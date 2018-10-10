package galihlprakoso.com.mvvmstarterkit.app

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import galihlprakoso.com.mvvmstarterkit.app.helper.DialogHelper

abstract class BaseViewActivity<B:ViewDataBinding>
    (val layoutId:Int):AppCompatActivity(){

    lateinit var binding:B

    lateinit var dialog:DialogHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,layoutId)

        dialog = DialogHelper(this)

    }

    fun showShortToast(text:String){

        Toast.makeText(this,text, Toast.LENGTH_SHORT).show()

    }

    fun showLongToast(text:String){

        Toast.makeText(this,text, Toast.LENGTH_LONG).show()

    }

    fun showLoading(text:String){

        //Show loading

    }


}