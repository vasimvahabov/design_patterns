package builder.user;

public class Admin extends User {

    private String organizationName;

    private String organizationAddress;

    public Admin(String email, String username, String password, UserRole role, String organizationName, String organizationAddress) {
        super(email, username, password, role);
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "organizationName='" + organizationName + '\'' +
                ", organizationAddress='" + organizationAddress + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
