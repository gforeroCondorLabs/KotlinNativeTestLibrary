# KotlinNativeTestLibrary

A library for demonstrating consuming a cross platform Kotlin library defined outside of the app project on both iOS and Android.
This library was used as part of a talk I gave at the [Mobilize Dublin](https://www.meetup.com/Mobilize-Dublin/) meetup on [22 August 2018](https://www.meetup.com/Mobilize-Dublin/events/lnsxzpyxlbdc/)

Slides from this talk can be found at [Slides]()

# How to use
1. Download this project

## Consuming on iOS
1. From the root of this project, run the command `./gradlew copyFramework`
2. Download the example [iOS project](https://github.com/bridgeri127/KotlinNativeTestIOS) and open in Xcode
3. Navigate to the project settings in Xcode, find the "Embedded Binaries" section, and add the binary framework created in step 3. This will be located at `"{KotlinNativeTestLibraryPath}/build/konan/bin/iphone_universal_framework/"`
4. Navigate to the project build settings in Xcode and ensure `"{KotlinNativeTestLibraryPath}/build/konan/bin/" has been added to the search path field, and marked as recursive
5. Rebuild this project, it should now find the library

## Consuming on Android

1. From the root of this project, run the command `./gradlew publishToMavenLocal`
2. Download the example [Android project](https://github.com/bridgeri127/KotlinNativeTestAndroid) and build. It should find the library in the mavenLocal repository
