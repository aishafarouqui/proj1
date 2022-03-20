package com.aisha2016.proj1;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
//import android.support.annotation.NonNull;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import java.util.ArrayList;
import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;


public class CompAdapter extends FirebaseRecyclerAdapter<Companies, CompAdapter.CompaniessViewholder>{

    public CompAdapter(
            @NonNull FirebaseRecyclerOptions<Companies> options)
    {
        super(options);
    }

    // Function to bind the view in Card view(here
    // "person.xml") iwth data in
    // model class(here "person.class")
    @Override
    protected void
    onBindViewHolder(@NonNull CompaniessViewholder holder,int position, @NonNull Companies model)
    {

        // Add firstname from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.email.setText(model.getEmail());

        // Add lastname from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.name.setText(model.getName());

        // Add age from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.price.setText(model.getPrice());
    }

    // Function to tell the class about the Card view (here
    // "person.xml")in
    // which the data will be shown
    @NonNull
    @Override
    public CompaniessViewholder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lv_company, parent, false);
        return new CompAdapter.CompaniessViewholder(view);
    }

    // Sub Class to create references of the views in Crad
    // view (here "person.xml")
    class CompaniessViewholder
            extends RecyclerView.ViewHolder {
        TextView email, name, price;
        public CompaniessViewholder(@NonNull View itemView)
        {
            super(itemView);

            email = itemView.findViewById(R.id.firstname);
            name = itemView.findViewById(R.id.lastname);
            price = itemView.findViewById(R.id.age);
        }
    }
}