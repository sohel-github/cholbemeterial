package com.walletmix.humayunkabir.cholbe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ContactFragment extends Fragment {

    ListView list;

    String[] title = {
            "Shidarto Sarkar",
            "Jahidul Hasan Shojib",
            "Osman Gani",
            "Neamul Karim",
            "Abdul Jabbar Sohel",
            "Mr Abul Basar",
            "Ziaul Kader Bablu"
    };

    String[] deg = {
            "Android Developer",
            "Software Engineer",
            "Web Developer",
            "Software Engineer",
            "Web Developer",
            "Manager Walletmix",
            "Marketing Executive"
    };

    String[] detail = {
            "Walletmix Ltd (Online Payment Gateway)",
            "Walletmix Ltd (Online Payment Gateway)",
            "Walletmix Ltd (Online Payment Gateway)",
            "Walletmix Ltd (Online Payment Gateway)",
            "Walletmix Ltd (Online Payment Gateway)",
            "Walletmix Ltd (Online Payment Gateway)",
            "Walletmix Ltd (Online Payment Gateway)"
    };

    Integer[] imageId = {
            R.drawable.au,
            R.drawable.ci,
            R.drawable.gb,
            R.drawable.cl,
            R.drawable.st,
            R.drawable.rue,
            R.drawable.es,
            R.drawable.hr
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        ContactAdapter adapter = new ContactAdapter(getContext(), title, deg, detail, imageId);
        list = (ListView)view.findViewById(R.id.contactList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), title[position], Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }


}
