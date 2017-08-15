package com.maburton.restaurantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MenuOptionActivity extends AppCompatActivity {

    private ExpandableListView mListView;
    private ExpandableListAdapter mListAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> mListHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_option);

        mListView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        mListAdapter = new ExpandableListAdapter(this, listDataHeader,mListHashMap);
        mListView.setAdapter(mListAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        mListHashMap = new HashMap<>();

        // add header data here
        listDataHeader.add("House-Made Soups");
        listDataHeader.add("Clubhouse Sandwich");
        listDataHeader.add("Grilled Veg Wrap");
        listDataHeader.add("Fish and Chips");
        listDataHeader.add("Bangers and Mash");
        listDataHeader.add("Vindaloo");


        List<String> soups = new ArrayList<>();
        soups.add("Choices change daily. Ask your server.");

        List<String> clubhouse = new ArrayList<>();
        clubhouse.add("On white, multigrain, or gluten-free. Served with your choice of salad or fries.");

        List<String> wrap = new ArrayList<>();
        wrap.add("A multitude of veggies, marinated then grilled. Served in a wrap filled with our house herb-blend greens, and side salad or fries.");

        List<String> fish = new ArrayList<>();
        fish.add("Two pieces of cod in crispy beer batter. Served on a bed of fries with side tartar.");

        List<String> bangers = new ArrayList<>();
        bangers.add("Two pork sausages, fluffy mash, and steamed veggies.");

        List<String> vindaloo = new ArrayList<>();
        vindaloo.add("Most popular curry in the UK! Only served one way: hot!");

        mListHashMap.put(listDataHeader.get(0),soups);
        mListHashMap.put(listDataHeader.get(1),clubhouse);
        mListHashMap.put(listDataHeader.get(2),wrap);
        mListHashMap.put(listDataHeader.get(3),fish);
        mListHashMap.put(listDataHeader.get(4),bangers);
        mListHashMap.put(listDataHeader.get(5),vindaloo);
    }
}
