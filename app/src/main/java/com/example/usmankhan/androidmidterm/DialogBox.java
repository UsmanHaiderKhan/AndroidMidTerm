package com.example.usmankhan.androidmidterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DialogBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dialog_box );
        Button btn_naught=(Button) findViewById( R.id.naught );
        btn_naught.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialogBox();
            }
        } );
    }
   public void  getDialogBox()
   {
        DialogFragements fragements=new DialogFragements();
        fragements.show( getSupportFragmentManager(),"Dialog Fragements" );
   }

}
