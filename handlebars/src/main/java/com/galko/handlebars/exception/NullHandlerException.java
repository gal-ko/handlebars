package com.galko.handlebars.exception;

/**
 * Created by galko on 07.09.17.
 */

public class NullHandlerException extends Exception{
    public NullHandlerException(){
        super("Handler is null.");
    }
}
