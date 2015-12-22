package net.room271

/**
  * Handles any uncaught exceptions. Useful to define in nearly all projects.
  */
object GlobalExceptionHandler  {

  def register(): Unit = {
    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
      def uncaughtException(t: Thread, e: Throwable): Unit = {
        //logger.error("Uncaught Exception in thread '" + t.getName + "'", e)
      }
    })
  }
}
