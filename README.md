# Android fat aar sample

* Merge sub aar to a aar, called "fat-aar"

* Merge resources included: res, class, jni, R, assets
    
    **not merged** AndroidManifest.xml and libs/*.jar currently

## Version info

* Android gradle plugin version: <span style="background-color: #FFFF00">4.1.3</span>

* Gradle version: <span style="background-color: #FFFF00">6.5</span>

## Abstract

* For detail, please reference [slides/Android_fat_aar.pdf](https://github.com/melody26613/android-fat-aar-by-gradle/blob/master/slides/Android_fat_aar.pdf) and code [fat_aar/fataar/build.gradle](https://github.com/melody26613/android-fat-aar-by-gradle/blob/master/fat_aar/fataar/build.gradle)

* Project structure

![image](https://github.com/melody26613/fat_aar_sample/blob/master/slides/structure.jpg)

* Build variant

    build variant in fat aar must use "release" to do obfuscation

![image](https://github.com/melody26613/fat_aar_sample/blob/master/slides/build_variant.png)

## Reference

[android-fat-aar/fat-aar.gradle at master · adwiv/android-fat-aar · GitHub](https://github.com/adwiv/android-fat-aar/blob/master/fat-aar.gradle)

[fat-aar实践及原理分享](https://www.jianshu.com/p/57024509b1d6)

[合并AAR踩坑之旅（fat-aar）](https://www.jianshu.com/p/8f7e32015836)

[AS 3.1 多library合併打包成aar的正確方式（fat-aar）](http://hk.javashuo.com/article/p-vwduaslv-bg.html)
