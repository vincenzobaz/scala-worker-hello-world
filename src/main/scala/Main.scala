import org.scalajs.dom.experimental.serviceworkers.FetchEvent
import org.scalajs.dom.experimental.{Request, Response, ResponseInit}
import scala.scalajs.js

@main
def main(): Unit =
  Globals.addEventListener("fetch", (event: FetchEvent) => {
    event.respondWith(handleRequest(event.request))
  })


def handleRequest(request: Request): Response =
  new Response("Scala Worker hello world", ResponseInit(
      _headers = js.Dictionary("content-type" -> "text/plain")))

