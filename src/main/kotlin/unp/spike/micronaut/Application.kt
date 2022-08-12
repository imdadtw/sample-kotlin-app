package unp.spike.micronaut

import io.micronaut.runtime.Micronaut

open class Application {
    companion object{
        @JvmStatic fun main(args: Array<String>) {
            Micronaut.run(*args)
        }
    }
}