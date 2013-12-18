package com.fb.partaker.util;

import android.util.Log;

/**
 * 2013-12-18
 * @author yuhg
 *
 */
public class Logs {

	// debug
	public static final boolean debug = true;

	// debug operate
	public static final boolean opDebug = false;

	public static void i(String tag, String msg) {
		if (debug) {
			Log.i(tag, msg);
		}
	}

	public static void v(String tag, String msg) {
		if (debug) {
			Log.v(tag, msg);
		}
	}

	public static void w(String tag, String msg) {
		if (debug) {
			Log.w(tag, msg);
		}
	}

	public static void e(String tag, String msg) {
		if (debug) {
			Log.e(tag, msg);
		}
	}

	public static void d(String tag, String msg) {
		if (debug) {
			Log.d(tag, msg);
		}
	}

	public static void iop(String tag, String msg) {
		if (opDebug) {
			Log.i(tag, msg);
		}
	}

	public static void wop(String tag, String msg) {
		if (opDebug) {
			Log.i(tag, msg);
		}
	}

}
