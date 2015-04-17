package com.avos.avoscloud.PushDemo;

import android.app.Application;

import com.avos.avoscloud.AVAnalytics;
import com.avos.avoscloud.AVOSCloud;

/**
 * Created with IntelliJ IDEA. User: tangxiaomin Date: 4/19/13 Time: 12:57 PM
 */
public class PushDemoApp extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    // 初始化应用信息
    AVOSCloud.initialize(this, "2s4amu2ol6y6j369flxy4orr38o4rtpoj2tldfvx4yk1945g",
            "x0wktubwarcb37tp4i3mhxvlbgaretjaxxiakua3mcjjt3ft");
    // 启用崩溃错误统计
    AVAnalytics.enableCrashReport(this.getApplicationContext(), true);
    AVOSCloud.setDebugLogEnabled(true);
  }
}
