Reproducer for https://github.com/apollographql/apollo-kotlin/issues/3979

To reproduce

* Start from fresh: `rm -rf */build`
* `./gradlew :app:assembleDebug`
* uncomment the line in `schema/build.gradle.kts`. This moves a class from the `feature1` module to the `feature2` module
* `./gradlew :app:assembleDebug`. There's now a duplicate error: `Type com.example.schema.type.Json$Companion is defined multiple times`
