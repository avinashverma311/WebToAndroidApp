package com.example.bhulekh_fcs;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOne = findViewById(R.id.button1);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(activity2Intent);
            }
        });
    }
    public void Myweb1(View view) {
        Button buttonOne = findViewById(R.id.button1);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(activity2Intent);
            }
        });
    }
    public void Myweb2(View view) {
        Button buttonTwo = findViewById(R.id.button2);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity3Intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(activity3Intent);
            }
        });
    }
    public void Myweb3(View view) {
        Button buttonThree = findViewById(R.id.button3);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(activity2Intent);
            }
        });
    }
}