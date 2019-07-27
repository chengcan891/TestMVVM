package ink.chengcan.loadui.load;

import android.content.Context;
import android.view.View;

import com.kingja.loadsir.callback.Callback;

import ink.chengcan.loadui.R;

/**
 * Description:TODO
 * Create Time:2017/9/4 10:22
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */

public class LottieLoadingCallback extends Callback {

    @Override
    protected int onCreateView() {
        return R.layout.load_layout_lottie_loading;
    }

    @Override
    protected boolean onReloadEvent(Context context, View view) {
        return true;
    }
}
