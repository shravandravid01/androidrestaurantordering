package com.androidfirst.touchmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class CategoryPageActivity extends MenuActivity{



    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        
        ImageButton Drinks = (ImageButton) findViewById(R.id.drinksicon);
          Drinks.setOnClickListener(new View.OnClickListener() {
               public void onClick(View view) {
                   Intent myPopulatorIntent = new Intent(CategoryPageActivity.this, DataBasePopulator.class);
                   //setContentView(R.layout.home);
                   startActivity(myPopulatorIntent);
               }

           });
       }
}