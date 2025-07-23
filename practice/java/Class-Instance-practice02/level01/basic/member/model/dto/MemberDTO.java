package com.ohgiraffers.practice02.level01.basic.member.model.dto;

import java.security.PrivateKey;

public class MemberDTO {

    /* tt. 1. 구현 클래스 및 구현 내용 */
    /* 요구사항
      - MemberDTO에 있는 매개변수의 값을 한번 출력 후, 값을 초기화(설정)하여 재출력한다.
    */

        private String id;
        private String pwd;
        private String name;
        private int age;
        private char gender;
        private String phone;
        private String email;


        /* tt. set */
        public void setId(String id) {
            this.id = id;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        /* tt. get */
        public String getId() {
            return id;
        }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
