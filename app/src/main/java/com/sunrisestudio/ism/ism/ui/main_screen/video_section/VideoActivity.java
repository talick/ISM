package com.sunrisestudio.ism.ism.ui.main_screen.video_section;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sunrisestudio.ism.ism.R;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.EventsAdapter;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.OnItemClickListener;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.VideoListAdapter;
import com.sunrisestudio.ism.ism.ui.main_screen.events.EventDetailActivity;
import com.sunrisestudio.ism.ism.ui.main_screen.events.EventsActivity;

public class VideoActivity extends AppCompatActivity {

    private RecyclerView videoRV;
    private VideoListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

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
        videoRV = findViewById(R.id.videos_recycler_view);
        videoRV.setLayoutManager(new LinearLayoutManager(this));
        adapter = new VideoListAdapter(this);

        videoRV.setAdapter(adapter);


    }
}
