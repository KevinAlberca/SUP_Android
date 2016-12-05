package com.supinternet.tp14;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.List;

/**
 * Created by AwH on 31/05/16.
 */
public class RepoAdapter extends BaseAdapter {
    private class ViewHolder {
        TextView text;
    }

    private List<Repo> repos;
    private LayoutInflater inflater;

    public RepoAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    public void setRepos(List repos) {

    }

    @Override
    public int getCount() {
        return repos != null ? repos.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return repos != null ? repos.get(position) : 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            holder.text = (TextView) convertView.findViewById(android.R.id.text1);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Repo repo = (Repo) getItem(position);

        holder.text.setText(repo.getName());

        return convertView;
    }
}
