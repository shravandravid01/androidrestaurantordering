package com.androidfirst.touchmenu;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;
public class DataBaseHelper extends SQLiteOpenHelper{
	private final Context myContext;
	private  static String DB_PATH = "data/data/com.androidfirst.touchmenu/databases/";
	private  static String DB_NAME  = "Myfirst.db";
	private SQLiteDatabase myDatabase;	    
	public DataBaseHelper(Context context) {
		super(context, DB_NAME, null, 1);
		this.myContext  = context;
	}


	public void createDataBase() throws IOException{
		// TODO Auto-generated method stub
		boolean dbExist = checkDatabase();
		if (dbExist) {
			
		}else {
			this.getReadableDatabase();
			
			try {
				copyDatabase();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new Error("Error copying database");
			}
		}
	}



	private void copyDatabase() throws IOException {
		InputStream myInput =  myContext.getAssets().open(DB_NAME);
		String outFile = DB_PATH+DB_NAME;
		OutputStream myOutput = new FileOutputStream(outFile);
		byte[] buffer =  new byte[1024];
		int length;
		while((length = myInput.read(buffer)) > 0) {
			myOutput.write(buffer, 0, length);
			
		}
		myOutput.flush();
		myInput.close();
		myOutput.close();
	}
	private boolean checkDatabase() {
		SQLiteDatabase checkDb = null;
		try {
			String myPath = DB_PATH+DB_NAME;
			checkDb = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
		} catch (SQLiteException e) {
			
		}
		
		if (checkDb != null) {
			checkDb.close();
		}
		return checkDb!= null ? true:false;
		
	}
	
	public void openDatabase() throws SQLiteException {
		String myPath = DB_PATH+DB_NAME;
		myDatabase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
	}
	@Override
	public synchronized  void close() {
		if (myDatabase != null) {
			myDatabase.close();
		}
		super.close();
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
	public SQLiteDatabase dataBaseReturner()
	{//rod=myDatabase;
		return myDatabase;}
	
	
	public Cursor doQuery(String query) {
		Cursor c = myDatabase.rawQuery(query,null);
		return c;
	}
}
