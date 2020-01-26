package com.isrin.gdeasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.isrin.gdeasia.adapter.GdeAdapter
import com.isrin.gdeasia.model.Gde
import com.isrin.gdeasia.model.GdeData

class MainActivity : AppCompatActivity() {

    private lateinit var listViewGde : RecyclerView
    private var listData : ArrayList<Gde> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.elevation?.compareTo(0)

        listViewGde = findViewById(R.id.rvGde)

        listData.addAll(GdeData.listData)
        recycleView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_info -> {
                val intent = Intent(this, About::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun  recycleView(){
        listViewGde.layoutManager = LinearLayoutManager(this)
        val adapter = GdeAdapter(listData)
        listViewGde.adapter = adapter

        adapter.setOnclickItem(object : GdeAdapter.OnclickItem{
            override fun onClickItem(listData: Gde) {
                val intent = Intent(this@MainActivity, Detail::class.java)
                intent.putExtra("name", listData.name)
                intent.putExtra("desc", listData.desc)
                intent.putExtra("photo", listData.photo)
                startActivity(intent)
            }
        })

    }
}
