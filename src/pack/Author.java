package pack;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //домашка по методам объектов

    @Override
    public int hashCode() {
        return Objects.hash("name", "surname");
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        return name.equals(((Author) obj).name) && surname.equals(((Author) obj).surname);
    }

    @Override
    public String toString() {
        return name + surname;
    }

}
