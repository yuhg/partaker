package com.fb.partaker;

import java.util.Vector;

import com.fb.partaker.util.Logs;

import android.app.Activity;
import android.os.Bundle;

public class FBActivity	extends Activity {
	
	public final static String TAG = "FBActivity";
	
	// 记录所有打开的activity
	private static Vector<Activity> activityList = new Vector<Activity>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		activityList.add(this);
	}
	
	
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		activityList.remove(this);
		Logs.i(TAG, "activityList size --> " + activityList.size());
	}






}
