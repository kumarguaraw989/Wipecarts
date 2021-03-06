package com.ecommerce.wipecart.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllCategoryModel {
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("data")
    @Expose
    private List<AllCategoryResponseModel> data = null;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<AllCategoryResponseModel> getData() {
        return data;
    }

    public void setData(List<AllCategoryResponseModel> data) {
        this.data = data;
    }

}
