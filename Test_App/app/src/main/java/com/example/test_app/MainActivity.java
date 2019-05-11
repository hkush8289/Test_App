package com.example.test_app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click = (Button) findViewById(R.id.click);
        click.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView Text = (TextView) findViewById(R.id.Text);
                        Text.setText("Button Clicked");
                    }
                }

        );
        click.setOnLongClickListener(
               new Button.OnLongClickListener(){
                   public boolean onLongClick(View v)
                   {
                       TextView Text=(TextView) findViewById(R.id.Text);
                       Text.setText("Long Press");
                       return true;


                   }
               }

        );


    }
}
