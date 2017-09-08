package com.daftar.hadir.guru;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.daftar.hadir.R;

/**
 * Created by Anu on 22/04/17.
 */



public class FragmentThree extends Fragment {
    WebView wv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle args) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        wv = (WebView) view.findViewById(R.id.info3);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("file:///android_asset/link/index.html");

        wv.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });
        return view;
    }
}