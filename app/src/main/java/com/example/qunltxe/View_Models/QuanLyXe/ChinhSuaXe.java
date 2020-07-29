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

import com.example.qunltxe.Data_Models.Xe;
import com.example.qunltxe.Database.DBXe;
import com.example.qunltxe.R;
import com.example.qunltxe.View_Models.HomePage.TrangChu;

import java.util.ArrayList;

public class ChinhSuaXe extends AppCompatActivity {
    EditText txtMaxe, txtTenXe, txtDungTich, txtSoLuong, txtMaLoai;
    Button btnClear, btnEdit;
    ArrayList<Xe> dataXE = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinh_sua_xe);
        setControl();
        setEvent();
    }

    private void setEvent() {
    }

    private void setControl() {
        txtMaxe = findViewById(R.id.txtMaXe);
        txtTenXe = findViewById(R.id.txtTenXe);
        txtDungTich = findViewById(R.id.txtDungTich);
        txtSoLuong = findViewById(R.id.txtSoLuong);
        txtMaLoai = findViewById(R.id.txtMaLoai);
        btnEdit = findViewById(R.id.btnSua);
        btnClear = findViewById(R.id.btnClear);
    }


}