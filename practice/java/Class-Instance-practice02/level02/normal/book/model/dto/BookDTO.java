package com.ohgiraffers.practice02.level02.normal.book.model.dto;

public class BookDTO {

//- title : String
//- publisher : String
//- author : String
//- price : int
//- discountRate : double
//
//+ BookDTO()
//+ BookDTO(title:String, publisher:String, author:String)
//+ BookDTO(title:String, publisher:String, author:String, price:int, discountRate:double)
//
//+ setters / getters             // 필드 수정용 메소드 / 필드값 리턴용 메소드
//
//+ printInformation():void       // 필드값 출력용 메소드


    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;



    /* tt. 생성자 */
    public BookDTO()  {}

    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this(title, publisher, author);   /* tt. 위에 미리 작성했기 때문에 전달 */
        this.price = price;
        this.discountRate = discountRate;
    }


    /* tt. setter */
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }


    /* tt. getter */
    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }



    /* tt. 필드값 출력용 메소드 */
    public String printInformation() {

        return title + ", " +
                publisher + ", " +
                author + ", " +
                price + ", " +
                discountRate;
    }
}
