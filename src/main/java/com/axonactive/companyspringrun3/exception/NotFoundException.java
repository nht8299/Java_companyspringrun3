package com.axonactive.companyspringrun3.exception;

public class NotFoundException extends Exception{
    public NotFoundException(Integer id){
        super("Id not found! "+id);
    }

    public NotFoundException(String id) {super("Id not found! "+id);
    }
}
