package com.sunrisestudio.ism.ism.ui.main_screen.students;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sunrisestudio.ism.ism.R;
import com.sunrisestudio.ism.ism.model.Person;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.StudentAdapter;

import java.util.ArrayList;
import java.util.List;

public class StudentsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StudentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

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
        recyclerView = findViewById(R.id.students_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new StudentAdapter(this);

        List<Person> people = getTempList();
        adapter.setPeople(people);
        recyclerView.setAdapter(adapter);
    }

    private List<Person> getTempList() {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new Person("Мира", "Нурбекова", "педагог", "+(996)559011376"));
        }
        return list;
    }
}
