package $organization$.$name;format="snake"$.application

import cats.effect._
import io.chrisdavenport.log4cats.slf4j.Slf4jLogger

object Context {
  def create[F[_]: Sync](
    args: List[String]
  ): Resource[F, AppAlg[F]] =
    for {
      logger <- Resource.liftF(Slf4jLogger.create[F])
    } yield new AppAlg[F](logger)
}
