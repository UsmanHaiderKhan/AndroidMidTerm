package com.example.usmankhan.androidmidterm;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;

public class DialogFragements extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder( getActivity() );
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View view=inflater.inflate( R.layout.dialog_content,null );
        builder.setView( view ).setTitle( "Login" ).setNegativeButton( "Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        } ).setPositiveButton( "Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        } );

        return builder.create();
    }


}
