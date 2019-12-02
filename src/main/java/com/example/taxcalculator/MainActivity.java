package com.example.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    String st;
    EditText editText;

    Button btn_check = (Button) findViewById(R.id.btn_check);
    //final MaskEditText edit_s = (MaskEditText) findViewById(R.id.txt_sin);
    final EditText edit_s = (EditText) findViewById(R.id.txt_sin);


    Button btn_submit = (Button) findViewById(R.id.btn_submit);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (CheckSinNo(edit_s.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Please Enter Valid 9-Digit Sin Number",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Sin Number is Valid",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //Intent i = new Intent(MainActivity.this,SecondActivity.class);
                //st1 = edit_s.getText().toString();
                //i.putExtra("SinNumber",st1);
                //startActivity(i);
                //finish();

                //Intent j = new Intent(MainActivity.this,SecondActivity.class);
                //st2 = edit_s.getText().toString();
                //i.putExtra("FullName",st2);
                //startActivity(j);
                //finish();

            }
        });

    }

    public Boolean CheckSinNo(String sn)
    {
        Boolean check = false;

        String no ="\\d*\\.?\\d+"; //d is considered as [0-9] & .? as Optional decimal point

        CharSequence inputStr = sn;

        Pattern ptn = Pattern.compile(no,Pattern.CASE_INSENSITIVE);
        Matcher matcher = ptn.matcher(inputStr);

        if (matcher.matches()){
            check = true;
        }
        return check;


    }


}
}