package $organization$.$name;format="snake"$.application

import cats.Monad
import cats.effect.ExitCode
import cats.syntax.all._
import org.typelevel.log4cats.Logger

final class AppAlg[F[_]: Monad](logger: Logger[F]) {
  def run: F[ExitCode] =
    (for {
      _ <- logger.info("hello world")
    } yield ()).as(ExitCode.Success)
}
