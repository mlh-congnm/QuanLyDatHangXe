package com.example.qunltxe.View_Models.QuanLyXe;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qunltxe.Data_Models.Xe;
import com.example.qunltxe.Database.DBXe;
import com.example.qunltxe.R;
import com.example.qunltxe.View_Models.HomePage.TrangChu;

public class ThemXe extends AppCompatActivity {
    EditText txtMaxe, txtTenXe, txtDungTich, txtSoLuong, txtMaLoai;
    Button btnAdd, btnClear;
    RecyclerView recyclerViewXe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.them_xe);
        setControl();
        setEvent();
    }

    public void setEvent() {

    }

    public void setControl() {
        txtMaxe = findViewById(R.id.txtMaXe);
        txtTenXe = findViewById(R.id.txtTenXe);
        txtDungTich = findViewById(R.id.txtDungTich);
        txtSoLuong = findViewById(R.id.txtSoLuong);
        txtMaLoai = findViewById(R.id.txtMaLoai);
        btnAdd = findViewById(R.id.btnThem);
        btnClear = findViewById(R.id.btnClear);
        recyclerViewXe = findViewById(R.id.recyclerViewXe);
    }

}