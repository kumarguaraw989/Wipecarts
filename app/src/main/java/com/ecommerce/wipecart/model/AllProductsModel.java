package com.ecommerce.wipecart.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllProductsModel {
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("data")
    @Expose
    private List<AllProductListModel> data = null;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<AllProductListModel> getData() {
        return data;
    }

    public void setData(List<AllProductListModel> data) {
        this.data = data;
    }

}

