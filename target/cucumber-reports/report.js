$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featurefile/MakeMyTrip.feature");
formatter.feature({
  "line": 1,
  "name": "Make my Trip Booking Flight",
  "description": "I want this feature to allow user to search flight",
  "id": "make-my-trip-booking-flight",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "To verify user is landing to Result Page after searching the flight",
  "description": "",
  "id": "make-my-trip-booking-flight;to-verify-user-is-landing-to-result-page-after-searching-the-flight",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@FlowTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on \"MakeMyTrip\" Dashboard Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user select One Way Trip",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user select origin city",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user select destination city",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user select departure date",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user select return date",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user select traveller\u0026class",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks on Searh Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user will land on Search Result Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "MakeMyTrip",
      "offset": 12
    }
  ],
  "location": "MakeMyTripStepDef.user_is_on_Dashboard_Page(String)"
});
formatter.result({
  "duration": 163165812900,
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 10.434\n  (Session info: chrome\u003d90.0.4430.93)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-P5JKHIML\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.93, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\sktou\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60845}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1fbb40c4699b5ead42f492231a2fc8ba\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat component.BaseClass.opentheapp(BaseClass.java:58)\r\n\tat component.BaseClass.getDriver(BaseClass.java:51)\r\n\tat stepdef.MakeMyTripStepDef.user_is_on_Dashboard_Page(MakeMyTripStepDef.java:20)\r\n\tat ✽.Given user is on \"MakeMyTrip\" Dashboard Page(src/test/resources/featurefile/MakeMyTrip.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MakeMyTripStepDef.user_select_One_Way_Trip()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MakeMyTripStepDef.user_select_origin_city()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MakeMyTripStepDef.user_select_destination_city()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MakeMyTripStepDef.user_select_departure_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MakeMyTripStepDef.user_select_return_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MakeMyTripStepDef.user_select_traveller_class()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MakeMyTripStepDef.user_clicks_on_Searh_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MakeMyTripStepDef.user_will_land_on_Search_Result_Page()"
});
formatter.result({
  "status": "skipped"
});
});