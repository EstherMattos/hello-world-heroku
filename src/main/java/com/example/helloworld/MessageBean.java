package com.example.helloworld;

import java.io.Serializable;

public class MessageBean implements Serializable {

    private String message;

    public MessageBean() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        switch (value){
            case "":
            case "pt":
                message = "Olá";
                break;
            case "en":
                message = "Hello";
                break;
            case "de":
                message = "Hallo";
                break;
            case "fr":
                message = "Bonjour";
                break;
        }
    }
}