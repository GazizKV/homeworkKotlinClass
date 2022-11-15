package com.example.educationhomework

abstract class Animal {
    val clazz: String = "Animal"
    open val type:String
        get() {
            return this.type
        }
    abstract val name:String
    override fun toString(): String {
        return "class = ${clazz} type = ${type} name = ${name}"
    }
}