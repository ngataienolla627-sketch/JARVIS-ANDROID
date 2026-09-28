package com.manifestquietly.jarvis

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

```
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val layout = LinearLayout(this)
    layout.orientation = LinearLayout.VERTICAL
    layout.gravity = Gravity.CENTER
    layout.setPadding(40, 40, 40, 40)
    layout.setBackgroundColor(Color.BLACK)

    val title = TextView(this)
    title.text = "J.A.R.V.I.S."
    title.textSize = 36f
    title.setTextColor(Color.WHITE)
    title.gravity = Gravity.CENTER

    val status = TextView(this)
    status.text = "SYSTEM ONLINE"
    status.textSize = 20f
    status.setTextColor(Color.WHITE)
    status.gravity = Gravity.CENTER
    status.setPadding(0, 40, 0, 40)

    val button = Button(this)
    button.text = "ACTIVATE JARVIS"

    button.setOnClickListener {
        status.text = "JARVIS ACTIVATED"
    }

    layout.addView(title)
    layout.addView(status)
    layout.addView(button)

    setContentView(layout)
}
```

}
