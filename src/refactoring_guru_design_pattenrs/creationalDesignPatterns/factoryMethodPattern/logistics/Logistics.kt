package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics

abstract class Logistics {
    protected abstract fun getTransportObject(): Transport

    fun startDeliveryAfeterPlanned() {
        val currentTransport = getTransportObject()

        println("${currentTransport.deliveryTime()} \n")
        currentTransport.delivery()
    }
}