package com.example.melvina.recipesapp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.melvina.recipesapp.Adapter.CustomAdapter;
import com.example.melvina.recipesapp.Details.DessertDetailsActivity;
import com.example.melvina.recipesapp.R;
import com.r0adkll.slidr.Slidr;

public class DessertActivity extends AppCompatActivity {

    ListView dessertListView;

    int[] images = {R.drawable.dess_im_1,
            R.drawable.dess_im_2,
            R.drawable.dess_im_3,
            R.drawable.dess_im_4,
            R.drawable.dess_im_5,
            R.drawable.dess_im_6,
            R.drawable.dess_im_7,
            R.drawable.dess_im_8,
            R.drawable.dess_im_9,
            R.drawable.dess_im_10};

    String[] names = {"Bread & Butter Pudding",
            "Feijoa Bran Muffins",
            "Feijoa & Banana Loaf",
            "Melissa Jones Boysenberry Tart",
            "Trifle",
            "Steamed Pudding",
            "Lamingtons",
            "Belgium Biscuits",
            "Meringues",
            "Plum and Chocolate Self Saucing Pudding"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_list);

        //SLIDER - SLIDING ACTIVITIES TO CLOSE THEM
        Slidr.attach(this);

        //CONNECTS THE LIST OF DATA TO THE LISTVIEW
        dessertListView =(ListView) findViewById(R.id.dessertList);

        //CONNECTING THE ADAPTER TO THE ACTIVITY
        CustomAdapter customeAdapter = new CustomAdapter(this, names,images);
        dessertListView.setAdapter(customeAdapter);

        //PASSING DATA TO THE DETAILS
        dessertListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //CHECKS THE POSITION OF THE NAME AND IMAGE IN THE LIST
                String name = names[position];
                final int dess_image = images [position];

                //GETS THE TITLE OF RECIPES FROM THE STRINGARRAY
                String[] titleRecipe = getResources().getStringArray(R.array.dessert_recipe_titles);
                final String title_recipe = titleRecipe[position];

                //GET THE INGREDIENTS OF RECIPES FROM THE STRINGARRAY
                String[] recipeingredients = getResources().getStringArray(R.array.dessert_ing);
                final String recipeingre = recipeingredients[position];

                Intent intent = new Intent(getApplicationContext(),DessertDetailsActivity.class);
                intent.putExtra("title_recipe", title_recipe);
                intent.putExtra("recipeingre", recipeingre);
                intent.putExtra("dessertImage", dess_image);
                startActivity(intent);
            }
        });

}

}





