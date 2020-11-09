package $organization$.$name;format="snake"$.application

import cats.Monad
import cats.implicits._
import cats.effect.ExitCode
import io.chrisdavenport.log4cats.Logger

final class AppAlg[F[_]: Monad](logger: Logger[F]) {
  def run: F[ExitCode] =
    (for {
      _ <- logger.info("hello world")
    } yield ()).as(ExitCode.Success)
}
