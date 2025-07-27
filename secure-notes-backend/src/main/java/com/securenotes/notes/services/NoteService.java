package com.securenotes.notes.services;

import com.securenotes.notes.models.Note;

import javax.persistence.Lob;
import java.util.List;

public interface NoteService {
    Note createNoteForUser(String username, String content);
    Note updateNoteForUser(Long noteId, String username, String content);
    void deleteNoteForUser(Long noteId, String content);
    List<Note> getNotesForuser(String username);
}
