package com.ecommerce.wipecart.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllProductListModel {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("pcode")
    @Expose
    private String pcode;
    @SerializedName("product_name")
    @Expose
    private String productName;
    @SerializedName("cat_id")
    @Expose
    private String catId;
    @SerializedName("subcat_id")
    @Expose
    private String subcatId;
    @SerializedName("gst_rate")
    @Expose
    private String gstRate;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("discount")
    @Expose
    private String discount;
    @SerializedName("variant_offerprice")
    @Expose
    private String variantOfferprice;
    @SerializedName("variant_id")
    @Expose
    private String variantId;
    @SerializedName("variant_price")
    @Expose
    private String variantPrice;
    @SerializedName("variant_stockhold_qty")
    @Expose
    private String variantStockholdQty;
    @SerializedName("variant_stock_qty")
    @Expose
    private String variantStockQty;
    @SerializedName("parent")
    @Expose
    private String parent;
    @SerializedName("added_on")
    @Expose
    private String addedOn;
    @SerializedName("publish_status")
    @Expose
    private String publishStatus;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("catname")
    @Expose
    private String catname;
    @SerializedName("catslug")
    @Expose
    private String catslug;
    @SerializedName("desp")
    @Expose
    private Object desp;
    @SerializedName("subcatname")
    @Expose
    private List<String> subcatname = null;
    @SerializedName("subcatslug")
    @Expose
    private List<String> subcatslug = null;
    @SerializedName("variantname")
    @Expose
    private String variantname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getSubcatId() {
        return subcatId;
    }

    public void setSubcatId(String subcatId) {
        this.subcatId = subcatId;
    }

    public String getGstRate() {
        return gstRate;
    }

    public void setGstRate(String gstRate) {
        this.gstRate = gstRate;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getVariantOfferprice() {
        return variantOfferprice;
    }

    public void setVariantOfferprice(String variantOfferprice) {
        this.variantOfferprice = variantOfferprice;
    }

    public String getVariantId() {
        return variantId;
    }

    public void setVariantId(String variantId) {
        this.variantId = variantId;
    }

    public String getVariantPrice() {
        return variantPrice;
    }

    public void setVariantPrice(String variantPrice) {
        this.variantPrice = variantPrice;
    }

    public String getVariantStockholdQty() {
        return variantStockholdQty;
    }

    public void setVariantStockholdQty(String variantStockholdQty) {
        this.variantStockholdQty = variantStockholdQty;
    }

    public String getVariantStockQty() {
        return variantStockQty;
    }

    public void setVariantStockQty(String variantStockQty) {
        this.variantStockQty = variantStockQty;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(String addedOn) {
        this.addedOn = addedOn;
    }

    public String getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public String getCatslug() {
        return catslug;
    }

    public void setCatslug(String catslug) {
        this.catslug = catslug;
    }

    public Object getDesp() {
        return desp;
    }

    public void setDesp(Object desp) {
        this.desp = desp;
    }

    public List<String> getSubcatname() {
        return subcatname;
    }

    public void setSubcatname(List<String> subcatname) {
        this.subcatname = subcatname;
    }

    public List<String> getSubcatslug() {
        return subcatslug;
    }

    public void setSubcatslug(List<String> subcatslug) {
        this.subcatslug = subcatslug;
    }

    public String getVariantname() {
        return variantname;
    }

    public void setVariantname(String variantname) {
        this.variantname = variantname;
    }

}