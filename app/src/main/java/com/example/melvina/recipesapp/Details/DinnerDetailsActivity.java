package com.example.melvina.recipesapp.Details;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.melvina.recipesapp.R;
import com.r0adkll.slidr.Slidr;

public class DinnerDetailsActivity extends AppCompatActivity {
    String  ingredients, titleRecipe_dinner;
    int dinnerImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner_details);


//SLIDER - SLIDING ACTIVITIES TO CLOSE THEM
        Slidr.attach(this);


        TextView dinnerTitl = (TextView) findViewById(R.id.titleRecipe_dinner);
        TextView ingred = (TextView)findViewById(R.id.ingredients);
        ImageView dinim = (ImageView)findViewById(R.id.DetailsDinnerImage) ;


        //RECEIVING DATA AND CHECKING OF THE INTENT IS NULL OR NOT
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {

            dinnerImageView = extras.getInt("dinnerImage");
            dinim.setImageResource(dinnerImageView);

            titleRecipe_dinner = extras.getString("title_recipe");
            dinnerTitl.setText(titleRecipe_dinner );

            ingredients = extras.getString("recipeingre");
            ingred.setText(ingredients);
        }




    }
}

