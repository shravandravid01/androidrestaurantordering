package com.androidfirst.touchmenu;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.MenuItem;

public class MenuActivity extends Activity {
public static final String MENU_PREFERENCES = "MenuPrefs";
//public static final String MYPREFS = “mySharedPreferences”;
protected void savePreferences(){
// Create the shared preference object.
SharedPreferences settings = getSharedPreferences(MENU_PREFERENCES,MODE_PRIVATE);
SharedPreferences.Editor prefEditor = settings.edit();
prefEditor.putString("UserName", "Rodwell");
prefEditor.putInt("UserAge", 28);
prefEditor.commit();
// ntsako we will use this to check if user is valid. refer to 24hours page 107
//we will need a way of creating sharedPreferences on the fly so that we can compare with user input
}


public boolean onCreateOptionsMenu(Menu menu) {
	super.onCreateOptionsMenu(menu);
	getMenuInflater().inflate(R.menu.menuoptions, menu);
	menu.findItem(R.id.help_menu_item).setIntent(
	new Intent(this, MenuHelpActivity.class));
	menu.findItem(R.id.settings_menu_item).setIntent(new Intent(this, MenuSettingsActivity.class));
	return true;
	}
public boolean onOptionsItemSelected(MenuItem item) {
	super.onOptionsItemSelected(item);
	startActivity(item.getIntent());
	return true;
	}

}
