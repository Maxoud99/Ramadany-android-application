package com.example.islam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Mos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mos);
        ArrayList<moslist>items=new ArrayList<>();
        items.add(new moslist("El Ekhtyar"));
        items.add(new moslist("El Fetwah"));
        items.add(new moslist("Forsa Tanya"));
        items.add(new moslist("El Nehaya"));
        items.add(new moslist("Valentino "));
        items.add(new moslist("EL Prince"));
        items.add(new moslist("Luebat Al-Nesyan"));
        items.add(new moslist("Lyalyna 80"));
        items.add(new moslist("Etneen Fel Sandoq"));
        items.add(new moslist("Kheyanet Ahad"));
        items.add(new moslist("Shahid Eian"));
        MyAdapter myAdapter=new MyAdapter(items);
        ListView ls =(ListView) findViewById(R.id.moslist);
        ls.setAdapter(myAdapter);
    }
    public void txtViewOnclick(View view) {
        TextView txtname=(TextView)view.findViewById(R.id.listname);
        String type=txtname.getText().toString();

    }
    class MyAdapter extends BaseAdapter {
        ArrayList<moslist> Items=new ArrayList<moslist>();
        MyAdapter(ArrayList<moslist>Items){
            this.Items=Items;
        }
        @Override
        public int getCount() {
            return Items.size();
        }

        @Override
        public Object getItem(int position) {
            return Items.get(position).name;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater=getLayoutInflater();
            View view1=layoutInflater.inflate(R.layout.mos_list,null);
            TextView txtname=(TextView)view1.findViewById(R.id.mosname);
            txtname.setText(Items.get(position).name);
            return view1;
        }
    }
}
