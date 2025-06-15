import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServerInfo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String skadoosh = now.format(formatter);

        String hostname = "Unknown";
        try {
            InetAddress ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
        } catch (Exception e) {
            System.err.println("Error getting hostname: " + e.getMessage());
        }
        System.out.println("Current Time: " + skadoosh);
        System.out.println("Hostname: " + hostname);
        int[] numbers = {1, 2, 3, 4, 5};

        // BUG: Off-by-one error – will cause ArrayIndexOutOfBoundsException
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
    }
