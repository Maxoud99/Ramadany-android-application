package com.example.islam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Main4Activity {
    //public static Main4Activity activity=new Main4Activity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view=this.getWindow().getDecorView();

    }


    public void buLOGIN(View view) {
        EditText txtEmail=(EditText)findViewById(R.id.Email);
        EditText txtPassword=(EditText)findViewById(R.id.Password);
        String pass=txtEmail.getText().toString()+txtPassword.getText().toString();
        Intent inte=getIntent();
        ArrayList<String>passwords=inte.getStringArrayListExtra("array");
        if(passwords.contains(pass)){
        Intent intent=new Intent(this,Main2Activity.class);
//        Bundle b=new Bundle();
//        b.putString("Email",txtEmail.getText().toString());
//        b.putString("Password",txtPassword.getText().toString());
//        intent.putExtras(b);
        startActivity(intent);}else{
            Toast.makeText(this,"Wrong username or password !",Toast.LENGTH_LONG).show();
        }
    }

    public void buttonSignUp(View view) {
        Intent intent=new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
}
