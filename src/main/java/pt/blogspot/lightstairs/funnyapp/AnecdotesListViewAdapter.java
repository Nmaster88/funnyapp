package pt.blogspot.lightstairs.funnyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Nuno on 23-12-2015.
 */
public class AnecdotesListViewAdapter extends BaseAdapter {
    private String category;
    private String[] alentejanos={"adad","adadd","adasda"};
    private String[] joãozinho={"oipio","iopiop","ipiop"};
    LayoutInflater myInflater;


    public AnecdotesListViewAdapter(String cat,Context context) {
        this.category=cat;
        this.myInflater= LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if(convertView == null){
            convertView = myInflater.inflate(R.layout.anecdote_layout_content, null);
        }

        if(this.category=="alentejanos")
        {
            ((TextView) convertView).setText(this.alentejanos[position]);
        }
        else if(this.category=="Joãozinho")
        {
            ((TextView) convertView).setText(this.joãozinho[position]);
        }
        else
        {
            ((TextView) convertView).setText("vazio");
        }
//
        //convertView.setClickable(false);
//        ((TextView) convertView).setText(this.category);
//        ((TextView) convertView).setText("nada");

        return convertView;
    }

}
