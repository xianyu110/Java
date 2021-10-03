package com.czxy.mybatis_0929.domain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ChinaManor
 * #Description Book
 * #Date: 30/9/2021 18:09
 */
public class Book {

    private String bid;
    private String title;
    private String price;
    private String author;
    private String cid;

    @Override
    public String toString() {
        return "Book{" +
                "bid='" + bid + '\'' +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", author='" + author + '\'' +
                ", cid='" + cid + '\'' +
                '}';
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Book() {
    }

    public Book(String bid, String title, String price, String author, String cid) {
        this.bid = bid;
        this.title = title;
        this.price = price;
        this.author = author;
        this.cid = cid;
    }
}
