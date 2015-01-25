//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.henglianmobile.beautyparlor.ui.activity.beautyparlor;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import com.doublefi123.diary.widget.CircularImage;
import com.henglianmobile.beautyparlor.R.id;
import com.henglianmobile.beautyparlor.R.layout;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class UpdateBeautyParlorActivity_
    extends UpdateBeautyParlorActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_beautyparlor_update_personal_info);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
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

    public static UpdateBeautyParlorActivity_.IntentBuilder_ intent(Context context) {
        return new UpdateBeautyParlorActivity_.IntentBuilder_(context);
    }

    public static UpdateBeautyParlorActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new UpdateBeautyParlorActivity_.IntentBuilder_(fragment);
    }

    public static UpdateBeautyParlorActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new UpdateBeautyParlorActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        et_beautyparlor_phone = ((EditText) hasViews.findViewById(id.et_beautyparlor_phone));
        et_beautyparlor_introduce = ((EditText) hasViews.findViewById(id.et_beautyparlor_introduce));
        iv_beautyparlor_photo = ((CircularImage) hasViews.findViewById(id.iv_beautyparlor_photo));
        et_beautyparlor_name = ((EditText) hasViews.findViewById(id.et_beautyparlor_name));
        et_beautyparlor_address = ((EditText) hasViews.findViewById(id.et_beautyparlor_address));
        if (iv_beautyparlor_photo!= null) {
            iv_beautyparlor_photo.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    UpdateBeautyParlorActivity_.this.iv_beautyparlor_photo();
                }

            }
            );
        }
        {
            View view = hasViews.findViewById(id.btn_back);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        UpdateBeautyParlorActivity_.this.btn_back();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.btn_submit);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        UpdateBeautyParlorActivity_.this.btn_submit();
                    }

                }
                );
            }
        }
        setData();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<UpdateBeautyParlorActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, UpdateBeautyParlorActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), UpdateBeautyParlorActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), UpdateBeautyParlorActivity_.class);
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

    }

}