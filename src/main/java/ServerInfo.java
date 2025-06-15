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
        } 
        System.out.println("Current Time: " + skadoosh);
        System.out.println("Hostname: " + hostname);
    }
}
