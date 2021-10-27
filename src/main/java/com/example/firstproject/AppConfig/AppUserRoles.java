//package com.example.firstproject.AppConfig;
//
//import com.google.common.collect.Sets;
//
//import java.util.Set;
//
//import static com.example.firstproject.AppConfig.AppUserPermissions.*;
//
//public enum AppUserRoles {
//    STUDENT(Sets.newHashSet()),
//    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE)),
//    ADMINTRAINEE(Sets.newHashSet(COURSE_READ, STUDENT_READ));
//
//    private final Set<AppUserPermissions> permissions;
//
//    AppUserRoles(Set<AppUserPermissions> permissions) {
//        this.permissions = permissions;
//    }
//
//    public Set<AppUserPermissions> getPermissions() {
//        return permissions;
//    }
//}
