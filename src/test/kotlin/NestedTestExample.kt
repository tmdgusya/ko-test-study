import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class NestedTestExample : DescribeSpec({

  describe("an outer test") {

    it("an inner test") {
      1 + 2 shouldBe 3
    }

    it("an inner test do") {
      3 + 4 shouldBe 7
    }

  }

})