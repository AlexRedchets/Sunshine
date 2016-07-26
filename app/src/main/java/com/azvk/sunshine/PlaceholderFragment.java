package com.azvk.sunshine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlaceholderFragment extends Fragment {

    public PlaceholderFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Initialize view
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        //Initialize adapter for list view
        ArrayAdapter<String> adapter;

        //String array for list view
        String[] array = {"Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
                "Today - Sunny - 88/63",
        };

        //Convert string array into ArrayList
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));

        //Initialize adapter
        adapter = new ArrayAdapter<>(
                //Current view
                getActivity(),
                //Layout list item
                R.layout.list_item_forecast,
                //TextView
                R.id.list_item_forecast_textview,
                arrayList);

        //Initialize List View
        ListView listView = (ListView) view.findViewById(R.id.listview_forecast);
        //Set adapter for List View
        listView.setAdapter(adapter);

        return view;
    }
}
