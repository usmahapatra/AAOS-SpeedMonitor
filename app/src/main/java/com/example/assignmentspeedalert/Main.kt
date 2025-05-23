package com.example.assignmentspeedalert

fun main() {
    val customer = Customer("C123", "Sneha", 80)
    val vehicle = Vehicle("V456", 0)
    val session = RentalSession(customer, vehicle)

    val monitor = SpeedMonitor(session, object : SpeedViolationListener {
        override fun onUserAlert(message: String) {
            println("User Alert: $message")
        }
    })

    val speedInputs = listOf(60, 75, 85, 90)
    for (speed in speedInputs) {
        println("Speed now: $speed")
        monitor.onSpeedChanged(speed)
    }
}