package com.example.whr;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import org.xutils.x;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

public class personal_setting extends Activity{
	
	@ViewInject(R.id.et_new_username)
	EditText et_new_username;
	@ViewInject(R.id.et_new_signature)
	EditText et_new_signature;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personal_setting);
		x.view().inject(this);
		loadInfo();
	}
	
	private void loadInfo() {
        SharedPreferences sp = getSharedPreferences("user",Context.MODE_PRIVATE);
        String username = sp.getString("username","");
        String signature = sp.getString("signature","");
        et_new_username.setText(username);
        et_new_signature.setText(signature);
	}
	
	@Event(value = {R.id.btn_confirm})
	private void onClick(View v) {
		// TODO Auto-generated method stub
		String username = et_new_username.getText().toString();
		String signature = et_new_signature.getText().toString();
		
	}

}
