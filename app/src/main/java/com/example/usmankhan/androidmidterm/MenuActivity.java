package com.example.usmankhan.androidmidterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menu );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater(  );
        inflater.inflate( R.menu.laboure_menu,menu );
      return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.usman:
                Toast.makeText( this,"You Select the Usman Khan for Teaching Programming",Toast.LENGTH_SHORT ).show();
                return true;
            case R.id.salman:
                Toast.makeText( this,"You Select the Salman Khan for Cleaning the Rooms",Toast.LENGTH_SHORT ).show();
                return true;
            case R.id.arslan:
                Toast.makeText( this,"You Select the Arslan Ammer for Electrical Wiring",Toast.LENGTH_SHORT ).show();
                return true;
            case R.id.saim:
                Toast.makeText( this,"You Select the Saim Khan for Construction of Buildings",Toast.LENGTH_SHORT ).show();
                return true;
                default:
                    return super.onOptionsItemSelected( item);
        }

    }
}
