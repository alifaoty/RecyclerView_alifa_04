package com.example.recyclerview_alifa_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nctdreamlist = listOf<NCTDream>(
            NCTDream(
            R.drawable.mark,
                "Mark Lee",
                "Mark Lee (born August 2, 1999), known professionally as Mark, is a Canadian rapper, singer, songwriter, dancer, and host of Korean descent. He is a member of the South Korean boy group NCT and its fixed sub-units NCT 127 and NCT Dream, and is also a member of the supergroup SuperM."
            ),
            NCTDream(
                R.drawable.renjun,
                "Huang Ren Jun",
                "Huáng Rénjùn (born March 23, 2000) is a Chinese singer under SM Entertainment. He is a member of the boy group NCT and the sub-unit NCT Dream."
            ),
            NCTDream(
                R.drawable.jeno,
                "Lee Je No",
                "Lee Je-no, known professionally as Jeno, is a South Korean rapper, singer, songwriter, dancer and host. He is a member of the South Korean boy group NCT and its fixed sub-unit NCT Dream."
            ),
            NCTDream(
                R.drawable.haechan,
                "Lee Dong Hyuck",
                "Lee Dong-hyuck better known as Haechan (born June 6, 2000), is a South Korean singer. He is a member of the South Korean boy band, NCT, and its three sub-units, NCT 127, NCT Dream, and NCT U."
            ),
            NCTDream(
                R.drawable.jaemin,
                "Na Jae Min",
                "Na Jae-min (born August 13, 2000), known mononymously as Jaemin, is a South Korean singer, rapper, songwriter and actor. He is a member of the South Korean boy group NCT, primarily promoting with fixed sub-unit NCT Dream."
            ),
            NCTDream(
                R.drawable.chenle,
                "Zhong Chenle",
                "Zhong Chenle (born 22 November 2001), known professionally by the mononym Chenle, is a Chinese singer, songwriter, and actor currently based in South Korea."
            ),
            NCTDream(
                R.drawable.jisung,
                "Park Ji Sung",
                "Ji Sung (born Kwak Tae-geun on February 27, 1977) is a South Korean actor."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_nctdream)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = NCTDreamAdapter(this, nctdreamlist) {
            val intent = Intent(this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}