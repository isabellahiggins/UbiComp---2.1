package com.example.form;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText name, password, phone, emailInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameID);
        password = findViewById(R.id.passwordID);
        phone = findViewById(R.id.phoneID);
        emailInput = findViewById(R.id.emailID);
    }

    public void SubmitForm(View view){
        String userName = name.getText().toString();
        String userPhone = phone.getText().toString();

        //validate form inputs
        boolean nameCheck = true;
        for( int i = 0; i < userName.length(); i++){
            char c = userName.charAt(i);
            if(Character.isDigit(c)){
                nameCheck = false;
            }
        }

        boolean phoneCheck = true;
        for(int i = 0; i < userPhone.length(); i++){
            char c = userPhone.charAt(i);
            if(Character.isLetter(c)){
                phoneCheck = false;
            }
        }

        if(nameCheck && phoneCheck){
            Toast.makeText(this, "Form submitted successfully, " + userName + ".", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "Invalid input, please recheck your details entered.",  Toast.LENGTH_LONG).show();
        }
    }
}