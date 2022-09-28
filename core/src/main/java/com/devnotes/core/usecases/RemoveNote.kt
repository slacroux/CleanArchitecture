package com.devnotes.core.usecases

import com.devnotes.core.data.Note
import com.devnotes.core.repository.NoteRepository

class RemoveNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}