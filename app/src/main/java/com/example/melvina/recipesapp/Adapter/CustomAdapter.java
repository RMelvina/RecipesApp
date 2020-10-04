package com.example.melvina.recipesapp.Adapter;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.melvina.recipesapp.R;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String>{
    String [] names;
    int [] imageViews;
    Context mContext;
    LayoutInflater inflater;


    public CustomAdapter( Context mContext,String[] names, int [] images) {
        super(mContext, R.layout.list_layout,names);
        this.mContext = mContext;
        this.names = names;
        this.imageViews=images;
    }

    public class ViewHolder
    {
        TextView recipeName;
        ImageView recipeImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //CHECK IF THE VIEW IS NULL, IF IT IS THAN CREATE THE VIEW HOLDER
        if (convertView == null)
        {
            inflater=(LayoutInflater)mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_layout,null);

        }
        // IF IT IS NOT THAN
        ViewHolder holder = new ViewHolder();

        //INITIALIZE THE VIEWS
        holder.recipeName=(TextView) convertView.findViewById(R.id.textView);
        holder.recipeImage=(ImageView) convertView.findViewById(R.id.imageView);

        //ASSIGNING THE DATA TO THE VIEWS
        holder.recipeName.setText(names[position]);
        holder.recipeImage.setImageResource(imageViews[position]);


        return  convertView;
    }
}


