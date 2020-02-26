package com.example.islam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b=getIntent().getExtras();
        String Email=b.getString("Email");
        Toast.makeText(this,"  Hello ! \n "+Email,Toast.LENGTH_LONG).show();

        ArrayList<ListItems>Items=new ArrayList<>();
        Items.add(new ListItems("Android"));
        Items.add(new ListItems("iPhone"));
        Items.add(new ListItems("Windows"));
        Items.add(new ListItems("BluckBerry"));
        Items.add(new ListItems("Linux"));
        MyAdapter adapter=new MyAdapter(Items);
        ListView ls=(ListView)findViewById(R.id.ListView);
        ls.setAdapter(adapter);
    }
    public void txtViewOnclick(View view) {
        TextView txt=(TextView) findViewById(R.id.txt_view);
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }

    class MyAdapter extends BaseAdapter {
        ArrayList<ListItems>Items=new ArrayList<ListItems>();
        MyAdapter(ArrayList<ListItems>Items){
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
            View view1=layoutInflater.inflate(R.layout.list_view,null);
            TextView txtname=(TextView)view1.findViewById(R.id.txt_view);
            txtname.setText(Items.get(position).name);
            return view1;
        }
    }
}
