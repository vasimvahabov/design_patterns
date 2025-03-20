package builder.user_builder;

import builder.UniversityStudent;
import builder.User;
import builder.UserRole;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UniversityStudentBuilder extends Builder {

    static UniversityStudentBuilder BUILDER = new UniversityStudentBuilder();

    @NonFinal
    String universityName;

    @NonFinal
    String universityAddress;

    public static UniversityStudentBuilder builder() {
        return BUILDER;
    }

    public UniversityStudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UniversityStudentBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UniversityStudentBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UniversityStudentBuilder setRole(UserRole role) {
        this.role = role;
        return this;
    }

    public UniversityStudentBuilder setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public UniversityStudentBuilder setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
        return this;
    }

    @Override
    public User build() {
        return new UniversityStudent(email, username, password, role, universityName, universityAddress);
    }

}
