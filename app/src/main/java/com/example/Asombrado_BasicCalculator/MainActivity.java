package com.example.Asombrado_BasicCalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddition, btnSubtraction, btnMultiplication, btnDivision, btnModulo;

        btnAddition = findViewById(R.id.btnAddition);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnDivision = findViewById(R.id.btnDivision);
        btnModulo = findViewById(R.id.btnModulo);

        btnAddition.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnModulo.setOnClickListener(this);









    }
    @Override
    public void onClick(View v){
        double operand1, operand2, answer;
        operand1 = 0.0;
        operand2 = 0.0;
        answer = 0.0;
        EditText txtoperand1, txtoperand2;
        TextView txtAnswer;
        txtoperand1 = findViewById(R.id.txtoperand1);
        txtoperand2 = findViewById(R.id.txtoperand2);
        txtAnswer = findViewById(R.id.txtAnswer);
        operand1 = Double.parseDouble(txtoperand1.getText().toString());
        operand2 = Double.parseDouble(txtoperand2.getText().toString());

        switch(v.getId()) {
            case R.id.btnAddition:
                answer = operand1 + operand2;
                txtAnswer.setText(Double.toString(answer));
                break;

            case R.id.btnSubtraction:
                answer = operand1 - operand2;
                txtAnswer.setText(Double.toString(answer));
                break;

            case R.id.btnMultiplication:
                answer = operand1 * operand2;
                txtAnswer.setText(Double.toString(answer));
                break;

            case R.id.btnDivision:
                answer = operand1 / operand2;
                txtAnswer.setText(Double.toString(answer));
                break;

            case R.id.btnModulo:
                answer = operand1 % operand2;
                txtAnswer.setText(Double.toString(answer));
                break;
        }




    }
}



