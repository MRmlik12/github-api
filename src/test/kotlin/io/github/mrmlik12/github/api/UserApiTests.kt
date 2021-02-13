package io.github.mrmlik12.github.api

import org.junit.Assert
import org.junit.Test

class UserApiTests {
    private val userName: String = "MRmlik12"

    @Test
    fun getNotNullUserData() {
        val result = UserApi().getUserData(userName)
        Assert.assertNotNull(result)
    }

    @Test
    fun getNotNullGistsData() {
        val result = UserApi().getGistList(userName)
        Assert.assertNotNull(result)
    }

    @Test
    fun getNotNullReposData() {
        val result = UserApi().getListRepositories(userName)
        Assert.assertNotNull(result)
    }

    @Test
    fun getNotNullFollowers() {
        val result = UserApi().getFollowers(userName)
        Assert.assertNotNull(result)
    }

    @Test
    fun getNotNullFollowing() {
        val result = UserApi().getFollowing(userName)
        Assert.assertNotNull(result)
    }

    @Test
    fun getNotNullStarred() {
        val result = UserApi().getStarred(userName)
        Assert.assertNotNull(result)
    }

    @Test
    fun getNotNullSubscriptions() {
        val result = UserApi().getSubscriptions(userName)
        Assert.assertNotNull(result)
    }

    @Test
    fun getNotNullEvents() {
        val result = UserApi().getEvents(userName)
        Assert.assertNotNull(result)
    }
}