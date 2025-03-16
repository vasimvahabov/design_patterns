package observer;

import lombok.extern.log4j.Log4j2;

@Log4j2
public record Driver(String name) implements DriverObserver {

    @Override
    public void update(RideRequest request) {
        log.info("Driver {} notified ...", name);
    }

}
