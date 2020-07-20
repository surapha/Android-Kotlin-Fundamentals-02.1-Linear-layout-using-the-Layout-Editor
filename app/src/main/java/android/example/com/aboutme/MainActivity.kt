package android.example.com.aboutme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
private fun addNickname(view: View) {
    val editText = findViewById<EditText>(R.id.nickname_edit)
    val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
    nicknameTextView.text = editText.text
    editText.visibility = View.GONE
    view.visibility = View.GONE
    nicknameTextView.visibility = View.VISIBLE
}
