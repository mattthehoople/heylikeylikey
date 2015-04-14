import static spark.Spark.*;

public class EntryPoint {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}