package builder.user_builder;

import builder.User;
import builder.UserRole;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PROTECTED)
public abstract class Builder {

    String email;
    String username;
    String password;
    UserRole role;

    public abstract User build();

    public abstract Builder setEmail(String email);

    public abstract Builder setUsername(String username);

    public abstract Builder setPassword(String password);

    public abstract Builder setRole(UserRole role);

}
