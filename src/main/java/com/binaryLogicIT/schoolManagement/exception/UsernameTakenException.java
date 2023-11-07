package com.binaryLogicIT.schoolManagement.exception;

public class UsernameTakenException extends Exception {

    public UsernameTakenException(String username){
        super(username + " is registered in our records. Please try another username or log in");
    }
}
