package com.example.usmankhan.androidmidterm;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_notifications );

        Button noty_btn = (Button) findViewById( R.id.notification );
        noty_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNotification();
            }
        } );
    }

    public void getNotification() {
        Notification builder = new Notification.Builder( this )
                .setContentTitle( "Mid Exames" )
                .setContentText( "This is for the Prepration of the Exames" )
                .setSmallIcon( R.mipmap.ic_launcher )
                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService( NOTIFICATION_SERVICE );
        builder.flags |= Notification.FLAG_AUTO_CANCEL;
        notificationManager.notify( 0, builder );


    }
}
