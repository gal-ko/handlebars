package com.galko.handlebars.exception;

/**
 * Created by galko on 07.09.17.
 */

public class NoHandlersException extends Exception{
    public NoHandlersException(){
        super("No Handlers were added to the HandlerBar. make sure you call addHandler() before calling handle().");
    }
}
