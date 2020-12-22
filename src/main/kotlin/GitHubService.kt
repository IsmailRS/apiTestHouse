import retrofit2.Call
import retrofit2.http.Path
import retrofit2.http.GET
//import Capital

interface GitHubService {
    //@GET("users/{user}/repos")
    //rest/v2/name/{YourNameCountry}?fields=capital
    @GET("rest/v2/name/{country}?fields=capital")
    fun listRepos(@Path("country") country : String ): Call<List<Capital>>
    //@GET("rest/v2/name/UAE?fields=capital")
    //fun listRepos(): Call<List<Capital>>

}