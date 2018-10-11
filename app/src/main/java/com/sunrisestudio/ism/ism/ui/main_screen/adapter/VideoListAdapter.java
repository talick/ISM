package com.sunrisestudio.ism.ism.ui.main_screen.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sunrisestudio.ism.ism.R;

public class VideoListAdapter extends RecyclerView.Adapter<VideoListAdapter.MyViewHolder>{

    private Context context;

    public VideoListAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.video_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView subTitleTextVeiw;
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
