package com.mohiva.play.htmlcompressor.fixtures

import play.api.mvc._
import play.twirl.api.Html
import scala.concurrent.Future

/**
 * Test controller.
 */
class Application extends Controller {

  /**
   * The template to compress.
   */
  val template = Html("""

    <!DOCTYPE html>
      <html>
        <head>
          <title>@title</title>
        </head>
        <body>
          I'm a play app
        </body>
      </html>
    """
  )

  /**
   * A default action.
   */
  def action = Action {
    Ok(template)
  }

  /**
   * A async action.
   */
  def asyncAction = Action.async {
    Future.successful(Ok(template))
  }

  /**
   * A non HTML action.
   */
  def nonHTML = Action {
    Ok("  <html/>")
  }
}
