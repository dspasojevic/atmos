/* LimitAttempts.scala
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
package atmos.termination

import scala.concurrent.duration.FiniteDuration

/**
  * A termination policy that limits the number of attempts made.
  *
  * @param maxAttempts The maximum number of attempts that can be performed.
  */
case class LimitAttempts(maxAttempts: Int = defaultMaxAttempts) extends atmos.TerminationPolicy {

  /* Signal for termination when the maximum attempt threshold is reached. */
  override def shouldTerminate(attempts: Int, nextAttemptAt: FiniteDuration) = attempts >= maxAttempts

}
