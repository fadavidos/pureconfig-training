package pureconfig.example

case class Config(taxes: List[Taxes], persistence: Percistence)

case class Taxes(percentage: Double)

case class Percistence(username: String, url: String, password: String)


