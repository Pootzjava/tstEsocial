export interface EventoDTO {
  id: number;
  tipoEvento: string;
  cpfTrabalhador?: string;
  cnpjEmpresa?: string;
  competencia: string;
  estado: string;
  dadosEvento: any;
  dataCriacao: string;
  dataProcessamento?: string;
  numeroLote?: string;
  erroProcessamento?: string;
}

export interface ListarEventosParams {
  pagina?: number;
  tamanho?: number;
  tipoEvento?: string;
  estado?: string;
  dataInicio?: string;
  dataFim?: string;
}

export interface PageResponse<T> {
  content: T[];
  totalElements: number;
  totalPages: number;
  size: number;
  number: number;
  first: boolean;
  last: boolean;
}

export interface DadosFolhaDTO {
  cpfTrabalhador: string;
  salarioBruto: number;
  salarioMinimoVigente: number;
  tetoINSS: number;
  aliquotaFGTS: number;
  baseFGTS: number;
  baseIRRF: number;
  dependentes: number;
  competencia: string;
  vinculosAtivos: string[];
}

export interface ValidacaoErroDTO {
  tipoErro: string;
  descricao: string;
  severidade: 'BAIXA' | 'MEDIA' | 'ALTA' | 'CRITICA';
  campo: string;
  valorEncontrado: any;
  valorEsperado: any;
}

export interface EventoPrioritarioDTO {
  idEvento: number;
  tipoEvento: string;
  prioridade: number;
  justificativa: string;
}

export interface DashboardTotaisApuracao {
  competencia: string;
  totalEventos: number;
  baseFgts: number;
  baseIrrf: number;
  valorLiquido: number;
}

export interface DashboardHistoricoMensal {
  mes: number;
  ano: number;
  totalEventos: number;
  eventosSucesso: number;
  eventosErro: number;
}

export interface AuditoriaLogDTO {
  id: number;
  usuario: string;
  acao: string;
  entidade: string;
  entidadeId: number;
  dadosAntigos?: any;
  dadosNovos?: any;
  ipOrigem: string;
  timestamp: string;
}

export interface WebhookDTO {
  id: number;
  url: string;
  eventos: string[];
  ativo: boolean;
  dataCriacao: string;
}

export interface GerarDadosSandboxParams {
  empresas?: number;
  eventos?: number;
  apuracoes?: number;
}
