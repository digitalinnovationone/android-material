package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityTopAppBarBinding
import br.com.messoretech.extensions.toast

class TopAppBarActivity : AppCompatActivity() {

    private val binding by lazy { ActivityTopAppBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.topAppBar.setNavigationOnClickListener {
            toast("Clicou no menu de navegação")
        }

        binding.topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.favorite -> {
                    toast("favorite")
                    true
                }
                R.id.search -> {
                    toast("search")
                    true
                }
                R.id.more -> {
                    toast("more")
                    true
                }
                else -> false
            }
        }
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, TopAppBarActivity::class.java)
    }

}
