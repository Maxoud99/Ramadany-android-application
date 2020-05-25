package com.example.islam;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //public static Main4Activity activity=new Main4Activity();
    private FirebaseAuth mAuth;
   private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view=this.getWindow().getDecorView();

// ...
// Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

    }
//    public void onStart() {
//        super.onStart();
//        // Check if user is signed in (non-null) and update UI accordingly.
//        FirebaseUser currentUser = mAuth.getCurrentUser();
//        updateUI(currentUser);
//    }

    public void buLOGIN(View view) {
        EditText txtEmail=(EditText)findViewById(R.id.Email);
        EditText txtPassword=(EditText)findViewById(R.id.Password);

        String email=txtEmail.getText().toString().trim();
        String password=txtPassword.getText().toString().trim();;
        if(email.isEmpty()||password.isEmpty()){
            Toast.makeText(MainActivity.this,"There is empty fields !!!",Toast.LENGTH_LONG);
        }else{
        intent=new Intent(MainActivity.this,Main2Activity.class);
        //System.out.println("hhhhhhhhhhhhhhhhh"+mAuth.toString());
            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            //System.out.println("9999999999999999999999999999999999");
                            if (task.isSuccessful()) {
                                Toast.makeText(MainActivity.this,"successful login !",Toast.LENGTH_LONG).show();
                                startActivity(intent);
                                finish();
                            } else {


                                Toast.makeText(MainActivity.this,"unsuccessful login !"+task.getException().getMessage(),Toast.LENGTH_LONG).show();
                                // ...
                            }

                            // ...
                        }
                    });
//        mAuth.signInWithEmailAndPassword(email, pass)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            // Sign in success, update UI with the signed-in user's information
//                            Toast.makeText(MainActivity.this,"successful login !",Toast.LENGTH_LONG);startActivity(intent);
//                        } else {
//
//                            // If sign in fails, display a message to the user.
//                            Toast.makeText(MainActivity.this,"unsuccessful login !",Toast.LENGTH_LONG);
//                        }
//
//                        // ...
//                    }
//                });
           }
    }

    public void buttonSignUp(View view) {
        Intent intent=new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
}
