package ink.chengcan.loadui.load;

import com.kingja.loadsir.callback.Callback;

import ink.chengcan.loadui.R;


/**
 * Description:TODO
 * Create Time:2017/9/4 10:22
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */

public class EmptyCallback extends Callback {

    @Override
    protected int onCreateView() {
        return R.layout.load_layout_empty;
    }

}
