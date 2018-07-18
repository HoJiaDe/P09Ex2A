package com.example.a17010621.p09ex2a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Employee> employeeList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Employee> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.employeeList = objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvRole = rowView.findViewById(R.id.tvRole);
        TextView tvSalary = rowView.findViewById(R.id.tvSalary);

        Employee currentItem = employeeList.get(position);
        tvName.setText(currentItem.getName());
        tvRole.setText(currentItem.getJob());
        tvSalary.setText(currentItem.getSalary());

        return rowView;

    }
}
