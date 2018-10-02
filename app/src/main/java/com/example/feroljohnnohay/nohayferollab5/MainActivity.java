package com.example.feroljohnnohay.nohayferollab5;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this,MyService.class);
        startService(i);
    }

    public void processNext(View v){
        Intent i = null, chooser = null;

        if (v.getId() == R.id.btnScreen2){
            i = new Intent (this, Activity2.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnMap){
            i = new Intent (Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.615569, 120.988985"));
            chooser = Intent.createChooser(i, "create a map app");
            startActivity(chooser);
        }
    }

}
