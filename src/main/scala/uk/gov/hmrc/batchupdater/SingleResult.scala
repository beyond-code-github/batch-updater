/*
 * Copyright 2015 HM Revenue & Customs
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

package uk.gov.hmrc.batchupdater

object SingleResult {
  case object Succeeded       extends SingleResult { val failureReason = None }
  case object AlreadyUpdated  extends SingleResult { val failureReason = Some("alreadyUpdated") }
  case object InvalidState    extends SingleResult { val failureReason = Some("invalidState") }
  case object NotFound        extends SingleResult { val failureReason = Some("notFound") }
  case object UpdateFailed    extends SingleResult { val failureReason = Some("updateFailed") }
  case object AuditFailed     extends SingleResult { val failureReason = Some("auditFailed")}
}

sealed trait SingleResult { val failureReason: Option[String] }
