package adapter;

/**
 * Target Interface: Modern system expects this format
 * */

public interface CustomerService {

    CustomerDTO findById(Long id);

}
