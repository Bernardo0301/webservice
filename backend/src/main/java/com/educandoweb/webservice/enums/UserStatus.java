package com.educandoweb.webservice.enums;


public enum UserStatus {

    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    PENDING("PENDING"),
    BLOCKED("BLOCKED");

    private final String status;

        UserStatus(String status){
            this.status = status;
        }

        public String getStatus(){
            return status;
        }
}
