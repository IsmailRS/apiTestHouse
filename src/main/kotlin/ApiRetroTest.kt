import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.GsonBuilder
import retrofit2.Callback

//import com.google.gson.Gson

//import GitHubService

//class apiRetroTest {
    fun main(args:Array<String>){
        println ("Hello World")
        val retrofit = Retrofit.Builder()
            //.baseUrl("https://api.github.com/")
            .baseUrl("https://restcountries.eu/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    //https://restcountries.eu/rest/v2/name/{YourNameCountry}?fields=capital
    //GitHubService service = retrofit.create(GitHubService.class);
    val cap = retrofit.create(GitHubService::class.java)
    val cal = cap.listRepos("France")
    println(cal.execute().body()?.get(0)?.capital)

    //cal.enqueue(Callback<List<Capital>>)


}
//}

/*

Retrofit turns your HTTP API into a Java interface.

public interface GitHubService {
  @GET("users/{user}/repos")
  Call<List<Repo>> listRepos(@Path("user") String user);
}
The Retrofit class generates an implementation of the GitHubService interface.

Retrofit retrofit = new Retrofit.Builder()
    .baseUrl("https://api.github.com/")
    .build();

GitHubService service = retrofit.create(GitHubService.class);
Each Call from the created GitHubService can make a synchronous or asynchronous HTTP request to the remote webserver.

Call<List<Repo>> repos = service.listRepos("octocat");
 */