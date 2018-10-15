package edu.ktu.firstapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private ListView myList;
    private ListAdapter adapter;
    private Context context = this;
    private static List<ListItem> items = new ArrayList<>();
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivityddesign);
        myList = (ListView) findViewById(R.id.ListView);



        Intent intent = getIntent();
        if(intent.getBooleanExtra("flag",true)){
            items.add(new ListItem("Jack", R.drawable.ic_3d_rotation_48pt,"Mathematics, Chemistry"));
            items.add(new ListItem("Jane", R.drawable.ic_announcement_black_48dp,"Physics, Informatics"));
            items.add(new ListItem("Bob", R.drawable.ic_alarm_black_48dp,"Mathematics, Informatics"));
            items.add(new ListItem("Clara", R.drawable.ic_account_box_48pt,"Geography, Chemistry"));
            items.add(new ListItem("Sam", R.drawable.ic_accessibility_48pt,"Mathematics, Physics"));
        }else{
            items.add(new ListItem("Mathematics", R.drawable.ic_3d_rotation_48pt,"Mathematics is the study of topics such as quantity, structure, " + "space and change."));
            items.add(new ListItem("Physics", R.drawable.ic_announcement_black_48dp,"Physics is the natural science that involves the study of matter and its motion through space and time, along with related concepts such as energy and force"));
            items.add(new ListItem("Chemistry", R.drawable.ic_alarm_black_48dp,"Chemistry is a branch of physical science that studies the composition, structure, properties and change of matter."));
            items.add(new ListItem("Informatics", R.drawable.ic_account_box_48pt,"Informatics is the science of information and cumputer information systems"));
            items.add(new ListItem("Geography", R.drawable.ic_accessibility_48pt,"Geography is a field of science devoted to the study of the lands, the features, the inhabitants, and the phenomena of earth"));

        }
        items.addAll(FirstActivity.getList());
        adapter = new ListAdapter(this,items);
        myList.setAdapter(adapter);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                runForthActivity((int) id);
            }
        });


    }

    public static ListItem getById(int id)
    {
        return items.get(id);
    }

    public void runForthActivity(int id)
        {
            Intent intent = new Intent(context, FourthActivity.class);
            intent.putExtra("flag",id);
            context.startActivity(intent);
        }

}
