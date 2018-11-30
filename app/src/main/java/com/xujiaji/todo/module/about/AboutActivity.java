package com.xujiaji.todo.module.about;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.xujiaji.todo.R;
import com.xujiaji.todo.base.BaseActivity;
import com.xujiaji.todo.helper.ToolbarHelper;

/**
 * author: xujiaji
 * created on: 2018/11/29 16:10
 * description:
 */
public class AboutActivity extends BaseActivity {

    public static void launch(Context context) {
        context.startActivity(new Intent(context, AboutActivity.class));
    }

    @Override
    public int layoutId() {
        return R.layout.activity_about;
    }

    @Override
    public void onInitCircle() {
        super.onInitCircle();
        ToolbarHelper.initMarginTopDiffBar(findViewById(R.id.btnBack));
    }

    public void onClickAboutBack(View view) {
        finish();
    }

    public void onClickLicense(View view) {
        LicenseActivity.launch(this);
    }
}
