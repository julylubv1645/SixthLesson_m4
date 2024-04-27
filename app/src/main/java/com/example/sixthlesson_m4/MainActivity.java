package com.example.sixthlesson_m4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // поля
    private EditText inputId, inputDrExp,inputDrExp2, inputCarCat;
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка разметки к полям
        inputId = findViewById(R.id.inputId);
        inputDrExp = findViewById(R.id.inputDrExp);
        inputDrExp2 = findViewById(R.id.inputDrExp2);
        inputCarCat = findViewById(R.id.inputCarCat);
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int ID = Integer.parseInt(inputId.getText().toString());
            int numPlace = Integer.parseInt(inputDrExp.getText().toString());
            String date = String.valueOf(inputDrExp2.getText());
            int cost = Integer.parseInt(inputCarCat.getText().toString());

            Ticket ticket = new Ticket(ID, numPlace, date, cost);

            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra("ticket", ticket);
            startActivity(intent);
        }

    };
}