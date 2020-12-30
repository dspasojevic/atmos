/* IgnoreEvents.scala
 *
 * Copyright (c) 2013-2014 linkedin.com
 * Copyright (c) 2013-2015 zman.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package atmos.monitor

import scala.concurrent.duration.FiniteDuration
import scala.util.Try

/**
  * A monitor that ignores all events.
  */
case object IgnoreEvents extends atmos.EventMonitor {

  /* Ignore the retrying event. */
  override def retrying(name: Option[String], outcome: Try[Any], attempts: Int, backoff: FiniteDuration, silent: Boolean) = ()

  /* Ignore the interrupted event. */
  override def interrupted(name: Option[String], outcome: Try[Any], attempts: Int) = ()

  /* Ignore the aborted event. */
  override def aborted(name: Option[String], outcome: Try[Any], attempts: Int) = ()

}
