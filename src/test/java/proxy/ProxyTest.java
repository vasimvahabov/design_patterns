package proxy;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class ProxyTest {

    @Test
    void test() {
        Image image1 = new ProxyImage("/home/photo1.jpg", UserRole.ADMIN);
        Image image2 = new ProxyImage("/home/photo2.jpg", UserRole.USER);
        Image image3 = new ProxyImage("/home/photo3.jpg", UserRole.GUEST);

        log.info("------------------------------------------------");
        log.info("Displaying first image with loading from disk...");
        log.info("------------------------------------------------");
        image1.display();
        log.info("------------------------------------------------\n\n");


        log.info("------------------------------------------------");
        log.info("Displaying first image without reloading from disk...");
        log.info("------------------------------------------------");
        image1.display();
        log.info("------------------------------------------------\n\n");

        log.info("------------------------------------------------");
        log.info("Displaying second image with loading from disk...");
        log.info("------------------------------------------------");
        image2.display();
        log.info("------------------------------------------------\n\n");

        log.info("------------------------------------------------");
        log.info("Displaying third image with loading from disk...");
        log.info("------------------------------------------------");
        assertDoesNotThrow(image3::display);
        log.info("------------------------------------------------\n\n");

    }

}
