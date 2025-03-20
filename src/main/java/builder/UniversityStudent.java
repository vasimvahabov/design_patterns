package builder;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UniversityStudent extends User {

    String universityName;

    String universityAddress;

    public UniversityStudent(String email, String username, String password, UserRole role, String universityName, String universityAddress) {
        super(email, username, password, role);
        this.universityName = universityName;
        this.universityAddress = universityAddress;
    }

}
