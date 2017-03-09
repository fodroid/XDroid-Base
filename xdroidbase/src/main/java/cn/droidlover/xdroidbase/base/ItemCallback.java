package cn.droidlover.xdroidbase.base;

/**
 * Created by wanglei on 2016/12/1.
 */

public abstract class ItemCallback<T> {

    public void onItemClick(int position, T model, int tag) {}

    public void onItemLongClick(int position, T model, int tag) {}
}
