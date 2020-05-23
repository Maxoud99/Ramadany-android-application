package com.example.islam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {
    ArrayList<String>passwords=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


    }

    public void buttonSignUp(View view) {
        EditText txtName=(EditText)findViewById(R.id.listname);
        EditText txtEmail=(EditText)findViewById(R.id.emailS);
        EditText txtPassword=(EditText)findViewById(R.id.passwordS);
        EditText txtRe=(EditText)findViewById(R.id.Re);
        String pass=txtName.getText().toString()+txtPassword.getText().toString();
        passwords.add(pass);
        String txtp=txtPassword.getText().toString();
        String txtRp=txtRe.getText().toString();
        if(txtRp.equals(txtp)){
        Intent intent=new Intent(this,MainActivity.class);
        Bundle b=new Bundle();
        b.putStringArrayList("array",passwords);
        intent.putExtras(b);
            Toast.makeText(this,"You successfully signed up",Toast.LENGTH_LONG).show();

            startActivity(intent);}
        else{
            Intent intent=new Intent(this,Main4Activity.class);
            Toast.makeText(this,"The password and the Re-password are different !"+"\n"+"Try again !",Toast.LENGTH_LONG).show();
            startActivity(intent);
        }

    }
}
