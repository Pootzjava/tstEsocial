import { AxiosInstance } from 'axios';
import { EventoDTO, ListarEventosParams, PageResponse } from '../types';

export class EventosService {
  private http: AxiosInstance;

  constructor(http: AxiosInstance) {
    this.http = http;
  }

  async listar(params?: ListarEventosParams): Promise<PageResponse<EventoDTO>> {
    const response = await this.http.get('/api/eventos', { params });
    return response.data;
  }

  async buscarPorId(id: number): Promise<EventoDTO> {
    const response = await this.http.get(`/api/eventos/${id}`);
    return response.data;
  }

  async enviar(dados: Partial<EventoDTO>): Promise<EventoDTO> {
    const response = await this.http.post('/api/eventos', dados);
    return response.data;
  }

  async atualizar(id: number, dados: Partial<EventoDTO>): Promise<EventoDTO> {
    const response = await this.http.put(`/api/eventos/${id}`, dados);
    return response.data;
  }

  async excluir(id: number): Promise<void> {
    await this.http.delete(`/api/eventos/${id}`);
  }

  async validarAntesEnvio(id: number): Promise<any> {
    const response = await this.http.post(`/api/eventos/${id}/validar`);
    return response.data;
  }
}
