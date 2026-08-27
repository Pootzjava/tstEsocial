import { AxiosInstance } from 'axios';
import { DashboardTotaisApuracao, DashboardHistoricoMensal } from '../types';

export class DashboardService {
  private http: AxiosInstance;

  constructor(http: AxiosInstance) {
    this.http = http;
  }

  async obterTotaisApuracao(competencia: string): Promise<DashboardTotaisApuracao> {
    const response = await this.http.get(`/api/dashboard/totais-apuracao/${competencia}`);
    return response.data;
  }

  async obterHistoricoMensal(ano: number, mes?: number): Promise<DashboardHistoricoMensal[]> {
    const params = mes ? { mes } : {};
    const response = await this.http.get(`/api/dashboard/historico-mensal/${ano}`, { params });
    return response.data;
  }

  async obterResumoEventos(): Promise<any> {
    const response = await this.http.get('/api/dashboard/resumo-eventos');
    return response.data;
  }
}
