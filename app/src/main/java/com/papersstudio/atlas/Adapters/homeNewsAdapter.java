package com.papersstudio.atlas.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.papersstudio.atlas.Models.categoryModel;
import com.papersstudio.atlas.Models.newsModel;
import com.papersstudio.atlas.R;

import java.util.ArrayList;
import java.util.List;

public class homeNewsAdapter extends RecyclerView.Adapter<homeNewsAdapter.viewHolder>{

    private List<newsModel.newsListModel> modelList=new ArrayList<>();
    private Context context;
    private clickEvent clickEvent;

    public homeNewsAdapter(List<newsModel.newsListModel> modelList, Context context) {
        this.modelList=modelList;
        this.context=context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.news_card_1,parent);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.category_text.setText(modelList.get(position).getCategory_name());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private View layout;
        private TextView category_text;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            layout=itemView.findViewById(R.id.category_card);
            category_text=itemView.findViewById(R.id.category_name);

            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=getAdapterPosition();
                    if(position!=RecyclerView.NO_POSITION) {
                        clickEvent.onLayoutClick(position);
                    }

                }
            });
        }
    }

    public interface clickEvent {
        void onLayoutClick(int position);
    }

    public void setOnclickEvent(clickEvent clickEvent) {
        this.clickEvent=clickEvent;
    }
}
