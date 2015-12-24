package pt.blogspot.lightstairs.funnyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Nuno on 18-12-2015.
 */
public class CategoriesListViewAdapter extends BaseAdapter {
    String[] categories;
    private Context context;
    LayoutInflater myInflater;

    public CategoriesListViewAdapter(String[] arr, Context context) {
        this.categories = arr;
//        this.context = context;
//        this.myInflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.myInflater= LayoutInflater.from(context);
    }

    @Override
    public int getCount(){
        return this.categories.length;
    }

    @Override
    public Object getItem(int arg0){
        return null;
    }

    @Override
    public long getItemId(int arg0){
        return arg0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if(convertView == null){
            convertView = myInflater.inflate(R.layout.test, null);
        }
        ((TextView) convertView).setText(categories[position]);
        //convertView.setClickable(false);

        return convertView;
    }

    //    public View getView(int arg0, View arg1, ViewGroup arg2){
//        if(arg1==null)
//            arg1 = this.myInflater.inflate(R.layout.test,arg2,false);
//
//
//        Button cat = (Button)arg1.findViewById(R.id.childButton);
//        cat.setText(this.categories[arg0]);
//
//        return arg1;
//    }
}
