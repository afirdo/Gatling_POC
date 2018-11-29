
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://scienceutsav.com")
		.inferHtmlResources()
		.acceptHeader("image/webp,image/apng,image/*,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-GB,en-US;q=0.9,en;q=0.8")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map("Proxy-Connection" -> "keep-alive")

	val headers_3 = Map(
		"Accept" -> "*/*",
		"Origin" -> "http://scienceutsav.com",
		"Proxy-Connection" -> "keep-alive")

	val headers_4 = Map(
		"Accept" -> "*/*",
		"Proxy-Connection" -> "keep-alive")

	val headers_5 = Map(
		"Accept" -> "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01",
		"Proxy-Connection" -> "keep-alive",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_14 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Proxy-Connection" -> "keep-alive",
		"X-Requested-With" -> "XMLHttpRequest")

    val uri1 = "http://connect.facebook.net/en_US/sdk.js"
    val uri3 = "https://www.google-analytics.com/analytics.js"
    val uri4 = "http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.min.css"
    val uri5 = "http://www.youtube.com/iframe_api"
    val uri6 = "https://s7.addthis.com/js/300/addthis_widget.js"
    val uri7 = "http://s.ytimg.com/yts/jsbin/www-widgetapi-vflylTdqs/www-widgetapi.js"
    val uri8 = "https://fonts.googleapis.com/css"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/wp-content/uploads/2016/02/sol-bg.png")
			.headers(headers_1),
            http("request_2")
			.get("/wp-content/themes/jkreativ-themes/public/img/pattern/grid_noise.png")
			.headers(headers_1),
            http("request_3")
			.get("/wp-content/themes/jkreativ-themes/public/fontawesome/fonts/fontawesome-webfont.woff2?v=4.6.3")
			.headers(headers_3),
            http("request_4")
			.get(uri5 + "")
			.headers(headers_4),
            http("request_5")
			.get("/wp-content/plugins/revslider/public/assets/js/extensions/revolution.extension.actions.min.js?version=5.4.1")
			.headers(headers_5),
            http("request_6")
			.get("/wp-content/plugins/revslider/public/assets/js/extensions/revolution.extension.slideanims.min.js?version=5.4.1")
			.headers(headers_5),
            http("request_7")
			.get("/wp-content/plugins/revslider/public/assets/js/extensions/revolution.extension.layeranimation.min.js?version=5.4.1")
			.headers(headers_5),
            http("request_8")
			.get("/wp-content/plugins/revslider/public/assets/js/extensions/revolution.extension.navigation.min.js?version=5.4.1")
			.headers(headers_5),
            http("request_9")
			.get("/wp-content/plugins/revslider/public/assets/js/extensions/revolution.extension.parallax.min.js?version=5.4.1")
			.headers(headers_5),
            http("request_10")
			.get(uri7 + "")
			.headers(headers_4),
            http("request_11")
			.get("/wp-content/plugins/revslider/public/assets/assets/coloredbg.png")
			.headers(headers_1),
            http("request_12")
			.get("/wp-content/plugins/revslider/public/assets/fonts/revicons/revicons.woff?5510888")
			.headers(headers_3),
            http("request_13")
			.get(uri1 + "")
			.headers(headers_4),
            http("request_14")
			.get("/wp-json/contact-form-7/v1/contact-forms/3598/refill")
			.headers(headers_14),
            http("request_15")
			.get("/wp-json/contact-form-7/v1/contact-forms/3575/refill")
			.headers(headers_14),
            http("request_16")
			.get("/wp-content/uploads/2018/04/10-150x150@2x.png")
			.headers(headers_1),
            http("request_17")
			.get("/wp-content/uploads/2018/05/Microsoft-Logo-150x150@2x.png")
			.headers(headers_1),
            http("request_18")
			.get("/wp-content/uploads/2014/07/Users_Circle_Woman-64-64x64.png")
			.headers(headers_1),
            http("request_19")
			.get("/wp-content/uploads/2014/07/Users_Circle_Man-64-64x64.png")
			.headers(headers_1),
            http("request_20")
			.get("/wp-content/plugins/contact-form-7/images/ajax-loader.gif")
			.headers(headers_1),
            http("request_21")
			.get("/wp-content/uploads/2018/03/science-fan-club-1.jpg")
			.headers(headers_1),
            http("request_22")
			.get("/wp-content/uploads/2017/09/tutions.jpg")
			.headers(headers_1),
            http("request_23")
			.get("/wp-content/uploads/2018/02/STEM-1.png")
			.headers(headers_1)))
		.pause(1)
		.exec(http("request_24")
			.get("/wp-content/uploads/2016/02/logo_loading-150x150.png")
			.headers(headers_1)
			.resources(http("request_25")
			.get("/wp-content/uploads/2016/02/logo_loading-270x270.png")
			.headers(headers_1)))

	setUp(scn.inject(rampUsers(100) over (100 seconds),holdFor(10 minute)).protocols(httpProtocol) 

}