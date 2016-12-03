package com.walletmix.humayunkabir.cholbe;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class Login extends Activity {

    TextView logTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        logTitle = (TextView) findViewById(R.id.logTitle);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/ElMessiri-SemiBold.ttf");
        logTitle.setTypeface(custom_font);

    }

}
