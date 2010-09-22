package com.androidfirst.touchmenu;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

	
	public class HomePageActivity extends MenuActivity implements View.OnClickListener {
	    /** Called when the activity is first created. */
		
	    @Override
	    public void onCreate(Bundle  savedInstanceState)
	    {
	        super.onCreate(savedInstanceState);
	     setContentView(R.layout.home);
	  //   ImageButton myButton;
	 //    myButton=getMyButton();
	     
	     	
	         ImageButton  ordericon = (ImageButton) findViewById(R.id.ordericon);
	        ordericon.setOnClickListener(this);
	        ImageButton  viewordersicon= (ImageButton) findViewById(R.id.viewordersicon);
	        viewordersicon.setOnClickListener(this) ;
	         ImageButton  refilldrinkicon= (ImageButton) findViewById(R.id.refilldrinkicon);
	         refilldrinkicon.setOnClickListener(this);
	         
	         ImageButton pagewaitericon= (ImageButton) findViewById(R.id.pagewaitericon);
	         pagewaitericon.setOnClickListener(this);
	         ImageButton  paybillicon = (ImageButton) findViewById(R.id.paybillicon);
	         paybillicon.setOnClickListener(this) ;
	    }
	    
	    
	            public void onClick(View view) {
	            	switch(view.getId())
	            	{
	            	case R.id.ordericon: 
	            	Intent myCategoryIntent = new Intent(HomePageActivity.this, CategoryPageActivity.class);
	                startActivity(myCategoryIntent);
	                break;
	            	
	            	case R.id.paybillicon:
	            		Intent myCategoryIntent2 = new Intent(HomePageActivity.this,PageMyWaiterActivity.class);
		                startActivity(myCategoryIntent2);
		                break;
	            	
	            	case R.id.viewordersicon:
	            		Intent myCategoryIntent3 = new Intent(HomePageActivity.this,OrderedItemsPageActivity.class);
		                startActivity(myCategoryIntent3);
		                break;
		                
	            	case R.id.refilldrinkicon:
	            		Intent myCategoryIntent4 = new Intent(HomePageActivity.this,RefillDrinksPageActivity.class);
		                startActivity(myCategoryIntent4);
		                break;
		                
	            	case R.id.pagewaitericon:
	            		Intent myCategoryIntent5 = new Intent(HomePageActivity.this,PageMyWaiterActivity.class);
		                startActivity(myCategoryIntent5);
		                break;
	            }
	            }
	        };
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	