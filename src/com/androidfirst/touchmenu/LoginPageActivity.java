package com.androidfirst.touchmenu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPageActivity extends MenuActivity {
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
       //ImageButton NavigateToCategory = (ImageButton) findViewById(R.id.ordericon);
       /* Button NavigateToCategory = (Button) findViewById(R.id.buttonSignIn);
        NavigateToCategory.setOnClickListener(  new View.OnClickListener() */
        
       /* {
        public void onClick(View v) {
        // navigate to category page//consider using the clickhandler with switch
        	setContentView(R.layout.home);
        }
        }
        
        );
           */
      Button login = (Button) findViewById(R.id.buttonSignIn);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(LoginPageActivity.this, HomePageActivity.class);
                //setContentView(R.layout.home);
                startActivity(myIntent);
            }

        });
    }
}
        
        
        
        
       
//---------------------
//package com.warriorpoint.taxman2;

/*import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends Activity {
    *//** Called when the activity is first created. *//*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button next = (Button) findViewById(R.id.Button01);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Activity2.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
}*/
