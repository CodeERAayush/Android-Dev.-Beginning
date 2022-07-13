package com.aayushpandey.recyclerview;

import android.view.View;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class theviewholder extends RecyclerView.ViewHolder {
TextView name;
    TextView address;


    public theviewholder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
        address=itemView.findViewById(R.id.details);
    }
}
