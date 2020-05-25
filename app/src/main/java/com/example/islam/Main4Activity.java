package com.example.islam;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {
    ArrayList<String>passwords=new ArrayList<>();
    private Intent intent;
    private FirebaseAuth mAuth;
    //Button button;
    private EditText txtName;
    private EditText txtEmail;
    private EditText txtPassword;
    private EditText txtRe;

    private String pass;
    private String txtp;
    private String txtRp;
    private String email;
    //Main4Activity mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        //mBinding = Main4Activity.LAYOUT_INFLATER_SERVICE(getLayoutInflater());

// ...
// Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

    }


    public void buttonSignUp(View view) {
        txtName=(EditText)findViewById(R.id.listname);
        txtEmail=(EditText)findViewById(R.id.emailS);
        txtPassword=(EditText)findViewById(R.id.passwordS);
        txtRe=(EditText)findViewById(R.id.Re);
        //pass=txtName.getText().toString()+txtPassword.getText().toString();
        txtp=txtPassword.getText().toString();
        txtRp=txtRe.getText().toString();
        email=txtEmail.getText().toString();
        intent=new Intent(this,MainActivity.class);


        if(email.isEmpty()||txtp.isEmpty()||txtRp.isEmpty()){
            //System.out.println("11111111111111111111111111111");
            Toast.makeText(Main4Activity.this,"there is an empty field",Toast.LENGTH_LONG).show();return;
        }else{if(!email.contains("@")){
            Toast.makeText(this,"invalid email",Toast.LENGTH_SHORT).show();return;
        }else{

            if(txtp.length()<6){
            Toast.makeText(Main4Activity.this,"the password should be bigger than or equal 6 ",Toast.LENGTH_LONG).show();return;
        }else{
        if(!txtRp.equals(txtp)){
            //System.out.println("2222222222222222222222222222222");
            Toast.makeText(Main4Activity.this,"The password and the retype password are not the same !!",Toast.LENGTH_LONG).show();return;
        }
        else {
            //System.out.println("333333333333333333333333333");
            mAuth.createUserWithEmailAndPassword(email, txtp)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

                        public void onComplete(@NonNull Task<AuthResult> task) {
                            //System.out.println("44444444444444444444444444444444444444");
                            if (task.isSuccessful()) {
                               // System.out.println("555555555555555555555555555555555");
                                // Sign in success, update UI with the signed-in user's information
                                 Toast.makeText(Main4Activity.this,"successful sign up !",Toast.LENGTH_LONG).show();
                                startActivity(intent);
                                finish();
                            } else {
                                //System.out.println("6666666666666666666666666666666666666");

                                Toast.makeText(Main4Activity.this, "unsuccessful sign up !", Toast.LENGTH_LONG).show();

                            }

                            // ...
                        }
                    });}
         }}
}}}
