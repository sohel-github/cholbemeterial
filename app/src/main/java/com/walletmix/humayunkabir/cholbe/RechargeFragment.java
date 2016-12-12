package com.walletmix.humayunkabir.cholbe;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RechargeFragment extends Fragment implements View.OnClickListener{

    EditText input_phone_number,input_amount;
    RadioGroup rechargeTypeGropup;
    RadioButton radioButtonPrepaid,radioButtonPostPaid;
    Button recharge;

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

        input_phone_number = (EditText)view.findViewById(R.id.input_phone_number);
        rechargeTypeGropup = (RadioGroup)view.findViewById(R.id.recharge_type_group);
        radioButtonPrepaid = (RadioButton)view.findViewById(R.id.radioButtonPrepaid);
        radioButtonPostPaid = (RadioButton)view.findViewById(R.id.radioButtonPostPaid);
        input_amount = (EditText)view.findViewById(R.id.input_amount);

        recharge = (Button)view.findViewById(R.id.btn_recharge);
        recharge.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(final View v) {
        switch (v.getId()){
            case R.id.btn_recharge:

                final CharSequence[] items = {" Pay by Card "," Pay by Fund "};

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Choose Payment Option");

                builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {

                        switch(item)
                        {
                            case 0:
                                Toast.makeText(getActivity(), "Pay by Card", Toast.LENGTH_LONG).show();
                                break;
                            case 1:
                                Toast.makeText(getActivity(), "Pay by Fund", Toast.LENGTH_LONG).show();
                                break;
                        }

                    }
                });
                builder.create();
                builder.show();


                break;
        }
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
