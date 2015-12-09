package com.example.hariprasad.lesson5;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button convertButton;
    EditText convertEditText;
    TextView centimeter,kilometer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        convertEditText = (EditText)findViewById(R.id.convert_edittext_id);
        convertButton =  (Button)findViewById(R.id.convert_button_id);
        centimeter = (TextView)findViewById(R.id.cm_id);
        kilometer = (TextView)findViewById(R.id.km_id);


        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    centimeter.setText(Integer.parseInt(convertEditText.getText().toString()) * 100 + " cm");
                    kilometer.setText(Double.parseDouble(convertEditText.getText().toString()) /1000 + "  km");

                } catch (NullPointerException e) {
                    Toast.makeText(getApplication(), "Please enter Meter", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}

