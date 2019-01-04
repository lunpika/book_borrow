package com.example.whr;

import org.xutils.x;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

	@ViewInject(R.id.iv_index)
	ImageView iv_index;
	@ViewInject(R.id.iv_book)
	ImageView iv_book;
	@ViewInject(R.id.iv_bfriend)
	ImageView iv_bfriend;
	@ViewInject(R.id.iv_personal)
	ImageView iv_personal;

	private FragmentManager manager;
	private FragmentTransaction ft;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		x.view().inject(this);
		initFragment();
	}

	private void initFragment() {
		// TODO Auto-generated method stub
		manager= getSupportFragmentManager();
		ft= manager.beginTransaction();
		index index= new index();
		ft.add(R.id.fl_main, index);
		ft.commit();
	}

	@Event(value={R.id.iv_index, R.id.iv_book, R.id.iv_bfriend, R.id.iv_personal})
	private void onClick(View v){
		manager= getSupportFragmentManager();
		ft= manager.beginTransaction();
		switch (v.getId()) {
		case R.id.iv_index:
			ft.replace(R.id.fl_main, new index());
			iv_index.setImageResource(R.drawable.index_sel);
			iv_book.setImageResource(R.drawable.book);
			iv_bfriend.setImageResource(R.drawable.bfriend);
			iv_personal.setImageResource(R.drawable.person);
			break;
		case R.id.iv_book:
			ft.replace(R.id.fl_main, new book());
			iv_index.setImageResource(R.drawable.index);
			iv_book.setImageResource(R.drawable.book_sel);
			iv_bfriend.setImageResource(R.drawable.bfriend);
			iv_personal.setImageResource(R.drawable.person);
			break;
		case R.id.iv_bfriend:
			ft.replace(R.id.fl_main, new bookfriend());
			iv_index.setImageResource(R.drawable.index);
			iv_book.setImageResource(R.drawable.book);
			iv_bfriend.setImageResource(R.drawable.bfriend_sel);
			iv_personal.setImageResource(R.drawable.person);
			break;
		case R.id.iv_personal:
			ft.replace(R.id.fl_main, new personal());
			iv_index.setImageResource(R.drawable.index);
			iv_book.setImageResource(R.drawable.book);
			iv_bfriend.setImageResource(R.drawable.bfriend);
			iv_personal.setImageResource(R.drawable.person_sel);
			break;
		default:
			break;
		}
		ft.commit();
	}
}
