package com.example.islam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayList<ListItems>items=new ArrayList<>();
        items.add(new ListItems("Moslslat"));
        items.add(new ListItems("Programs"));
        MyAdapter myAdapter=new MyAdapter(items);
        ListView ls =(ListView)findViewById(R.id.list);
//        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//
//            }
//        });
        ls.setAdapter(myAdapter);
    }
    public void txtViewOnclick(View view) {
        TextView txtname=(TextView)view.findViewById(R.id.listname);
        String type=txtname.getText().toString();
        if(type.equals("Moslslat")){
            Intent intent = new Intent(this, Mos.class);
            startActivity(intent);
        }else{
            if(type.equals("Programs")){
                Intent intent=new Intent(this,prog.class);
                startActivity(intent);
            }
        }
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
            TextView txtname=(TextView)view1.findViewById(R.id.listname);
            txtname.setText(Items.get(position).name);
            return view1;
        }
    }
}
