package com.justec.alcotesterms.view.widget;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.justec.alcotesterms.R;
import com.justec.alcotesterms.fragment.BaseMainFragment;
import com.justec.alcotesterms.fragment.FourFragment;
import com.justec.alcotesterms.fragment.SecFragment;
import com.justec.alcotesterms.fragment.ThreeFragment;

public class DataGenerator {
    public static final int[] mTabRes = new int[]{R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    public static final int[] mTabResPressed = new int[]{R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round};
    public static final String[] mTabTitle = new String[]{"查询", "实时接收", "地图", "我的"};

    public static Fragment[] getFragments() {
        Fragment fragments[] = new Fragment[4];
        fragments[0] = BaseMainFragment.newInstance();
        fragments[1] = SecFragment.newInstance();
        fragments[2] = ThreeFragment.newInstance();
        fragments[3] = FourFragment.newInstance();
        return fragments;
    }

    /**
     * 获取Tab 显示的内容
     *
     * @param context
     * @param position
     * @return
     */
    public static View getTabView(Context context, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tab, null);
        ImageView tabIcon = (ImageView) view.findViewById(R.id.tab_content_image);
        tabIcon.setImageResource(DataGenerator.mTabRes[position]);
        TextView tabText = (TextView) view.findViewById(R.id.tab_content_text);
        tabText.setText(mTabTitle[position]);
        return view;
    }
}
