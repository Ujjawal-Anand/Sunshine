package com.example.android.sunshine;

import android.app.Activity;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/*
public class LocationActivity extends PreferenceActivity
        implements Preference.OnPreferenceChangeListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Add 'general' preferences, defined in the XML file
        // TODO: Add preferences from XML
        addPreferencesFromResource(R.xml.pref_location);
//        bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_location_key)));
//        bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_temp_unit_key)));
        // TODO: Add preferences
    }

    /**
     * Attaches a listener so the summary is always updated with the preference value.
     * Also fires the listener once, to initialize the summary (so it shows up before the value
     * is changed.)
     */
/*
    private void bindPreferenceSummaryToValue(Preference preference) {
        // Set the listener to watch for value changes.
        preference.setOnPreferenceChangeListener(this);

        // Trigger the listener immediately with the preference's
        // current value.
        onPreferenceChange(preference,
                PreferenceManager
                        .getDefaultSharedPreferences(preference.getContext())
                        .getString(preference.getKey(), ""));
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object value) {
        String stringValue = value.toString();

        if (preference instanceof ListPreference) {
            // For list preferences, look up the correct display value in
            // the preference's 'entries' list (since they have separate labels/values).
            ListPreference listPreference = (ListPreference) preference;
            int prefIndex = listPreference.findIndexOfValue(stringValue);
            if (prefIndex >= 0) {
                preference.setSummary(listPreference.getEntries()[prefIndex]);
            }
        } else {
            // For other preferences, set the summary to the value's simple string representation.
            preference.setSummary(stringValue);
        }
        return true;
    }

}
*/

public class LocationActivity extends Activity {
    public LocationActivity() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Bundle extras = getIntent().getExtras();
        String cityName = extras.getString("cityKey");
        String longitude = extras.getString("lonKey");
        String latitude = extras.getString("latKey");

        TextView cityText = (TextView) findViewById(R.id.city_text);
        TextView lonText = (TextView) findViewById(R.id.lon_text);
        TextView latText = (TextView) findViewById(R.id.lat_text);

        cityText.setText(cityName);
        lonText.setText(longitude);
        latText.setText(latitude);

    }

}
