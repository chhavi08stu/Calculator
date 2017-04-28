package com.houser.garima.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class UserActivity extends fwActivity implements View.OnClickListener{
    Button btnCalculate;
    TextView txtValue;
    public void onClick(View view) {
        Log.i("clicks","You Clicked B1");
       // txtValue=(TextView)findViewById(R.id.);

        Button btnAdd1=(Button)findViewById(R.id.btnAdd);
      //  txtValue.setText((TextView)findViewById(R.id.lo));
       // findViewById(R.id.action_settings)
       // txtValue.setText("Welcome to the place where you can find your place good");
        //txtValue.setVisibility(txtValue.VISIBLE);
                switch(view.getId()){
            case R.id.btnAdd:
            {
                btnAdd1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Log.i("clicks","You Clicked B1");
                        txtValue=(TextView)findViewById(R.id.lblCalculatedValue);
                        txtValue.setText("Welcome to the place where you can find your place good");
                        txtValue.setVisibility(View.GONE);
                    }
                });
                /*
               String val="";
                txtValue=(TextView)findViewById(R.id.lblCalculatedValue);
                txtValue.setText("Welcome to the place where you can find your place good");
                txtValue.setVisibility(View.VISIBLE);
*/
                //txtValue.getVisibility();

                //View v=(View)R.id.lblCalculatedValue;
//findViewById(R.id.lblCalculatedValue);
            }
            case R.id.btnSubtract:
            {

            }
            case R.id.btnMultiply:
            {

            }
            case R.id.btnDivision:
            {

            }
        }
        }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.user_content);

    }
    }
