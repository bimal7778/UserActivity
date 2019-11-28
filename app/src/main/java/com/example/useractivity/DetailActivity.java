package com.example.useractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView txtName, txtAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.imageView2);
        txtAddress = findViewById(R.id.textView6);
        txtName = findViewById(R.id.textView5);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            imageView.setImageResource(bundle.getInt( "profile"));
            txtName.setText(bundle.getString("name"));
            txtAddress.setText(bundle.getString("address"));
        }
    }
}
