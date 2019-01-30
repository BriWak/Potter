import org.scalatest.{MustMatchers, WordSpec}

class PotterSpec extends WordSpec with MustMatchers{

"calculateBasket" should {

  "return 0 when given no books" in {
    Potter.calculateBasket(List.empty) mustEqual 0.00
  }

  "return 8 when given 1 book" in {
    Potter.calculateBasket(List("Book 1")) mustEqual 8.00
  }

  "return 16 when given a list of book 1, book 1" in {
    Potter.calculateBasket(List("Book 1", "Book 1")) mustEqual 16.00
  }

  "return 15.20 when given a list of book 1, book 2" in {
    Potter.calculateBasket(List("Book 1", "Book 2")) mustEqual 15.20
  }

  "return 24 when given a list of book 1, book 1, book 1" in {
    Potter.calculateBasket(List("Book 1", "Book 1", "Book 1")) mustEqual 24.00
  }

  "return 23.20 when given a list of book 1, book 1, book 2" in {
    Potter.calculateBasket(List("Book 1", "Book 1", "Book 2")) mustEqual 23.20
  }

  "return 21.60 when given a list of book 1, book 2, book 3" in {
    Potter.calculateBasket(List("Book 1", "Book 2", "Book 3")) mustEqual 21.60
  }

  "return 32.00 when given a list of book 1, book 1, book 1, book 1" in {
    Potter.calculateBasket(List("Book 1", "Book 1", "Book 1", "Book 1")) mustEqual 32.00
  }

  "return 31.20 when given a list of book 1, book 1, book 1, book 2" in {
    Potter.calculateBasket(List("Book 1", "Book 1", "Book 1", "Book 2")) mustEqual 31.20
  }

  "return 29.60 when given a list of book 1, book 1, book 2, book 3" in {
    Potter.calculateBasket(List("Book 1", "Book 1", "Book 2", "Book 3")) mustEqual 29.60
  }
}
}
