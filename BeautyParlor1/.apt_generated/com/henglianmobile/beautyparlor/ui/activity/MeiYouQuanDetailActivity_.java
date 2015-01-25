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
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.henglianmobile.beautyparlor.R.id;
import com.henglianmobile.beautyparlor.R.layout;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class MeiYouQuanDetailActivity_
    extends MeiYouQuanDetailActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String T_ID_EXTRA = "tId";
    public final static String T_TYPE_EXTRA = "tType";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_meiyouquan_detail);
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

    public static MeiYouQuanDetailActivity_.IntentBuilder_ intent(Context context) {
        return new MeiYouQuanDetailActivity_.IntentBuilder_(context);
    }

    public static MeiYouQuanDetailActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new MeiYouQuanDetailActivity_.IntentBuilder_(fragment);
    }

    public static MeiYouQuanDetailActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new MeiYouQuanDetailActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        lv_pinglun = ((ListView) hasViews.findViewById(id.lv_pinglun));
        ll_submit_commit = ((LinearLayout) hasViews.findViewById(id.ll_submit_commit));
        iv_meiyou_pic = ((ImageView) hasViews.findViewById(id.iv_meiyou_pic));
        tv_meiyou_topic = ((TextView) hasViews.findViewById(id.tv_meiyou_topic));
        tv_publish_time = ((TextView) hasViews.findViewById(id.tv_publish_time));
        iv_meiyou_photo = ((ImageView) hasViews.findViewById(id.iv_meiyou_photo));
        ll_meiyou_pics = ((LinearLayout) hasViews.findViewById(id.ll_meiyou_pics));
        tv_meiyou_nick = ((TextView) hasViews.findViewById(id.tv_meiyou_nick));
        ll_bottom = ((LinearLayout) hasViews.findViewById(id.ll_bottom));
        iv_meiyou_pic1 = ((ImageView) hasViews.findViewById(id.iv_meiyou_pic1));
        gv_meiyou_pics = ((GridView) hasViews.findViewById(id.gv_meiyou_pics));
        tv_pinglun_count = ((TextView) hasViews.findViewById(id.tv_pinglun_count));
        iv_pinglun = ((ImageView) hasViews.findViewById(id.iv_pinglun));
        et_comment = ((EditText) hasViews.findViewById(id.et_comment));
        tv_zan_count = ((TextView) hasViews.findViewById(id.tv_zan_count));
        iv_meiyou_pic2 = ((ImageView) hasViews.findViewById(id.iv_meiyou_pic2));
        {
            View view = hasViews.findViewById(id.btn_send);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeiYouQuanDetailActivity_.this.btn_send();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.iv_zan_bottom);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeiYouQuanDetailActivity_.this.iv_zan_bottom();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.iv_comment_bottom);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeiYouQuanDetailActivity_.this.iv_comment_bottom();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.btn_back);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeiYouQuanDetailActivity_.this.btn_back();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.iv_share_bottom);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeiYouQuanDetailActivity_.this.iv_share_bottom();
                    }

                }
                );
            }
        }
        getData();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(T_ID_EXTRA)) {
                tId = extras_.getInt(T_ID_EXTRA);
            }
            if (extras_.containsKey(T_TYPE_EXTRA)) {
                tType = extras_.getInt(T_TYPE_EXTRA);
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<MeiYouQuanDetailActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, MeiYouQuanDetailActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), MeiYouQuanDetailActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), MeiYouQuanDetailActivity_.class);
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

        public MeiYouQuanDetailActivity_.IntentBuilder_ tId(int tId) {
            return super.extra(T_ID_EXTRA, tId);
        }

        public MeiYouQuanDetailActivity_.IntentBuilder_ tType(int tType) {
            return super.extra(T_TYPE_EXTRA, tType);
        }

    }

}
