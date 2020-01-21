package com.example.a12012020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "com.examle.danz.testintentsenddata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickNext( View view){
        Button btntext = (Button)findViewById(R.id.btntext);
        Intent intent = new Intent(MainActivity.this,text.class);
        startActivity(intent);
    }
    public void onClickcall( View view) {
       Uri number = Uri.parse("tel:0961815943");
       Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
       startActivity(callIntent);
    }
    public void onClickWeb( View view) {
        Uri webpage = Uri.parse("http://www.google.com");
        Intent web = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(web);
    }
    public void onClictext( View view) {
        Intent sendmessage = new Intent();
        sendmessage.setAction(Intent.ACTION_SEND);
        sendmessage.putExtra(Intent.EXTRA_TEXT, "this is my text to send");
        sendmessage.setType("text/plain");
        startActivity(Intent.createChooser(sendmessage, "จตุพล งอยภูธร"));
    }
    public void onClicmap( View view) {
       Uri location = Uri.parse("geo:16.999754,104.169462?z=14");
       Intent mapintent = new Intent(Intent.ACTION_VIEW, location);
       startActivity(mapintent);
    }
}
