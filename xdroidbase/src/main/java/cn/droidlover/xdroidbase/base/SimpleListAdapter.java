package cn.droidlover.xdroidbase.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by wanglei on 2016/12/1.
 */

public abstract class SimpleListAdapter<T, H> extends XListAdapter<T> {

    public SimpleListAdapter(Context context) {
        super(context);
    }

    public SimpleListAdapter(Context context, ItemCallback<T> callback) {
        super(context, callback);
    }

    public SimpleListAdapter(Context context, List<T> data) {
        super(context, data);
    }

    public SimpleListAdapter(Context context, List<T> data, ItemCallback<T> callback) {
        super(context, data, callback);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        H holder = null;
        T item = data.get(position);

        if (convertView == null) {
            convertView = View.inflate(context, getLayoutId(), null);
            holder = newViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (H) convertView.getTag();
        }

        onBindViewHolder(holder, item, position);

        return convertView;
    }

    protected abstract H newViewHolder(View convertView);

    protected abstract int getLayoutId();

    protected abstract void onBindViewHolder(H holder, T item, int position);
}
