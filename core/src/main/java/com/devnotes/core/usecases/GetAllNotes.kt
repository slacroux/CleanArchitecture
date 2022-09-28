package com.devnotes.core.usecases

import com.devnotes.core.repository.NoteRepository

class GetAllNotes (private val noteRepository: NoteRepository) {
    suspend operator fun invoke() = noteRepository.getAllNotes()
}