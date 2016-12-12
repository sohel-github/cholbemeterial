package com.walletmix.humayunkabir.cholbe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class EditContact extends AppCompatActivity {


    Spinner edit_contact_phone_number_spinner_1, edit_contact_phone_number_spinner_2,edit_contact_email_address_spinner_1, edit_contact_email_address_spinner_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_contact);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        edit_contact_phone_number_spinner_1 = (Spinner) findViewById(R.id.edit_contact_phone_number_spinner_1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.phone_number_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        edit_contact_phone_number_spinner_1.setAdapter(adapter);

        edit_contact_phone_number_spinner_2 = (Spinner) findViewById(R.id.edit_contact_phone_number_spinner_2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.phone_number_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        edit_contact_phone_number_spinner_2.setAdapter(adapter2);


        edit_contact_email_address_spinner_1 = (Spinner) findViewById(R.id.edit_contact_email_address_spinner_1);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.email_spinner, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        edit_contact_email_address_spinner_1.setAdapter(adapter3);

        edit_contact_email_address_spinner_2 = (Spinner) findViewById(R.id.edit_contact_email_address_spinner_2);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.email_spinner, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        edit_contact_email_address_spinner_2.setAdapter(adapter3);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home) {
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(menuItem);
    }

}
