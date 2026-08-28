import { AxiosInstance } from 'axios';
import { GerarDadosSandboxParams } from '../types';

export class SandboxService {
  private http: AxiosInstance;

  constructor(http: AxiosInstance) {
    this.http = http;
  }

  async gerarDados(params?: GerarDadosSandboxParams): Promise<any> {
    const response = await this.http.post('/api/sandbox/gerar-dados', params);
    return response.data;
  }

  async limparDados(): Promise<void> {
    await this.http.delete('/api/sandbox/limpar');
  }

  async obterEstatisticas(): Promise<any> {
    const response = await this.http.get('/api/sandbox/estatisticas');
    return response.data;
  }
}
