package com.zhuang.zcomponent;

import android.util.Log;

@ZModule
public class MailModule implements ZModuleLauncher {
    @Override
    public void init() {
        Log.e("zhuangTest","mail init kk");
    }
}
