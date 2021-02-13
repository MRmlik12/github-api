package io.github.mrmlik12.github.api

enum class URLs(val url: String) {
    User("https://api.github.com/users/"),
    UserRepo("https://api.github.com/users/{userName}/repos"),
    UserGist("https://api.github.com/users/{userName}/gists"),
    UserFollowers("https://api.github.com/users/{userName}/followers"),
    UserFollowing("https://api.github.com/users/{userName}/following"),
    UserStarred("https://api.github.com/users/{userName}/starred"),
    UserSubscriptions("https://api.github.com/users/{userName}/subscriptions"),
    UserOrganizations("https://api.github.com/users/{userName}/orgs"),
    UserEvents("https://api.github.com/users/{userName}/received_events")
}