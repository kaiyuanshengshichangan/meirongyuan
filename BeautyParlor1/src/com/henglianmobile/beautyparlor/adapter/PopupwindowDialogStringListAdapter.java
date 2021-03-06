package com.henglianmobile.beautyparlor.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.henglianmobile.beautyparlor.R;
import com.henglianmobile.beautyparlor.view.ViewHolder;

public class PopupwindowDialogStringListAdapter extends BaseAdapter {
	private List<Map<String, String>> list;
	private Context mContext;
	private LayoutInflater inflater;
	private int selectPos = -1;
	private OnItemClickCallback callback = null;

	public PopupwindowDialogStringListAdapter(Context context, List<Map<String, String>> list) {
		this.mContext = context;
		inflater = LayoutInflater.from(this.mContext);
		if (list == null) {
			list = new ArrayList<Map<String,String>>();
		}else{
			this.list = list;
		}
	}

	public int getSelectPos() {
		return selectPos;
	}

	public void setSelect(int pos) {
		selectPos = pos;
		notifyDataSetChanged();
	}

	public void setCallback(OnItemClickCallback callback) {
		this.callback = callback;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
//		final String item = list.get(position);
		Map<String, String> map= list.get(position);
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.text, null);
		}
		TextView name = ViewHolder.get(convertView, R.id.tv_text);
		name.setText(map.get("type"));
		if (position == selectPos) {
			name.setSelected(true);
		} else {
			name.setSelected(false);
		}
		convertView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				selectPos = position;
				notifyDataSetChanged();
				callback.onClick(selectPos, false);
			}
		});
		return convertView;
	}

	public static interface OnItemClickCallback {
		public void onClick(int position, boolean isSelect);
	}
}
