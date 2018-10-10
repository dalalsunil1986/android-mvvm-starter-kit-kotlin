package galihlprakoso.com.mvvmstarterkit.app.base

abstract class BaseActiveModel<M:BaseModel>(val type:Class<M>):GHackFramework(){

    fun getNamaKoleksi():String{

        return type.simpleName
    }


}