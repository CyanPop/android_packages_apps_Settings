package com.android.settings.cyanpop;

import android.os.Bundle;
import android.content.res.Resources;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.R;
import android.provider.Settings;

import com.android.internal.logging.MetricsLogger;

public class CyanpopSettings extends SettingsPreferenceFragment implements
        Preference.OnPreferenceChangeListener {

    private static final String TAG = "CyanpopSettings";

    @Override
    protected int getMetricsCategory() {
        return MetricsLogger.APPLICATION;
    }

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        addPreferencesFromResource(R.xml.cyanpop_settings);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    public boolean onPreferenceChange(Preference preference, Object objValue) {
        return false;
    }
}
