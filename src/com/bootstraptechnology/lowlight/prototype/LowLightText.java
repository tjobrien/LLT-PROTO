package com.bootstraptechnology.lowlight.prototype;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.support.v4.app.NavUtils;

public class LowLightText extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_low_light_text);
        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
      		  "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
      		  "Linux", "OS/2" };
      ArrayList<String> list_OS = new ArrayList<String>();
      list_OS.add("Android");
      list_OS.add("iPhone");
      list_OS.add("Linux");
     // single textview in android list
      ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
      		  android.R.layout.simple_list_item_1, android.R.id.text1, values);  // can use ArrayList (list_OS, or Array (values)
      //ArrayAdapter is 1 dimensional
     
      
      
      
      
      setListAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_low_light_text, menu);
        return true;
    }

    
}
