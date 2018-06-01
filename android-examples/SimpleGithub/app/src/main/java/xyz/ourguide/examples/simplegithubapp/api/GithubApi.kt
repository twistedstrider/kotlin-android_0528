package xyz.ourguide.examples.simplegithubapp.api

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import xyz.ourguide.examples.simplegithubapp.api.model.RepoSearchResponse


interface GithubApi {
    // api.github.com
    @GET("search/repositories")
    // fun rxSearchRepository(@Query("q") query: String) : Call<RepoSearchResponse>
    fun rxSearchRepository(@Query("q") query: String) : Observable<RepoSearchResponse>
}