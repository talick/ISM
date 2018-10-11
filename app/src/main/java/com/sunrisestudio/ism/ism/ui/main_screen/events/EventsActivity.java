package com.sunrisestudio.ism.ism.ui.main_screen.events;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sunrisestudio.ism.ism.R;
import com.sunrisestudio.ism.ism.model.Person;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.EventsAdapter;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.OnItemClickListener;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.StudentAdapter;

import java.util.List;

public class EventsActivity extends AppCompatActivity {

    private RecyclerView eventsRV;
    private EventsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        initToolbar();
        initRV();
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_arrow);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        toolbar.inflateMenu(R.menu.toolbar_menu);
        SearchView searchView = (SearchView) toolbar.getMenu().findItem(R.id.action_search).getActionView();
    }

    private void initRV() {
        eventsRV = findViewById(R.id.students_recycler_view);
        eventsRV.setLayoutManager(new LinearLayoutManager(this));
        adapter = new EventsAdapter(this);

        eventsRV.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                startActivity(new Intent(EventsActivity.this, EventDetailActivity.class));
            }

            @Override
            public void onItemLongClick(int position) {

            }
        });
    }
}
