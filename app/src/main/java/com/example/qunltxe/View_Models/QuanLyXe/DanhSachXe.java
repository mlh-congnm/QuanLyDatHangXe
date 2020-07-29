package com.example.qunltxe.View_Models.QuanLyXe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qunltxe.Adapter.XeRecyclerAdapter;
import com.example.qunltxe.Data_Models.Xe;
import com.example.qunltxe.Database.DBXe;
import com.example.qunltxe.R;

import java.util.ArrayList;

public class DanhSachXe extends AppCompatActivity {
    RecyclerView recyclerViewXe;
    ImageView img_add;
    ArrayList<Xe> data_XE = new ArrayList<>();
    XeRecyclerAdapter xeRecyclerAdapter;
    DBXe dbXe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.danh_sach_xe);
        setControl();
        setEvent();
    }

    private void setEvent() {

    }

    private void setControl() {
        recyclerViewXe = findViewById(R.id.recyclerViewXe);
        img_add = findViewById(R.id.img_add);
    }

}

