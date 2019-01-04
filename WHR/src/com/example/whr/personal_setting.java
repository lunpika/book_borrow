package com.example.whr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import org.xutils.x;
import org.xutils.view.annotation.ViewInject;

public class personal_setting extends Fragment{
	
	@ViewInject(R.id.et_new_username)
	EditText et_new_username;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view= inflater.inflate(R.layout.personal_setting, null);
		return view;
	}

}
