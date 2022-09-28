package com.devnotes.core.repository

import com.devnotes.core.data.Note

class NoteRepository(private val dataSource: NoteDataSource) {
    suspend fun addNote(note: Note) = dataSource.add(note)
    suspend fun removeNote(note: Note) = dataSource.remove(note)
    suspend fun getNote(id: Long) = dataSource.get(id)
    suspend fun getAllNotes() = dataSource.getAll()
}