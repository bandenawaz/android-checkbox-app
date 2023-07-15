package com.sveri.checkboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox pizza,burger,coffee;
    TextView tvRes;
    Button btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza = findViewById(R.id.checkBoxPizza);
        burger = findViewById(R.id.checkBoxBurger);
        coffee = findViewById(R.id.checkBoxCoffee);
        btnOrder = findViewById(R.id.buttonOrder);
        tvRes = findViewById(R.id.textViewResult);

        //event handler
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int amount = 0;
                StringBuilder res = new StringBuilder();
                res.append("Selected Items are :\n");

                //check if pizza is checked
                if (pizza.isChecked()){

                    res.append("Price of Pizza is :600");
                    amount += 600;
                }

                //check if burger is checked
                if (burger.isChecked()){

                    res.append("\nPrice of Burger is :150");
                    amount += 150;
                }

                //check if coffee is checked
                if (coffee.isChecked()){

                    res.append("\nPrice of Coffee is :50");
                    amount += 50;
                }

                //append the total amount to string
                res.append("\nTotal Bill is "+amount);
                //Toast.makeText(MainActivity.this, res.toString(), Toast.LENGTH_LONG).show();
                tvRes.setText(res.toString());

            }
        });
    }
}