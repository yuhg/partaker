package com.fb.partaker.adapter;

import java.util.List;

import com.fb.partaker.R;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuContentAdapter extends BaseAdapter {
	
	private Context myContext;
	private List<String> list;
	private LayoutInflater inflater;
	public MenuContentAdapter(Context myContext, List<String> list){
		this.myContext = myContext;
		this.list = list;
		inflater = LayoutInflater.from(myContext);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.menu_item, null);
			holder.menu_item_text = (TextView)convertView.findViewById(R.id.menu_item_text);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.menu_item_text.setText(list.get(position));
		return convertView;
	}
	
	class ViewHolder {
		ImageView icon;
		TextView menu_item_text;
	}

}
