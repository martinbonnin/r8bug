plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.apollographql.apollo3")
}

dependencies {
    implementation("com.apollographql.apollo3:apollo-runtime:3.2.0")
}

apollo {
    packageName.set("com.example.schema")
    generateApolloMetadata.set(true)
}