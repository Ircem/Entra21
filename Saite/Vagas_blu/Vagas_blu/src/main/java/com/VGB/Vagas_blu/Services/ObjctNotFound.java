package com.VGB.Vagas_blu.Services;

public class ObjctNotFound extends RuntimeException {

    public ObjctNotFound(String message) {
        super(message);
    }

    public ObjctNotFound(String message, Throwable cause) {
        super(message, cause);
    }
    
}
