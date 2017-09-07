package com.example.handlebars.handlers;

import android.content.Context;

import com.galko.handlebars.HandlerInterface;

/**
 * Created by galko on 05.09.17.
 */

public class CrashingHandler implements HandlerInterface<String> {

    @Override
    public void handle(Context context, String... objects) {
        int num = 10 / 0;
    }
}
