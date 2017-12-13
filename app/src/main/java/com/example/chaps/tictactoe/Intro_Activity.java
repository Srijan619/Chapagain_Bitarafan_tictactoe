package com.example.chaps.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intro_Activity extends Activity implements View.OnClickListener {

    private Button btnSingle;
    private Button btnMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_);

        btnSingle = (Button) findViewById(R.id.btnSingle);
        btnMulti = (Button) findViewById(R.id.btnMultiplayer);

        btnSingle.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSingle:
                Intent intent=new Intent(this,tictak.class);
                startActivity(intent);
                break;
            case R.id.btnMultiplayer:
                break;
            default:
                break;
        }
    }
}
