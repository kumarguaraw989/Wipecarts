package com.ecommerce.wipecart.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ecommerce.wipecart.R;
import com.ecommerce.wipecart.fragment.OrderFragment;
import com.ecommerce.wipecart.model.AllCategoryResponseModel;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.ecommerce.wipecart.api.URLs.BASE_URL;

public class AllCategoryAdapter extends RecyclerView.Adapter<AllCategoryAdapter.MyViewHolder> {
    private static final String TAG = "test";
    public static boolean ischecked = false;
    List<AllCategoryResponseModel> allCategoryResponseModelList;
    Context context;
    OrderFragment orderFragment;

    public AllCategoryAdapter(Context context, List<AllCategoryResponseModel> allCategoryResponseModels, OrderFragment orderFragment) {
        this.allCategoryResponseModelList = allCategoryResponseModels;
        this.context = context;
        this.orderFragment = orderFragment;
    }

    @Override
    public AllCategoryAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_circular_dishes_layout, parent, false); //inflater.inflate(R.layout.officelayout, parent, false);
        return new AllCategoryAdapter.MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final AllCategoryAdapter.MyViewHolder holder, final int position) {
        holder.productName.setText(allCategoryResponseModelList.get(position).getName());
        Picasso.get().load(allCategoryResponseModelList.get(position).getImage()).into(holder.productImage);

    }

    @Override
    public int getItemCount() {
        return allCategoryResponseModelList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        CircleImageView productImage;
        TextView productName;

        public MyViewHolder(View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.product_image);
            productName=itemView.findViewById(R.id.tv_product_name);
        }
    }

}
