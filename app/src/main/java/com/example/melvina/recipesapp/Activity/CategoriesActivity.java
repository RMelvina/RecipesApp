package com.example.melvina.recipesapp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.melvina.recipesapp.R;


public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

    }

    public void showBreakfastList (View view){
        Intent  breakfastList = new Intent(this,BreakfastActivity.class);
        startActivity(breakfastList);
    }

    public void showDinnerList(View view){
        Intent dinnerList = new Intent(this,DinnerActivity.class);
        startActivity(dinnerList);
     }

     public void showDessertList (View view){
        Intent dessertList= new Intent(this,DessertActivity.class);
         startActivity(dessertList);
     }


}
