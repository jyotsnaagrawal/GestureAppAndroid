package com.jyotsna.gesturejyotsnaa

import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity handles various gestures using the GestureDetector class.
 * It updates the TextView with the detected gesture information.
 */
class MainActivity : AppCompatActivity(),
    GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener {

    // GestureDetector instance for detecting gestures
    private var gestureDetector: GestureDetector? = null
    // TextView instance to display gesture information
    private lateinit var gestureTextView: TextView

    /**
     * Called when the activity is first created.
     * Initializes the GestureDetector and TextView.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the GestureDetector with this context and the gesture listeners
        gestureDetector = GestureDetector(this, this)
        // Set this class as the double-tap listener
        gestureDetector?.setOnDoubleTapListener(this)
        // Find the TextView by its ID and assign it to the variable
        gestureTextView = findViewById(R.id.gestureText)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        // Use local variable 'detector' to handle null safety and smart casting
        val detector = gestureDetector
        // Pass the touch event to the GestureDetector if it's not null
        if (event != null && detector != null) {
            detector.onTouchEvent(event)
        }
        return super.onTouchEvent(event)
    }

    /**
     * Called when a touch event is detected as a "down" gesture.
     * Updates the TextView with "On Down".
     */
    override fun onDown(event: MotionEvent): Boolean {
        "On Down".also { gestureTextView.text = it }
        return true
    }

    /**
     * Called when the user has pressed down on the screen.
     * Updates the TextView with "On Show Press".
     */
    override fun onShowPress(event: MotionEvent) {
        "On Show Press".also { gestureTextView.text = it }
    }

    /**
     * Called when a single tap is detected and the tap is lifted.
     * Updates the TextView with "On Single Tap Up".
     */
    override fun onSingleTapUp(event: MotionEvent): Boolean {
        "On Single Tap Up".also { gestureTextView.text = it }
        return true
    }

    /**
     * Called when a scroll gesture is detected.
     * Updates the TextView with "On Scroll".
     */
    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        "On Scroll".also { gestureTextView.text = it }
        return true
    }

    /**
     * Called when a long press gesture is detected.
     * Updates the TextView with "On Long Press".
     */
    override fun onLongPress(event: MotionEvent) {
        "On Long Press".also { gestureTextView.text = it }
    }

    /**
     * Called when a fling gesture is detected.
     * Updates the TextView with "On Fling".
     */
    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        "On Fling".also { gestureTextView.text = it }
        return true
    }

    /**
     * Called when a double tap gesture is detected.
     * Updates the TextView with "On Double Tap".
     */
    override fun onDoubleTap(event: MotionEvent): Boolean {
        "On Double Tap".also { gestureTextView.text = it }
        return true
    }

    /**
     * Called when a double-tap event is detected.
     * Updates the TextView with "On Double Tap Event".
     */
    override fun onDoubleTapEvent(event: MotionEvent): Boolean {
        "On Double Tap Event".also { gestureTextView.text = it }
        return true
    }

    /**
     * Called when a single tap is confirmed.
     * Updates the TextView with "On Single Tap Confirmed".
     */
    override fun onSingleTapConfirmed(event: MotionEvent): Boolean {
        "On Single Tap Confirmed".also { gestureTextView.text = it }
        return true
    }
}
