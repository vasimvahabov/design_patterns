package builder.user.user_builder;

import builder.user.UniversityTeacher;
import builder.user.User;
import builder.user.UserRole;

public class UniversityTeacherBuilder extends Builder {

    private static final UniversityTeacherBuilder BUILDER = new UniversityTeacherBuilder();

    private String universityName;

    private String universityAddress;

    private String lecture;

    public UniversityTeacherBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UniversityTeacherBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UniversityTeacherBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UniversityTeacherBuilder setRole(UserRole role) {
        this.role = role;
        return this;
    }

    public static UniversityTeacherBuilder builder() {
        return BUILDER;
    }

    public UniversityTeacherBuilder setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public UniversityTeacherBuilder setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
        return this;
    }

    public UniversityTeacherBuilder setLecture(String lecture) {
        this.lecture = lecture;
        return this;
    }

    @Override
    public User build() {
        return new UniversityTeacher(email, username, password, role, universityName, universityAddress, lecture);
    }

}
