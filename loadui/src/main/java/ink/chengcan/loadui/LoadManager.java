package ink.chengcan.loadui;

import com.kingja.loadsir.core.LoadSir;

import ink.chengcan.loadui.load.CustomCallback;
import ink.chengcan.loadui.load.EmptyCallback;
import ink.chengcan.loadui.load.ErrorCallback;
import ink.chengcan.loadui.load.LoadingCallback;
import ink.chengcan.loadui.load.TimeoutCallback;

public class LoadManager {

    public static void init() {
        LoadSir.beginBuilder()
                .addCallback(new ErrorCallback())//添加各种状态页
                .addCallback(new EmptyCallback())
                .addCallback(new LoadingCallback())
                .addCallback(new TimeoutCallback())
                .addCallback(new CustomCallback())
                .setDefaultCallback(LoadingCallback.class)//设置默认状态页
                .commit();
    }
}
