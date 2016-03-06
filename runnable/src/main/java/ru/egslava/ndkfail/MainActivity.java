package ru.egslava.ndkfail;

import android.app.Activity;
import android.os.Bundle;

import ru.egslava.ndk.Bindings;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bindings.method();
        Bindings.method();
    }
}
