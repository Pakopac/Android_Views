package com.example.lilia.helloworldetressources;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Lilian Pacaud");

        Toast.makeText(MainActivity.this,
                "Hello World", Toast.LENGTH_LONG).show();

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR) - 1999;

        TextView getYear = findViewById(R.id.getYear);
        getYear.setText("" + year + " ans");

        Log.v("MainActivity","Hello World");
    }


}