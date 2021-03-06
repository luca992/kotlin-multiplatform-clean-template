buildscript {
    extra["AndroidSdk_min"] = 29
    extra["AndroidSdk_compile"] = 29
    extra["AndroidSdk_target"] = extra["AndroidSdk_compile"]
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { setUrl("https://dl.bintray.com/icerockdev/moko") }
        maven { setUrl("https://jitpack.io") }
    }
}

tasks.register("clean").configure {
    delete("build")
}

