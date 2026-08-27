import { AxiosInstance } from 'axios';
import { DadosFolhaDTO, ValidacaoErroDTO, EventoPrioritarioDTO } from '../types';

export class RegrasService {
  private http: AxiosInstance;

  constructor(http: AxiosInstance) {
    this.http = http;
  }

  async validarFolha(dadosFolha: DadosFolhaDTO): Promise<ValidacaoErroDTO[]> {
    const response = await this.http.post('/api/regras/validar-folha', dadosFolha);
    return response.data;
  }

  async calcularPrioridades(idsEventos: number[]): Promise<EventoPrioritarioDTO[]> {
    const response = await this.http.post('/api/regras/prioridades', idsEventos);
    return response.data;
  }

  async reordenarFila(): Promise<string> {
    const response = await this.http.post('/api/regras/reordenar-fila');
    return response.data;
  }
}
