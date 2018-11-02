package kr.co.startop.samplelist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jihun on 02/11/2018.
 */

public class MyAdapter extends BaseAdapter {
    List<Person> items = new ArrayList<>();

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ItemsView itemView = null;
        if (view == null) {
            itemView = new ItemsView(viewGroup.getContext());
        } else {
            itemView = (ItemsView) view;
        }
        itemView.setData(items.get(i));
        return itemView;
    }

    public void add(Person person) {
        items.add(person);
        notifyDataSetChanged();
    }

    public Person getItemAtPosition(int position) {
        return items.get(position);
    }
}
