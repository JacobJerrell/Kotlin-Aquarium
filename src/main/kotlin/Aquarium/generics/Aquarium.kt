package Aquarium.generics

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(needsProcessed = true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(needsProcessed = false)
class LakeWater : WaterSupply(needsProcessed = true) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<T>(val waterSupply: T)

fun newAquariumExample() {
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
}