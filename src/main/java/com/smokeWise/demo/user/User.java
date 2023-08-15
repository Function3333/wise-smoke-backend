package com.smokeWise.demo.user;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {

    // 이메일, 생년월일은 로그인 데이터를 가져와서 입력할거라 notnull 별도 표시안함
    // 소셜로그인 아이디를 그대로 사용하기 때문에 @GeneratedValue는 사용하지 않음
    // 카카오를 시작으로 로그인 구현할건데 조인과 관련해서는 추후 명시
    // USER_ID를 PRIMARY로 할경우 에러가 발생하는데 확인해야함

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_NUMBER")
    private int userNumber;

    @NotNull
    @Column(name = "USER_ID", unique = true, length = 50)
    private String userID;

    @NotNull
    @Column(name = "NICKNAME", unique = true, length = 30)
    private String nickname;

    @NotNull
    @Column(name = "PASSWORD", length = 30)
    private String password;

    @NotNull
    @Column(name = "NAME", length = 30)
    private String userName;

    @Column(name = "PHONE_NUMBER", length = 13)
    private String phoneNumber;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "GENDER")
    private boolean gender;

    @Column(name = "BIRTH_DATE", length = 8)
    private String birthDate;

    @NotNull
    @Column(name = "AGE", length = 5)
    private int age;

    @Column(name = "USER_REG_DATE")
    private Date userRegDate;

    @Column(name = "USER_DROP_DATE")
    private Date userDropDate;

    @Column(name = "USER_DROP_CHECK")
    private boolean userDropCheck;

    @Column(name = "USER_OPEN_CHECK")
    private boolean userOpenCheck;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getUserRegDate() {
        return userRegDate;
    }

    public void setUserRegDate(Date userRegDate) {
        this.userRegDate = userRegDate;
    }

    public Date getUserDropDate() {
        return userDropDate;
    }

    public void setUserDropDate(Date userDropDate) {
        this.userDropDate = userDropDate;
    }

    public boolean isUserDropCheck() {
        return userDropCheck;
    }

    public void setUserDropCheck(boolean userDropCheck) {
        this.userDropCheck = userDropCheck;
    }

    public boolean isUserOpenCheck() {
        return userOpenCheck;
    }

    public void setUserOpenCheck(boolean userOpenCheck) {
        this.userOpenCheck = userOpenCheck;
    }
}
