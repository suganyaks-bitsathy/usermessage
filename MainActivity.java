package com.example.usermessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText1);
        String tst=editText.getText().toString();
        btn=(Button)findViewById(R.id.button1);

       btn.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {

                       Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_LONG).show();

                   }
               }
       );




    }
}
