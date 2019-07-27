package ink.chengcan.base.activity;

import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import java.util.List;

import ink.chengcan.base.BaseViewModel;
import ink.chengcan.loadui.BaseView;

public abstract class BaseMVVMActivity<V extends ViewDataBinding, VM extends BaseViewModel> extends AppCompatActivity {
    protected List<VM> viewModels;
    protected V viewDataBinding;

    public abstract
    @LayoutRes
    int getLayoutId();

    protected abstract List<VM> getViewModels();

    public abstract List<Integer> getBindingVariable();

    private BaseView baseView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getViewModels() != null && getBindingVariable() != null && getViewModels().size() != getBindingVariable().size()) {
            throw new RuntimeException("VM size is must equal tBindingVariable's size!");
        }

        performDataBinding();
    }

    private void performDataBinding() {
        viewDataBinding = DataBindingUtil.setContentView(this, getLayoutId());
        if (viewModels == null) {
            this.viewModels = getViewModels();
        }
        List<Integer> variables = getBindingVariable();
        if (viewModels != null && variables != null) {
            for (int i = 0; i < variables.size(); i++) {
                if (variables.get(i) > 0) {
                    viewDataBinding.setVariable(variables.get(i), viewModels.get(i));
                }
            }
        }
        viewDataBinding.executePendingBindings();
    }


    public void showContent() {
        if (baseView != null) {
            baseView.showContent();
        }
    }


    public void showLoading() {
        if (baseView != null) {
            baseView.showLoading();
        }

    }


    public void onRefreshEmpty() {
        if (baseView != null) {
            baseView.onRefreshEmpty();
        }

    }


    public void onRefreshFailure(String message) {
        if (baseView != null) {
            baseView.onRefreshFailure(message);
        }
    }
}
