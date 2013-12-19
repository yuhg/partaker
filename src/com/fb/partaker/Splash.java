package com.fb.partaker;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

public class Splash extends FBActivity{
	private Context myContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		myContext = getApplicationContext();
		new AsyncTaskonResume().execute(myContext);
	}

	private class AsyncTaskonResume extends
	AsyncTask<Context, Integer, Integer> {

		@Override
		protected void onPostExecute(Integer result) {
			super.onPostExecute(result);
			Intent intent = new Intent();
			intent.setClass(myContext, MainActivity.class);
			startActivity(intent);
		}

		@Override
		protected Integer doInBackground(Context... arg0) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;
		}
		
	}
	
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

}
