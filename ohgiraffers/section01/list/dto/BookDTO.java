package com.ohgiraffers.section01.list.dto;

public class BookDTO implements Comparable<BookDTO> {

    private int number;          // 도서 번호
    private String title;        // 제목
    private String author;       // 저자
    private String category;     // 카테고리
    private String publisher;    // 출판사
    private int year;            // 출판년도
    private int price;           // 가격
    private boolean available;   // 대여 가능 여부
    private String condition;    // 상태 (good, bad 등)

    // 기본 생성자
    public BookDTO() {
        this.condition = "good";
        this.available = true;
    }

    // 복사 생성자
    public BookDTO(BookDTO other) {
        this.number = other.number;
        this.title = other.title;
        this.author = other.author;
        this.category = other.category;
        this.publisher = other.publisher;
        this.year = other.year;
        this.price = other.price;
        this.available = other.available;
        this.condition = other.condition;
    }

    // 4개 인자 생성자 유지 (호환용)
    public BookDTO(int number, String title, String author, int price) {
        this(number, title, author, null, null, 0, price, true, "good");
    }

    // 5개 인자 생성자 유지 (호환용)
    public BookDTO(int number, String title, String author, int price, String condition) {
        this(number, title, author, null, null, 0, price, true, condition);
    }

    // ★ Application2에서 사용하는 9개 인자 생성자 추가 (핵심)
    public BookDTO(int number, String title, String author,
                   String category, String publisher,
                   int year, int price,
                   boolean available, String condition) {

        this.number = number;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
        this.available = available;
        this.condition = condition;
    }

    // getter / setter
    public int getNumber() { return number; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public String getPublisher() { return publisher; }
    public int getYear() { return year; }
    public int getPrice() { return price; }
    public boolean isAvailable() { return available; }
    public String getCondition() { return condition; }

    public void setNumber(int number) { this.number = number; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setCategory(String category) { this.category = category; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(int price) { this.price = price; }
    public void setAvailable(boolean available) { this.available = available; }
    public void setCondition(String condition) { this.condition = condition; }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", available=" + available +
                ", condition='" + condition + '\'' +
                '}';
    }

    @Override
    public int compareTo(BookDTO o) {
        return this.title.compareTo(o.title);
    }
}
