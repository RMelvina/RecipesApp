package com.example.melvina.recipesapp.Details;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.melvina.recipesapp.R;
import com.r0adkll.slidr.Slidr;

public class DessertDetailsActivity extends AppCompatActivity {
    String  ingredients, titleRecipe_dessert;
    int dessertImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_details);

       //SLIDER - SLIDING ACTIVITIES TO CLOSE THEM
        Slidr.attach(this);

        TextView dessertTitl = (TextView) findViewById(R.id.titleRecipe_dessert);
        TextView ingred = (TextView)findViewById(R.id.ingredients);
        ImageView dessim = (ImageView)findViewById(R.id.DDImage) ;

        //RECEIVING DATA AND CHECKING OF THE INTENT IS NULL OR NOT
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {

            dessertImageView = extras.getInt("dessertImage");
            dessim.setImageResource(dessertImageView);

            titleRecipe_dessert = extras.getString("title_recipe");
            dessertTitl.setText(titleRecipe_dessert );

            ingredients = extras.getString("recipeingre");
            ingred.setText(ingredients);
        }




    }
}



