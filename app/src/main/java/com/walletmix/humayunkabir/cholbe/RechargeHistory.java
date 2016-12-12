package com.walletmix.humayunkabir.cholbe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class RechargeHistory extends AppCompatActivity {

    ListView lv;


    String[] transactionID = {
            "245789365",
            "258147365",
            "753254896",
            "123547896",
            "258412563",
            "452152365",
            "589632145"
    };

    String[] orderID = {
            "256325145",
            "147589632",
            "147253654",
            "147836254",
            "471256325",
            "123852456",
            "236521478"
    };

    String[] rechargeAMMOUNT = {
            "100",
            "150",
            "50",
            "200",
            "50",
            "100",
            "300"
    };

    String[] phoneNO = {
            "01717111222",
            "01717111222",
            "01717111222",
            "01717111222",
            "01717111222",
            "01717111222",
            "01717111222"
    };

    String[] rechargeTYPE = {
            "Pre-Paid",
            "Pre-Paid",
            "Pre-Paid",
            "Pre-Paid",
            "Post-Paid",
            "Pre-Paid",
            "Pre-Paid"
    };

    String[] rechargeREMARK = {
            "Nice",
            "Nice",
            "Nice",
            "Nice",
            "Nice",
            "Nice",
            "Nice"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recharge_history);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        lv=(ListView) findViewById(R.id.rechargeHistoryList);
        lv.setAdapter(new RechargeHistoryAdapter(RechargeHistory.this,transactionID,orderID,rechargeAMMOUNT,phoneNO,rechargeTYPE,rechargeREMARK));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recharge, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home) {
            this.onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

}
