# beachfront-reach-sdk-android
Beachfront reach android SDK

## Guide

REACH is a next generation syndication platform for video. REACH enables a transparent content exchange between content owners, publishers, and advertisers.This document shows you how to integrate REACH into your Android app.

## What You'll Need

* REACH embeded id - [Get it from here](http://www.beachfrontreach.com/)
* REACH SDK Jar - [Get it from here](https://github.com/beachfront/beachfront-reach-sdk-android/tree/master/bf-reach-android-sdk)

## Supported Platforms
* Android Phone & Tablets having android 2.2 or above

## Installing the SDK
1. [Get embeded id](http://www.beachfrontreach.com/) if you don't already have one.
2. Download the SDK and copy the .jar into the /lib folder of your Android Project. 
3. For Eclipe Users: Make sure the jar files in the lib folder are selected in the 'Order and Export' tab of the Java Build Path panel.
4. Add the following Activities in the application node of AndroidManifest.xml:

```
	<activity
            android:name="com.reach.player.ReachCategoryActivity"
            android:configChanges="keyboardHidden|orientation|screenSize" />
        <activity
            android:name="com.reach.player.ReachVideoActivity"
            android:configChanges="keyboardHidden|orientation|screenSize" />  
        <activity
            android:name="com.reach.player.ReachPlayer"
            android:configChanges="orientation|screenSize” />
        <activity
            android:name="com.bfio.ad.BFIOActivity"
            android:configChanges="keyboardHidden|orientation|screenSize" />

```

* Make sure android:targetSdkVersion is at least 13 in the manifest

```
 <uses-sdk android:targetSdkVersion="13" />
```

* Add the following required permissions in your AndroidManifest.xml

```
  <uses-permission android:name="android.permission.READ_PHONE_STATE" />
  <uses-permission android:name="android.permission.INTERNET" />
  <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />  
```


## Starting REACH
Wherever you want to start REACH, make an intent on any action event:

```
	Intent intent = new Intent(this, ReachCategoryActivity.class);
	intent.putExtra("embeded", embeded);
	startActivity(intent);
```

Here, embeded is “embeded id” in String format.


Have an issue? Please [contact us](mailto:udit@beachfrontmedia.com) or [create an issue on GitHub](https://github.com/beachfront/beachfront-reach-sdk-android/issues)

