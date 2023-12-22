package com.example.noteapp.feature_note.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.noteapp.feature_note.data.data_source.NoteDatabase
import com.example.noteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

class NoteViewModel(application: Application) : AndroidViewModel(application) {
    var db = NoteDatabase.getDatabase(application);
    var noteDao = db.noteDao();
    val notes: Flow<List<Note>> = noteDao.getNotes();
    var noteContent = ""
  suspend  fun  addTodo(note: Note){
        noteDao.insertNote(note)
    }
//    suspend fun  update(note: Note){
//        noteDao.insertNote(note)
//    }

    fun handleTextFieldChange(title:String){
        noteContent = title
    }

}