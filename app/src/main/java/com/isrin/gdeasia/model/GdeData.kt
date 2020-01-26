package com.isrin.gdeasia.model

import com.isrin.gdeasia.R

object GdeData{

    private val name = arrayOf(
        "Sidiq Permana",
        "Zarah Dominguez",
        "Hassan Abid",
        "Daichi Furiya",
        "Yuki Anzai",
        "Andrew Kelly",
        "Somkiat Khitwongwattana",
        "Quang Thảo Huỳnh",
        "Seungmin Lee",
        "HyeonSeok Noh",
        "Saurabh Arora"
    )

    private  val desc = arrayOf(
        "Sidiq Permana is an Indonesian Professional Android Application Developer, Entrepereneur - a Chief Innovation Officer at Nusantara Beta Studio",
        "Zarah has been growing up with the Android platform since Donut and has helped produce beautiful",
        "Hassan is a passionate Software Engineer with several years of experience in Android and Web development.",
        "Daichi has been developing Android apps since the donut(Android 1.6). In particular, he has strong interests in delivering a best user experience for end users with smooth animation and UI interaction",
        "Yuki is an android application developer. she started android application development since 2009",
        "Andrew is a Freelance Android Developer based in Sydney Australia and has developed Android applications for clients such as eBay, Commonwealth Bank, BIG W and the Sydney Opera House.",
        "Ake is a passionate android developer who's worked on enterprise software product development and as one of the contributor in the Thailand Android user community website.",
        "Thao is a dedicated Android developer and also a blog writer. He worked on a huge variety of mobile projects across client-server, native and UI/UX.",
        "I'm developing Android application since 2011. I'm currently developing personal fund management service 'Banksalad' at Rainist, South Korea.",
        "I am a software developer on Android. Since 2010, I have been developing Android Applications for consumer.",
        "Saurabh has been building Android apps for 6 years. Currently a part of the Android team at Viki, Singapore"
    )

    private val photo = arrayOf(
        R.drawable.gde1,
        R.drawable.gde2,
        R.drawable.gde3,
        R.drawable.gde4,
        R.drawable.gde5,
        R.drawable.gde6,
        R.drawable.gde7,
        R.drawable.gde8,
        R.drawable.gde9,
        R.drawable.gde10,
        R.drawable.gde11
    )

    val listData : ArrayList<Gde> get() {
        val list = arrayListOf<Gde>()

        for (position in name.indices){
            val gde = Gde()

            gde.name = name[position]
            gde.desc = desc[position]
            gde.photo = photo[position]

            list.add(gde)
        }

        return  list
    }

}