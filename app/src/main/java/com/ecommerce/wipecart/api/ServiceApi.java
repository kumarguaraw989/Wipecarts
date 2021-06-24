package com.ecommerce.wipecart.api;

import com.ecommerce.wipecart.model.AllCategoryModel;
import com.ecommerce.wipecart.model.AllCategoryResponseModel;
import com.ecommerce.wipecart.model.AllProductsModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ServiceApi {
    @POST("allcategory")
    Call<AllCategoryModel> getAllCategoryList();
    @GET("getallproduct")
    Call<AllProductsModel> getAllProduct();
}
