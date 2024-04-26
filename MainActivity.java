package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    EditText editText;
    TextView textView1,textView2,textView3;
    ImageButton button1,button2,button3;
    DecimalFormat units=new DecimalFormat("######.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner1);
        editText = findViewById(R.id.editTextvalue);
        textView1 = findViewById(R.id.result1);
        textView2 = findViewById(R.id.result2);
        textView3 = findViewById(R.id.result3);
        button1 = findViewById(R.id.imageButton1);
        button2 = findViewById(R.id.imageButton2);
        button3 = findViewById(R.id.imageButton3);
        button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Double meter = Double.parseDouble(editText.getText().toString());

                    Double Centi = meter * 100;
                    Double Inch = meter * 39.37;
                    Double Feet = meter * 3.28;
                    textView1.setText("" + units.format(Centi) + "  " + "Centimeters");
                    textView2.setText("" + units.format(Inch) + "  " + "Inches");
                    textView3.setText("" + units.format(Feet) + "  " + "Feets");


                }
            });

        button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double celsius = Double.parseDouble(editText.getText().toString());
                    Double Fah = (celsius * 1.8) + 32;
                    Double Kelvin = celsius + 273.15;
                    textView1.setText("" + units.format(Fah) + "  " + "Fahrenheit");
                    textView2.setText("" + units.format(Kelvin) + "  " + "Kelvin");
                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double kilogram = Double.parseDouble(editText.getText().toString());
                    Double gram = kilogram * 1000;
                    Double ounce = kilogram * 35.274;
                    Double pounds = kilogram * 2.205;
                    textView1.setText("" + units.format(gram) + "  " + "Grams");
                    textView2.setText("" + units.format(ounce) + "  " + "Ounce");
                    textView3.setText("" + units.format(pounds) + "  " + "Pounds");
                }
            });
        }

        }


