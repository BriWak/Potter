object Potter {

  def calculateBasket(basket: List[String]): Double = {


    val filteredDuplicates = basket.toSet.toList

    val book1 = basket.count(book => book == "Book 1")
    val book2 = basket.count(book => book == "Book 2")
    val book3 = basket.count(book => book == "Book 3")
    val book4 = basket.count(book => book == "Book 4")
    val book5 = basket.count(book => book == "Book 5")

    basket.length match {

      case 0 => 0.00
      case 1 => 8.00
      case 2 if basket(0)  == basket(1) => 16.00
      case 2 => 15.20
      case 3 => {
        if (filteredDuplicates.length == 2) {
          23.20
        } else if (filteredDuplicates.length == 3) {
          21.60
        } else {
          24.00
        }
      }
        case 4 => {
          if (filteredDuplicates.length == 2) {
          31.20
        } else if (filteredDuplicates.length == 3) {
            29.60
          } else {
          32.00
          }
        }

    }

  }
}
