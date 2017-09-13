package com.tagfans.plugin.webviewScale;

import android.content.Context;
import android.content.Intent;
import android.app.Activity;

import org.apache.cordova.*;




public class webviewScale extends CordovaActivity
{
   @Override
   public void onCreate(Bundle savedInstanceState)
  {
   super.onCreate(savedInstanceState);
  if (appView == null) {
  init();
   }
 
   // If keepRunning
   this.keepRunning = preferences.getBoolean("KeepRunning", true);

   ((WebView) appView.getView()).getSettings().setUseWideViewPort(true);
   ((WebView) appView.getView()).setInitialScale(55);
   appView.loadUrlIntoView(launchUrl, true);
   }
}

    



