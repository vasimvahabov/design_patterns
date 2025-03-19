package proxy;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;

/**
 * RealSubject : RealImage
 * */

@Log4j2
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RealImage extends Image {

    public RealImage(String fileName) {
        super(fileName);
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        log.info("Loading image from disk...");
    }

    @Override
    public void display() {
        log.info("Displaying image...");
    }

}
