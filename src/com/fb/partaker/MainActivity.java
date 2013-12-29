package com.fb.partaker;

import java.util.ArrayList;
import java.util.List;

import com.fb.partaker.adapter.MenuContentAdapter;
import com.fb.partaker.view.Panel;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SlidingDrawer;
import android.widget.Toast;

public class MainActivity extends FBActivity {
	private MyContext myContext;
	
	private SlidingDrawer menu_Drawder;
	private Panel menu_Panel;
	private ListView menu_Content_list, menu_Content_list2;
	private List<String> list = new ArrayList<String>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		myContext = (MyContext) getApplication();
		init();
	}

	public void init(){
		menu_Drawder = (SlidingDrawer)findViewById(R.id.menu_Drawer);
		menu_Panel = (Panel)findViewById(R.id.leftPanel1);
		menu_Content_list = (ListView)findViewById(R.id.menu_Content_list);
		menu_Content_list2 = (ListView)findViewById(R.id.menu_Content_list2);
		list.add("APPLE");
		list.add("PEACH");
		list.add("PEAR");
		list.add("LEAMON");
		list.add("ORANGE");
		MenuContentAdapter adapter = new MenuContentAdapter(this, list);
		menu_Content_list.setAdapter(adapter);
		menu_Content_list.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Toast.makeText(MainActivity.this, list.get(arg2),Toast.LENGTH_SHORT).show();
				if(menu_Drawder.isOpened()){
					menu_Drawder.close();
				}
			}
		});
		
		menu_Content_list2.setAdapter(adapter);
		menu_Content_list2.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Toast.makeText(MainActivity.this, list.get(arg2),Toast.LENGTH_SHORT).show();
			}
		});
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		if(menu_Drawder.isOpened()){
			menu_Drawder.close();
		}
	}
	

}
