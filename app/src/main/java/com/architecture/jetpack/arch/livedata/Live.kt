package com.architecture.jetpack.arch.livedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.architecture.jetpack.R
import kotlinx.android.synthetic.main.activity_live.*
import org.jetbrains.anko.doAsync
import java.util.*

class Live : AppCompatActivity() {

    /**
     * Android LiveData
     *
     * LiveData is a part of the architecture patterns. It’s basically a data holder that contains primitive/collection types.
     * It’s used for observing changes in the view and updating the view when it is ACTIVE. Thus, LiveData is lifecycle aware.
     *
     * We know that ViewModels are used to communicate the data to the View. Using ViewModels alone can be a tedious and costly
     * operation since we need to make multiple calls each time the data has to alter the View. Plus we need to store the data Model at different places.
     *
     * LiveData is based on the Observer Pattern and makes the communication between the ViewModel and View easy.
     *
     *It observes for data changes and updates the data automatically instead of us doing multiple calls in adding and
     * deleting data references from multiple places (for example SQLite, ArrayList, ViewModel).
     */


    private lateinit var model: StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live)

        // Get the view model
        model = ViewModelProviders.of(this).get(StudentViewModel::class.java)

        // Specify layout for recycler view
        val linearLayoutManager = LinearLayoutManager(
            this, RecyclerView.VERTICAL, false
        )
        recyclerview.layoutManager = linearLayoutManager

        // Observe the model
        model.allStudents.observe(this, Observer { students ->
            // Data bind the recycler view
            recyclerview.adapter = students?.let { RecyclerViewAdapter(it) }
        })

        // Insert data into table
        insert_button.setOnClickListener{

        doAsync {
            model.insert(Student(null, UUID.randomUUID().toString()))

        }


    }

}
}
