package observer;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Log4j2
class ObserverTest {

    @Test
    void test(){

        var driver1 = new Driver("Driver 1");
        var driver2 = new Driver("Driver 2");
        var driver3 = new Driver("Driver 3");

        RideSharingSystem.getSystem().registerDriver(driver1);
        RideSharingSystem.getSystem().registerDriver(driver2);
        RideSharingSystem.getSystem().registerDriver(driver3);

        RideSharingSystem.getSystem().newRideRequest(new RideRequest("Baku, Azerbaijan", "Fountains Square"));

        RideSharingSystem.getSystem().removeDriver(driver2);

        RideSharingSystem.getSystem().newRideRequest(new RideRequest("Baku, Azerbaijan", "Baku Boulevard"));

        Assertions.assertNotEquals(RideSharingSystem.driverCount(), 3);

    }

}
