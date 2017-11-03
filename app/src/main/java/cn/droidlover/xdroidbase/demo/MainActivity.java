package cn.droidlover.xdroidbase.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.droidlover.xdroidbase.XDroidBaseConf;
import cn.droidlover.xdroidbase.base.XRecyclerAdapter;
import cn.droidlover.xdroidbase.base.SimpleItemCallback;
import cn.droidlover.xdroidbase.kit.ToastManager;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 10; i++)
            ToastManager.showLong(this, "test:" + i);

        XDroidBaseConf.getInstance()
                .setCacheSpName("cache")//SharedPreferences文件名
                .setCacheDiskDir("xdroid")//本地缓存的文件夹名
                .setDefLogTag("XDroid")//log默认的tag
                .setLog(BuildConfig.DEBUG)//是否输出log
                .build();

    }
}
