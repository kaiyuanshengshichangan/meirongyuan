//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.henglianmobile.beautyparlor.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.doublefi123.diary.widget.CircularImage;
import com.henglianmobile.beautyparlor.R.layout;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class MeiYouBaseInfoDetailActivity_
    extends MeiYouBaseInfoDetailActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String FRIEND_EXTRA = "friend";
    public final static String ID_EXTRA = "id";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_meiyou_baseinfo_detail);
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

    public static MeiYouBaseInfoDetailActivity_.IntentBuilder_ intent(Context context) {
        return new MeiYouBaseInfoDetailActivity_.IntentBuilder_(context);
    }

    public static MeiYouBaseInfoDetailActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new MeiYouBaseInfoDetailActivity_.IntentBuilder_(fragment);
    }

    public static MeiYouBaseInfoDetailActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new MeiYouBaseInfoDetailActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        iv_beautyparlor_photo = ((ImageView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.iv_beautyparlor_photo));
        et_beautyparlor_address = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.et_beautyparlor_address));
        ll_no = ((LinearLayout) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.ll_no));
        iv_jishi_photo = ((ImageView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.iv_jishi_photo));
        et_user_nick = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.et_user_nick));
        et_sign = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.et_sign));
        sv_beautyparlor = ((ScrollView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.sv_beautyparlor));
        btn_add = ((Button) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.btn_add));
        tv_beautyparlor_phone = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.tv_beautyparlor_phone));
        iv_zizhizhengshu = ((ImageView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.iv_zizhizhengshu));
        tv_beautyparlor_people_count = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.tv_beautyparlor_people_count));
        et_jishi_name = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.et_jishi_name));
        iv_certificate = ((ImageView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.iv_certificate));
        ll_consumer = ((LinearLayout) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.ll_consumer));
        et_address = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.et_address));
        tv_beautyparlor_name = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.tv_beautyparlor_name));
        iv_my_photo = ((CircularImage) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.iv_my_photo));
        iv_sex = ((ImageView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.iv_sex));
        iv_company_pic = ((ImageView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.iv_company_pic));
        tv_manager = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.tv_manager));
        tv_beautyparlor_introduce = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.tv_beautyparlor_introduce));
        et_age = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.et_age));
        if (iv_zizhizhengshu!= null) {
            iv_zizhizhengshu.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MeiYouBaseInfoDetailActivity_.this.iv_zizhizhengshu();
                }

            }
            );
        }
        if (iv_company_pic!= null) {
            iv_company_pic.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MeiYouBaseInfoDetailActivity_.this.iv_company_pic();
                }

            }
            );
        }
        if (iv_certificate!= null) {
            iv_certificate.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MeiYouBaseInfoDetailActivity_.this.iv_certificate();
                }

            }
            );
        }
        if (iv_jishi_photo!= null) {
            iv_jishi_photo.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MeiYouBaseInfoDetailActivity_.this.iv_jishi_photo();
                }

            }
            );
        }
        {
            View view = hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.btn_back);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeiYouBaseInfoDetailActivity_.this.btn_back();
                    }

                }
                );
            }
        }
        if (btn_add!= null) {
            btn_add.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MeiYouBaseInfoDetailActivity_.this.btn_add();
                }

            }
            );
        }
        getData();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(FRIEND_EXTRA)) {
                friend = extras_.getInt(FRIEND_EXTRA);
            }
            if (extras_.containsKey(ID_EXTRA)) {
                id = extras_.getInt(ID_EXTRA);
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<MeiYouBaseInfoDetailActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, MeiYouBaseInfoDetailActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), MeiYouBaseInfoDetailActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), MeiYouBaseInfoDetailActivity_.class);
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

        public MeiYouBaseInfoDetailActivity_.IntentBuilder_ friend(int friend) {
            return super.extra(FRIEND_EXTRA, friend);
        }

        public MeiYouBaseInfoDetailActivity_.IntentBuilder_ id(int id) {
            return super.extra(ID_EXTRA, id);
        }

    }

}
