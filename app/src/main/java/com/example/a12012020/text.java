package com.example.a12012020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class text extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.examle.danz.testintentsenddata";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
    }
    public void sendMessage (View view){
        Intent intent = new Intent(this, textResult.class);
        EditText editText = (EditText) findViewById(R.id.edt);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
