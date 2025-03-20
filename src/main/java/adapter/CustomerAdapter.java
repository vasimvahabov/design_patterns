package adapter;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Objects;

/**
 * Adapter: Converts LegacyCustomer to CustomerDTO
 */

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CustomerAdapter implements CustomerService {

    static CustomerAdapter CUSTOMER_ADAPTER;
    LegacyCustomerSystem legacyCustomerSystem;

    public static CustomerAdapter customerAdapter() {
        if (Objects.isNull(CUSTOMER_ADAPTER)) {
            synchronized (CustomerAdapter.class) {
                CUSTOMER_ADAPTER = new CustomerAdapter(LegacyCustomerSystem.legacyCustomerSystem());
            }
        }
        return CUSTOMER_ADAPTER;
    }

    @Override
    public CustomerDTO findById(Long id) {
        return this.legacyCustomerToCustomerDTO(legacyCustomerSystem.findCustomerById(id));
    }


    private CustomerDTO legacyCustomerToCustomerDTO(LegacyCustomer legacyCustomer) {
        var firstname = legacyCustomer.fullName().split(" ")[0];
        var lastname = legacyCustomer.fullName().split(" ")[1];
        return new CustomerDTO(legacyCustomer.id(), firstname, lastname, legacyCustomer.address());
    }

}
