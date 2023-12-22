package com.example.noteapp.feature_note.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.noteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow
@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    fun  getNotes(): Flow<MutableList<Note>>
    @Query("SELECT * FROM note WHERE id = :id")
    suspend  fun  getNoteByIds(id:Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)
//    @Delete
//    suspend fun deleteNote(id:Int)
//    @Update
//    suspend fun updateNote(note: Note,id:Int)
}