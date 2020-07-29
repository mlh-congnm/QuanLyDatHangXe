package com.example.qunltxe.Adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qunltxe.Data_Models.Xe;
import com.example.qunltxe.Database.DBXe;
import com.example.qunltxe.R;
import com.example.qunltxe.View_Models.QuanLyXe.ChinhSuaXe;
import com.example.qunltxe.View_Models.QuanLyXe.DanhSachXe;

import java.util.ArrayList;

public class XeRecyclerAdapter extends RecyclerView.Adapter<XeRecyclerAdapter.XeViewHolder> {

    @NonNull
    @Override
    public XeRecyclerAdapter.XeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull XeRecyclerAdapter.XeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
