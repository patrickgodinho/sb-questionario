// @SOURCE:/Users/patrick/Dropbox/sb-questionario/conf/routes
// @HASH:99870bc475d2373b64bd56d2c873d51a1841b7e2
// @DATE:Fri Aug 28 13:01:07 BRT 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_main0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_main1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("any", """[^/]+""",true))))
        

// @LINE:10
private[this] lazy val controllers_QuizController_list2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/quiz"))))
        

// @LINE:11
private[this] lazy val controllers_QuizController_findById3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/quiz/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:12
private[this] lazy val controllers_QuizController_upsert4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/quiz"))))
        

// @LINE:15
private[this] lazy val controllers_QuestionController_list5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/question"))))
        

// @LINE:16
private[this] lazy val controllers_QuestionController_upsert6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/question"))))
        

// @LINE:17
private[this] lazy val controllers_QuestionController_findByQuiz7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/question/findByQuiz/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:20
private[this] lazy val controllers_OptionController_list8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/option"))))
        

// @LINE:21
private[this] lazy val controllers_OptionController_upsert9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/option"))))
        

// @LINE:22
private[this] lazy val controllers_OptionController_findByQuestion10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/option/findByQuestion/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_AnswerController_upsert11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/answer"))))
        

// @LINE:26
private[this] lazy val controllers_AnswerController_list12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/answer"))))
        

// @LINE:29
private[this] lazy val controllers_UserController_upsert13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/user"))))
        

// @LINE:30
private[this] lazy val controllers_UserController_authenticate14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/login"))))
        

// @LINE:31
private[this] lazy val controllers_UserController_logoff15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/logoff"))))
        

// @LINE:34
private[this] lazy val controllers_Assets_at16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.main(any:String = "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$any<[^/]+>""","""controllers.Application.main(any:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/quiz""","""controllers.QuizController.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/quiz/$id<[^/]+>""","""controllers.QuizController.findById(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/quiz""","""controllers.QuizController.upsert()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/question""","""controllers.QuestionController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/question""","""controllers.QuestionController.upsert()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/question/findByQuiz/$id<[^/]+>""","""controllers.QuestionController.findByQuiz(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/option""","""controllers.OptionController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/option""","""controllers.OptionController.upsert()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/option/findByQuestion/$id<[^/]+>""","""controllers.OptionController.findByQuestion(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/answer""","""controllers.AnswerController.upsert()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/answer""","""controllers.AnswerController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/user""","""controllers.UserController.upsert()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/login""","""controllers.UserController.authenticate()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/logoff""","""controllers.UserController.logoff()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_main0(params) => {
   call(Param[String]("any", Right(""))) { (any) =>
        invokeHandler(controllers.Application.main(any), HandlerDef(this, "controllers.Application", "main", Seq(classOf[String]),"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_main1(params) => {
   call(params.fromPath[String]("any", None)) { (any) =>
        invokeHandler(controllers.Application.main(any), HandlerDef(this, "controllers.Application", "main", Seq(classOf[String]),"GET", """""", Routes.prefix + """$any<[^/]+>"""))
   }
}
        

// @LINE:10
case controllers_QuizController_list2(params) => {
   call { 
        invokeHandler(controllers.QuizController.list(), HandlerDef(this, "controllers.QuizController", "list", Nil,"GET", """Quiz""", Routes.prefix + """api/quiz"""))
   }
}
        

// @LINE:11
case controllers_QuizController_findById3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.QuizController.findById(id), HandlerDef(this, "controllers.QuizController", "findById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """api/quiz/$id<[^/]+>"""))
   }
}
        

// @LINE:12
case controllers_QuizController_upsert4(params) => {
   call { 
        invokeHandler(controllers.QuizController.upsert(), HandlerDef(this, "controllers.QuizController", "upsert", Nil,"POST", """""", Routes.prefix + """api/quiz"""))
   }
}
        

// @LINE:15
case controllers_QuestionController_list5(params) => {
   call { 
        invokeHandler(controllers.QuestionController.list(), HandlerDef(this, "controllers.QuestionController", "list", Nil,"GET", """Question""", Routes.prefix + """api/question"""))
   }
}
        

// @LINE:16
case controllers_QuestionController_upsert6(params) => {
   call { 
        invokeHandler(controllers.QuestionController.upsert(), HandlerDef(this, "controllers.QuestionController", "upsert", Nil,"POST", """""", Routes.prefix + """api/question"""))
   }
}
        

// @LINE:17
case controllers_QuestionController_findByQuiz7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.QuestionController.findByQuiz(id), HandlerDef(this, "controllers.QuestionController", "findByQuiz", Seq(classOf[Long]),"GET", """""", Routes.prefix + """api/question/findByQuiz/$id<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_OptionController_list8(params) => {
   call { 
        invokeHandler(controllers.OptionController.list(), HandlerDef(this, "controllers.OptionController", "list", Nil,"GET", """Option""", Routes.prefix + """api/option"""))
   }
}
        

// @LINE:21
case controllers_OptionController_upsert9(params) => {
   call { 
        invokeHandler(controllers.OptionController.upsert(), HandlerDef(this, "controllers.OptionController", "upsert", Nil,"POST", """""", Routes.prefix + """api/option"""))
   }
}
        

// @LINE:22
case controllers_OptionController_findByQuestion10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.OptionController.findByQuestion(id), HandlerDef(this, "controllers.OptionController", "findByQuestion", Seq(classOf[Long]),"GET", """""", Routes.prefix + """api/option/findByQuestion/$id<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_AnswerController_upsert11(params) => {
   call { 
        invokeHandler(controllers.AnswerController.upsert(), HandlerDef(this, "controllers.AnswerController", "upsert", Nil,"POST", """Answer""", Routes.prefix + """api/answer"""))
   }
}
        

// @LINE:26
case controllers_AnswerController_list12(params) => {
   call { 
        invokeHandler(controllers.AnswerController.list(), HandlerDef(this, "controllers.AnswerController", "list", Nil,"GET", """""", Routes.prefix + """api/answer"""))
   }
}
        

// @LINE:29
case controllers_UserController_upsert13(params) => {
   call { 
        invokeHandler(controllers.UserController.upsert(), HandlerDef(this, "controllers.UserController", "upsert", Nil,"POST", """User""", Routes.prefix + """api/user"""))
   }
}
        

// @LINE:30
case controllers_UserController_authenticate14(params) => {
   call { 
        invokeHandler(controllers.UserController.authenticate(), HandlerDef(this, "controllers.UserController", "authenticate", Nil,"POST", """""", Routes.prefix + """api/login"""))
   }
}
        

// @LINE:31
case controllers_UserController_logoff15(params) => {
   call { 
        invokeHandler(controllers.UserController.logoff(), HandlerDef(this, "controllers.UserController", "logoff", Nil,"POST", """""", Routes.prefix + """api/logoff"""))
   }
}
        

// @LINE:34
case controllers_Assets_at16(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     