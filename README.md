# SimpleKotlinNativeApp
kotlin/native を使ったAndroid iOS アプリのシンプルなプロジェクトです  
Android側は Kotlin or Java  
iOS側は Swift で記述できます  
iOSのSwiftの部分を全部Kotlinで書くこともできます

## 開発環境
### OS
- Windows
- MacOS
### IDE
- IntelliJ IDEA ULTIMATE 2018.2.5 (Android Plugin)
- Xcode 10.0  (Mac のみ)
### SDK, PLUGIN
- kotlin 1.3.0
- kotlin/native 1.0
- android gradle plugin 3.2.1

## プロジェクト構成
```
□   
┣ [android] Android の基本的なプロジェクトが入っています
┣ [ios] iOS の基本的なプロジェクトが入っています
┣ [common] 共通部分のプロジェクトが入っています
    ┗ [src] ここのbuild.gradle内 sourceSets と以下のディレクトリが対応しています
        ┣ [androidMain] Android側から参照できるソースが入っています
        ┣ [commonMain] 共通のソースが入っています
        ┣ [iOSMain] iOS側から参照できるソースが入っています

```
    

## ビルド手順
1. kotlin/native のセットアップ
    1. git clone -b v1.0 https://github.com/JetBrains/kotlin-native
    2. cd kotlin-native
    3. ./gradlew dependencies:update
    4. ./gradlew bundle (とても長い)
    5. export PATH=./dist/bin:$PATH  
       ※ 適切な場所に kotlin-native を移動してからした方がいいです
    6. kotlinc-native -version
    ```
    info: kotlinc-native 1.3.20-dev-1048 (JRE 1.8.0_171-b11)  
    Kotlin/Native: 1.1-dev
    ```

2. Android SDK のセットアップ
    1. https://developer.android.com/studio/#downloads
        - 以下どちらかをする
            - Andrid Studio の インストール
            - SDK Tool のインストール
    2. 環境変数 ANDROID_HOME にSDKのパスを指定してください


3. IntelliJ IDEA のセットアップ (Android Studio でやるより柔軟性が高いため)  
   ULTIMATE (有料) で作業をしていますが、Community Edition で出来るかは不明
    1. https://www.jetbrains.com/idea/download/
        - こちらよりインストールしてください
    2. IntelliJ IDEA を起動
    3. [Configure] -> [Plugins] ->  [Install JetBrains plugin]
    4. Kotlinを検索 インストール

4. よしなに

## 参考
- [Kotlin/Native IDE Support Preview - JetBrains KOTLIN BLOG](https://blog.jetbrains.com/kotlin/2017/11/kotlinnative-ide-support-preview/)
- [Kotlin/Native for Native - Kotlinlang.org](https://kotlinlang.org/docs/reference/native-overview.html)
- [kotlinconf-app - Github](https://github.com/JetBrains/kotlinconf-app)
- [Kotlin/Nativeを使ってiOSアプリを作ってみる - Qiita](https://qiita.com/noripi/items/4ee969c48b3da5ca6fbd)