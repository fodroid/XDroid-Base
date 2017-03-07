package cn.droidlover.xdroidbase;


import cn.droidlover.xdroidbase.imageloader.ILoader;
import cn.droidlover.xdroidbase.router.Router;

/**
 * Created by wanglei on 2016/12/4.
 */

public class XDroidBaseConf {
    // #log
    private boolean LOG = true;
    private String LOG_TAG = "XDroid";

    // #cache
    private String CACHE_SP_NAME = "config";
    private String CACHE_DISK_DIR = "cache";

    // #router
    private int ROUTER_LAUNCH_ANIM_ENTER = Router.RES_NONE;
    private int ROUTER_LAUNCH_ANIM_EXIT = Router.RES_NONE;
    private int ROUTER_POP_ANIM_ENTER = Router.RES_NONE;
    private int ROUTER_POP_ANIM_EXIT = Router.RES_NONE;

    // #imageloader
    private int IL_LOADING_RES = ILoader.Options.RES_NONE;
    private int IL_ERROR_RES = ILoader.Options.RES_NONE;

    private XDroidBaseConf() {

    }

    private static XDroidBaseConf xDroidBaseConf;

    public static XDroidBaseConf getInstance() {
        if (xDroidBaseConf == null)
            xDroidBaseConf = new XDroidBaseConf();
        return xDroidBaseConf;
    }

    public XDroidBaseConf setLog(boolean log) {
        this.LOG = log;
        return this;
    }

    public XDroidBaseConf setDefLogTag(String defLogTag) {
        this.LOG_TAG = defLogTag;
        return this;
    }

    public XDroidBaseConf setCacheSpName(String cacheSpName) {
        this.CACHE_SP_NAME = cacheSpName;
        return this;
    }

    public XDroidBaseConf setCacheDiskDir(String dir) {
        this.CACHE_DISK_DIR = dir;
        return this;
    }

    public XDroidBaseConf setRouterLaunchAnimEnter(int launchAnimEnter) {
        this.ROUTER_LAUNCH_ANIM_ENTER = launchAnimEnter;
        return this;
    }

    public XDroidBaseConf setRouterLaunchAnimExit(int launchAnimExit) {
        this.ROUTER_LAUNCH_ANIM_EXIT = launchAnimExit;
        return this;
    }

    public XDroidBaseConf setRouterPopAnimEnter(int popAnimEnter) {
        this.ROUTER_POP_ANIM_ENTER = popAnimEnter;
        return this;
    }

    public XDroidBaseConf setRouterPopAnimExit(int popAnimExit) {
        this.ROUTER_POP_ANIM_EXIT = popAnimExit;
        return this;
    }

    public XDroidBaseConf setILLoadingRes(int loadingRes) {
        this.IL_LOADING_RES = loadingRes;
        return this;
    }

    public XDroidBaseConf setILErrorRes(int errorRes) {
        this.IL_ERROR_RES = errorRes;
        return this;
    }


    public boolean getLog() {
        return LOG;
    }

    public String getDefLogTag() {
        return LOG_TAG;
    }

    public String getCacheSpName() {
        return CACHE_SP_NAME;
    }

    public String getCacheDiskDir() {
        return CACHE_DISK_DIR;
    }

    public int getRouterLaunchAnimEnter() {
        return ROUTER_LAUNCH_ANIM_ENTER;
    }

    public int getRouterLaunchAnimExit() {
        return ROUTER_LAUNCH_ANIM_EXIT;
    }

    public int getRouterPopAnimEnter() {
        return ROUTER_POP_ANIM_ENTER;
    }

    public int getRouterPopAnimExit() {
        return ROUTER_POP_ANIM_EXIT;
    }

    public int getILLoadingRes() {
        return IL_LOADING_RES;
    }

    public int getILErrorRes() {
        return IL_ERROR_RES;
    }
}
