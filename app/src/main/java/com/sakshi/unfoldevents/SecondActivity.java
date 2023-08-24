package com.sakshi.unfoldevents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

//    GoogleSignInOptions gso;
//    GoogleSignInClient gsc;
    Button signOutBtn, bookEvent, myBookings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();

        signOutBtn = findViewById(R.id.signout);
        bookEvent = findViewById(R.id.bookEvent);
        myBookings = findViewById(R.id.myBookings);

        bookEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                intent.putExtra("email", extras.getString("email"));
                startActivity(intent);
            }
        });

        myBookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MyBookingActivity.class);
                intent.putExtra("email", extras.getString("email"));
                startActivity(intent);
            }
        });

//        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
//        gsc = GoogleSignIn.getClient(this, gso);
//
//        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
//        if (acct != null) {
//            String personName = acct.getDisplayName();
//            String personEmail = acct.getEmail();
//
//        }
//        signOutBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                signOutBtn();
//            }
//        });

        signOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }

//    void signOutBtn() {
//        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                finish();
//                startActivity(new Intent(SecondActivity.this, MainActivity.class));
//            }
//        });
//    }

}
