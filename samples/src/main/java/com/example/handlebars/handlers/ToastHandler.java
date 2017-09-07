package com.example.handlebars.handlers;

import android.content.Context;
import android.widget.Toast;

import com.galko.handlebars.HandlerInterface;

/**
 * Created by galko on 05.09.17.
 */

public class ToastHandler implements HandlerInterface<String> {

    @Override
    public void handle(Context context, String... objects) {
        for (String string : objects){
            Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
        }
    }
}
