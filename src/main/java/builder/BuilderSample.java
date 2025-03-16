package builder;

import builder.user.UserRole;
import builder.user.user_builder.AdminBuilder;
import builder.user.user_builder.UniversityStudentBuilder;
import builder.user.user_builder.UniversityTeacherBuilder;

public class BuilderSample {

    public static void main(String[] args) {

        var admin = AdminBuilder
                .builder()
                .setEmail("adminEmail")
                .setUsername("adminUsername")
                .setPassword("adminPassword")
                .setRole(UserRole.ADMIN)
                .setOrganizationName("organizationName")
                .setOrganizationAddress("organizationAddress")
                .build();
        System.out.println(admin+"\n");

        var universityStudent = UniversityStudentBuilder
                .builder()
                .setEmail("universityStudentEmail")
                .setUsername("universityStudentUsername")
                .setPassword("universityStudentPassword")
                .setRole(UserRole.UNIVERSITY_STUDENT)
                .setUniversityName("universityName")
                .setUniversityAddress("universityAddress")
                .build();
        System.out.println(universityStudent+"\n");


        var universityTeacher = UniversityTeacherBuilder
                .builder()
                .setEmail("universityTeacherEmail")
                .setUsername("universityTeacherUsername")
                .setPassword("universityTeacherPassword")
                .setRole(UserRole.UNIVERSITY_TEACHER)
                .setUniversityName("universityName")
                .setUniversityAddress("universityAddress")
                .build();
        System.out.println(universityTeacher+"\n");

    }
}
