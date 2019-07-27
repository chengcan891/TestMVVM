package ink.chengcan.testmvvm.application;

import ink.chengcan.base.BaseApplication;
import ink.chengcan.testmvvm.BuildConfig;

public class NewApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        setDebug(BuildConfig.DEBUG);
    }
}
