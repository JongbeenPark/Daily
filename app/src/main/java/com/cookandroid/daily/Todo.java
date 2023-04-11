package com.cookandroid.daily;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "todoTable")
public class Todo implements Serializable {
    @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) Long id;
    @ColumnInfo(name = "title") String title;
    @ColumnInfo(name = "content") String content;
    @ColumnInfo(name = "timeStamp") String timestamp;
    @ColumnInfo(name = "isChecked") boolean isChecked;
}
