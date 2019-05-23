package com.example.don8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.analytics.FirebaseAnalytics;

public class AnalyticsActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analytics_view);

        // init analytics
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    // TODO: setup function and send analytics
    /*
    public void click() {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.PRICE, );

        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
    */
}
