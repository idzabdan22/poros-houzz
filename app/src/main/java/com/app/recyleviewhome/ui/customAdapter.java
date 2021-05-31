package com.app.recyleviewhome.ui;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.recyleviewhome.ContentActivity;
import com.app.recyleviewhome.R;

import java.util.List;

public class customAdapter extends RecyclerView.Adapter<customAdapter.myviewHolder> {

    List<modalClass> mlist;
    Context context;

    public customAdapter(List<modalClass> mlist, Context context) {
        this.mlist = mlist;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.homebasedlyt, parent, false);
        return new myviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
        holder.img.setImageResource(mlist.get(position).getImage());
        holder.txt.setText(mlist.get(position).getText());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContentActivity.class);
                intent.putExtra("image", mlist.get(position).getImage());
                intent.putExtra("text", mlist.get(position).getText());
                intent.putExtra("desc",mlist.get(position).getDesc());
                intent.putExtra("type",mlist.get(position).getType());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class myviewHolder extends RecyclerView.ViewHolder {
            ImageView img;
            TextView txt;
            public myviewHolder(@NonNull View itemView){
                super(itemView);
                img = itemView.findViewById(R.id.layoutimg);
                txt = itemView.findViewById(R.id.layouttxt);
            }
    }
}
