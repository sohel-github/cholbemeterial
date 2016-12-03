package com.walletmix.humayunkabir.cholbe;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class Registration extends Activity {

    TextView regTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        regTitle = (TextView) findViewById(R.id.regTitle);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/ElMessiri-SemiBold.ttf");
        regTitle.setTypeface(custom_font);

    }

}
