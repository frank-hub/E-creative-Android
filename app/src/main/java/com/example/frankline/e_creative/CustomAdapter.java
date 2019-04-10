package com.example.frankline.e_creative;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private List<RetroArticle> dataList;
    private Context context;

    public CustomAdapter(Context context,List<RetroArticle> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView title,author,category,created;
        private ImageView image;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            title = mView.findViewById(R.id.a_title);
            author = mView.findViewById(R.id.a_author);
            category = mView.findViewById(R.id.a_category);
            created = mView.findViewById(R.id.a_created_at);
            image = mView.findViewById(R.id.a_image);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.articles_row, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.title.setText(dataList.get(position).getTitle());
        holder.author.setText(dataList.get(position).getAuthor());
        holder.category.setText(dataList.get(position).getCartegory());
        holder.created.setText(dataList.get(position).getCreated_at());

//        Picasso.Builder builder = new Picasso.Builder(context);
//        builder.downloader(new OkHttp3Downloader(context));
//        builder.build().load(dataList.get(position).getImage_name())
//                .placeholder((R.drawable.ic_launcher_background))
//                .error(R.drawable.ic_launcher_background)
//                .into(holder.image);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
