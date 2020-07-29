package com.example.qunltxe.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.qunltxe.Data_Models.Xe;

import java.util.ArrayList;

public class DBXe extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "QuanLyDatHangXe";
    private static final String TABLE_XE = "Xe";

    // Table Xe
    private static final String COLUMN_MA_XE = "maxe";
    private static final String COLUMN_TEN_XE = "tenxe";
    private static final String COLUMN_DUNGTICH_XE = "dungtich";
    private static final String COLUMN_SOLUONG_XE = "soluong";
    private static final String COLUMN_MALOAI_XE = "maloai";
    public static final String CREATE_XE_TABLE = "CREATE TABLE "
            + TABLE_XE + "(" + COLUMN_MA_XE + " TEXT PRIMARY KEY NOT NULL,"
            + COLUMN_TEN_XE + " TEXT,"
            + COLUMN_DUNGTICH_XE + " INTEGER,"
            + COLUMN_SOLUONG_XE + " INTEGER,"
            + COLUMN_MALOAI_XE + " TEXT" + ")";

    public DBXe(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_XE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS CREATE_XE_TABLE");
        onCreate(db);
    }


    public void Them(Xe xe) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("maxe", xe.getMaXe());
        values.put("tenxe", xe.getTenXe());
        values.put("dungtich", xe.getDungTich());
        values.put("soluong", xe.getSoLuong());
        values.put("maloai", xe.getMaLoai());
        db.insert("Xe", null, values);
        db.close();
    }

    public void Sua(Xe xe) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("maxe", xe.getMaXe());
        values.put("tenxe", xe.getTenXe());
        values.put("dungtich", xe.getDungTich());
        values.put("soluong", xe.getSoLuong());
        values.put("maloai", xe.getMaLoai());
        db.update("Xe", values, "maxe ='" + xe.getMaXe() + "'", null);
        db.close();
    }

    public void Xoa(Xe xe) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("Xe", "maxe ='" + xe.getMaXe() + "'", null);
        db.close();
    }

    public ArrayList<Xe> LayDL() {
        ArrayList<Xe> data = new ArrayList<>();
        String sql = "SELECT * FROM Xe";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();

        try {
            cursor.moveToFirst();
            do {
                Xe xe = new Xe();
                xe.setMaXe(cursor.getString(0));
                xe.setTenXe(cursor.getString(1));
                xe.setDungTich(cursor.getInt(2));
                xe.setSoLuong(cursor.getInt(3));
                xe.setMaLoai(cursor.getString(4));
                data.add(xe);
            }
            while (cursor.moveToNext());
        } catch (Exception ex) {
        }
        return data;
    }

    public ArrayList<Xe> LayDL(String maxe) {
        ArrayList<Xe> data = new ArrayList<>();
        String sql = "SELECT * FROM Xe WHERE maxe ='" + maxe + "'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();

        try {
            cursor.moveToFirst();
            do {
                Xe xe = new Xe();
                xe.setMaXe(cursor.getString(0));
                xe.setTenXe(cursor.getString(1));
                xe.setDungTich(cursor.getInt(2));
                xe.setSoLuong(cursor.getInt(3));
                xe.setMaLoai(cursor.getString(4));
                data.add(xe);
            }
            while (cursor.moveToNext());
        } catch (Exception ex) {
        }

        return data;
    }
}
