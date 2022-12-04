package com.example.chatapplication.Adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import com.example.chatapplication.R;
import androidx.recyclerview.widget.RecyclerView;
import com.example.chatapplication.ViewHolder.MessageViewHolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<MessageViewHolder>{


//    class UsersViewHolder extends RecyclerView.ViewHolder {
//
//
//    }
//    private Bitmap getUserImage(String Image){
//        byte[] bytes = Base64.decode(Image,Base64.DEFAULT);
//        return BitmapFactory.decodeByteArray(bytes,0,bytes.length);
//    }

//    private final ArrayList<UsersEntity> userList;
//
//    public UsersAdapter(ArrayList<UsersEntity> userList) {
//        this.userList = userList;
//    }

    private final List<String> userList = new ArrayList<String>(Arrays.asList("James","田中 和夫","春日原 歩","Tom Cruise","高橋 明"));

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //レイアウト取得
        View xml = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_chats,parent,false);

        return new MessageViewHolder(xml);
    }

    //positionデータをレイアウトに表示する
    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        holder.txtName.setText(userList[position]);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
