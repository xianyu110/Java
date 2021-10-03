package com.czxy.mybatis_0929.domain;

import java.util.ArrayList;

/**
 * @author ChinaManor
 * #Description Category
 * #Date: 30/9/2021 18:09
 */
public class Category {
    private String cid;
    private String cname;
    private String parent_id;
    private String desc;
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Category> categories = new ArrayList<>();

    @Override
    public String toString() {
        return "Category{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", parent_id='" + parent_id + '\'' +
                ", desc='" + desc + '\'' +
                ", books=" + books +
                ", categories=" + categories +
                '}';
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public Category() {
    }

    public Category(String cid, String cname, String parent_id, String desc, ArrayList<Book> books, ArrayList<Category> categories) {
        this.cid = cid;
        this.cname = cname;
        this.parent_id = parent_id;
        this.desc = desc;
        this.books = books;
        this.categories = categories;
    }
}
