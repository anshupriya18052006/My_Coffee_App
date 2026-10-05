# Copilot instructions for My Coffee App

## Project overview

This repository is a small single-module Android app built with Jetpack Compose and Navigation Compose. The app is organized around feature screens rather than a layered MVVM architecture: UI screens live under `app/src/main/java/com/example/my_coffee_app/presentation/screens/...`, domain models live under `domain/model`, and navigation is defined in the `presentation/screens/navigation` package.

Key entry points:
- `app/src/main/java/com/example/my_coffee_app/MainActivity.kt` sets edge-to-edge mode and launches `NavGraph()`.
- `presentation/screens/navigation/NavGraph.kt` owns the Compose `NavHost` and screen routing.
- `presentation/screens/navigation/Routes.kt` defines typed navigation destinations via `kotlinx.serialization.Serializable`.
- `presentation/screens/theme` contains the app theme and color definitions.
- `domain/model/Product.kt` is the main domain model used by the home/details flows.

The app is intentionally simple: product data is defined inline in screens (for example, in `homescreen` and `detailsscreen`) instead of a repository/data layer, so most changes are UI and navigation focused.

## Build, test, and lint commands

Use the Gradle wrapper from the repository root:

- Build the debug app:
  - `./gradlew assembleDebug`
- Run unit tests:
  - `./gradlew testDebugUnitTest`
- Run a single test class or method:
  - `./gradlew testDebugUnitTest --tests "com.example.my_coffee_app.ExampleUnitTest"`
  - `./gradlew testDebugUnitTest --tests "com.example.my_coffee_app.ExampleUnitTest.addition_isCorrect"`
- Run lint checks:
  - `./gradlew lintDebug`
- Run instrumented tests on a connected device/emulator:
  - `./gradlew connectedDebugAndroidTest`

If you are only touching the app module, `:app:` task names are also valid, for example:
- `./gradlew :app:testDebugUnitTest`

## Architecture notes

- The app is a single module (`:app`) with a standard Android layout: `manifest`, `res`, `src/main/java`, `src/test`, and `src/androidTest`.
- Compose UIs are organized by screen package (`welcomescreen`, `homescreen`, `detailsscreen`) and shared UI pieces live under `ui_components`.
- Navigation uses `androidx.navigation:navigation-compose` with typed routes and `rememberNavController()`. Keep route definitions and screen parameter types aligned.
- Theme and styling are centralized under `presentation/screens/theme`; screen-specific colors and spacing are often set inline in Compose functions.
- Product data is a lightweight `Product` model with local resource IDs for Android drawables; do not add a full data layer unless the feature requires it.

## Repository conventions and gotchas

- Keep new screens in a feature package that matches the screen name, for example `presentation/screens/checkoutscreen` instead of sprinkling UI across unrelated folders.
- Prefer `@Composable` functions for UI; keep rendering logic close to the screen that owns it.
- Use `Routes` and screen signatures consistently. The app currently relies on typed `Serializable` routes; avoid changing a route argument type to `Any` or leaving screen parameters mismatched with the route.
- `MainActivity` should stay minimal: edge-to-edge setup and `NavGraph()` should be the main behavior.
- Keep resources in `res` and reference them with `R.drawable.*` or other generated IDs; do not hardcode asset names or move drawables without updating references.
- Many screens include inline sample data lists (for example, product lists in Home and Details); if you add or remove product items, keep the IDs and route arguments consistent.

## Current repo state

The project compiles as a Compose app, but route/screen consistency matters: navigation-related edits should be checked immediately because mismatched parameter types or missing `navController` arguments will fail Kotlin compilation.
