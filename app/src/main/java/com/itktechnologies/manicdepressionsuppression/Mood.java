package com.itktechnologies.manicdepressionsuppression;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TabHost;

/**
 * Created by Alexandre on 2/25/2018.
 */

public class Mood extends android.support.v4.app.Fragment {


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Mood");

        TabHost tabHost = (TabHost) view.findViewById(R.id.tabHost);
        tabHost.setup();

        // tab1
        TabHost.TabSpec spec = tabHost.newTabSpec("Anger");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Anger");
        tabHost.addTab(spec);


        // tab2
        spec = tabHost.newTabSpec("Sadness");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Sadness");
        tabHost.addTab(spec);


        // tab3
        spec = tabHost.newTabSpec("Happy");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Happy");
        tabHost.addTab(spec);






    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mood, container, false);

    }

}
