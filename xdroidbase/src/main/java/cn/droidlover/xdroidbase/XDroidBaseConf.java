package cn.droidlover.xdroidbase;


import java.util.ArrayList;
import java.util.List;

import cn.droidlover.xdroidbase.cache.DiskCache;
import cn.droidlover.xdroidbase.cache.SharedPref;
import cn.droidlover.xdroidbase.imageloader.ILFactory;
import cn.droidlover.xdroidbase.imageloader.ILoader;
import cn.droidlover.xdroidbase.log.XLog;
import cn.droidlover.xdroidbase.router.Router;

/**
 * Created by wanglei on 2016/12/4.
 */

public class XDroidBaseConf {
    // #log
    private boolean isLog = true;
    private String logTag = "XDroid";

    // #cache
    private String cacheSpName = "config";
    private String cacheDiskDir = "cache";

    // #router
    private int routerLaunchAnimEnter = Router.RES_NONE;
    private int routerLaunchAnimExit = Router.RES_NONE;
    private int routerPopAnimEnter = Router.RES_NONE;
    private int routerPopAnimExit = Router.RES_NONE;

    // #imageloader
    private int ilLoadingRes = ILoader.Options.RES_NONE;
    private int ilErrorRes = ILoader.Options.RES_NONE;
    private ILoader loader;

    private XDroidBaseConf() {

    }

    private static XDroidBaseConf xDroidBaseConf;

    public static XDroidBaseConf getInstance() {
        if (xDroidBaseConf == null)
            xDroidBaseConf = new XDroidBaseConf();
        return xDroidBaseConf;
    }

    public XDroidBaseConf setLog(boolean log) {
        this.isLog = log;
        return this;
    }

    public XDroidBaseConf setDefLogTag(String defLogTag) {
        this.logTag = defLogTag;
        return this;
    }

    public XDroidBaseConf setCacheSpName(String cacheSpName) {
        this.cacheSpName = cacheSpName;
        return this;
    }

    public XDroidBaseConf setCacheDiskDir(String dir) {
        this.cacheDiskDir = dir;
        return this;
    }

    public XDroidBaseConf setRouterLaunchAnim(int launchAnimEnter, int launchAnimExit) {
        setRouterLaunchAnimEnter(launchAnimEnter);
        setRouterLaunchAnimExit(launchAnimExit);
        return this;
    }

    public XDroidBaseConf setRouterLaunchAnimEnter(int launchAnimEnter) {
        this.routerLaunchAnimEnter = launchAnimEnter;
        return this;
    }

    public XDroidBaseConf setRouterLaunchAnimExit(int launchAnimExit) {
        this.routerLaunchAnimExit = launchAnimExit;
        return this;
    }

    public XDroidBaseConf setRouterPopAnim(int popAnimEnter, int popAnimExit) {
        setRouterPopAnimEnter(popAnimEnter);
        setRouterPopAnimExit(popAnimExit);
        return this;
    }

    public XDroidBaseConf setRouterPopAnimEnter(int popAnimEnter) {
        this.routerPopAnimEnter = popAnimEnter;
        return this;
    }

    public XDroidBaseConf setRouterPopAnimExit(int popAnimExit) {
        this.routerPopAnimExit = popAnimExit;
        return this;
    }

    public XDroidBaseConf setILLoadingRes(int loadingRes) {
        this.ilLoadingRes = loadingRes;
        return this;
    }

    public XDroidBaseConf setILErrorRes(int errorRes) {
        this.ilErrorRes = errorRes;
        return this;
    }

    public XDroidBaseConf setILoader(ILoader iLoader) {
        loader = iLoader;
        return this;
    }

    public void build() {
        Router.init(routerLaunchAnimEnter, routerLaunchAnimExit, routerPopAnimEnter, routerPopAnimExit);
        XLog.init(isLog, logTag);
        SharedPref.init(cacheSpName);
        DiskCache.init(cacheDiskDir);
        ILoader.Options.initDefaultOptions(ilLoadingRes, ilErrorRes);
        ILFactory.setILoader(loader);
    }
}
