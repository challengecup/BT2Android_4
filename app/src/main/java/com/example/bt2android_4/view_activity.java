package com.example.bt2android_4;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class view_activity extends AppCompatActivity {

    TextView name,email,project;
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_contact);

        name = findViewById(R.id.getName);
        email = findViewById(R.id.getEmail);
        project = findViewById(R.id.getProject);

        finish = findViewById(R.id.finishBTN);
        finish.setOnClickListener(mClickFinishListener);

        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("nameuser");
        String useremail = bundle.getString("emailuser");
        String userproject = bundle.getString("projectuser");

        name.setText(username);
        email.setText(useremail);
        project.setText(userproject);
    }

    private final View.OnClickListener mClickFinishListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}
