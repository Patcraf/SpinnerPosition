package com.samuelvialle.spinnerposition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String[] liste = {"Item 1", "Item 2", "Item 3", "Item 4"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapterPourListeLocal =
                new ArrayAdapter<String>
                        (this, android.R.layout.simple_list_item_1, liste);

        adapterPourListeLocal
                .setDropDownViewResource
                        (androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapterPourListeLocal);
        int myPposition = 2;
        spinner.setSelection(myPposition);
    }
}






















