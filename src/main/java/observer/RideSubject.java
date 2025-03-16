package observer;

public interface RideSubject {

    void registerDriver(DriverObserver observer);

    void removeDriver(DriverObserver observer);

    void notifyDrivers(RideRequest request);

}
