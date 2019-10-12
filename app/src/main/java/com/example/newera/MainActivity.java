package com.example.newera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editUsername, editPassword;
    private Button btnlogin;

    private String username = "cwk", password="123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews(){
        editUsername=findViewById(R.id.edit_username);
        editPassword=findViewById(R.id.edit_password);
        btnlogin=findViewById(R.id.btn_login);
    }

    private void setListeners() {
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername=editUsername.getText().toString();
                String inputPassword=editPassword.getText().toString();

                if(inputUsername.equals(username) && inputPassword.equals(password)){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(i);
                    finish();

                }else{
                    Toast.makeText(MainActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }}
