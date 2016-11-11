package com.rolando.ejemploactionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_settings:
                Toast.makeText(MainActivity.this,"Click en Settings",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.buscar:
                Toast.makeText(MainActivity.this,"Click en Buscar",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nuevo:
                Toast.makeText(MainActivity.this,"Click en nuevo",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
