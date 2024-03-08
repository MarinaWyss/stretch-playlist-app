// This Entity class maps stretches in the db

package javaproject.marinalearnsjava;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stretches")
public class Stretch {

    @Id
    // The value of the id field will be generated automatically 
    // by MySQL auto-increment and should not be manually assigned.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String body_part;
    private boolean repeated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBodyPart() {
        return body_part;
    }

    public void setBodyPart(String body_part) {
        this.body_part = body_part;
    }

    public boolean getRepeated() {
        return repeated;
    }

    public void setRepeated(boolean repeated) {
        this.repeated = repeated;
    }
}