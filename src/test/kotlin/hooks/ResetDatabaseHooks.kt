package hooks

import io.kotest.core.spec.BeforeTest
import io.kotest.core.spec.style.FunSpec

val resetDatabase: BeforeTest = {
  println("reset database!!!")
}

class ResetDatabaseHooks : FunSpec({
  beforeTest(resetDatabase)
})