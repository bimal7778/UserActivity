package com.example.useractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViw);

        /* have to create a interface to fetch data from Database */

        // Data listing through Arraylist
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Bimal Godar", "30", "Lalitpur", "male", R.drawable.male, R.drawable.delete));
        contactsList.add(new Contacts("Harry potter", "20", "Bhaktapur", "male", R.drawable.male, R.drawable.delete));
        contactsList.add(new Contacts("Alisha Chan", "19", "Kathmandu", "female", R.drawable.female, R.drawable.delete));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}