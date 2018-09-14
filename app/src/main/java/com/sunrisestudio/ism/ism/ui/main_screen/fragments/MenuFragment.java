package com.sunrisestudio.ism.ism.ui.main_screen.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sunrisestudio.ism.ism.R;

public class MenuFragment extends Fragment {

    private final String TAG = MenuFragment.class.getSimpleName();

 /*   RecyclerView recyclerView;
    MenuAdapter adapter;
*/

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
/*

        recyclerView = view.findViewById(R.id.menuRV);
        adapter = new MenuAdapter(Menu.initTempItems());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
*/

        return view;

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
