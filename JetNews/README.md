# Jetnews sample
Jetnews is a sample news reading app, built with
[Jetpack Compose](https://developer.android.com/jetpack/compose). The goal of the sample is to
showcase the current UI capabilities of Compose.

To try out this sample app, you need to use the latest Canary version of Android Studio 4.2.
You can clone this repository or import the
project from Android Studio following the steps
[here](https://developer.android.com/jetpack/compose/setup#sample).

Screenshots
-----------
<img src="screenshots/jetnews_demo.gif" alt="Screenshot">

## Dependency Injection with Koin

First, let's declare ours dependencies in the di Package [`com.example.jetnews.di`][1]

From here, we can write briefly our `appModule`  [`AppModule.kt`][2]

The setup for Jetpack Compose consist in a classical Android configuration in the Application class: [`JetnewsApplication.kt`][3].

We can resolve components inside `AppContent` function, as default value with `get()`. This allow to replace with any instance later for test.

[`JetnewsApp.kt`][4]

[1]: app/src/main/java/com/example/jetnews/di
[2]: app/src/main/java/com/example/jetnews/di/AppModule.kt
[3]: app/src/main/java/com/example/jetnews/JetnewsApplication.kt
[4]: app/src/main/java/com/example/jetnews/ui/JetnewsApp.kt

## Features

This sample contains three screens: a list of articles, a detail page for articles, and a page to
subscribe to topics of interest. The navigation from the the list of articles to the interests
screen uses a navigation drawer.

### App scaffolding

Package [`com.example.jetnews.ui`][5]

[`JetnewsApp.kt`][6] arranges the different screens in the `NavDrawerLayout`. It also implements a simple
navigation pattern.

[5]: app/src/main/java/com/example/jetnews/ui
[6]: app/src/main/java/com/example/jetnews/ui/JetnewsApp.kt

### Main article list

Package [`com.example.jetnews.ui.home`][7]

This screen shows how to create different custom Composable functions and combine them in a list
that scrolls vertically and horizontally.

See how to:

* Use `Row`s and `Column`s to arrange the contents of the UI
* Add an `AppBar`
* Use `MaterialTypography` and opacity to style the text
* Use `Shape` to round the corners of the images
* Use elevation to make the `Card`s stand out from the background

[7]: app/src/main/java/com/example/jetnews/ui/home

### Article detail

Package [`com.example.jetnews.ui.article`][8]

This screen dives into the Text API, showing how to use different fonts than the ones defined in
[`Typograhy`][9]. It also adds a bottom appbar, with custom actions.

[8]: app/src/main/java/com/example/jetnews/ui/article
[9]: app/src/main/java/com/example/jetnews/ui/theme/Type.kt

### Interests screen

Package [`com.example.jetnews.ui.interests`][10]

This screens shows how to use Tabs and switch content depending on the selected tab. It
also includes a custom checkbox button, [SelectTopicButton][11]
that uses a `Toggleable` composable function to provide
the on/off behaviour and semantics, while drawing a custom UI. The UI of the button is partly
drawn with low-level primitives and partly overlaying images. See also how to visualize
on and off, light and dark version in the Android Studio Preview.

[10]: app/src/main/java/com/example/jetnews/ui/interests
[11]: app/src/main/java/com/example/jetnews/ui/interests/SelectTopicButton.kt

### Data

The data in the sample is static, held in the `com.example.jetnews.data` package.

### UI testing

Run UI tests from Android Studio or with the `./gradlew connectedCheck` command.

## License

```
Copyright 2020 The Android Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
