package com.example.android.saveit;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "my_notes")
public class Note {
    public Note(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    private String title;
    private String desc;

    @PrimaryKey(autoGenerate = true)
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
