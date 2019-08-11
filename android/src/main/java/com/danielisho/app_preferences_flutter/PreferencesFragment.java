package com.danielisho.app_preferences_flutter;

import com.takisoft.preferencex.PreferenceFragmentCompat;
import android.os.Bundle;
import androidx.annotation.Nullable;

public class PreferencesFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferencesFix(@Nullable Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
	
    }
}