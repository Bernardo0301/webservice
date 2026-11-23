//Contrato de Pedidos

import type { User } from "./user";

//Status do pedido
export type OrderStatus = 'WAITING_PAYMENT' | 'PAID' | 'SHIPPED' | 'DELIVERED' | 'CANCELED';

//Contrato Principal -> Dados Ordem API

export interface Order{
    id: number;
    moment: string; //instant
    client: User;
}

//Criar Ordem
export type CreateOrderDTO = Omit<Order, 'id'|'createdAt'|'updatedAt'|'status'>;

//Atualizar dados da Ordem (Parcial, ID fixo)
export type UpdateOrderDTO =  Partial<Omit<Order, 'id' | 'createdAt' | 'updatedAt'>>;
