package com.example.assignmentspeedalert

class SpeedMonitor(
    private val rentalSession: RentalSession,
    private val alertListener: SpeedViolationListener
) {
    fun onSpeedChanged(newSpeed: Int) {
        rentalSession.vehicle.currentSpeed = newSpeed
        if (newSpeed > rentalSession.customer.maxAllowedSpeed) {
            alertListener.onUserAlert("Speed limit exceeded!")
            FirebaseNotifier.sendSpeedViolationAlert(
                rentalSession.customer.id,
                rentalSession.vehicle.id
            )
        }
    }
}