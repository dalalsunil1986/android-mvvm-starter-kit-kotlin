package galihlprakoso.com.mvvmstarterkit.app

import android.support.multidex.MultiDexApplication
import galihlprakoso.com.mvvmstarterkit.app.dagger.Components.AppComponent
import galihlprakoso.com.mvvmstarterkit.app.dagger.Components.DaggerAppComponent
import galihlprakoso.com.mvvmstarterkit.app.dagger.Module.AppModule

class App:MultiDexApplication(){

    val component: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
    }

}