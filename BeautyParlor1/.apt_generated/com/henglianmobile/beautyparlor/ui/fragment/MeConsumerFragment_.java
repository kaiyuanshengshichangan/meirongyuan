//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.henglianmobile.beautyparlor.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.henglianmobile.beautyparlor.R.layout;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class MeConsumerFragment_
    extends com.henglianmobile.beautyparlor.ui.fragment.MeConsumerFragment
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.fragment_me_consumer, container, false);
        }
        return contentView_;
    }

    @Override
    public void onDestroyView() {
        contentView_ = null;
        super.onDestroyView();
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static MeConsumerFragment_.FragmentBuilder_ builder() {
        return new MeConsumerFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tv_my_nick = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.tv_my_nick));
        tv_my_sign = ((TextView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.tv_my_sign));
        iv_my_photo = ((ImageView) hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.iv_my_photo));
        {
            View view = hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.btn_logout);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeConsumerFragment_.this.btn_logout();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.ll_my_proposal);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeConsumerFragment_.this.ll_my_proposal();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.ll_my_infos);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeConsumerFragment_.this.ll_my_infos();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.ll_my_friends);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeConsumerFragment_.this.ll_my_friends();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.ll_proposal_request);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeConsumerFragment_.this.ll_proposal_request();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(com.henglianmobile.beautyparlor.R.id.iv_personal_info_edit);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MeConsumerFragment_.this.iv_personal_info_edit();
                    }

                }
                );
            }
        }
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<MeConsumerFragment_.FragmentBuilder_, com.henglianmobile.beautyparlor.ui.fragment.MeConsumerFragment>
    {


        @Override
        public com.henglianmobile.beautyparlor.ui.fragment.MeConsumerFragment build() {
            MeConsumerFragment_ fragment_ = new MeConsumerFragment_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}