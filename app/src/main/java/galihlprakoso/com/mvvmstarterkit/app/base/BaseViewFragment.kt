package galihlprakoso.com.mvvmstarterkit.app.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import galihlprakoso.com.mvvmstarterkit.app.helper.DialogHelper

abstract class BaseViewFragment<B:ViewDataBinding>:Fragment(){

    abstract fun getLayoutId():Int

    lateinit var binding:B

    lateinit var dialog: DialogHelper

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, getLayoutId(),container,false)

        dialog = DialogHelper(context!!)

        initialize(savedInstanceState)

        return binding.root

    }

    abstract fun initialize(savedInstanceState: Bundle?)


    fun showShortToast(text:String){

        Toast.makeText(activity,text, Toast.LENGTH_SHORT).show()

    }

    fun showLongToast(text:String){

        Toast.makeText(activity,text, Toast.LENGTH_LONG).show()

    }


}
