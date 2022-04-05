import java.util.Objects;

public class SchoolStudent {
    private final String group;
    private final String name;
    private final App.Gender gender;

    public SchoolStudent(String group, String name, App.Gender gender) {
        if (group == null || name == null) {
            throw new IllegalArgumentException();
        }
        this.group = group;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public App.Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolStudent that = (SchoolStudent) o;
        return Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group);
    }

    @Override
    public String toString() {
        return "SchoolStudent{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", gender=" + gender +
                '}';
    }
}
