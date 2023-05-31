package com.example.springmybatisscanning.items;


import java.util.Objects;


public class Item {
    private Integer id;
    private String title;
    private String comment;
    private String cathegory;
    private Integer price;
    private Integer total;
    private Integer discount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCathegory() {
        return cathegory;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) && Objects.equals(title, item.title) && Objects.equals(comment,
                item.comment) && Objects.equals(cathegory, item.cathegory) && Objects.equals(price, item.price) && Objects.equals(total, item.total) && Objects.equals(discount, item.discount);
    }

    public int hashCode() {
        return Objects.hash(id, title, comment, cathegory, price, total, discount);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", comment='" + comment + '\'' +
                ", cathegory='" + cathegory + '\'' +
                ", price=" + price +
                ", total=" + total +
                ", discount=" + discount +
                '}';
    }
}
