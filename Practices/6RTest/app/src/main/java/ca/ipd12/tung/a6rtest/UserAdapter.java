package ca.ipd12.tung.a6rtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.OneItemViewHolder> {

    String[] fruits = {"Apple", "Banana", "Carrot", "Mango", "Orange"};

    @NonNull
    @Override
    public OneItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View inflatedView = inflater.inflate(R.layout.participant_layout, viewGroup, false);
        return new OneItemViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(@NonNull OneItemViewHolder oneItemViewHolder, final int i) {
        oneItemViewHolder.tvInOneItem.setText(fruits[i]);
        oneItemViewHolder.singleItemParentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("RecycleView", "Clicked card number: " + Integer.toString(i));
            }
        });
    }

    @Override
    public int getItemCount() {
        return fruits.length;
    }

    class OneItemViewHolder extends RecyclerView.ViewHolder {
        TextView tvInOneItem;
        FrameLayout singleItemParentLayout;

        public OneItemViewHolder(@NonNull View itemView) {
            super(itemView);

            tvInOneItem = itemView.findViewById(R.id.tv_in_item);
            singleItemParentLayout = itemView.findViewById(R.id.single_item_parent_layout);

        }
    }
}
