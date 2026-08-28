import { AxiosInstance } from 'axios';

export class RelatoriosService {
  private http: AxiosInstance;

  constructor(http: AxiosInstance) {
    this.http = http;
  }

  async gerarPdfApuracao(competencia: string): Promise<Blob> {
    const response = await this.http.get(`/api/relatorios/apuracao`, {
      params: { competencia },
      responseType: 'blob'
    });
    return response.data;
  }

  async gerarCsvValidacoes(dataInicio: string, dataFim: string): Promise<Blob> {
    const response = await this.http.get('/api/relatorios/validacoes', {
      params: { dataInicio, dataFim },
      responseType: 'blob'
    });
    return response.data;
  }
}
