package seedu.address.model.note;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

/**
 * Represents a note in the note list.
 */
public class Note {

    private String note;
    private String description;
    private Priority priority;

    /**
     * Creates a new note.
     *
     * @param note to set.
     * @param description to the question.
     */
    public Note(String note, String description) {
        requireAllNonNull(note, description);
        this.note = note;
        this.description = description;
    }

    /**
     * Creates a new note.
     *
     * @param note to set.
     * @param description to the question.
     * @param priority of the note.
     */
    public Note(String note, String description, Priority priority) {
        requireAllNonNull(note, description, priority);
        this.note = note;
        this.description = description;
        this.priority = priority;
    }

    public String getNote() {
        return this.note;
    }

    public String getDescription() {
        return this.description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns true if both notes have the same string comparison of note title.
     * This defines a weaker notion of equality between two notes.
     */
    public boolean isSameNote(Note otherNote) {
        if (otherNote == this) {
            return true;
        }
        return otherNote != null
                && otherNote.getNote().equals(getNote());
    }

    /**
     * Returns true if both notes have the same note title and description.
     * This defines a stronger notion of equality between two notes.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Note)) {
            return false;
        }
        Note otherNote = (Note) other;
        return otherNote.getNote().equals(getNote())
                && otherNote.getDescription().equals(getDescription())
                && otherNote.getPriority().equals(getPriority());
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(note, description);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Note: ")
            .append(getNote())
            .append(" Description: ")
            .append(getDescription())
            .append(" Priority: ")
            .append(getPriority())
            .append("\n");
        return builder.toString();
    }

}
