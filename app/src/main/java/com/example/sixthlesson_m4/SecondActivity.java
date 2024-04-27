package com.example.sixthlesson_m4;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    // поля
    private TextView output;
    private Button button;

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            // intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // удаление всех активностей кроме той, на которую происходит переход
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        output = findViewById(R.id.output);
        button = findViewById(R.id.button);
        button.setOnClickListener(listener);

        Bundle bundle = getIntent().getExtras();

        Ticket ticket = null;

        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                ticket = (Ticket) bundle.getSerializable("ticket", Ticket.class);
            } else {
                ticket = (Ticket) bundle.getSerializable("ticket");
            }

            if (ticket != null) {
                output.setText("ID: " + ticket.getID() + "\n " +
                        "Место номер: " + ticket.getNumPlace() + "\n" +
                        "Время прибытия: " + ticket.getDate() + "\n" +
                        "Стоимость билета: " + ticket.getCost() + " монет" + "\n");
            } else {
                Toast.makeText(this, "Ticket is null", Toast.LENGTH_SHORT).show();
            }

        }
}}
