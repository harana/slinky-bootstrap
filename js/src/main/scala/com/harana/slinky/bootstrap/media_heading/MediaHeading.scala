package com.harana.slinky.bootstrap.media_heading

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/v", JSImport.Default)
@js.native
object ReactMediaHeading extends js.Object

@react object MediaHeading extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactMediaHeading
}