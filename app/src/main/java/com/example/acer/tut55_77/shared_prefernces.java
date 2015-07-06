package com.example.acer.tut55_77;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import  android.widget.EditText;
import android.widget.Toast;
import android.os.Build;


public class shared_prefernces extends ActionBarActivity {
    TextView sp_tv1;
    EditText sp_et1,sp_et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_prefernces);
        sp_tv1 = (TextView)findViewById(R.id.sp_tv3);
        sp_et1 =(EditText)findViewById(R.id.sp_et1);
        sp_et2 =(EditText)findViewById(R.id.sp_et2);
    }
    public void save(View view){
        SharedPreferences spref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = spref.edit();
        editor.putString("username",sp_et1.getText().toString());
        editor.putString("password", sp_et2.getText().toString());
        //editor.apply();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            // If so, call apply()
            editor.apply();
// if not
        } else {
            // Call commit()
            editor.commit();
        }
        Toast.makeText(this,"saved",Toast.LENGTH_LONG).show();
    }
    public void display(View view ){
        SharedPreferences spref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        String un = spref.getString("username", "");
        String pwd = spref.getString("password","");
        sp_tv1.setText(un+" "+pwd);

    }



}
