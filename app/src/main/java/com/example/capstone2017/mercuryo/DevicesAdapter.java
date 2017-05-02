package com.example.capstone2017.mercuryo;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class DevicesAdapter extends RecyclerView.Adapter<DevicesAdapter.MyViewHolder>{

private List<Device> deviceList;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView name, description, location;

    public MyViewHolder(View view) {
        super(view);
        name = (TextView) view.findViewById(R.id.name);
        description = (TextView) view.findViewById(R.id.description);
        location = (TextView) view.findViewById(R.id.location);
    }
}


    public DevicesAdapter(List<Device> devicesList) {
        this.deviceList = devicesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.device_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Device device = deviceList.get(position);
        holder.name.setText(device.getName());
        holder.description.setText(device.getDescription());
        holder.location.setText(device.getLocation());
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }
}


