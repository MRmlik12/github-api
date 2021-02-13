package io.github.mrmlik12.github.api

import io.github.mrmlik12.github.api.request.Request
import io.github.mrmlik12.github.api.user.*

class UserApi {

    fun getUserData(userName: String): Users = Request<Users>().getResponse(URLs.User.url + userName)

    fun getListRepositories(userName: String): Repos = Request<Repos>().getResponse(replaceUsername(URLs.UserRepo.url, userName))

    fun getFollowers(userName: String): Followers? = Request<Users>().getResponse(replaceUsername(URLs.UserFollowers.url, userName))

    fun getFollowing(userName: String): Following = Request<Users>().getResponse(replaceUsername(URLs.UserFollowing.url, userName))

    fun getGistList(userName: String): Gists = Request<Gists>().getResponse(replaceUsername(URLs.UserGist.url, userName))

    fun getStarred(userName: String): Starred = Request<Repos>().getResponse(replaceUsername(URLs.UserStarred.url, userName))

    fun getSubscriptions(userName: String): Subscriptions = Request<Repos>().getResponse(replaceUsername(URLs.UserSubscriptions.url, userName))

    fun getEvents(userName: String): Events = Request<Event>().getResponse(replaceUsername(URLs.UserEvents.url, userName))

    private fun replaceUsername(url: String, userName: String): String = url.replace("{userName}", userName)
}