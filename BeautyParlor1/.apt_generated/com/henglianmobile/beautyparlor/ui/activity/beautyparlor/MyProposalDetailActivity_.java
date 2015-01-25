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

public final class MyProposalDetailActivity_
    extends MyProposalDetailActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String P_ID_EXTRA = "pId";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_beautyparlor_proposal_detail);
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

    public static MyProposalDetailActivity_.IntentBuilder_ intent(Context context) {
        return new MyProposalDetailActivity_.IntentBuilder_(context);
    }

    public static MyProposalDetailActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new MyProposalDetailActivity_.IntentBuilder_(fragment);
    }

    public static MyProposalDetailActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new MyProposalDetailActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tv_title = ((TextView) hasViews.findViewById(id.tv_title));
        gv_meiyou_pics = ((GridView) hasViews.findViewById(id.gv_meiyou_pics));
        tv_content = ((TextView) hasViews.findViewById(id.tv_content));
        lv_pinglun = ((ListView) hasViews.findViewById(id.lv_pinglun));
        tv_publish_time = ((TextView) hasViews.findViewById(id.tv_publish_time));
        ll_submit_commit = ((LinearLayout) hasViews.findViewById(id.ll_submit_commit));
        et_comment = ((EditText) hasViews.findViewById(id.et_comment));
        iv_meiyou_pic2 = ((ImageView) hasViews.findViewById(id.iv_meiyou_pic2));
        ll_meiyou_pics = ((LinearLayout) hasViews.findViewById(id.ll_meiyou_pics));
        iv_meiyou_pic1 = ((ImageView) hasViews.findViewById(id.iv_meiyou_pic1));
        ll_bottom = ((LinearLayout) hasViews.findViewById(id.ll_bottom));
        iv_meiyou_pic = ((ImageView) hasViews.findViewById(id.iv_meiyou_pic));
        if (ll_bottom!= null) {
            ll_bottom.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MyProposalDetailActivity_.this.ll_bottom();
                }

            }
            );
        }
        {
            View view = hasViews.findViewById(id.btn_send);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MyProposalDetailActivity_.this.btn_send();
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
                        MyProposalDetailActivity_.this.btn_back();
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
            if (extras_.containsKey(P_ID_EXTRA)) {
                pId = extras_.getInt(P_ID_EXTRA);
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<MyProposalDetailActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, MyProposalDetailActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), MyProposalDetailActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), MyProposalDetailActivity_.class);
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

        public MyProposalDetailActivity_.IntentBuilder_ pId(int pId) {
            return super.extra(P_ID_EXTRA, pId);
        }

    }

}
