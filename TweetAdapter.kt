import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class TweetAdapter(private val tweets: List<Tweet>) : RecyclerView.Adapter<TweetAdapter.TweetViewHolder>() {

    class TweetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvUserName: TextView = itemView.findViewById(R.id.tvUserName)
        val tvTweetContent: TextView = itemView.findViewById(R.id.tvTweetContent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_tweet, parent, false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        val currentTweet = tweets[position]
        holder.tvUserName.text = currentTweet.userName
        holder.tvTweetContent.text = currentTweet.tweetContent
    }

    override fun getItemCount() = tweets.size
}
