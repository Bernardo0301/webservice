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

// Contrato para resposta paginada de listagem de usuários
export interface PaginatedUsersResponse {
  data: User[];
  total: number;
  page: number;
  limit: number;
}