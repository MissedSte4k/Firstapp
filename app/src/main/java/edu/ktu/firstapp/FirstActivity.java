package edu.ktu.firstapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {


    private Button secondActivityButton;
    private EditText title;
    private EditText Description;
    private Button add;
    private Context context = this;

    static private List<ListItem> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);
        setContentView(R.layout.firstactivitydesign);

        secondActivityButton = (Button) findViewById(R.id.secondActivityButton);
        title = (EditText) findViewById(R.id.editText);
        Description = (EditText) findViewById(R.id.editText2);
        add = (Button) findViewById(R.id.button);

        items.add(new ListItem("Jack", R.drawable.ic_3d_rotation_48pt,"Mathematics, Chemistry"));
        items.add(new ListItem("Jane", R.drawable.ic_announcement_black_48dp,"Physics, Informatics"));

        secondActivityButton.setOnClickListener(startSecondActivity);
        secondActivityButton.setOnLongClickListener(startThirdActivityLong);

        add.setOnClickListener(startAdd);
    }

    static public List<ListItem> getList()
    {
        return items;
    }
    public void runSecondActivity(boolean b)
    {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra("flag",b);
        context.startActivity(intent);
    }

    public void runThirdActivity()
    {
        Intent intent = new Intent(context, ThirdActivity.class);
        context.startActivity(intent);
    }

    View.OnClickListener startSecondActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            runSecondActivity(true);
        }
    };


    View.OnClickListener startAdd = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            items.add(new ListItem(title.getText().toString(), R.drawable.ic_3d_rotation_48pt, Description.getText().toString()));
        }
    };



    View.OnLongClickListener startThirdActivityLong = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            runThirdActivity();
            return  true;
        }
    };
}
