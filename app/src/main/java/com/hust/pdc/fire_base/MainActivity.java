package com.hust.pdc.fire_base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button btnThemDulieu;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();    // get root url ->  https://fire-pdc.firebaseio.com/

        btnThemDulieu = findViewById(R.id.btnThemDuLieu);

        btnThemDulieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User("Pham Dinh Chien", true, "21");

                databaseReference.child("users").child("user3").setValue(user);
            }
        });
    }
}
