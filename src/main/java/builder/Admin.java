package builder;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Admin extends User {

    String organizationName;

    String organizationAddress;

    public Admin(String email, String username, String password, UserRole role, String organizationName, String organizationAddress) {
        super(email, username, password, role);
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

}
