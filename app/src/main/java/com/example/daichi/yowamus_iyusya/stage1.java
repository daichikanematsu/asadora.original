package com.example.daichi.yowamus_iyusya;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class stage1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage1);
    }




    public void modoru(View v) {
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game_activity1, menu);
        return true;
    }

    int hazure=new java.util.Random().nextInt(2)+1;


    public void one(View v){
        if (hazure==1){
            Intent intent = new Intent(this, gameover.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(this, stage2.class);
            startActivity(intent);
        }
    }

    public void two(View v){
        if (hazure==2){
            Intent intent = new Intent(this, gameover.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(this, stage2.class);
            startActivity(intent);
        }
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
