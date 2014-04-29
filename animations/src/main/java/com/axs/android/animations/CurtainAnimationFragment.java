package com.axs.android.animations;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by paulselden on 4/10/14.
 */
public class CurtainAnimationFragment extends Fragment {
    private View curtain;

    public static CurtainAnimationFragment newInstance(){
        return new CurtainAnimationFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_curtain_animation, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        curtain = view.findViewById(R.id.curtain_animation);
        curtain.setBackgroundResource(R.drawable.curtain_animation);
    }

    @Override
    public void onResume() {
        super.onResume();

        AnimationDrawable curtainAnimation = (AnimationDrawable) curtain.getBackground();
        curtainAnimation.start();
    }
}
