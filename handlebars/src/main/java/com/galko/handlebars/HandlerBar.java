package com.galko.handlebars;

import android.content.Context;
import android.util.Log;

import com.galko.handlebars.exception.NoHandlersException;
import com.galko.handlebars.exception.NullHandlerException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by galko on 05.09.17.
 */

public class HandlerBar<T> {

    private static final String LOG_TAG = "HandlerBar";

    private List<HandlerInterface<T>> handlers;
    private boolean loggingEnabled;

    public HandlerBar(){
        this.handlers = new ArrayList<>();
        setLoggingEnabled(false);
    }

    public HandlerBar<T> addHandler(HandlerInterface<T> handler){
        this.handlers.add(handler);
        return this;
    }

    public HandlerBar<T> setLoggingEnabled(boolean loggingEnabled){
        this.loggingEnabled = loggingEnabled;
        return this;
    }

    @SafeVarargs
    public final void handle(Context context, T... objects){
        if (handlers == null || handlers.size() == 0){
            printToLog(new NoHandlersException());
            return;
        }
        for (HandlerInterface<T> handler : handlers){
            try{
                if (handler == null){
                    throw new NullHandlerException();
                }
                printToLog("currentHandler=" + handler.getClass().getSimpleName());
                handler.handle(context, objects);
            }
            catch (Exception e){
                printToLog(e);
            }
        }
    }

    private void printToLog(String message){
        if (loggingEnabled){
            Log.d(LOG_TAG, message);
        }
    }

    private void printToLog(Exception e){
        if (loggingEnabled){
            Log.e(LOG_TAG, Log.getStackTraceString(e));
        }
    }

}
