package com.daftar.hadir.guru;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.daftar.hadir.R;




public class FragmentOne extends Fragment {
    WebView wv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle args) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        wv = (WebView) view.findViewById(R.id.infos);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("http://hadir.gtk.kemdikbud.go.id/");

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