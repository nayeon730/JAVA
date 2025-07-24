package com.ohgiraffers.practice02.level02.normal.book.run;

import com.ohgiraffers.practice02.level02.normal.book.model.dto.BookDTO;
import org.w3c.dom.ls.LSOutput;

import java.awt.print.Book;

public class Application {

    public static void main(String[] args) {

        BookDTO bookDTO = new BookDTO();

        /* tt. 기본 생성자 호출 */
        System.out.println(bookDTO.printInformation());     // null, null, 0, 0.0

        /* tt. title, publisher, author를 매개변수로 전달받는 생성자 호출 */
        BookDTO bookDTO2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        System.out.println(bookDTO2.printInformation());    // 자바의 정석, 도우출판, 남궁성, 0, 0.0

        /* tt. 모든 필드를 초기화하는 생성자 호출 */
        BookDTO bookDTO3 = new BookDTO("홍길동전", "활빈당", "허균", 500000, 0.5);
        System.out.println(bookDTO3.printInformation());    // 홍길동전, 활빈당, 허균, 5000000, 0.5

        System.out.println();

        /* tt. getter & setter */
        BookDTO bookDTO4 = new BookDTO();

        System.out.println(bookDTO4.getTitle());
        System.out.println(bookDTO4.getPublisher());
        System.out.println(bookDTO4.getAuthor());
        System.out.println(bookDTO4.getPrice());
        System.out.println(bookDTO4.getDiscountRate());

        System.out.println();
        //

        BookDTO bookDTO5 = new BookDTO();
        bookDTO5.setTitle("자바의 정석");
        bookDTO5.setPublisher("도우출판");
        bookDTO5.setAuthor("남궁성");

        System.out.println(bookDTO5.getTitle());
        System.out.println(bookDTO5.getPublisher());
        System.out.println(bookDTO5.getAuthor());
        System.out.println(bookDTO5.getPrice());
        System.out.println(bookDTO5.getDiscountRate());

        System.out.println();
        //

        BookDTO bookDTO6 = new BookDTO();
        bookDTO6.setTitle("홍길동전");
        bookDTO6.setPublisher("활빈당");
        bookDTO6.setAuthor("허균");
        bookDTO6.setPrice(500000);
        bookDTO6.setDiscountRate(0.5);

        System.out.println(bookDTO6.getTitle());
        System.out.println(bookDTO6.getPublisher());
        System.out.println(bookDTO6.getAuthor());
        System.out.println(bookDTO6.getPrice());
        System.out.println(bookDTO6.getDiscountRate());
    }


}
