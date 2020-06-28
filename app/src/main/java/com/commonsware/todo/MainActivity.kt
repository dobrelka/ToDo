package com.commonsware.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.transaction

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    if (supportFragmentManager.findFragmentById(android.R.id.content) == null) {
      supportFragmentManager.commit {
        add(android.R.id.content, RosterListFragment())
      }
    }
  }
}
