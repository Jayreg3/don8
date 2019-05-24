package com.example.don8;

//import android.content.Intent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
//import android.view.View;

import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.github.mikephil.charting.charts.BarChart;

import java.util.ArrayList;


public class AnalyticsActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analytics_view);
        // init analytics
        //mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        /*
        BarChart barChart = (BarChart) findViewById(R.id.analytics_bar_chart);
        BarDataSet set1 = getBarDataSet();

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        barChart.setData(data);

        Description desc = new Description();
        desc.setText("My Chart");

        barChart.setDescription(desc);
        barChart.animateXY(2000, 2000);
        barChart.invalidate();

        */

    }

    // TODO: add fake data
    /*
    private BarDataSet getBarDataSet() {
        return null;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList xAxis = new ArrayList();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        return xAxis;
    }
    */


    // TODO: import bar chart and draw

    // TODO: setup function and send analytics
    /*
    public void click() {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.PRICE, );

        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
    */
}
