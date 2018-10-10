package galihlprakoso.com.mvvmstarterkit.app.helper

import android.app.Activity
import android.content.Context

const val KEY_OPEN = "KEY_OPEN"


class SharedPrefHelper(val activity:Activity){

    var sharedPref = activity.getPreferences(Context.MODE_PRIVATE)

    fun setFirstTimeOpen(status:Boolean){

        with(sharedPref.edit()){
            putBoolean(KEY_OPEN,status)
            apply()
        }

    }

    fun getFirstTimeOpen():Boolean{

        return sharedPref.getBoolean(KEY_OPEN,true)

    }

}