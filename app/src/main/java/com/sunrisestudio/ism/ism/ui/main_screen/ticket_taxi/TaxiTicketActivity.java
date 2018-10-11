package com.sunrisestudio.ism.ism.ui.main_screen.ticket_taxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sunrisestudio.ism.ism.R;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.BooksAdapter;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.OnItemClickListener;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.TaxiTicketAdapter;

public class TaxiTicketActivity extends AppCompatActivity {

    private RecyclerView ticketRV;
    private TaxiTicketAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi_ticket);
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
        ticketRV = findViewById(R.id.students_recycler_view);
        ticketRV.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TaxiTicketAdapter(this);

        ticketRV.setAdapter(adapter);

        adapter.setItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                //startActivity(new Intent(LibraryActivity.this, ));
            }

            @Override
            public void onItemLongClick(int position) {

            }
        });
    }
}
