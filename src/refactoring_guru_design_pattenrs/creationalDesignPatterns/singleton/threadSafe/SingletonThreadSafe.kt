package refactoring_guru_design_pattenrs.creationalDesignPatterns.singleton.threadSafe

class SingletonThreadSafe private constructor(val value: String) {

    init {
        // Simulating slow init.
        Thread.sleep(1000)
    }

    companion object {

        @Volatile
        private var instance: SingletonThreadSafe? = null

        fun getInstance(value: String): SingletonThreadSafe {
            return instance ?: synchronized(this) {
                instance ?: SingletonThreadSafe(value).also { instance = it }
            }
        }
    }
}