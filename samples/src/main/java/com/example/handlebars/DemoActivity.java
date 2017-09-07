package com.example.handlebars;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.handlebars.handlers.CrashingHandler;
import com.example.handlebars.handlers.LogHandler;
import com.example.handlebars.handlers.ToastHandler;
import com.galko.handlebars.HandlerBar;

public class DemoActivity extends AppCompatActivity {

    private HandlerBar<String> stringHandleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        stringHandleBar = new HandlerBar<String>()
                .addHandler(new ToastHandler())
                .addHandler(new CrashingHandler())
                .addHandler(new LogHandler())
                .setLoggingEnabled(true);
    }

    public void onButtonClicked(View view) {
        stringHandleBar.handle(getApplicationContext(), "Example");
    }
}
