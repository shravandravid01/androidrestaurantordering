package com.androidfirst.touchmenu;
import java.io.IOException;
import java.util.ArrayList;
import android.app.ListActivity;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;


	public class DataBasePopulator extends ListActivity{
		TextView selection;
		ArrayList<String>Names=new ArrayList<String>();
		ArrayList<String>Prices=new ArrayList<String>();
		ArrayList<byte[]> list = new ArrayList<byte[]>(); 
        ArrayList<Bitmap>list2 = new ArrayList<Bitmap>();
		@Override
		public void onCreate(Bundle icicle) {
			super.onCreate(icicle);
			setContentView(R.layout.drinks_list_view);
			populateList();
		//	setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Names));
			setListAdapter(new IconicAdapter());
			//selection=(TextView)findViewById(R.id.selection);
		}
		
	        DataBaseHelper dHelper = new DataBaseHelper(this);
	        String a = "",b = "";
	       byte[] d = null;//declaration of an empty blob holder.
	       String e = "";
	       String f = "";
	        private void populateList() {
	    		// TODO Auto-generated method stub
	    		  
	    	      try {
	    				dHelper.createDataBase();
	    				dHelper.openDatabase(); 		
	    				Cursor c = dHelper.doQuery   ("  SELECT * FROM Drinks");//("SELECT * FROM tbl1 WHERE two LIKE 'y%'");
	    				if (c == null) {
	    					a += "no record"; 
	    				} else {
	    					
	    					while (c.moveToNext()) {
	    						
	    						int idd = c.getInt(c.getColumnIndex("_id"));
	    						byte[] rody=c.getBlob(c.getColumnIndex("Picture"));
	    						String Name= c.getString(c.getColumnIndex("Name"));
	    						String Description= c.getString(c.getColumnIndex("Description")); //("two");
	    						String Price =c.getString(c.getColumnIndex("Price"));
	    						//a += N+ ":"+ rod + ":"+ idn+"\n";
	    						//d=BitmapFactory.decodeByteArray(rody, 0, rody.length);
	    						//ist.add(a);
	    					//	Names.add(Description+"\t"+"::"+ "\t"+"R"+Price);
	    						Names.add(Description);
	    						list.add(rody);
	    						Prices.add("R"+"\t"+Price);
	    					    					}
	    				}
	    				
	    				
	    				
	    			}
	    	     catch (IOException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		
	    	}
	        
	        class IconicAdapter extends ArrayAdapter {
	    		
				IconicAdapter() {
	    			super(DataBasePopulator.this, R.layout.row, Names);
	    		}
	    		
	    		public View getView(int position, View convertView,
	    												ViewGroup parent) {
	    			LayoutInflater inflater=getLayoutInflater();
	    			View row=inflater.inflate(R.layout.row, parent, false);
	    			TextView label=(TextView)row.findViewById(R.id.label);
	    			TextView label2=(TextView)row.findViewById(R.id.label2);
	     ImageButton drinkslisticon = (ImageButton)row.findViewById(R.id.drinkslisticon);
	     CheckBox checkbox= (CheckBox)row.findViewById(R.id.checkbox);
	    	//	ImageView icon=(ImageView)row.findViewById(R.id.icon);
	    		
	    				d=list.get(position);
	    			   
	    			e=Names.get(position);
	    				label.setText(e);
	    			f=Prices.get(position);
	    			label2.setText(f);
	    				drinkslisticon.setImageBitmap(BitmapFactory.decodeByteArray(d, 0, d.length));
	    				
	    			
	    			return(row);
	    		}
	    	}
	}