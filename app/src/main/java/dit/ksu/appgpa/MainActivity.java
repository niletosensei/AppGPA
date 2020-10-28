package dit.ksu.appgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private EditText in1;
    private EditText in2;
    private EditText in3;
    private Button   sum1;
    private EditText in4;
    private EditText in5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in1=(EditText)findViewById(R.id.editTextNumber3);
        in2=(EditText)findViewById(R.id.editTextNumber);
        in3=(EditText)findViewById(R.id.editTextNumber2);
        sum1=(Button)findViewById(R.id.buttonsum);
        in4=(EditText)findViewById(R.id.editTextTextPersonName);
        in5=(EditText)findViewById(R.id.editTextTextPersonName2);

        sum1.setOnClickListener(new View.OnClickListener() {

            @Override

                public void onClick(View v) {
                int a = Integer.parseInt(in1.getText().toString());
                int b = Integer.parseInt(in2.getText().toString());
                int c = Integer.parseInt(in3.getText().toString());
                String str2 = new String(in5.getText().toString());
                int d = (a + b + c);
                long newd=(long) d ;
                    String Grade;
                    if (newd >= 80) {
                        Grade = "A";
                    } else if (newd >= 75) {
                        Grade = "B+";
                    } else if (newd >= 70) {
                        Grade = "B";
                    } else if (newd >= 65) {
                        Grade = "C+";
                    } else if (newd >= 60) {
                        Grade = "C";
                    } else if (newd >= 55) {
                        Grade = "D+";
                    } else if (newd >= 50) {
                        Grade = "D";
                    } else {
                        Grade = "F";
                    }
                    in4.setText("Grade = "+Grade+("คะเเนน = "+newd)+("ชื่อ-สกุล = "+str2));
            }

            });

    }
    }




