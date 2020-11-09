package $organization$.$name;format="snake"$

import $organization$.$name;format="snake"$.application.Context
import cats.effect.ExitCode
import cats.effect.IO
import cats.effect.IOApp

object Main extends IOApp {
  override def run(args: List[String]): IO[ExitCode] =
    Context.create[IO](args).use(_.run)
}
