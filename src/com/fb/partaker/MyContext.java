package com.fb.partaker;


import android.app.Application;
import android.content.res.Configuration;

/**
 * 2013-12-17 应用全局环境
 * @author yuhg
 *
 */
public class MyContext extends Application {
	
	private static MyContext myApplication;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		myApplication = this;
	}

	
	/**
	 * 获得实例，用于那些无法直接获取全局环境的地方。
	 * 
	 * @return
	 */
	public static MyContext getInstance() {
		return myApplication;
	}
	
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
	}

	
	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		super.onLowMemory();
	}

	@Override
	public void onTerminate() {
		// TODO Auto-generated method stub
		super.onTerminate();
	}
	
}
