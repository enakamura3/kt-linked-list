package main

import java.util.ArrayList

class LinkedList {
    var head: Node? = null

    fun add(value: Int){
        addNode(Node(value))
    }

    private fun addNode(node: Node) {
        if (head == null) {
            head = node
        } else {
            var aux = head
            while (aux!!.next != null) {
                aux = aux!!.next
            }
            aux.next = node
        }
    }

    fun size(): Int {
        var count = 1
        if (head == null) return 0
        var aux = head
        while (aux!!.next != null) {
            count++
            aux = aux!!.next
        }
        return count
    }

    fun values(): Array<Int?> {
        var aux = head
        var count = 0
        var values = arrayOfNulls<Int>(size())
        values[count] = aux!!.value
        while (aux!!.next != null) {
            aux = aux!!.next
            values[++count] = aux!!.value
        }
        return values
    }
}