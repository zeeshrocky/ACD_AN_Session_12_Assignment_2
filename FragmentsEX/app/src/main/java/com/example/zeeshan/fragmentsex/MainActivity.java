package com.example.zeeshan.fragmentsex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    boolean status = false;
    Simpleaddition simpleaddition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.et_top);
        button = (Button) findViewById(R.id.Button_top);
        simpleaddition = new Simpleaddition();

        if (!status){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment, simpleaddition).commit();
        }

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                changeFragmentTextView(simpleaddition, editText.getText().toString());
                Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_LONG).show();
            }
        };

        button.setOnClickListener(listener);



    }

    private void changeFragmentTextView(Simpleaddition simpleaddition, String s) {
        ((TextView) simpleaddition.getView().findViewById(R.id.tv_fragment)).setText(s);
    }


}