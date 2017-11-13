package com.wblogs.spannablestring;

import android.os.Bundle;

import com.wblogs.spannablestring.base.BaseActivity;
import com.wblogs.spannablestring.utils.StatusBarUtil;

public class OtherActivity extends BaseActivity {

    @Override
    protected void beforeInit() {
        //StatusBarUtil.setTranslucent(this);
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
    }

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_other;
    }
}
