package com.matthewbarbier.admin.recipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.recipe_list_item, R.id.listViewTemplateField, createData());

        ListView lv = (ListView)findViewById(R.id.listView);

        lv.setAdapter(adapter);
    }

    private String[] createData()
    {
        String [] recipeList  = {
            "Spag bol", "Tuna pasta bake", "Carbonara"
        };

        return recipeList;
    }
}
