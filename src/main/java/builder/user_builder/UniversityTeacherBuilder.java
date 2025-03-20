package builder.user_builder;

import builder.UniversityTeacher;
import builder.User;
import builder.UserRole;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UniversityTeacherBuilder extends Builder {

    static UniversityTeacherBuilder BUILDER = new UniversityTeacherBuilder();

    @NonFinal
    String universityName;

    @NonFinal
    String universityAddress;

    @NonFinal
    String lecture;

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
