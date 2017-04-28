package com.houser.garima.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.Menu;

public class LoginPageActivity extends fwActivity implements View.OnClickListener{
    Button btnLogin;
    //LoginPageActivity loginAct=new LoginPageActivity();
    @Override
    public void onClick(View view) {
        Log.i("clicks","You Clicked B1");
        Intent i=new Intent(LoginPageActivity.this, UserActivity.class);
        startActivity(i);
        //setContentView(R.layout.mainscreenafterlogin);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
       // setContentView(R.layout.login_main);
        //btnLogin=(Button)findViewById(R.id.btnLoginSubmit);
      /*  btnLogin=(Button)findViewById(R.id.btnSubmit);

        //btnLogin.setOnClickListener(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Log.i("clicks","You Clicked B1");
                Intent i=new Intent(
                        LoginPageActivity.this,
                        UserActivity.class);
                startActivity(i);
            }
        });*/
        //loginAct.onClick(btnLogin);
    }
}
