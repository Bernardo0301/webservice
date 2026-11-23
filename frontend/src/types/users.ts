//Status da conta
export type UserStatus = 'ACTIVE' | 'INACTIVE' | 'PENDING' | 'BLOCKED';

// Contrato Principal -> Dados Usuario API
export interface User{
    id: number;
    name: string;
    email: string;
    phone: string;
    password?: string;
}

//Criação de Usuario
export type CreateUserDTO = Omit<User, 'id'|'createdAt'|'updatedAt'|'status'> &{
    password: string;
}

//Atualizar dados de Usuario (Parcial, id nao atualiza)
export type UpdateUserDTO =  Partial<Omit<User, 'id' | 'createdAt' | 'updatedAt'>>;

// Espelha exatamente o objeto 
export interface SpringPage<T> {
  content: T[];
  totalElements: number;
  totalPages: number;
  number: number; // Índice da página atual (começa em 0)
  size: number;   // Quantidade de itens por página
  first: boolean;
  last: boolean;
  empty: boolean;
}