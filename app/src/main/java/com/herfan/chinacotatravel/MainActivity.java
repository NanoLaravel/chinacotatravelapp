package com.herfan.chinacotatravel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lugar lugar = new Lugar("UIS", "Calle 9 #27","una de las mejores u",634400,5, TipoLugar.EDUCACION,
        7.1377, -73.121);
}
}
