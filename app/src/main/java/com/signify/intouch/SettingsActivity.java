package com.signify.intouch;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class SettingsActivity extends ActionBarActivity {

    Button editResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        editResponse = (Button)findViewById(R.id.button_edit_response);

        editResponse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoEditCannedActivity();
            }
        });
    }

    private void gotoEditCannedActivity(){
        Intent intent = new Intent(this, EditCannedActivity.class);
        startActivity(intent);
    }

    private void propagateData(){

    }

}