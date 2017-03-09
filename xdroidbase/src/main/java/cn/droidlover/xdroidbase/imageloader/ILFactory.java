package cn.droidlover.xdroidbase.imageloader;

/**
 * Created by wanglei on 2016/11/28.
 */
public class ILFactory {

    private static ILoader loader;


    public static ILoader getLoader() {
        if (loader == null) {
            synchronized (ILFactory.class) {
                if (loader == null) {
                    loader = new GlideLoader();
                }
            }
        }
        return loader;
    }

    public static void setILoader(ILoader iLoader) {
        if (iLoader != null)
            loader = iLoader;
    }

}
