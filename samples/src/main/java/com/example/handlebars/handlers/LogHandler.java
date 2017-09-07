package com.example.handlebars.handlers;

import android.content.Context;
import android.util.Log;

import com.galko.handlebars.HandlerInterface;

/**
 * Created by galko on 05.09.17.
 */

public class LogHandler implements HandlerInterface<String> {

    @Override
    public void handle(Context context, String... objects) {
        for (String string : objects){
            Log.e(getClass().getSimpleName(), string);
        }
    }
}
