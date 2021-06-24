package com.ecommerce.wipecart.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ecommerce.wipecart.R;
import com.ecommerce.wipecart.fragment.OrderFragment;
import com.ecommerce.wipecart.model.AllCategoryResponseModel;
import com.ecommerce.wipecart.model.AllProductListModel;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AllProductListAdapter extends RecyclerView.Adapter<AllProductListAdapter.MyViewHolder> {
    private static final String TAG = "test";
    public static boolean ischecked = false;
    List<AllProductListModel> allProductListModelList;
    Context context;
    OrderFragment orderFragment;

    public AllProductListAdapter(Context context, List<AllProductListModel> allProductListModels, OrderFragment orderFragment) {
        this.allProductListModelList = allProductListModels;
        this.context = context;
        this.orderFragment = orderFragment;
    }
    @Override
    public AllProductListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_square_product, parent, false);
        return new AllProductListAdapter.MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final AllProductListAdapter.MyViewHolder holder, final int position) {
        Picasso.get().load(allProductListModelList.get(position).getPath()).into(holder.productImage);
        holder.productName.setText(allProductListModelList.get(position).getProductName());
        holder.productRealPrice.setText("₹ "+allProductListModelList.get(position).getVariantPrice());
        holder.productRealPrice.setPaintFlags(holder.productRealPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.productDisPrice.setText("₹ "+allProductListModelList.get(position).getVariantOfferprice());
    }

    @Override
    public int getItemCount() {
        return allProductListModelList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productName,productRealPrice,productDisPrice;

        public MyViewHolder(View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.product_image);
            productName=itemView.findViewById(R.id.tv_product_name);
            productRealPrice=itemView.findViewById(R.id.product_real_price);
            productDisPrice=itemView.findViewById(R.id.product_dis_price);
        }
    }

}
