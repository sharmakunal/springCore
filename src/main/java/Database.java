import org.springframework.stereotype.Repository;

@Repository
public class Database {
    public int port;
    public String name;

    public void setPort(int port) {
        this.port = port;
    }

    public void setName(String name) {
        this.name = name;
    }
}
