package org.launchcode.techjobs.oo;
import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    JobField (String value){
        this.id = nextId;
        nextId++;
        this.value = value;
    }
    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public boolean isEmpty() {
        return value == null || value.isEmpty();
    }

}
