package com.example.mvpexample.Main;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mvpexample.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private final MainPresenter presenter = new MainPresenter(this);
    private EditText firstNum, secondNum;
    private Button plus, minus;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        firstNum = findViewById(R.id.edit_first_number);
        secondNum = findViewById(R.id.edit_second_number);

        plus.setOnClickListener(v -> {
            presenter.calc(getFirstNum(), getSecondNum(), '+');
        });

        minus.setOnClickListener(v -> {
            presenter.calc(getFirstNum(), getSecondNum(), '-');
        });
    }

    @Override
    public void setCalcResult(int res) {
        Toast.makeText(this, "계산한 숫자 : " + res, Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getFirstNum() {
        return Integer.parseInt(firstNum.getText().toString());
    }

    @Override
    public int getSecondNum() {
        return Integer.parseInt(secondNum.getText().toString());
    }
}
