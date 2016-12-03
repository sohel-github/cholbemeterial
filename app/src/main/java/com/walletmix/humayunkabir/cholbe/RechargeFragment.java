package com.walletmix.humayunkabir.cholbe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RechargeFragment extends Fragment {

    //protected ArrayList<String> strings;
    //private ListView listView;


    public RechargeFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recharge, container, false);



        return view;

    }

}
