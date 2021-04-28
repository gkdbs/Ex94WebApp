package com.milkywaylhy.ex94webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.wv);

//        기본적으로 WebView는 Javascript 실행을 허용하지 않음.
//        웹뷰 설정객체를 통해 jS사용을 허용하도록 변경설정
//

//        웹뷰가 보여줄 웹문서(.html) 로드하기
//        웹앱 또는 하이브리드 앱은 네이티브앱처럼 오프라인상태에서도
//        동작해야 하는경우가 많아 html문서를 프로젝트안에 위치시킴

        wv.loadUrl("file:///android_asset/index.html");

    }
}