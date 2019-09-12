package com.example.myapplication;

        import android.icu.text.BreakIterator;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textRes;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnplus, btnmin, btnmul, btnsh, btn0, btnC, btnres;
    private String temt = "";
    private List<Integer> prList = new ArrayList<>();

    Integer tempNumber = 0;

    int operation = 0;
    public MainActivity() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textRes = findViewById(R.id.text_res);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnplus = findViewById(R.id.btnplus);
        btnmin = findViewById(R.id.btnmin);
        btnmul = findViewById(R.id.btnmul);
        btnsh = findViewById(R.id.btnsh);
        btn0 = findViewById(R.id.btn0);
        btnC = findViewById(R.id.btnC);
        btnres = findViewById(R.id.btnres);
        initBtnsListener();
    }

    private void initBtnsListener() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temt += "1";
                textRes.setText(temt);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temt += "2";
                textRes.setText(temt);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temt += "3";
                textRes.setText(temt);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temt += "4";
                textRes.setText(temt);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temt += "5";
                textRes.setText(temt);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temt += "6";
                textRes.setText(temt);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temt += "7";
                textRes.setText(temt);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temt += "8";
                textRes.setText(temt);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temt += "9";
                textRes.setText(temt);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temt += "0";
                textRes.setText(temt);
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempNumber = Integer.valueOf(temt);
                operation = 1;
                temt = "";
                textRes.setText(temt);
            }
        });


        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float res = 0;
                switch (operation){
                    case 1:
                        res = tempNumber + Float.valueOf(temt);
                        break;

                    case 2:
                        res = tempNumber - Integer.valueOf(temt);
                        break;

                    case 3 :
                        res = tempNumber / Float.valueOf(temt);
                        break;

                    case 4 :
                        res = tempNumber * Float.valueOf(temt);
                        break;
                }

                temt = String.valueOf(res);
                textRes.setText(temt);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                tempNumber = Integer.valueOf(temt);
                operation = 4;
                temt = "";
                textRes.setText(temt);
            }
        });

        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempNumber = Integer.valueOf(temt);
                operation = 2;
                temt = "";
                textRes.setText(temt);
            }
        });

        btnsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempNumber = Integer.valueOf(temt);
                operation = 3;
                temt = "";
                textRes.setText(temt);
            }
        });
    }
}