package observer;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import java.util.ArrayList;
import java.util.List;

@Log4j2
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RideSharingSystem implements RideSubject {

    static RideSharingSystem system;
    static List<DriverObserver> drivers;

    public static RideSharingSystem getSystem() {
        if(system!=null) {
            return system;
        }
        synchronized(RideSharingSystem.class) {
            system = new RideSharingSystem();
            drivers = new ArrayList<>();
            return system;
        }
    }

    public static long driverCount() {
        return drivers.size();
    }

    @Override
    public void registerDriver(DriverObserver observer) {
        drivers.add(observer);
    }

    @Override
    public void removeDriver(DriverObserver observer) {
        log.info("Driver {} goes offline", ((Driver) observer).name());
        drivers.remove(observer);
    }

    @Override
    public void notifyDrivers(RideRequest request) {
        drivers.forEach(driverObserver -> driverObserver.update(request));
    }

    public void newRideRequest(RideRequest request) {
        log.info("New ride request .....");
        log.info("RiderLocation : {}", request.riderLocation());
        log.info("Destination : {}", request.destination());
        notifyDrivers(request);
    }

}
