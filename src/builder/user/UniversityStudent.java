package builder.user;

public class UniversityStudent extends User {

    private String universityName;

    private String universityAddress;

    public UniversityStudent(String email, String username, String password, UserRole role, String universityName, String universityAddress) {
        super(email, username, password, role);
        this.universityName = universityName;
        this.universityAddress = universityAddress;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    @Override
    public String toString() {
        return "UniversityStudent{" +
                "universityName='" + universityName + '\'' +
                ", universityAddress='" + universityAddress + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
