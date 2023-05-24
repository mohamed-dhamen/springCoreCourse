package org.example;

public class Module {
    public String name;
    public float note;

    @Override
    public String toString() {
        return "Module{" +
                "name='" + name + '\'' +
                ", note=" + note +
                '}';
    }

    public Module(String name) {
        this.name = name;
    }

    public Module(float note) {
        this.note = note;
    }

    public Module(String name, float note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public Module() {
    }
}
