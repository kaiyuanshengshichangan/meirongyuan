//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.henglianmobile.beautyparlor.ui.activity.beautyparlor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.henglianmobile.beautyparlor.R.id;
import com.henglianmobile.beautyparlor.R.layout;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class GuangGaoPublishActivity_
    extends GuangGaoPublishActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String JUMPFROMSHOUYE_EXTRA = "jumpfromshouye";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_beautyparlor_guanggao_publish);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        injectExtras_();
        requestWindowFeature(1);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static GuangGaoPublishActivity_.IntentBuilder_ intent(Context context) {
        return new GuangGaoPublishActivity_.IntentBuilder_(context);
    }

    public static GuangGaoPublishActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new GuangGaoPublishActivity_.IntentBuilder_(fragment);
    }

    public static GuangGaoPublishActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new GuangGaoPublishActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        et_title = ((EditText) hasViews.findViewById(id.et_title));
        gv_patient_pics = ((GridView) hasViews.findViewById(id.gv_patient_pics));
        tv_guanggao_to = ((TextView) hasViews.findViewById(id.tv_guanggao_to));
        tv_money = ((TextView) hasViews.findViewById(id.tv_money));
        rl_guanggao_to = ((RelativeLayout) hasViews.findViewById(id.rl_guanggao_to));
        et_content = ((EditText) hasViews.findViewById(id.et_content));
        {
            View view = hasViews.findViewById(id.btn_back);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        GuangGaoPublishActivity_.this.btn_back();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tv_pay_and_publish);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        GuangGaoPublishActivity_.this.tv_pay_and_publish();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tv_cancel);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        GuangGaoPublishActivity_.this.tv_cancel();
                    }

                }
                );
            }
        }
        if (rl_guanggao_to!= null) {
            rl_guanggao_to.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    GuangGaoPublishActivity_.this.rl_guanggao_to();
                }

            }
            );
        }
        {
            View view = hasViews.findViewById(id.tv_preview);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        GuangGaoPublishActivity_.this.tv_preview();
                    }

                }
                );
            }
        }
        initViews();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(JUMPFROMSHOUYE_EXTRA)) {
                jumpfromshouye = extras_.getString(JUMPFROMSHOUYE_EXTRA);
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<GuangGaoPublishActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, GuangGaoPublishActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), GuangGaoPublishActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), GuangGaoPublishActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent, requestCode);
                } else {
                    super.startForResult(requestCode);
                }
            }
        }

        public GuangGaoPublishActivity_.IntentBuilder_ jumpfromshouye(String jumpfromshouye) {
            return super.extra(JUMPFROMSHOUYE_EXTRA, jumpfromshouye);
        }

    }

}
