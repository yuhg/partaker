package com.fb.partaker;


import android.app.Application;
import android.content.res.Configuration;

/**
 * 2013-12-17 Ӧ��ȫ�ֻ���
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
	 * ���ʵ����������Щ�޷�ֱ�ӻ�ȡȫ�ֻ����ĵط���
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
