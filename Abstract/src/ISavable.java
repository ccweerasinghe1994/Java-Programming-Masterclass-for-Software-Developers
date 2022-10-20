import java.util.List;

public interface ISavable {
    List write();

    void read(List list);
}

