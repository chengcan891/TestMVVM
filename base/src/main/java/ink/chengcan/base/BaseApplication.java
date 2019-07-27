package ink.chengcan.base;

import android.app.Application;

import ink.chengcan.loadui.LoadManager;

public class BaseApplication extends Application {
    public static Application instance;

    protected void setDebug(boolean isDebug) {
        DebugContext.setDebug(isDebug);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        LoadManager.init();
    }
}
