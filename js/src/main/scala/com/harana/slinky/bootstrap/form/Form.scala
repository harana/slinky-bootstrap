package com.harana.slinky.bootstrap.form

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/Form", "Form")
@js.native
object ReactForm extends js.Object

@react object Form extends ExternalComponent {

  case class Props(horizontal: Option[Boolean] = None,
                   inline: Option[Boolean] = None,
                   componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactForm
}