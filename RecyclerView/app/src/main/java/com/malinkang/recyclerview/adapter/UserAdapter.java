package com.malinkang.recyclerview.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.malinkang.recyclerview.R;
import com.malinkang.recyclerview.databinding.ItemUserBinding;
import com.malinkang.recyclerview.model.User;

import java.util.List;

/**
 * Created by malk on 16/11/14.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{
    private Context mContext;
    private List<User> mUsers;
    public UserAdapter(Context context, List<User> users){
        this.mContext = context;
        this.mUsers = users;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.getBinding().setUser(mUsers.get(position));
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    static class UserViewHolder extends RecyclerView.ViewHolder{
        ItemUserBinding binding;
        public UserViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
        public ItemUserBinding getBinding(){
            return binding;
        }
    }
}
