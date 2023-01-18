package com.VGB.Vagas_blu.Exeception;

public class DataintegrityVioltionException extends RuntimeException{
    public DataintegrityVioltionException(String message) {
        super(message);
    }

    public DataintegrityVioltionException(String message, Throwable cause) {
        super(message, cause);
    } 
    
}
