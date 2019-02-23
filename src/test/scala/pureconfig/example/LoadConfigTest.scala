package pureconfig.example

import org.scalatest.FunSuite

class LoadConfigTest extends FunSuite {

  test("simple example") {
    import pureconfig.generic.auto._

    pureconfig.loadConfig[Config]("simple.pureconfig.example" ).map( conf => {
      println(conf.persistence.username)
    })

    assert(true)

  }
}
