package com.example.easyreminderv3;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {

    private NoteRepository mRepository;

    private final LiveData<List<Note>> mAllWords;

    public NoteViewModel (Application application) {
        super(application);
        mRepository = new NoteRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    LiveData<List<Note>> getAllWords() { return mAllWords; }
    LiveData<List<Note>> get() { return mAllWords; }

    public void insert(Note note) { mRepository.insert(note); }
}
