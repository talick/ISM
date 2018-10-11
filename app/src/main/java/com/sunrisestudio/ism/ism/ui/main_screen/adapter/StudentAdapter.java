package com.sunrisestudio.ism.ism.ui.main_screen.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sunrisestudio.ism.ism.R;
import com.sunrisestudio.ism.ism.model.Person;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder>{

    private Context context;
    private List<Person> people;

    public StudentAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.students_item_rv, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

        holder.fullNameTextView.setText(String.format("%s %s", people.get(position).getFirstName(), people.get(position).getLastName()));
        holder.infoTextView.setText(String.format("%s %s", people.get(position).getProfession(), people.get(position).getPhoneNumber()));
    }

    @Override
    public int getItemCount() {
        if (people != null) {
            return people.size();
        }
        return 0;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView fullNameTextView;
        TextView infoTextView;
        public StudentViewHolder(View itemView) {
            super(itemView);
            fullNameTextView = itemView.findViewById(R.id.full_name);
            infoTextView = itemView.findViewById(R.id.info);
        }
    }
}
