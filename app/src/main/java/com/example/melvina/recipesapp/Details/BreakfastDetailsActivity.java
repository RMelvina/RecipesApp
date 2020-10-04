package com.example.melvina.recipesapp.Details;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.melvina.recipesapp.R;
import com.r0adkll.slidr.Slidr;

public class BreakfastDetailsActivity extends AppCompatActivity {
   String  ingredients, titleRecipe_breakfast;
    int breakfastImageView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_details);

        //SLIDER - SLIDING ACTIVITIES TO CLOSE THEM
        Slidr.attach(this);

        TextView titleRes = (TextView)findViewById(R.id.titleRecipe_breakfast);
        TextView ingred = (TextView)findViewById(R.id.ingredients);
        ImageView bim = (ImageView)findViewById(R.id.DetailsBreakfastImage) ;


        //RECEIVING DATA AND CHECKING OF THE INTENT IS NULL OR NOT
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {

            titleRecipe_breakfast = extras.getString("title_recipe");
            titleRes.setText(titleRecipe_breakfast);

            breakfastImageView = extras.getInt("breakfastImage");
            bim.setImageResource(breakfastImageView);

            ingredients = extras.getString("recipeingre");
            ingred.setText(ingredients);



        }




    }
}
