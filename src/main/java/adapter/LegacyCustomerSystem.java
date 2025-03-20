package adapter;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

import java.util.List;
import java.util.Objects;

/**
 * Adaptee: Legacy system returning customer details in an old format
 * */

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class LegacyCustomerSystem {

    @NonFinal
    static LegacyCustomerSystem LEGACY_CUSTOMER_SYSTEM;

    List<LegacyCustomer> legacyCustomers;

    public LegacyCustomerSystem() {
        this.legacyCustomers = List.of(
                new LegacyCustomer(1L, "Firstname1 Lastname1", "zip1", "Baku, Azerbaijan"),
                new LegacyCustomer(2L, "Firstname1 Lastname2", "zip2", "Baku, Azerbaijan"),
                new LegacyCustomer(3L, "Firstname1 Lastname3", "zip3", "Baku, Azerbaijan")
        );
    }

    public static LegacyCustomerSystem legacyCustomerSystem() {
        if(Objects.isNull(LEGACY_CUSTOMER_SYSTEM)) {
            synchronized (LegacyCustomerSystem.class) {
                LEGACY_CUSTOMER_SYSTEM = new LegacyCustomerSystem();
            }
        }
        return LEGACY_CUSTOMER_SYSTEM;
    }

    public LegacyCustomer findCustomerById(Long id) {
        return legacyCustomers.stream()
                .filter(legacyCustomer -> legacyCustomer.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new LegacyCustomerNotFoundException(String.format("User not found by %d id", id)));
    }

}
