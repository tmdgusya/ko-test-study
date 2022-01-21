import hooks.ResetDatabaseHooks
import hooks.resetDatabase
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldHaveLength

class LifeCycleCallback : FunSpec({

  beforeTest(resetDatabase)

  beforeEach {
    println("Hello from $it")
  }

  test("sam should be a three letter name") {
    "sam".shouldHaveLength(3)
  }

  afterEach {
    println("Goodbye from $it")
  }

})