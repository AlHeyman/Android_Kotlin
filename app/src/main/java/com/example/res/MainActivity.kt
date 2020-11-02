package com.example.res

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actors: MutableList<Actor> = ArrayList()


        but_1.setOnClickListener {
            actors.add(0, Actor(
                    "Vova Chert",
                    "https://cdn.fishki.net/upload/post/201512/11/1771317/tn/cb43e36ba9eea7b2dcd3410d99262de8.jpg",
                    true
                )
            )
            rv.adapter = RvAdapter(actors)
        }
        but_2.setOnClickListener {
            actors.add(
                Actor(
                    "miru mir",
                    "https://avatars.mds.yandex.net/get-zen_doc/1347728/pub_5adcbd70db0cd9dcbee53fff_5adcbe0b0422b4aedfbb4b1c/scale_1200",
                    true
                )
            )
            rv.adapter = RvAdapter(actors)
        }
        but_3.setOnClickListener {
            actors.add(actors.size/2,
                Actor(
                    "Zarina Suchara",
                    "https://million-wallpapers.ru/wallpapers/3/57/301809285005215/igrivyj-kot.jpg",
                false
            )
            )
            rv.adapter = RvAdapter(actors)
        }

        actors.add(
            Actor(
                "Alicia Vikander",
                "https://i.pinimg.com/originals/18/11/3b/18113bd5e12202694154ac0fb2f3b7f3.jpg",
                true
            )
        )
        actors.add(Actor("Amanda Seyfried", "https://muzh-zhena.ru/_bl/13/26570635.jpg", false))
        actors.add(
            Actor(
                "Anne Hathaway",
                "https://funik.ru/wp-content/uploads/2018/11/b15533839cf78181cdd9.jpg",
                false
            )
        )
        actors.add(
            Actor(
                "Benito Martinez",
                "https://s01.diziler.com/original/19-03/26/benito-martinez.jpg",
                false
            )
        )

        rv.adapter = RvAdapter(actors)

    }
}

data class Actor(
    val name: String,
    val avatar: String,
    val has0scar: Boolean
)



