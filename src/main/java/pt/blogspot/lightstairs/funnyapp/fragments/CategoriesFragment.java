package pt.blogspot.lightstairs.funnyapp.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.ListActivity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import pt.blogspot.lightstairs.funnyapp.CategoriesListViewAdapter;
import pt.blogspot.lightstairs.funnyapp.MainActivity;
import pt.blogspot.lightstairs.funnyapp.R;

/**
 * Created by Nuno on 17-12-2015.
 */
public class CategoriesFragment extends Fragment implements AdapterView.OnItemClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.categories_layout, null);

        Resources res = getResources();
        String[] cats = res.getStringArray(R.array.categories);
        ListView cat_list = (ListView) v.findViewById(R.id.categories_list_view);//.inflate(R.layout.categories_layout,null);
        CategoriesListViewAdapter ad = new CategoriesListViewAdapter(cats, getActivity());
        cat_list.setAdapter(ad);
        cat_list.setOnItemClickListener(this);
        return v;

//        ((ListView) v.findViewById(R.id.categories_list_view)).setOnItemClickListener(this);
//        Resources res = getResources();
//        String[] cats = res.getStringArray(R.array.categories);
//        CategoriesListViewAdapter ad = new CategoriesListViewAdapter(cats, getActivity());
//        ((ListView) v).setAdapter(ad);
//        return v;
//        return inflater.inflate(R.layout.categories_layout, container, false);
    }


//    @Override
//    public void onActivityCreated(Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        ListView list = inflater.inflate(R.layout.categories_layout);
//        ListView list.findViewById(R.id.categories_list_view).setOnItemClickListener(this);
//
//        Resources res = getResources();
//        String[] cats = res.getStringArray(R.array.categories);
//
//        CategoriesListViewAdapter ad = new CategoriesListViewAdapter(cats, getActivity());
//
//        ((ListView) list).setAdapter(ad);
//
//}


        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getActivity(), ((TextView)view).getText().toString(), Toast.LENGTH_LONG).show();
            ((MainActivity)getActivity()).loadAnecdotes(((TextView)view).getText().toString());
        }

    }