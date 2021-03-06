package com.example.qunltxe.View_Models.TaiKhoan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.qunltxe.Data_Models.User;
import com.example.qunltxe.Database.DBUser;
import com.example.qunltxe.R;
import com.example.qunltxe.View_Models.HomePage.DangNhap;


public class DangKy extends AppCompatActivity {
    EditText reg_username, reg_fullname, reg_password;
    Button register;
    TextView back_login;
    DBUser dbUser;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        setControl();
        setEvent();
        KhoiTaoData();
    }

    public void setEvent() {
        back_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangKy.this, DangNhap.class);
                startActivity(intent);
                intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInputRegister();
            }
        });
    }

    public void setControl() {
        reg_username = findViewById(R.id.reg_username);
        reg_fullname = findViewById(R.id.reg_fullname);
        reg_password = findViewById(R.id.reg_password);
        back_login = findViewById(R.id.back_login);
        register = findViewById(R.id.btn_register);
    }

    private void KhoiTaoData() {
        dbUser = new DBUser(DangKy.this);
        user = new User();
    }

    private void checkInputRegister() {

        if (reg_username.getText().toString().isEmpty()) {
            reg_username.setError("Bạn chưa nhập tài khoản");
        } else if (reg_fullname.getText().toString().isEmpty()) {
            reg_fullname.setError("Bạn chưa nhập họ tên");
        } else if (reg_password.getText().toString().isEmpty()) {
            reg_password.setError("Bạn chưa nhập mật khẩu");
        }

        if (!dbUser.checkUserRegister(reg_username.getText().toString().trim())) {
            user.setUsername(reg_username.getText().toString().trim());
            user.setFullname(reg_fullname.getText().toString().trim());
            user.setPassword(reg_password.getText().toString().trim());
            dbUser.Them(user);

            AlertDialog.Builder alert = new AlertDialog.Builder(DangKy.this);
            alert.setTitle("Thông báo");
            alert.setMessage("Đăng ký thành công");
            alert.setPositiveButton("OK", null);
            alert.show();

        } else {
            AlertDialog.Builder alert = new AlertDialog.Builder(DangKy.this);
            alert.setTitle("Thông báo");
            alert.setMessage("Tài khoản đã tồn tại");
            alert.setPositiveButton("OK", null);
            alert.show();
        }
    }

}