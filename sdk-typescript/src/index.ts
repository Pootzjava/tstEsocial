import axios, { AxiosInstance, AxiosError } from 'axios';

export interface ApiConfig {
  baseUrl: string;
  token: string;
  timeout?: number;
}

export class ApiError extends Error {
  status: number;
  detalhes: any;

  constructor(status: number, message: string, detalhes?: any) {
    super(message);
    this.name = 'ApiError';
    this.status = status;
    this.detalhes = detalhes;
  }
}

export class EsocialJTClient {
  private http: AxiosInstance;

  constructor(config: ApiConfig) {
    this.http = axios.create({
      baseURL: config.baseUrl,
      timeout: config.timeout || 30000,
      headers: {
        'Content-Type': 'application/json',
        'Authorization': `Bearer ${config.token}`
      }
    });

    // Interceptor para tratamento de erros
    this.http.interceptors.response.use(
      response => response,
      (error: AxiosError) => {
        if (error.response) {
          throw new ApiError(
            error.response.status,
            error.response.data?.message || error.message,
            error.response.data
          );
        }
        throw error;
      }
    );
  }

  getHttpClient(): AxiosInstance {
    return this.http;
  }
}

// Exportar serviços
export { EventosService } from './services/EventosService';
export { LotesService } from './services/LotesService';
export { DashboardService } from './services/DashboardService';
export { RegrasService } from './services/RegrasService';
export { RelatoriosService } from './services/RelatoriosService';
export { AuditoriaService } from './services/AuditoriaService';
export { WebhooksService } from './services/WebhooksService';
export { SandboxService } from './services/SandboxService';

// Exportar tipos
export * from './types';
