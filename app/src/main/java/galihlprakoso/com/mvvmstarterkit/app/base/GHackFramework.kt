package galihlprakoso.com.mvvmstarterkit.app.base

import galihlprakoso.com.mvvmstarterkit.app.dagger.Components.AppComponent
import galihlprakoso.com.mvvmstarterkit.app.dagger.Components.DaggerAppComponent
import galihlprakoso.com.mvvmstarterkit.app.dagger.Module.AppModule

open class GHackFramework{

    val component: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .build()
    }

}