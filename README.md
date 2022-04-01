Reproducer for https://github.com/apollographql/apollo-kotlin/issues/3979

To reproduce

* Start from fresh: `rm -rf */build`
* `./gradlew :app:assembleDebug --continue`. You should see 2 errors, one Apollo, one Dex related
* uncomment the line in `schema/build.gradle.kts` to fix the duplicate error
* `./gradlew :app:assembleDebug --continue`. One error is gone but the other sticks
