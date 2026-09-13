import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(ns.plugins.extension)
}

keiyoushi {
    name = "Mknov"
    versionCode = 1
    contentWarning = ContentWarning.SAFE

    source {
        lang = "ar"
        baseUrl = "https://mknov.com"
    }

    deeplink {
        host("mknov.com")
        path("/..*")
    }
}
