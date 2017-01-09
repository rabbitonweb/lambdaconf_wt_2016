package ffgg

import scalaz._
import Scalaz._

object MonadTransformers {

  type Error[A] = String \/ A
  type Outcome[A] = OptionT[Error, A]

  def calculate(input: String): OptionT[Error, Int] = 10.point[Outcome]

  val plus1: OptionT[Error, Int] = for {
    v <- calculate("some")
  } yield (v + 1)

}

