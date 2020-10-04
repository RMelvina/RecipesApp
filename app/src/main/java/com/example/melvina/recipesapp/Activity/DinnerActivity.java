package com.example.melvina.recipesapp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.melvina.recipesapp.Adapter.CustomAdapter;
import com.example.melvina.recipesapp.Details.DinnerDetailsActivity;
import com.example.melvina.recipesapp.R;
import com.r0adkll.slidr.Slidr;

public class DinnerActivity extends AppCompatActivity {
    ListView mListView;

    int[] images = {R.drawable.d_im_1,
            R.drawable.d_im_2,
            R.drawable.d_im_3,
            R.drawable.d_im_4,
            R.drawable.d_im_5,
            R.drawable.d_im_7,
            R.drawable.d_im_6,
            R.drawable.d_im_8,
            R.drawable.d_im_9,
            R.drawable.d_im_10};

    String[] names = {"Porcupine Meatballs",
            "Mustard Chicken",
            "Mexican Nacho Bowls",
            "Creamy Mushroom and Chicken Fettuccine",
            "Honey Mustard Chicken Pie",
            "Creamy Mushroom and Chicken Stroganoff",
            "Classic Nachos",
            "Honey Mustard Chicken Potato Bake",
            "Easy Bacon Wrapped Chicken",
            "Chicken Pea Risotto"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner_list);


        //CONNECTS THE LIST OF DATA TO THE LISTVIEW
        mListView =(ListView) findViewById(R.id.dinnerList);

        //CONNECTING THE ADAPTER TO THE ACTIVITY
        CustomAdapter customAdapter = new CustomAdapter(this, names,images);
        mListView.setAdapter(customAdapter);

        //SLIDER - SLIDING ACTIVITIES TO CLOSE THEM
        Slidr.attach(this);

        //PASSING DATA TO THE DETAILS
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //CHECKS THE POSITION OF THE NAME AND IMAGE IN THE LIST
                String name = names[position];
                final int din_image = images[position];

                //GETS THE TITLE OF RECIPES FROM THE STRINGARRAY
                String[] titleRecipe = getResources().getStringArray(R.array.dinner_recipe_titles);
                final String title_recipe = titleRecipe[position];

                //GET THE INGREDIENTS OF RECIPES FROM THE STRINGARRAY
                String[] recipeingredients = getResources().getStringArray(R.array.dinner_ing);
                final String recipeingre = recipeingredients[position];

                Intent intent = new Intent(getApplicationContext(),DinnerDetailsActivity.class);
                intent.putExtra("title_recipe", title_recipe);
                intent.putExtra("recipeingre", recipeingre);
                intent.putExtra("dinnerImage", din_image);
                startActivity(intent);
            }
        });


 }

}



