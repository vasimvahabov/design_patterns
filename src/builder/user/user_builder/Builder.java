package builder.user.user_builder;

import builder.user.User;
import builder.user.UserRole;

public abstract class Builder {

    protected String email;
    protected String username;
    protected String password;
    protected UserRole role;

    public abstract User build();

    public abstract Builder setEmail(String email);

    public abstract Builder setUsername(String username);

    public abstract Builder setPassword(String password);

    public abstract Builder setRole(UserRole role);

}
