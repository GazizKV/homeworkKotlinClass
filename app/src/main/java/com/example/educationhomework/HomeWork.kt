package com.example.educationhomework

fun main() {
    val animals = mutableListOf<Animal>()
    animals.add(0, Herbivores("Giraph"))
    animals.add(1, Herbivores("Hippo"))
    animals.add(2, Carnivores("Tiger"))
    animals.add(3, Carnivores("Leo"))
    for (next in animals) {
        println(next.toString())
    }
}

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

class Herbivores(override var name: String) : Animal() {
    override val type: String = "Herbivores"
}

class Carnivores(override var name: String) : Animal() {
    override val type: String = "Carnivores"
}

class HomeWork {
}