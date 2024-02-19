package com.dkbrawlstars.assignment.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dkbrawlstars.assignment.Models_for_profile.Model;
import com.dkbrawlstars.assignment.R;

import java.util.ArrayList;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.viewHolder> {

    ArrayList<Model> list;
    Context context;

    public ModelAdapter(ArrayList<Model> list, Context context) {
        this.list = list;
        this.context = context;
    }
    // influent layout
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_user_profile_card,parent,false);

        return new viewHolder(view);
    }
    //
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
    Model model = list.get(position);
    // use to set data
    holder.profileImageView.setText(model.getPic());
    holder.tvName.setText(model.getName());
    holder.tvPurpose.setText(model.getPurpose());
    holder.tvStatus.setText(model.getStatus());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // new class viewHolder
    public class viewHolder extends RecyclerView.ViewHolder{
        TextView tvName,tvPurpose,tvStatus,tvDistance,profileImageView;
       public viewHolder(@NonNull View itemView) {

           super(itemView);
           profileImageView = itemView.findViewById(R.id.profileImage);
           tvName = itemView.findViewById(R.id.username);
           tvPurpose = itemView.findViewById(R.id.tvSelectPurpose_View);
           tvStatus = itemView.findViewById(R.id.tvStatus_view);
           tvDistance = itemView.findViewById(R.id.kilo_meter);


       }
   }
}
