package com.example.feroljohnnohay.nohayferollab5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v){
        Intent i, chooser ;

        if (v.getId() == R.id.btnScreen1){
            i = new Intent (this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnMap2){
            i = new Intent (Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.594595, 120.970553"));
            chooser = Intent.createChooser(i, "create a map app");
            startActivity(chooser);
        }
    }
}
