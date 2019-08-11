package com.danielisho.app_preferences_flutter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class PreferencesActivity: AppCompatActivity(){

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                supportActionBar!!.setDisplayHomeAsUpEnabled(true)
                supportActionBar!!.setHomeButtonEnabled(true)

                supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.settings, PreferencesFragment())
                        .commit()
        }

        override fun onSupportNavigateUp(): Boolean {
                onBackPressed()
                return true
        }
}