import { AxiosInstance } from 'axios';
import { WebhookDTO } from '../types';

export class WebhooksService {
  private http: AxiosInstance;

  constructor(http: AxiosInstance) {
    this.http = http;
  }

  async listar(): Promise<WebhookDTO[]> {
    const response = await this.http.get('/api/webhooks');
    return response.data;
  }

  async criar(webhook: Partial<WebhookDTO>): Promise<WebhookDTO> {
    const response = await this.http.post('/api/webhooks', webhook);
    return response.data;
  }

  async atualizar(id: number, webhook: Partial<WebhookDTO>): Promise<WebhookDTO> {
    const response = await this.http.put(`/api/webhooks/${id}`, webhook);
    return response.data;
  }

  async excluir(id: number): Promise<void> {
    await this.http.delete(`/api/webhooks/${id}`);
  }

  async testar(id: number): Promise<any> {
    const response = await this.http.post(`/api/webhooks/${id}/testar`);
    return response.data;
  }
}
