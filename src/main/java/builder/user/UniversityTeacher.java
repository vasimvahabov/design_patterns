package builder.user;

public class UniversityTeacher extends User {

    private String universityName;

    private String universityAddress;

    private String lecture;

    public UniversityTeacher(String email, String username, String password, UserRole role, String universityName, String universityAddress, String lecture) {
        super(email, username, password, role);
        this.universityName = universityName;
        this.universityAddress = universityAddress;
        this.lecture = lecture;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public String getLecture() {
        return lecture;
    }

    @Override
    public String toString() {
        return "UniversityTeacher{" +
                "universityName='" + universityName + '\'' +
                ", universityAddress='" + universityAddress + '\'' +
                ", lecture='" + lecture + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
