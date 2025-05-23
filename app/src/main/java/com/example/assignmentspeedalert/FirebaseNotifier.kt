package com.example.assignmentspeedalert

object FirebaseNotifier {
    fun sendSpeedViolationAlert(customerId: String, vehicleId: String) {
        println("Firebase Alert: Customer $customerId exceeded speed in vehicle $vehicleId")
    }
}