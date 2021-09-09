package main

class App {
}

fun main() {
    println("Linked List test")
    val ll = LinkedList()
    ll.add(1)
    ll.add(2)
    ll.add(3)
    println(ll.size())
    ll.values().forEach { print("$it ") }
}