package com.galko.handlebars;

import android.content.Context;

/**
 * Created by galko on 05.09.17.
 */

public interface HandlerInterface<T> {
    void handle(Context context, T... objects);
}
