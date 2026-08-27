import { AxiosInstance } from 'axios';

export class LotesService {
  private http: AxiosInstance;

  constructor(http: AxiosInstance) {
    this.http = http;
  }

  async listar(params?: any): Promise<any> {
    const response = await this.http.get('/api/lotes', { params });
    return response.data;
  }

  async buscarPorId(id: number): Promise<any> {
    const response = await this.http.get(`/api/lotes/${id}`);
    return response.data;
  }

  async enviarLote(eventosIds: number[]): Promise<any> {
    const response = await this.http.post('/api/lotes/enviar', { eventosIds });
    return response.data;
  }

  async consultarRecibo(numeroLote: string): Promise<any> {
    const response = await this.http.get(`/api/lotes/recibo/${numeroLote}`);
    return response.data;
  }
}
