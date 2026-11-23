package com.educandoweb.webservice.enums;

public enum OrderStatus {

    
    WAITING_PAYMENT("WAITING_PAYMENT"),
    PAID("PAID"),
    SHIPPED("SHIPPED"),
    DELIVERED("DELIVERED"),
    CANCELED("CANCELED");

    private final String status;

        OrderStatus(String status){
            this.status = status;
        }

        public String getStatus(){
            return status;
        }

}
