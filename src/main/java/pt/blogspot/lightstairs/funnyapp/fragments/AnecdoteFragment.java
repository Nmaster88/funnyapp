package pt.blogspot.lightstairs.funnyapp.fragments;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import pt.blogspot.lightstairs.funnyapp.AnecdotesListViewAdapter;
import pt.blogspot.lightstairs.funnyapp.CategoriesListViewAdapter;
import pt.blogspot.lightstairs.funnyapp.R;

/**
 * Created by Nuno on 17-12-2015.
 */
public class AnecdoteFragment extends Fragment{
private static String ARG_CATEGORY_ID="categoryID";

    public AnecdoteFragment(){
    }

    public static AnecdoteFragment newInstance(String category){
        AnecdoteFragment fragment = new AnecdoteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_CATEGORY_ID,category);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.anecdote_layout, null);

        ListView anecdotes_list = (ListView) v.findViewById(R.id.anecdotes_list_view);//.inflate(R.layout.categories_layout,null);

        AnecdotesListViewAdapter adapter = new AnecdotesListViewAdapter(getArguments().getString(ARG_CATEGORY_ID), getActivity());
        anecdotes_list.setAdapter(adapter);

        return v;
    }


}
