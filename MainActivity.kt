import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewTweets: RecyclerView
    private lateinit var adapter: TweetAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewTweets = findViewById(R.id.recyclerViewTweets)
        recyclerViewTweets.layoutManager = LinearLayoutManager(this)
        adapter = TweetAdapter(getSampleTweets()) // Örnek tweetleri al
        recyclerViewTweets.adapter = adapter
    }

    private fun getSampleTweets(): List<Tweet> {
        val tweets = mutableListOf<Tweet>()
        tweets.add(Tweet("John Doe", "This is a sample tweet!"))
        tweets.add(Tweet("Jane Smith", "Another tweet here."))
        // Buraya daha fazla örnek tweet ekleme yapabilirsiniz
        return tweets
    }
}
