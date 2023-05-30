package com.uts_10120070_if2;

import android.database.Cursor;

import com.uts_10120070_if2.model.Note;


public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}
