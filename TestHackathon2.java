import org.testng.annotations.Test;
import java.sql.Timestamp;
import java.util.*;


public class TestHackathon2  {
    
    @Test()
    public void HackTest2() {
      
        Date today = new Date();
        Timestamp time = (Timestamp)today;

        long seconds = System.currentTimeMillis();
        time = new Timestamp(seconds);
        today = (Date)time; 

    }
}
