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

public class prog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog);

        ArrayList<progList>items=new ArrayList<>();
        items.add(new progList("Ramez magnoon rasmy"));
        items.add(new progList("Crazy Taxi"));
        items.add(new progList("Eghlb El-Sa'a"));
        items.add(new progList("Lalahom Yafqahoon "));
        items.add(new progList("EL-Imam El-Tayeb"));
        items.add(new progList("Ard El-Anbya'a"));
        prog.MyAdapter myAdapter=new prog.MyAdapter(items);
        ListView ls =(ListView) findViewById(R.id.listprog);
        ls.setAdapter(myAdapter);
    }
    public void txtViewOnclick(View view) {
        TextView txtname=(TextView)view.findViewById(R.id.listname);
        String type=txtname.getText().toString();

    }
    class MyAdapter extends BaseAdapter {
        ArrayList<progList> Items=new ArrayList<>();
        MyAdapter(ArrayList<progList>Items){
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
            View view1=layoutInflater.inflate(R.layout.list_prog,null);
            TextView txtname=(TextView)view1.findViewById(R.id.progname);
            txtname.setText(Items.get(position).name);
            return view1;
        }
    }
}
