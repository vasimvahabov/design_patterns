package proxy;

import lombok.AccessLevel;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import lombok.extern.log4j.Log4j2;

import java.util.Objects;

/**
 * Proxy : ProxyImage
 * */

@Log4j2
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProxyImage extends Image {

    @NonFinal
    Image realImage;

    UserRole userRole;

    public ProxyImage(String fileName, UserRole userRole) {
        super(fileName);
        if(Objects.isNull(userRole)) {
            throw new IllegalArgumentException("Role cannot be null...");
        }
        this.userRole = userRole;
    }

    @Override
    @SneakyThrows
    public void display() {
        if(UserRole.GUEST.equals(userRole)) {
            throw new ImageUnauthorizedException("You don't have appropriate role to display photo");
        }

        log.info("Displaying image...");
        if (Objects.isNull(realImage)) {
            this.realImage = new RealImage("/home/abc.png");
        }
        realImage.display();
    }

}
