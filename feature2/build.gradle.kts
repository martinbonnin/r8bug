plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.apollographql.apollo3")
}

dependencies {
    implementation("com.apollographql.apollo3:apollo-runtime:3.2.0")
    apolloMetadata(project(":schema"))
}

apollo {
    packageName.set("com.example.feature2")
}