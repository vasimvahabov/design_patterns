package builder;

import builder.user_builder.AdminBuilder;
import builder.user_builder.UniversityStudentBuilder;
import builder.user_builder.UniversityTeacherBuilder;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

@Log4j2
class BuilderTest {

    @Test
    void test() {
        var admin = AdminBuilder
                .builder()
                .setEmail("adminEmail")
                .setUsername("adminUsername")
                .setPassword("adminPassword")
                .setRole(UserRole.ADMIN)
                .setOrganizationName("organizationName")
                .setOrganizationAddress("organizationAddress")
                .build();
        log.info("{} \n", admin);

        var universityStudent = UniversityStudentBuilder
                .builder()
                .setEmail("universityStudentEmail")
                .setUsername("universityStudentUsername")
                .setPassword("universityStudentPassword")
                .setRole(UserRole.UNIVERSITY_STUDENT)
                .setUniversityName("universityName")
                .setUniversityAddress("universityAddress")
                .build();
        log.info("{} \n", universityStudent);


        var universityTeacher = UniversityTeacherBuilder
                .builder()
                .setEmail("universityTeacherEmail")
                .setUsername("universityTeacherUsername")
                .setPassword("universityTeacherPassword")
                .setRole(UserRole.UNIVERSITY_TEACHER)
                .setUniversityName("universityName")
                .setLecture("physics")
                .setUniversityAddress("universityAddress")
                .build();
        log.info("{} \n", universityTeacher);

    }

}
