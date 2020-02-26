package com.example.islam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view=this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.Inverted);
    }


    public void buLOGIN(View view) {
        EditText txtEmail=(EditText)findViewById(R.id.Email);
        EditText txtPassword=(EditText)findViewById(R.id.Password);

        Intent intent=new Intent(this,Main2Activity.class);
        Bundle b=new Bundle();
        b.putString("Email",txtEmail.getText().toString());
        b.putString("Password",txtPassword.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}
