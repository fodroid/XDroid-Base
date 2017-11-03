package cn.droidlover.xdroidbase.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wanglei on 2016/12/1.
 */

public abstract class XListAdapter<T> extends BaseAdapter {

    protected List<T> data = new ArrayList<T>();
    private ItemCallback itemCallback;
    protected Context context;

    public XListAdapter(Context context) {
        this.context = context;
    }

    public XListAdapter(Context context, ItemCallback<T> callback) {
        this(context);
        this.itemCallback = callback;
    }

    public XListAdapter(Context context, List<T> data) {
        this.context = context;
        this.data.clear();
        this.data.addAll(data);
    }

    public XListAdapter(Context context, List<T> data, ItemCallback<T> callback) {
        this.context = context;
        this.data.clear();
        this.data.addAll(data);
        this.itemCallback = callback;
    }

    /**
     * 设置数据源
     *
     * @param data
     */
    public void setData(List<T> data) {
        this.data.clear();
        if (data != null) {
            this.data.addAll(data);
        }
        notifyDataSetChanged();
    }


    /**
     * 设置数据源
     *
     * @param data
     */
    public void setData(T[] data) {
        if (data != null && data.length > 0) {
            setData(Arrays.asList(data));
        }
    }


    /**
     * 添加数据
     *
     * @param data
     */
    public void addData(List<T> data) {
        if (data != null && data.size() > 0) {
            this.data.addAll(data);
        }
        notifyDataSetChanged();
    }


    /**
     * 添加数据
     *
     * @param data
     */
    public void addData(T[] data) {
        addData(Arrays.asList(data));
    }

    /**
     * 删除元素
     *
     * @param element
     */
    public void removeElement(T element) {
        if (data.contains(element)) {
            data.remove(element);
            notifyDataSetChanged();
        }
    }

    /**
     * 删除元素
     *
     * @param position
     */
    public void removeElement(int position) {
        if (data != null && data.size() > position) {
            data.remove(position);
            notifyDataSetChanged();
        }
    }

    /**
     * 删除元素
     *
     * @param elements
     */
    public void removeElements(List<T> elements) {
        if (data != null && elements != null && elements.size() > 0
                && data.size() >= elements.size()) {

            for (T element : elements) {
                if (data.contains(element)) {
                    data.remove(element);
                }
            }

            notifyDataSetChanged();
        }
    }

    /**
     * 删除元素
     *
     * @param elements
     */
    public void removeElements(T[] elements) {
        if (elements != null && elements.length > 0) {
            removeElements(Arrays.asList(elements));
        }
    }

    /**
     * 更新元素
     *
     * @param element
     * @param position
     */
    public void updateElement(T element, int position) {
        if (position >= 0 && data.size() > position) {
            data.set(position, element);
            notifyDataSetChanged();
        }
    }

    /**
     * 添加元素
     *
     * @param element
     */
    public void addElement(T element) {
        if (element != null) {
            data.add(element);
            notifyDataSetChanged();
        }
    }

    /**
     * 添加元素
     *
     * @param position
     * @param element
     */
    public void addElement(int position, T element) {
        if (element != null) {
            data.add(position, element);
            notifyDataSetChanged();
        }
    }

    /**
     * 清除数据源
     */
    public void clearData() {
        if (this.data != null) {
            this.data.clear();
            notifyDataSetChanged();
        }
    }

    /**
     * 获取数据源大小
     *
     * @return
     */
    public int getSize() {
        return data == null ? 0 : data.size();
    }

    public T getItemData(int position) {
        return data.get(position);
    }

    /**
     * 设置控件可见
     *
     * @param view
     */
    protected void setVisible(View view) {
        view.setVisibility(View.VISIBLE);
    }

    /**
     * 设置控件不可见
     *
     * @param view
     */
    protected void setGone(View view) {
        view.setVisibility(View.GONE);
    }

    /**
     * 设置控件不可见
     *
     * @param view
     */
    protected void setInvisible(View view) {
        view.setVisibility(View.INVISIBLE);
    }

    /**
     * 设置控件可用
     *
     * @param view
     */
    protected void setEnable(View view) {
        view.setEnabled(true);
    }

    /**
     * 设置控件不可用
     *
     * @param view
     */
    protected void setDisable(View view) {
        view.setEnabled(false);
    }

    /**
     * 获取图片资源
     *
     * @param resId
     * @return
     */
    protected Drawable getDrawable(int resId) {
        return context.getResources().getDrawable(resId);
    }

    /**
     * 获取字符串资源
     *
     * @param resId
     * @return
     */
    protected String getString(int resId) {
        return context.getResources().getString(resId);
    }

    /**
     * 获取颜色资源
     *
     * @param resId
     * @return
     */
    protected int getColor(int resId) {
        return context.getResources().getColor(resId);
    }

    /**
     * 获取数据源
     *
     * @return
     */
    public List<T> getDataSource() {
        return data;
    }

    public void setItemClick(ItemCallback recItemClick) {
        this.itemCallback = recItemClick;
    }

    public ItemCallback getItemClick() {
        return itemCallback;
    }

    public SimpleItemCallback getSimpleItemClick() {
        if (itemCallback instanceof SimpleItemCallback)
            return (SimpleItemCallback) itemCallback;
        return null;
    }


    @Override
    public int getCount() {
        return data == null || data.isEmpty() ? 0 : data.size();
    }

    @Override
    public T getItem(int position) {
        return data != null ? data.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public abstract View getView(int position, View convertView,
                                 ViewGroup parent);


}
