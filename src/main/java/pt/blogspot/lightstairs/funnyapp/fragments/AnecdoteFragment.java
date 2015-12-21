package pt.blogspot.lightstairs.funnyapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pt.blogspot.lightstairs.funnyapp.R;

/**
 * Created by Nuno on 17-12-2015.
 */
public class AnecdoteFragment extends Fragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.anecdote_layout, null);
        return v;
    }


}
