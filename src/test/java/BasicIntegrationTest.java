import org.junit.jupiter.api.Test;


public class BasicIntegrationTest
{
    @Test
    void integrationTest()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}