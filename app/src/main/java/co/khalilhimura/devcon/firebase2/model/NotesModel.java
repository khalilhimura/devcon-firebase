package co.khalilhimura.devcon.firebase2.model;

/**
 * Created by Khalil Nooh on 28/10/2017.
 */

public class NotesModel {

    public NotesModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    private String title;
    private String description;

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
