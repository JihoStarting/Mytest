package com.vokasi.mytest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editNama;
    EditText editEmail;
    EditText editPassword;
    CheckBox checkBox;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNama = findViewById(R.id.nama_et);
        editEmail = findViewById(R.id.email_et);
        editPassword = findViewById(R.id.pass_et);
        checkBox = findViewById(R.id.checkbox);


    }
    public void Login(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }}