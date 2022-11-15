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

