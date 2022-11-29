package com.example.chatapplication.Adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;

public class UsersAdapter extends RecyclerView.Adapter{

    class UsersViewHolder extends RecyclerView.ViewHolder {

        
    }

    private Bitmap getUserImage(String Image){
        byte[] bytes = Base64.decode(Image,Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(bytes,0,bytes.length);
    }
}
