package refactoring_guru_design_pattenrs.builderPattern.pcBuilder.builder

class PersonalComputer private constructor(
    val cpu: String,
    val gpu: String,
    val ram: Int,
    val hdd: Int?,
    val ssd: Int?,
    val motherBoard: String,
) {
    class Builder {
        private var cpu = "I7 12400F"
        private var gpu = "GTX 1080 TI"
        private var ram = 16
        private var hdd: Int? = null
        private var ssd: Int? = 512
        private var motherBoard = "Z730"

        fun setCpu(cpu: String) = apply { this.cpu = cpu }
        fun setGpu(gpu: String) = apply { this.gpu = gpu }
        fun setRam(ram: Int) = apply { this.ram = ram }
        fun setHdd(hdd: Int?) = apply { this.hdd = hdd }
        fun setSsd(ssd: Int?) = apply { this.ssd = ssd }

        fun build() = PersonalComputer(
            cpu, gpu, ram, hdd, ssd, motherBoard
        )
    }
}