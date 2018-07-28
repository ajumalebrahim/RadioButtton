package com.example.ajumal.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rChanged(View view) {

        ImageView imgVw = (ImageView)findViewById(R.id.RdoImg);
        int vId = view.getId();

        if (vId == R.id.RdBtnLeo) {
            imgVw.setImageResource(R.drawable.ic_launcher_background);
        } else if (vId == R.id.RdBtnMike) {
            imgVw.setImageResource(R.drawable.ic_launcher_foreground);
        } else if (vId == R.id.RdBtnDon) {
            imgVw.setImageResource(R.drawable.ic_launcher_background);
        } else  if (vId == R.id.RdBtnRaph) {
            imgVw.setImageResource(R.drawable.ic_launcher_foreground);
        }
    }


}
