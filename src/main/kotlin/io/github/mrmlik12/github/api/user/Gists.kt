package io.github.mrmlik12.github.api.user

import com.google.gson.annotations.SerializedName

typealias Gists = ArrayList<Gist>

data class Gist (
    val url: String?,

    @SerializedName("fork_url")
    val forksURL: String?,

    @SerializedName("commits_url")
    val commitsURL: String?,

    val id: String?,

    @SerializedName("node_id")
    val nodeID: String?,

    @SerializedName("git_pull_url")
    val gitPullURL: String?,

    @SerializedName("git_push_url")
    val gitPushURL: String?,

    @SerializedName("html_url")
    val htmlURL: String?,

    val files: Files?,
    val public: Boolean?,

    @SerializedName("created_at")
    val createdAt: String?,

    @SerializedName("updated_at")
    val updatedAt: String?,

    val description: String?,
    val comments: Long?,
    val user: String?,

    @SerializedName("comments_url")
    val commentsURL: String?,

    val owner: Users?,
    val truncated: Boolean?
)

data class Files (
    val filename: String?,
    val type: String?,
    val language: String?,

    @SerializedName("raw_url")
    val rawURL: String?,

    val size: Long?
)

data class Owner (
    val login: String,
    val id: Long,

    @SerializedName("node_id")
    val nodeID: String,

    @SerializedName("avatar_url")
    val avatarURL: String,

    @SerializedName("gravatar_id")
    val gravatarID: String,

    val url: String,

    @SerializedName("html_url")
    val htmlURL: String,

    @SerializedName("followers_url")
    val followersURL: String,

    @SerializedName("following_url")
    val followingURL: String,

    @SerializedName("gists_url")
    val gistsURL: String,

    @SerializedName("starred_url")
    val starredURL: String,

    @SerializedName("subscriptions_url")
    val subscriptionsURL: String,

    @SerializedName("organizations_url")
    val organizationsURL: String,

    @SerializedName("repos_url")
    val reposURL: String,
)