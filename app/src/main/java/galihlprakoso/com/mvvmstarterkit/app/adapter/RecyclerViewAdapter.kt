package galihlprakoso.com.mvvmstarterkit.app.adapter

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class RecyclerViewAdapter<T,B:ViewDataBinding>(var list: List<T>,
                                               val layout_id:Int,
                                               val variable_id:Int,
                                               val onBind:(B)->Unit) : RecyclerView.Adapter<RecyclerViewAdapter<T,B>.RecyclerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val binding = DataBindingUtil.inflate<B>(LayoutInflater.from(parent.context),
                layout_id,parent,false)


        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder,position:Int){

        holder.binding.setVariable(variable_id,list[position])

        onBind(holder.binding)

    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemCount(): Int {
        return list.size
    }



    inner class RecyclerViewHolder(internal var binding: B) : RecyclerView.ViewHolder(binding.root)

}
