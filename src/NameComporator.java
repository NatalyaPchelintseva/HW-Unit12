import java.util.Comparator;

public class NameComporator implements Comparator<SchoolStudent> {
    @Override
    public int compare(SchoolStudent o1, SchoolStudent o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
