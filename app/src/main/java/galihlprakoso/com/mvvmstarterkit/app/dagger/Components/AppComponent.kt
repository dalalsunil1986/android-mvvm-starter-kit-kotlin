package galihlprakoso.com.mvvmstarterkit.app.dagger.Components

import android.app.Activity
import dagger.Component
import galihlprakoso.com.mvvmstarterkit.app.BaseViewActivity
import galihlprakoso.com.mvvmstarterkit.app.dagger.Module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(activity: Activity)

}