package com.drping.singadeals

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}