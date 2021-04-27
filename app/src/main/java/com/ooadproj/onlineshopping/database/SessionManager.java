package com.ooadproj.onlineshopping.database;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;



public class SessionManager {

    private SharedPreferences SharedPref;
    private SharedPreferences.Editor SharedPref_Editor;

    @SuppressLint("CommitPrefEdits")
    public SessionManager(Context context) {
        this.SharedPref = context.getSharedPreferences("com.ooadproj.onlineshopping.database.PREFERENCE.", Activity.MODE_PRIVATE);
        this.SharedPref_Editor = SharedPref.edit();
    }

    public void saveSession(String Key, String Value) {
        SharedPref_Editor.putString(Key, Value);
        SharedPref_Editor.commit();
    }

    public String getSessionData(String Key) {
        return SharedPref.getString(Key, "");
    }

    public void clearPreferences() {
        SharedPref_Editor.clear();
        SharedPref_Editor.commit();
    }
}
