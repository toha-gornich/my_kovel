package com.cl.mykowel.model.model_my_kovel.model_bazar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemBazar {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("checked")
    @Expose
    private Integer checked;

    public ItemBazar(String title, String description, String price, String photo) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.photo = photo;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }

}
