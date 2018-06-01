package xyz.ourguide.examples.simplegithubapp.ui

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_respositary.view.*
import xyz.ourguide.examples.simplegithubapp.R
import xyz.ourguide.examples.simplegithubapp.api.model.GithubRepo

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

    }
}

class SearchAdapter : RecyclerView.Adapter<SearchAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = Holder(parent)
    override fun getItemCount() = items.count()

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val repo = items[position]

        // Glide 4


        with(holder.itemView) {
            tvItemRepositoryName.text = repo.fullName
            tvItemRepositoryLanguage.text = repo.language
                    ?: context.getText(R.string.no_language_specified)
        }

    }

    var items: List<GithubRepo> = emptyList()

    private val placeholder = ColorDrawable(Color.GRAY)


    class Holder(parent: ViewGroup) : RecyclerView.ViewHolder(
            LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_respositary, parent, false)
    )
}
