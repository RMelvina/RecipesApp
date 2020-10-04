package com.example.melvina.recipesapp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.melvina.recipesapp.Details.BreakfastDetailsActivity;
import com.example.melvina.recipesapp.Adapter.CustomAdapter;
import com.example.melvina.recipesapp.R;
import com.r0adkll.slidr.Slidr;

public class BreakfastActivity extends AppCompatActivity {


    ListView ListView;

    int[] images = {R.drawable.bf_im1,
            R.drawable.bf_im_2,
            R.drawable.bf_im_3,
            R.drawable.bf_im_4,
            R.drawable.bf_im_5,
            R.drawable.bf_im_6,
            R.drawable.bf_im_7,
            R.drawable.bf_im_8,
            R.drawable.bf_im_9,
            R.drawable.bf_im_10};



    String[] names = {"Breakfast Tortilla with Baked Beans",
            "Hawaiian Spaghetti Pockets",
            "Savoury Mince on Toast",
            "French Toast",
            "Self-Crusting Quiche with Tomato Chutney",
            "Beans over Hash Browns with Egg",
            "Peach Pancakes",
            "Easy Bacon and Egg Slice",
            "Spaghetti and Egg Pies",
            "Maple and Orange Crêpes"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_list);

        //SLIDER - SLIDING ACTIVITIES TO CLOSE THEM
        Slidr.attach(this);


        //CONNECTS THE LIST OF DATA TO THE LISTVIEW
        ListView =(ListView) findViewById(R.id.breakfastList);

        //CONNECTING THE ADAPTER TO THE ACTIVITY
        CustomAdapter adapter = new CustomAdapter(this, names,images);
       ListView.setAdapter(adapter);

        //PASSING DATA TO THE DETAILS
       ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               //CHECKS THE POSITION OF THE NAME AND IMAGE IN THE LIST
               String name = names[position];
               final int image = images[position];

               //GETS THE TITLE OF RECIPES FROM THE STRINGARRAY
                String[] titleRecipe = getResources().getStringArray(R.array.breakfast_recipe_titles);
                final String title_recipe = titleRecipe[position];

                //GET THE INGREDIENTS OF RECIPES FROM THE STRINGARRAY
               String[] recipeingredients = getResources().getStringArray(R.array.breakfast_ing);
               final String recipeingre = recipeingredients[position];

               Intent intent = new Intent(getApplicationContext(),BreakfastDetailsActivity.class);
               intent.putExtra("title_recipe", title_recipe);
               intent.putExtra("recipeingre", recipeingre);
               intent.putExtra("breakfastImage", image);


               startActivity(intent);

}
     });

 }

}


