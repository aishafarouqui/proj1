package com.aisha2016.proj1;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class CompnyVH extends RecyclerView.ViewHolder

{
    public TextView com_name,com_price;
    public CompnyVH(@NonNull View itemView) {
        super(itemView);

        com_name = itemView.findViewById(R.id.comp_name);
        com_price = itemView.findViewById(R.id.subscPrice);
    }

}

