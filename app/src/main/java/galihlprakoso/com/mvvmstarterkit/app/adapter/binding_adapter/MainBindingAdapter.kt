package galihlprakoso.com.mvvmstarterkit.app.adapter.binding_adapter

import android.databinding.BindingAdapter
import android.location.Geocoder
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import galihlprakoso.com.mvvmstarterkit.R
import java.lang.Exception
import java.util.*

class MainBindingAdapter{
    companion object {

        @JvmStatic
        @BindingAdapter("android:setInt")
        fun setInt(textView: TextView,integer:Int){

            try{

                textView.setText(integer.toString())

            }catch (e:Exception){

                textView.text = "0"

            }

        }

    }
}