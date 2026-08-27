import { AxiosInstance } from 'axios';
import { AuditoriaLogDTO } from '../types';

export interface BuscarLogsParams {
  usuario?: string;
  acao?: string;
  entidade?: string;
  dataInicio?: string;
  dataFim?: string;
  pagina?: number;
  tamanho?: number;
}

export class AuditoriaService {
  private http: AxiosInstance;

  constructor(http: AxiosInstance) {
    this.http = http;
  }

  async buscarLogs(params?: BuscarLogsParams): Promise<any> {
    const response = await this.http.get('/api/auditoria/logs', { params });
    return response.data;
  }

  async buscarLogPorId(id: number): Promise<AuditoriaLogDTO> {
    const response = await this.http.get(`/api/auditoria/logs/${id}`);
    return response.data;
  }

  async obterResumo(): Promise<any> {
    const response = await this.http.get('/api/auditoria/resumo');
    return response.data;
  }
}
