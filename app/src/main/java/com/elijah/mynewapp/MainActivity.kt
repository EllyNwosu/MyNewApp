package com.elijah.mynewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), OnItemClickListner {
    private lateinit var binding: ActivityMainBinding
    private lateinit var manAdapter: ManAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animals: List<Man> = mutableListOf(
            Man(
                R.drawable.ic_guy,
                firstname = "Michael",
                surname = "Jackson"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "James",
                surname = "Blunt"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "James",
                surname = "Bond"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Tom",
                surname = "Cruise"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Angelina",
                surname = "Jolie"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Tom",
                surname = "Hanks"
            ),
            Man(
                R.drawable.ic_boy,
                firstName = "Mega",
                surName = "Tron"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Optimus",
                surname = "Prime"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Jamie",
                surname = "Fox"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Orlando",
                surname = "Bloom"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Jack",
                surname = "Sparrow"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Megan",
                surname = "Stallion"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Mike",
                surname = "Jim"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Somalia",
                surname = "Moon"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Elijah",
                surname = "Nwosu"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Zain",
                surname = "Maliq"
            ),
            Man(
                R.drawable.ic_boy,
                firstName = "Bumble",
                surName = "Bee"
            ),
            Man(
                R.drawable.ic_boy,
                firstname = "Logan",
                surname = "Wolverine"
            ),
            Man(
                R.drawable.ic_boy,
                firstName = "Lex",
                surName = "Luthur"
            ),
            Man(
                R.drawable.ic_boy,
                firstName = ame = "Mary",
                surName = "Jane"
            )
        )

        manAdapter = ManAdapter(man, clickListner = this)
        binding.animalRecycler.adapter = manAdapter

    }

    override fun onItemClick(item: Man, position: Int) {
        var intent = Intent(this, PropertyActivity::class.java)
        intent.putExtra("imageAnimal",item.picture.toString())
        intent.putExtra("textfirstname",item.firstname)
        intent.putExtra("textsurname",item.surname)
        startActivity(intent)
    }
}


//var intent = Intent(activity, ClickDetail::class.java)
//intent.putExtra("your_key",MainActivity.clickArray.toString())
//startActivity(intent)
//
//class ClickDetail : AppCompatActivity(){
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.traffic_click_detail)
//        val YourData =  getIntent().getStringExtra("your_key")
//    }
//}