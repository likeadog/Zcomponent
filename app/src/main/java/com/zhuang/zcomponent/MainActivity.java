package com.zhuang.zcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServiceLoader<ZModuleLauncher> loader = ServiceLoader.load(ZModuleLauncher.class);
        Iterator<ZModuleLauncher> mIterator = loader.iterator();
        while (mIterator.hasNext()) {
            mIterator.next().init();
        }
    }
}