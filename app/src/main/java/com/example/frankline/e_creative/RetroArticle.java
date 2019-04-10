package com.example.frankline.e_creative;

import com.google.gson.annotations.SerializedName;

public class RetroArticle {

    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;
    @SerializedName("body")
    private String body;
    @SerializedName("cartegory")
    private String cartegory;
    @SerializedName("image_name")
    private String image_name;
    @SerializedName("created_at")
    private String created_at;
    @SerializedName("author")
    private String author;

    public RetroArticle(int id,String title, String body,String cartegory,String image_name,String author){

        this.id = id;
        this.title = title;
        this.body = body;
        this.cartegory = cartegory;
        this.image_name = image_name;
        this.author = author;
    }

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCartegory() {
        return cartegory;
    }

    public void setCartegory(String cartegory) {
        this.cartegory = cartegory;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
