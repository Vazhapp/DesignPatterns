package refactoring_guru_design_pattenrs.creationalDesignPatterns.singleton.nonThreadSafe

class SingletonNonThreadSafe private constructor(val value: String) {
    companion object {
        private var instance: SingletonNonThreadSafe? = null

        fun getInstance(value: String): SingletonNonThreadSafe {
            if (instance == null) {
                instance = SingletonNonThreadSafe(value)
            }
            return instance!!
        }
    }
}