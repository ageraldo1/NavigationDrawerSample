package com.itktechnologies.manicdepressionsuppression;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Alexandre on 2/25/2018.
 */

public class Quotes extends android.support.v4.app.Fragment {
    protected ListView mListView;
    protected int[] images = { R.drawable.jan,
            R.drawable.feb,
            R.drawable.mar,
            R.drawable.apr,
            R.drawable.may,
            R.drawable.jun,
            R.drawable.jul,
            R.drawable.aug,
            R.drawable.sep,
            R.drawable.oct,
            R.drawable.nov,
            R.drawable.dec
    };
    private String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Quotes");

        mListView = view.findViewById(R.id.listView);
        CustomAdaptor customAdaptor = new CustomAdaptor();
        mListView.setAdapter(customAdaptor);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.quotes, container, false);

    }

    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.quotes_custom_layout, null);
            ImageView imageView = v.findViewById(R.id.imageView);
            TextView textView = v.findViewById(R.id.textView);

            imageView.setImageResource(images[i]);
            textView.setText(monthNames[i]);

            return v;
        }
    }

}

