package com.example.melvina.recipesapp.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.melvina.recipesapp.R;

public class OpeningActivity extends AppCompatActivity {
    private static int Recipes = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run () {
                Intent mainIntent = new Intent(OpeningActivity.this, CategoriesActivity.class);
                startActivity(mainIntent);
                finish();


            }
        }, Recipes);
    }
}
