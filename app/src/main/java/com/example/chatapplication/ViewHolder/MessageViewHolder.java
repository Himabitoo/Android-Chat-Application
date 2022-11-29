package com.example.chatapplication.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.chatapplication.R;
import androidx.recyclerview.widget.RecyclerView;


public class MessageViewHolder extends RecyclerView.ViewHolder {

    public ImageView imgUrl;
    public TextView txtName;
    public TextView txtMessage;

    public MessageViewHolder(View item){
        super(item);

        this.imgUrl = item.findViewById(R.id.imgUser);
        this.txtName = item.findViewById(R.id.txtName);
        this.txtMessage = item.findViewById(R.id.txtMessage);
    }

}
