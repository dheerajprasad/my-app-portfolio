package com.example.nanodegree.MyPortfolioApp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String toastMessage ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void onClick(View v) {
        final int id = v.getId();
        switch (id) {
            case R.id.btnspotifysteamer:
                this.toastMessage = getResources().getString(R.string.btn_spotifystreamer);
                break;
            case R.id.btnscores:
                this.toastMessage =  getResources().getString(R.string.btn_scoresapp);
                break;
            case R.id.btnlibrary:
                this.toastMessage =  getResources().getString(R.string.btn_libraryapp);
                break;
            case R.id.btnbuilditbig:
                this.toastMessage =  getResources().getString(R.string.btn_builditbig);
                break;
            case R.id.btnxyzreader:
                this.toastMessage =  getResources().getString(R.string.btn_xyzreader);
                break;
            case R.id.btncapstone:
                this.toastMessage =  getResources().getString(R.string.btn_capstone);
                break;



        }
        displaytoastMessage( this.toastMessage);

    }


    private void displaytoastMessage(String message)
    {
        Context context = getApplicationContext();
        String text =  getResources().getString(R.string.toast_message)+ message.toLowerCase() +  getResources().getString(R.string.btn_capstone);;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


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
