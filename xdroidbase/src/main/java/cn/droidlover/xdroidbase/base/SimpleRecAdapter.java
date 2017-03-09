package cn.droidlover.xdroidbase.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by wanglei on 2016/11/29.
 */

public abstract class SimpleRecAdapter<T, H extends RecyclerView.ViewHolder> extends XRecyclerAdapter<T, H> {

    public SimpleRecAdapter(Context context) {
        super(context);
    }

    public SimpleRecAdapter(Context context, ItemCallback<T> callback) {
        super(context, callback);
    }

    public SimpleRecAdapter(Context context, List<T> data) {
        super(context, data);
    }

    public SimpleRecAdapter(Context context, List<T> data, ItemCallback<T> callback) {
        super(context, data, callback);
    }

    @Override
    public H onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(getLayoutId(), parent, false);
        return newViewHolder(view);
    }

    public abstract H newViewHolder(View itemView);

    public abstract int getLayoutId();

}
