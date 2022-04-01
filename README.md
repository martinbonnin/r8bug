Reproducer for https://github.com/apollographql/apollo-kotlin/issues/3979

To reproduce

* Start from fresh: `rm -rf */build`
* build the project from AS. You should get an (expected) duplicate error
* uncomment the line in `schema/build.gradle.kts` to fix the duplicate error
* rebuild the project. One error is gone but the other sticks
