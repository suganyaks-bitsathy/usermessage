package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText3);
        btnlogin=(Button)findViewById(R.id.button);

        btnlogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if(username.getText().toString().equals("xxx")
                                && password.getText().toString().equals("xxx"))
                        {
                            Toast.makeText(getApplicationContext(),"Valid User",
                                    Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"InValid User",
                                    Toast.LENGTH_LONG).show();

                        }



                    }
                }
        );





    }
}
