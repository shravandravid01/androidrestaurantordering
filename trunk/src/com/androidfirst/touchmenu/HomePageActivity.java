package com.androidfirst.touchmenu;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

//public class HomePageActivity  extends MenuActivity implements OnClickListener{

 
 /*
protected void onCreate(Bundle savedValues)
{
 //   super.onCreate(savedInstanceState);
 //   setContentView(R.layout.category);
   //ImageButton NavigateToCategory = (ImageButton) findViewById(R.id.ordericon);
    //ImageButton NavigateToCategory = (ImageButton) findViewById(R.id.ordericon);
   // NavigateToCategory.setOnClickListener(  new View.OnClickListener() 
    ImageButton button =(ImageButton)findViewById(R.id.ordericon);
    button.setOnClickListener( this);
}
    public void onClick(View b) {
    // navigate to category page//consider using the clickhandler with switch
    	setContentView(R.layout.login);
    };
    
    
} 
*/
	
	public class HomePageActivity extends MenuActivity {
	    /** Called when the activity is first created. */
		
	    @Override
	    public void onCreate(Bundle  savedInstanceState)
	    {
	        super.onCreate(savedInstanceState);
	     setContentView(R.layout.home);
	       
	     ImageButton OrderMeal = (ImageButton) findViewById(R.id.ordericon);
	        OrderMeal.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                Intent myCategoryIntent = new Intent(HomePageActivity.this, CategoryPageActivity.class);
	                //setContentView(R.layout.home);
	                startActivity(myCategoryIntent);
	            }

	        });
	    }
	}
	