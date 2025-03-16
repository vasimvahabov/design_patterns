package adapter.payment;

import java.math.BigDecimal;

public interface Payment {

    BigDecimal pay(BigDecimal balance, BigDecimal amount);

}
