package edu.illinois.cs.cs125.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button1 = (Button) findViewById(R.id.button15);
        button1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Main2Activity.this, Zodiac1.class);
                    startActivity(intent);
            }
        }));
        Button button2 = (Button) findViewById(R.id.button16);
        button2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Zodiac2.class);
                startActivity(intent);
            }
        }));

        Button button3 = (Button) findViewById(R.id.button17);
        button3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Zodiac3.class);
                startActivity(intent);
            }
        }));
        Button button5 = (Button) findViewById(R.id.button19);
        button5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Zodiac5.class);
                startActivity(intent);
            }
        }));
        Button button4 = (Button) findViewById(R.id.button18);
        button4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Zodiac4.class);
                startActivity(intent);
            }
        }));
//        Button button5 = (Button) findViewById(R.id.button19);
//        button2.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(Main2Activity.this, Zodiac5.class);
//                startActivity(intent);
//            }
//        }));
//
//        Button button6 = (Button) findViewById(R.id.button20);
//        button3.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(Main2Activity.this, Zodiac6.class);
//                startActivity(intent);
//            }
//        }));
        Button button6 = (Button) findViewById(R.id.button20);
        button6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Zodiac6.class);
                startActivity(intent);
            }
        }));
        Button button7 = (Button) findViewById(R.id.button21);
        button7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Zodiac7.class);
                startActivity(intent);
            }
        }));
        Button button8 = (Button) findViewById(R.id.button22);
        button8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Zodiac8.class);
                startActivity(intent);
            }
        }));

        Button button9 = (Button) findViewById(R.id.button23);
        button9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Zodiac9.class);
                startActivity(intent);
            }
        }));
        Button button10 = (Button) findViewById(R.id.button24);
        button10.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Zodiac10.class);
                startActivity(intent);
            }
        }));
        Button button11 = (Button) findViewById(R.id.button25);
        button11.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Zodiac11.class);
                startActivity(intent);
            }
        }));

        Button button12 = (Button) findViewById(R.id.button26);
        button12.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Zodiac12.class);
                startActivity(intent);
            }
        }));

    }
}
