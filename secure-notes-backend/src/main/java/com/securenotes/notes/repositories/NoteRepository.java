package com.securenotes.notes.repositories;

import com.securenotes.notes.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByOwnerUserName(String ownerUserName);
}
