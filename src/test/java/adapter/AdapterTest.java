package adapter;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

@Log4j2
class AdapterTest {

    @Test
    void test() {

        CustomerService customerService = CustomerAdapter.customerAdapter();

        System.out.println("---------------------------------------");
        var customer1 = customerService.findById(1L);
        log.info(customer1.toString());
        System.out.println("---------------------------------------\n");

        System.out.println("---------------------------------------");
        var customer2 = customerService.findById(2L);
        log.info(customer2.toString());
        System.out.println("---------------------------------------\n");

        System.out.println("---------------------------------------");
        var customer3 = customerService.findById(3L);
        log.info(customer3.toString());
        System.out.println("---------------------------------------\n");

        System.out.println("---------------------------------------");
        var customer4 = customerService.findById(4L);
        log.info(customer4.toString());
        System.out.println("---------------------------------------\n");
    }

}
