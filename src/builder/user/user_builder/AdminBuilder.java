package builder.user.user_builder;

import builder.user.Admin;
import builder.user.User;
import builder.user.UserRole;

public class AdminBuilder extends Builder {

    private String organizationName;
    private String organizationAddress;

    private static final AdminBuilder BUILDER = new AdminBuilder();

    public static AdminBuilder builder() {
        return BUILDER;
    }

    public AdminBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public AdminBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public AdminBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public AdminBuilder setRole(UserRole role) {
        this.role = role;
        return this;
    }

    public AdminBuilder setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    public AdminBuilder setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
        return this;
    }

    @Override
    public User build() {
        return new Admin(email, username, password, role, organizationName, organizationAddress);
    }

}
