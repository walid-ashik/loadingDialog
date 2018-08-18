package com.latenightcode;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ViewDialog viewDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewDialog = new ViewDialog(this);
    }

    public void showCustomLoadingDialog(View view) {
        //..show gif and hide after 5 seconds

        viewDialog.showDialog();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                viewDialog.hideDialog();
            }
        }, 7000);
    }
}
