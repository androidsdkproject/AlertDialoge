package com.example.android1.alertdialoge;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String fontPath="fonts/Face Your Fears.ttf";
        TextView textView=(TextView)findViewById(R.id.text);

        Typeface tface=Typeface.createFromAsset(getAssets(),fontPath);

        textView.setTypeface(tface);

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Alert Message");
        alertDialog.setMessage("Do you Want to save this file");
        alertDialog.setIcon(R.drawable.ic_save_black_24dp);
        alertDialog.setCancelable(false);

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"click on yes",Toast.LENGTH_LONG).show();
            }
        });

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"click on no",Toast.LENGTH_LONG).show();
            }
        });


        alertDialog.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"click on cancel",Toast.LENGTH_LONG).show();
            }
        });
        alertDialog.show();




    }
}
