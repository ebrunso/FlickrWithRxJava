package com.example.simpleflickr

import android.util.Log
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import org.greenrobot.eventbus.EventBus

class FlickrObserver() : Observer<FlickrObserver> {
    lateinit var flickr : FlickrObserver

    override fun onComplete() {
        Log.d("OBSERVER_TAG", "onComplete")
        EventBus.getDefault().post(flickr)
    }

    override fun onSubscribe(d: Disposable) {
        Log.d("OBSERVER_TAG", "onSubscribed")
    }

    override fun onNext(flickrObserver: FlickrObserver) {
        Log.d("OBSERVER_TAG", "onNext Photo = ${flickrObserver}")
        flickr = flickrObserver
    }

    override fun onError(e: Throwable) {
        Log.d("OBSERVER_TAG", "ERROR ----->> -------->>")
    }

}