package com.example.cafe_management_systemfin.dto.request;

import com.example.cafe_management_systemfin.domain.enums.RoleType;

import java.util.Objects;

public class UserRequestDto {

    private String firstName;
    private String lastName;
    private String userName;

    private String password;

    private RoleType userRoleType;
    private Boolean active;

    public UserRequestDto() {
    }

    public UserRequestDto(String firstName, String lastName,
                          String userName, String password,
                          RoleType userRoleType, Boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.userRoleType = userRoleType;
        this.active = active;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public RoleType getUserRoleType() {
        return userRoleType;
    }

    public void setUserRoleType(RoleType userRoleType) {
        this.userRoleType = userRoleType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRequestDto that = (UserRequestDto) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && userRoleType == that.userRoleType && Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, userName, password, userRoleType, active);
    }
}
