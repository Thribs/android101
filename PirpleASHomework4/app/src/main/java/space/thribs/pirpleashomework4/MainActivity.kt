package space.thribs.pirpleashomework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fizzBuzz()
    }

    private fun fizzBuzz() {
        for (i in 1..100) {
            Log.d("FizzBuzz", "$i - " + when {
                isPrime(i) -> "Prime"
                i.rem(3) == 0 && i.rem(5) == 0 -> "FizzBuzz"
                i.rem(3) == 0 -> "Fizz"
                i.rem(5) == 0 -> "Buzz"
                else -> i
            }.toString())
        }
    }

    private fun isPrime(i: Int): Boolean {
        if (i ==1) return false
        for (n in 2..50) {
            if (i.rem(n) == 0 && i != n) return false
        }
        return true
    }
}