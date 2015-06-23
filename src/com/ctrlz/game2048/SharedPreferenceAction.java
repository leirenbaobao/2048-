package com.ctrlz.game2048;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceAction {

	SharedPreferences sharedPreferences;
	SharedPreferences.Editor sharePreferencesEditor;
	
	/**
	 * @param context
	 * @param appName
	 * @param mode
	 * ���췽��
	 */
	@SuppressLint("CommitPrefEdits")
	public SharedPreferenceAction(Context context, String appName, int mode){
		
		sharedPreferences = context.getSharedPreferences(appName, mode);
		sharePreferencesEditor = sharedPreferences.edit();
		
	}
	
	/**
	 * @param 
	 * ��һ������
	 */
	public void Sharedput(String key, String value){
		sharePreferencesEditor.putString(key, value);
		sharePreferencesEditor.commit();
	}
	
	/**
	 * @param getItems
	 * @return
	 * ȡһ������
	 */
	public String Sharedget(String key){
		return	sharedPreferences.getString(key, "");
	}
	
	/**
	 * @param key
	 * ɾ��һ������
	 */
	public void ShareRemove(String key){
		sharePreferencesEditor.remove(key);
		sharePreferencesEditor.commit();
	}
}
