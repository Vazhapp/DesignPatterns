package refactoring_guru_design_pattenrs.singleton.withLazy

class SingletonWithLazy private constructor() {
    companion object {
        val instance: SingletonWithLazy by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonWithLazy()
        }
    }
}