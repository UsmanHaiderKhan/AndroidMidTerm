package com.example.usmankhan.androidmidterm;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends AppCompatActivity {

    int[] images = {R.drawable.ic_launcher_background};
    String[] ltitle = {"Usman Haider Khan"};
    String[] descrp = {"Hello! How are You Android Uncle....?"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_list_view );
        ListView listView = (ListView) findViewById( R.id.mylist );
        CustomAdapter adpater = new CustomAdapter();
        listView.setAdapter( adpater );

    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate( R.layout.custome_list_layout, null );

            ImageView imageView = (ImageView) convertView.findViewById( R.id.image );
            TextView textView = (TextView) convertView.findViewById( R.id.title );
            TextView textView1 = (TextView) convertView.findViewById( R.id.description );
            imageView.setImageResource( images[position] );
            textView.setText( ltitle[position] );
            textView1.setText( descrp[position] );
            return convertView;
        }
    }
}
