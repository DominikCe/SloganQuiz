package com.coppertincoders.sloganquiz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare In and Outputs
    TextView lblSlogan;
    EditText txtInput;
    Button buSubmit;

    String sAnswer = "";
    String sSolution = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Integrate In and Outputs
        lblSlogan = (TextView) findViewById(R.id.lblSlogan);
        txtInput = (EditText) findViewById(R.id.txtInput);
        buSubmit = (Button) findViewById(R.id.buSubmit);

        sSolution = "Bauhaus";

        //Submit-button OnClick-Event
        buSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //here some cool button action!!!! (with explosions! *booooom*)
                sAnswer = txtInput.getText().toString();
                checkAnswer();
            }
        });
    }

    //Checks if the Answer is right
    public void checkAnswer() {
        if (sAnswer.equals(sSolution)) {
            lblSlogan.setText("richtig");
        } else {
            lblSlogan.setText("FALSCH!!!");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
