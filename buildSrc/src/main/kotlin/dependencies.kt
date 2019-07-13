const val kotlinVersion = "1.3.41"


object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.5.0-beta05"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinMultiplatform = "kotlin-multiplatform"
    const val kotlinCocoapods = "org.jetbrains.kotlin.native.cocoapods"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"

}

object AndroidSdk {
    const val min = 21
    const val compile = 29
    const val target = compile
}

object Libraries {
    private object Versions {
        const val jetpack = "1.1.0-rc01"
        const val constraintLayout = "1.1.3"
        const val ktx = "1.1.0-rc02"
    }

    const val kotlinStdLibCommon     = "org.jetbrains.kotlin:kotlin-stdlib-common:$kotlinVersion"
    const val kotlinStdLib     = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat        = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore          = "androidx.core:core-ktx:${Versions.ktx}"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.12"
        const val testExtJUnit = "1.1.0"
        const val espresso = "3.2.0"
    }
    const val junit4     = "junit:junit:${Versions.junit4}"
    const val testExtJUnit = "androidx.test.ext:junit:${Versions.testExtJUnit}"
    const val espresso   = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}