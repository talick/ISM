package com.sunrisestudio.ism.ism.ui.main_screen.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sunrisestudio.ism.ism.R;
import com.sunrisestudio.ism.ism.model.Menu;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.EventsAdapter;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.MenuRVAdapter;
import com.sunrisestudio.ism.ism.ui.main_screen.adapter.OnItemClickListener;
import com.sunrisestudio.ism.ism.ui.main_screen.events.EventsActivity;
import com.sunrisestudio.ism.ism.ui.main_screen.library.LibraryActivity;
import com.sunrisestudio.ism.ism.ui.main_screen.students.StudentsActivity;

import java.util.List;

public class MenuFragment extends Fragment {

    private final String TAG = MenuFragment.class.getSimpleName();

    RecyclerView recyclerView;
    MenuRVAdapter adapter;

    public MenuFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static MenuFragment newInstance(String param1, String param2) {
        return new MenuFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        recyclerView = view.findViewById(R.id.menu_recycler_view);
        final List<Menu> list = Menu.generateMenu();
        adapter = new MenuRVAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setFocusable(false);
        adapter.setItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

                switch (list.get(position).getTitle()) {

                    case ("Student"):
                        startActivity(new Intent(getActivity(), StudentsActivity.class));
                        break;
                    case "Events":
                        startActivity(new Intent(getActivity(), EventsActivity.class));
                        break;
                    case "Library":
                        startActivity(new Intent(getActivity(), LibraryActivity.class));
                        break;
                }
            }

            @Override
            public void onItemLongClick(int position) {

            }
        });
        return view;

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
