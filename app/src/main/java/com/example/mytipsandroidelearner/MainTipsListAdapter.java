package com.example.mytipsandroidelearner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MainTipsListAdapter extends BaseExpandableListAdapter {

    Context context;
     List<String> list_Group;
    HashMap<String,List<String>> list_item;

    public MainTipsListAdapter(Context context,List<String> list_Group,HashMap<String,List<String>> list_item) {

        this.context = context;
        this.list_Group = list_Group;
        this.list_item = list_item;

    }

    @Override
    public int getGroupCount() {
        return list_Group.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return list_item.get(this.list_Group.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.list_Group.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.list_item.get(this.list_Group.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition ;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String group = (String) getGroup(groupPosition);

        if (convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_group,null);
        }

        TextView tv_parent = convertView.findViewById(R.id.list_view_parents);
        tv_parent.setText(group);
        return convertView;

    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String child = (String) getChild(groupPosition,childPosition);
        if (convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_item,null);
        }

        TextView tv_child = convertView.findViewById(R.id.list_view_child);
        tv_child.setText(child);
        return convertView;

    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
