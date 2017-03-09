package cn.droidlover.xdroidbase.imageloader;

import android.content.Context;
import android.widget.ImageView;

import java.io.File;

import cn.droidlover.xdroidbase.XDroidBaseConf;

/**
 * Created by wanglei on 2016/11/27.
 */

public interface ILoader {

    void init(Context context);

    void loadNet(ImageView target, String url, Options options);

    void loadNet(Context context, String url, Options options, LoadCallback callback);

    void loadResource(ImageView target, int resId, Options options);

    void loadAssets(ImageView target, String assetName, Options options);

    void loadFile(ImageView target, File file, Options options);

    void clearMemoryCache(Context context);

    void clearDiskCache(Context context);

    void resume(Context context);

    void pause(Context context);


    class Options {

        public int loadingResId = RES_NONE;        //加载中的资源id
        public int loadErrorResId = RES_NONE;      //加载失败的资源id
        public ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;

        public static final int RES_NONE = -1;

        private static Options defOptions;

        public static void initDefaultOptions(int loadingResId, int loadErrorResId) {
            defOptions = new Options(loadingResId, loadErrorResId);
        }

        public static Options defaultOptions() {
            if (defOptions == null)
                defOptions = new Options(RES_NONE, RES_NONE);
            return defOptions;
        }

        public Options(int loadingResId, int loadErrorResId) {
            this.loadingResId = loadingResId;
            this.loadErrorResId = loadErrorResId;
        }

        public Options scaleType(ImageView.ScaleType scaleType) {
            this.scaleType = scaleType;
            return this;
        }
    }

}
