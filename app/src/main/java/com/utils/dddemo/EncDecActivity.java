package com.utils.dddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class EncDecActivity extends AppCompatActivity {


    public static void openActivity(Activity activity) {
        Intent intent = new Intent(activity, EncDecActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enc_dec);
    }
}
