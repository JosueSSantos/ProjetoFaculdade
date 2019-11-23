package com.example.wydenworkspace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

    public void login () {

        Button botaoLogin = (Button) findViewById(R.id.botaoLogin);
        Login (EditText)findViewById(R.id.campoLogin);
        Senha (EditText)findViewById(R.id.campoSenha);

    }