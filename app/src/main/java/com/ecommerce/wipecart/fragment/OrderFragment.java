package com.ecommerce.wipecart.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.ecommerce.wipecart.R;
import com.ecommerce.wipecart.adapter.AllCategoryAdapter;
import com.ecommerce.wipecart.adapter.AllProductListAdapter;
import com.ecommerce.wipecart.api.APIClient;
import com.ecommerce.wipecart.api.ServiceApi;
import com.ecommerce.wipecart.model.AllCategoryModel;
import com.ecommerce.wipecart.model.AllCategoryResponseModel;
import com.ecommerce.wipecart.model.AllProductListModel;
import com.ecommerce.wipecart.model.AllProductsModel;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OrderFragment extends Fragment {
    View view;
    RecyclerView recyclerViewCircular,recyclerViewRectangular;
    String TAG = this.getClass().getCanonicalName();
    AllCategoryAdapter allCategoryAdapter;
    AllProductListAdapter allProductListAdapter;
    ProgressBar loaderCircular;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_order, container, false);
        loaderCircular = view.findViewById(R.id.circular_product_loader);
        recyclerViewCircular = view.findViewById(R.id.my_recycler_view_circulaerProducts);
        recyclerViewRectangular = view.findViewById(R.id.my_recycler_view_square_Products);
        callApiOfAllCategoryList();
        callApiOfAllProducts();
        return view;
    }

    private void callApiOfAllCategoryList() {
        loaderCircular.setVisibility(View.VISIBLE);
        ServiceApi serviceApi = APIClient.getClient().create(ServiceApi.class);
        Call<AllCategoryModel> call = serviceApi.getAllCategoryList();
        call.enqueue(new Callback<AllCategoryModel>() {
            @Override
            public void onResponse(@NotNull Call<AllCategoryModel> call, @NotNull Response<AllCategoryModel> response) {
                if (response.isSuccessful()) {
                    assert response.body() != null;
                    boolean Status = response.body().getStatus();
                    if (Status) {
                        loaderCircular.setVisibility(View.GONE);
                        AllCategoryModel allCategoryModel = new AllCategoryModel();
                        allCategoryModel.setData(response.body().getData());
                        allCategoryAdapter = new AllCategoryAdapter(getActivity(), allCategoryModel.getData(), OrderFragment.this);
                        recyclerViewCircular.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
                        recyclerViewCircular.setAdapter(allCategoryAdapter);
                    } else {
                        loaderCircular.setVisibility(View.GONE);
                        Toast.makeText(getActivity(), (CharSequence) response.body().getData(), Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(@NotNull Call<AllCategoryModel> call, @NotNull Throwable t) {
            }
        });
    }
    private void callApiOfAllProducts(){
        ServiceApi serviceApi = APIClient.getClient().create(ServiceApi.class);
        Call<AllProductsModel> call = serviceApi.getAllProduct();
        call.enqueue(new Callback<AllProductsModel>() {
            @Override
            public void onResponse(@NotNull Call<AllProductsModel> call, @NotNull Response<AllProductsModel> response) {
                if (response.isSuccessful()){
                    AllProductsModel allProductsModel = new AllProductsModel();
                    allProductsModel.setData(response.body().getData());
                    allProductListAdapter = new AllProductListAdapter(getActivity(), allProductsModel.getData(), OrderFragment.this);
                    recyclerViewRectangular.setLayoutManager(new GridLayoutManager(getActivity(), 2));
                    recyclerViewRectangular.setAdapter(allProductListAdapter);
                }
            }
            @Override
            public void onFailure(@NotNull Call<AllProductsModel> call, @NotNull Throwable t) {
            }
        });
    }
}