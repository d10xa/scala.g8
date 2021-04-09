package $organization$.$name;format="snake"$.application

import cats.effect._
import org.typelevel.log4cats.slf4j.Slf4jLogger

object Context {
  def create[F[_]: Sync](
    args: List[String]
  ): Resource[F, AppAlg[F]] =
    for {
      logger <- Resource.eval(Slf4jLogger.create[F])
    } yield new AppAlg[F](logger)
}
