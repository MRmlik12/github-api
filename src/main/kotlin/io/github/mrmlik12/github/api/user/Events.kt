package io.github.mrmlik12.github.api.user

import com.google.gson.annotations.SerializedName

typealias Events = ArrayList<Event>

data class Event (
    val id: String?,
    val type: String?,
    val actor: Actor?,
    val repo: RepoInfo?,
    val payload: Payload?,
    val public: Boolean?,

    @SerializedName("created_at")
    val createdAt: String?,

    val org: Actor?
)

data class Actor (
    val id: Long?,
    val login: String?,

    @SerializedName("display_login")
    val displayLogin: String? = null,

    @SerializedName("gravatar_id")
    val gravatarID: String?,

    val url: String?,

    @SerializedName("avatar_url")
    val avatarURL: String?
)

data class Payload (
    val action: String?
)

data class RepoInfo (
    val id: Long?,
    val name: String?,
    val url: String?
)