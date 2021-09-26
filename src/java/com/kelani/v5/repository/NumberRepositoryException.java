package com.kelani.v5.repository;



public class NumberRepositoryException extends Exception {
    public NumberRepositoryException(Exception e, String message) {
        super(message,e);
    }
}
