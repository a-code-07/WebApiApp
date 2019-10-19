package com.example.webapiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton BtLogin;
    private AppCompatEditText EtUsr,EtPsw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtLogin=findViewById(R.id.btnLogIn);
        EtUsr=findViewById(R.id.EtUsr);
        EtPsw=findViewById(R.id.EtPsw);

    }
}
