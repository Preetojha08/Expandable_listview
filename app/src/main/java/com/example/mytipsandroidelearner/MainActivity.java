package com.example.mytipsandroidelearner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView_tips;
    List<String> list_group;
    HashMap<String , List<String>> list_item;
    MainTipsListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView;

        textView.setText("Commit 1");
        expandableListView_tips = (ExpandableListView)findViewById(R.id.expanded_list_view);
        list_group = new ArrayList<>();
        list_item = new HashMap<>();
        adapter = new MainTipsListAdapter(this,list_group,list_item);
        expandableListView_tips.setAdapter(adapter);
        initListData();
    }

    private void initListData()
    {
        list_group.add(getString(R.string.Group_0));
        list_group.add(getString(R.string.Group_1));
        list_group.add(getString(R.string.Group_2));
        list_group.add(getString(R.string.Group_3));
        list_group.add(getString(R.string.Group_4));
        list_group.add(getString(R.string.Group_5));
        list_group.add(getString(R.string.Group_6));
        list_group.add(getString(R.string.Group_7));
        list_group.add(getString(R.string.Group_8));
        list_group.add(getString(R.string.Group_9));
        list_group.add(getString(R.string.Group_10));
        list_group.add(getString(R.string.Group_11));
        list_group.add(getString(R.string.Group_12));
        list_group.add(getString(R.string.Group_13));
        list_group.add(getString(R.string.Group_14));
        list_group.add(getString(R.string.Group_15));
        list_group.add(getString(R.string.Group_16));
        list_group.add(getString(R.string.Group_17));
        list_group.add(getString(R.string.Group_18));
        list_group.add(getString(R.string.Group_19));
        list_group.add(getString(R.string.Group_20));
        list_group.add(getString(R.string.Group_21));
        list_group.add(getString(R.string.Group_22));
        list_group.add(getString(R.string.Group_23));
        list_group.add(getString(R.string.Group_24));

        String[] array ;

        List<String> list_0 = new ArrayList<>();
        array = getResources().getStringArray(R.array.general_tips);
        for (String item : array)
        {
            list_0.add(item);
        }

        List<String> list_1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Android_studio);
        for (String item : array)
        {
            list_1.add(item);
        }

        List<String> list_2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.layouts);
        for (String item : array)
        {
            list_2.add(item);
        }

        List<String> list_3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Edittext_textview);
        for (String item : array)
        {
            list_3.add(item);
        }

        List<String> list_4 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Toast);
        for (String item : array)
        {
            list_4.add(item);
        }

        List<String> list_5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.button);
        for (String item : array)
        {
            list_5.add(item);
        }

        List<String> list_6 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Check_box);
        for (String item : array)
        {
            list_6.add(item);
        }

        List<String> list_7 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Radio_button);
        for (String item : array)
        {
            list_7.add(item);
        }

        List<String> list_8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Toggle_Button_switch);
        for (String item : array)
        {
            list_8.add(item);
        }

        List<String> list_9 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Spinner);
        for (String item : array)
        {
            list_9.add(item);
        }

        List<String> list_10 = new ArrayList<>();
        array = getResources().getStringArray(R.array.image_view_image_button);
        for (String item : array)
        {
            list_10.add(item);
        }

        List<String> list_11 = new ArrayList<>();
        array = getResources().getStringArray(R.array.intent);
        for (String item : array)
        {
            list_11.add(item);
        }

        List<String> list_12 = new ArrayList<>();
        array = getResources().getStringArray(R.array.scroll_view);
        for (String item : array)
        {
            list_12.add(item);
        }

        List<String> list_13 = new ArrayList<>();
        array = getResources().getStringArray(R.array.progress_bar);
        for (String item : array)
        {
            list_13.add(item);
        }

        List<String> list_14 = new ArrayList<>();
        array = getResources().getStringArray(R.array.card_view);
        for (String item : array)
        {
            list_14.add(item);
        }

        List<String> list_15 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Grid_view);
        for (String item : array)
        {
            list_15.add(item);
        }

        List<String> list_16 = new ArrayList<>();
        array = getResources().getStringArray(R.array.seek_bar);
        for (String item : array)
        {
            list_16.add(item);
        }

        List<String> list_17 = new ArrayList<>();
        array = getResources().getStringArray(R.array.motion);
        for (String item : array)
        {
            list_17.add(item);
        }

        List<String> list_18 = new ArrayList<>();
        array = getResources().getStringArray(R.array.adview);
        for (String item : array)
        {
            list_18.add(item);
        }

        List<String> list_19 = new ArrayList<>();
        array = getResources().getStringArray(R.array.search_view);
        for (String item : array)
        {
            list_19.add(item);
        }

        List<String> list_20 = new ArrayList<>();
        array = getResources().getStringArray(R.array.user_interface_tips);
        for (String item : array)
        {
            list_20.add(item);
        }

        List<String> list_21 = new ArrayList<>();
        array = getResources().getStringArray(R.array.fire_base);
        for (String item : array)
        {
            list_21.add(item);
        }

        List<String> list_22 = new ArrayList<>();
        array = getResources().getStringArray(R.array.sqlite);
        for (String item : array)
        {
            list_22.add(item);
        }

        List<String> list_23 = new ArrayList<>();
        array = getResources().getStringArray(R.array.log_cat);
        for (String item : array)
        {
            list_23.add(item);
        }

        List<String> list_24 = new ArrayList<>();
        array = getResources().getStringArray(R.array.icon);
        for (String item : array)
        {
            list_24.add(item);
        }


        list_item.put(list_group.get(0),list_0);
        list_item.put(list_group.get(1),list_1);
        list_item.put(list_group.get(2),list_2);
        list_item.put(list_group.get(3),list_3);
        list_item.put(list_group.get(4),list_4);
        list_item.put(list_group.get(5),list_5);
        list_item.put(list_group.get(6),list_6);
        list_item.put(list_group.get(7),list_7);
        list_item.put(list_group.get(8),list_8);
        list_item.put(list_group.get(9),list_9);
        list_item.put(list_group.get(10),list_10);

        list_item.put(list_group.get(11),list_11);
        list_item.put(list_group.get(12),list_12);
        list_item.put(list_group.get(13),list_13);
        list_item.put(list_group.get(14),list_14);
        list_item.put(list_group.get(15),list_15);
        list_item.put(list_group.get(16),list_16);
        list_item.put(list_group.get(17),list_17);
        list_item.put(list_group.get(18),list_18);
        list_item.put(list_group.get(19),list_19);
        list_item.put(list_group.get(20),list_20);

        list_item.put(list_group.get(21),list_21);
        list_item.put(list_group.get(22),list_22);
        list_item.put(list_group.get(23),list_23);
        list_item.put(list_group.get(24),list_24);

        adapter.notifyDataSetChanged();
    }

}