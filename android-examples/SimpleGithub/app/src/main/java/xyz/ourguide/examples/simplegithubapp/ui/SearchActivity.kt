package xyz.ourguide.examples.simplegithubapp.ui

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SearchView
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_search.*
import kotlinx.android.synthetic.main.item_respositary.view.*
import org.jetbrains.anko.toast
import xyz.ourguide.examples.simplegithubapp.R
import xyz.ourguide.examples.simplegithubapp.api.model.GithubRepo

class SearchActivity : AppCompatActivity() {

    private val adapter = SearchAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        rvActivitySearchList.layoutManager = LinearLayoutManager(this)
        rvActivitySearchList.adapter = adapter
    }

    lateinit var menuSearch: MenuItem
    lateinit var searchView: SearchView

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_activity_search, menu)

        menu?.let {
            menuSearch = it.findItem(R.id.menu_activity_search_query)
            searchView = menuSearch.actionView as SearchView

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String): Boolean {
                    updateTitle(query)
                    hideSoftKeyboard()
                    collapseSearchView()
                    searchRepository(query)
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    return false
                }

            })

        }

        return true
    }

    private fun searchRepository(query: String) {
        toast(query)
    }

    private fun collapseSearchView() {
        menuSearch.collapseActionView()
    }

    private fun hideSoftKeyboard() {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
        imm?.hideSoftInputFromWindow(searchView.windowToken, 0)
    }

    private fun updateTitle(query: String) {
        supportActionBar?.subtitle = query
    }


}

class SearchAdapter : RecyclerView.Adapter<SearchAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = Holder(parent)
    override fun getItemCount() = items.count()

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val repo = items[position]

        // Glide 4
        with(holder.itemView) {
            GlideApp.with(context)
                    .load(repo.owner.avatarUrl)
                    .placeholder(placeholder)
                    .into(ivItemRepositoryProfile)

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

// Glide 4 - Code Generation

@GlideModule
class MyGlideAppModule : AppGlideModule()

// annotation processor가 GlideApp - Java








