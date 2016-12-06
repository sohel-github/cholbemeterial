package com.walletmix.humayunkabir.cholbe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class RechargeFragment extends Fragment {


    public RechargeFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recharge, container, false);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu,MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.menu_recharge, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.forget_pin) {

            return true;
        }
        if (id == R.id.change_pin) {
            Intent cp = new Intent("com.walletmix.humayunkabir.cholbe.CHANGEPIN");
            startActivity(cp);
            return true;
        }
        if (id == R.id.recharge_history) {
            Intent rh = new Intent("com.walletmix.humayunkabir.cholbe.RECHARGEHISTORY");
            startActivity(rh);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
