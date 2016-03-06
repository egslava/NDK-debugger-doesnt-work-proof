package ru.egslava.ndkfail;


import android.app.Application;

public class App extends Application {

    @Override public void onCreate() {

        super.onCreate();
        System.loadLibrary("gl2jni");
    }
}
