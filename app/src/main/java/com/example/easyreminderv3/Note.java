package com.example.easyreminderv3;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int contentId;
    private String name;
    private String description;
    private int difficulty;

    public Note(Integer contentId, String name, String description, Integer difficulty) {
        this.contentId = contentId;
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public int getContentId() {
        return contentId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
