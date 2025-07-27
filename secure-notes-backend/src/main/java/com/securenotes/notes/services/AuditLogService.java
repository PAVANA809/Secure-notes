package com.securenotes.notes.services;

import com.securenotes.notes.models.AuditLog;
import com.securenotes.notes.models.Note;

import java.util.List;

public interface AuditLogService {

    void logNoteCreation(String username, Note note);

    void logNoteUpdate(String username, Note note);

    void logNoteDeletion(String username, Long noteId);

    List<AuditLog> getAllAuditLogs();

    List<AuditLog> getAllAuditLogsForNoteId(Long id);
}
