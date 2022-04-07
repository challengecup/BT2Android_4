package com.example.bt2android_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email,project;
    Button viewcontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.namefill);
        email = findViewById(R.id.emailfill);
        project = findViewById(R.id.projectfill);
        viewcontact = findViewById(R.id.viewBTN);

         viewcontact.setOnClickListener((View view) -> {
                 String username = name.getText().toString();
                 String useremail = email.getText().toString();
                 String userproject = project.getText().toString();

                 Intent intent = new Intent(MainActivity.this,view_activity.class);
                 Bundle bundle = new Bundle();

                 bundle.putString("nameuser",name.getText().toString());
                 bundle.putString("emailuser",email.getText().toString());
                 bundle.putString("projectuser",project.getText().toString());
                 intent.putExtras(bundle);

                 startActivity(intent);
         });
    }
}