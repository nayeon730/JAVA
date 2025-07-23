package com.ohgiraffers.practice02.level01.basic.member.run;

import com.ohgiraffers.practice02.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {

        /* tt. 객체 생성 */
        MemberDTO memberDTO = new MemberDTO();

        /* tt. 초기화를 안 했기 때문에, 각 기본값(null 등)으로 출력됨 */
        // 생성한객체.get--()
        System.out.println("id : " + memberDTO.getId());
        System.out.println("pwd : " + memberDTO.getPwd());
        System.out.println("name : " + memberDTO.getName());
        System.out.println("age : " + memberDTO.getAge());
        System.out.println("gender : " + memberDTO.getGender());
        System.out.println("phone : " + memberDTO.getPhone());
        System.out.println("email : " + memberDTO.getEmail());

        /* tt. setter로 값 설정 */
        memberDTO.setId("user01");
        memberDTO.setPwd("pwd01");
        memberDTO.setName("김무열");
        memberDTO.setAge(44);
        memberDTO.setGender('남');
        memberDTO.setPhone("010-0000-0000");
        memberDTO.setEmail("momo123@gamil.com");

        System.out.println();

        System.out.println(memberDTO.getId());
        System.out.println(memberDTO.getPwd());
        System.out.println(memberDTO.getName());
        System.out.println(memberDTO.getAge());
        System.out.println(memberDTO.getGender());
        System.out.println(memberDTO.getPhone());
        System.out.println(memberDTO.getEmail());

    }

}
