// @SOURCE:/Users/patrick/Dropbox/sb-questionario/conf/routes
// @HASH:99870bc475d2373b64bd56d2c873d51a1841b7e2
// @DATE:Fri Aug 28 13:01:07 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:34
class ReverseAssets {
    

// @LINE:34
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseQuestionController {
    

// @LINE:15
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/question")
}
                                                

// @LINE:17
def findByQuiz(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/question/findByQuiz/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:16
def upsert(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/question")
}
                                                
    
}
                          

// @LINE:31
// @LINE:30
// @LINE:29
class ReverseUserController {
    

// @LINE:31
def logoff(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/logoff")
}
                                                

// @LINE:30
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/login")
}
                                                

// @LINE:29
def upsert(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/user")
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseQuizController {
    

// @LINE:11
def findById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/quiz/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:10
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/quiz")
}
                                                

// @LINE:12
def upsert(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/quiz")
}
                                                
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
// @LINE:6
def main(any:String): Call = {
   (any: @unchecked) match {
// @LINE:6
case (any) if any == "" => Call("GET", _prefix)
                                                        
// @LINE:7
case (any) if true => Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("any", dynamicString(any)))
                                                        
   }
}
                                                
    
}
                          

// @LINE:26
// @LINE:25
class ReverseAnswerController {
    

// @LINE:26
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/answer")
}
                                                

// @LINE:25
def upsert(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/answer")
}
                                                
    
}
                          

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseOptionController {
    

// @LINE:20
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/option")
}
                                                

// @LINE:22
def findByQuestion(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/option/findByQuestion/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:21
def upsert(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/option")
}
                                                
    
}
                          
}
                  


// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:34
class ReverseAssets {
    

// @LINE:34
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseQuestionController {
    

// @LINE:15
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.QuestionController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/question"})
      }
   """
)
                        

// @LINE:17
def findByQuiz : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.QuestionController.findByQuiz",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/question/findByQuiz/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:16
def upsert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.QuestionController.upsert",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/question"})
      }
   """
)
                        
    
}
              

// @LINE:31
// @LINE:30
// @LINE:29
class ReverseUserController {
    

// @LINE:31
def logoff : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.logoff",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/logoff"})
      }
   """
)
                        

// @LINE:30
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/login"})
      }
   """
)
                        

// @LINE:29
def upsert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.upsert",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user"})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseQuizController {
    

// @LINE:11
def findById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.QuizController.findById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/quiz/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:10
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.QuizController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/quiz"})
      }
   """
)
                        

// @LINE:12
def upsert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.QuizController.upsert",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/quiz"})
      }
   """
)
                        
    
}
              

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
// @LINE:6
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.main",
   """
      function(any) {
      if (any == """ + implicitly[JavascriptLitteral[String]].to("") + """) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("any", encodeURIComponent(any))})
      }
      }
   """
)
                        
    
}
              

// @LINE:26
// @LINE:25
class ReverseAnswerController {
    

// @LINE:26
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnswerController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/answer"})
      }
   """
)
                        

// @LINE:25
def upsert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnswerController.upsert",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/answer"})
      }
   """
)
                        
    
}
              

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseOptionController {
    

// @LINE:20
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OptionController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/option"})
      }
   """
)
                        

// @LINE:22
def findByQuestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OptionController.findByQuestion",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/option/findByQuestion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:21
def upsert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OptionController.upsert",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/option"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:34
class ReverseAssets {
    

// @LINE:34
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseQuestionController {
    

// @LINE:15
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.QuestionController.list(), HandlerDef(this, "controllers.QuestionController", "list", Seq(), "GET", """Question""", _prefix + """api/question""")
)
                      

// @LINE:17
def findByQuiz(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.QuestionController.findByQuiz(id), HandlerDef(this, "controllers.QuestionController", "findByQuiz", Seq(classOf[Long]), "GET", """""", _prefix + """api/question/findByQuiz/$id<[^/]+>""")
)
                      

// @LINE:16
def upsert(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.QuestionController.upsert(), HandlerDef(this, "controllers.QuestionController", "upsert", Seq(), "POST", """""", _prefix + """api/question""")
)
                      
    
}
                          

// @LINE:31
// @LINE:30
// @LINE:29
class ReverseUserController {
    

// @LINE:31
def logoff(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.logoff(), HandlerDef(this, "controllers.UserController", "logoff", Seq(), "POST", """""", _prefix + """api/logoff""")
)
                      

// @LINE:30
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.authenticate(), HandlerDef(this, "controllers.UserController", "authenticate", Seq(), "POST", """""", _prefix + """api/login""")
)
                      

// @LINE:29
def upsert(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.upsert(), HandlerDef(this, "controllers.UserController", "upsert", Seq(), "POST", """User""", _prefix + """api/user""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseQuizController {
    

// @LINE:11
def findById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.QuizController.findById(id), HandlerDef(this, "controllers.QuizController", "findById", Seq(classOf[Long]), "GET", """""", _prefix + """api/quiz/$id<[^/]+>""")
)
                      

// @LINE:10
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.QuizController.list(), HandlerDef(this, "controllers.QuizController", "list", Seq(), "GET", """Quiz""", _prefix + """api/quiz""")
)
                      

// @LINE:12
def upsert(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.QuizController.upsert(), HandlerDef(this, "controllers.QuizController", "upsert", Seq(), "POST", """""", _prefix + """api/quiz""")
)
                      
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def main(any:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.main(any), HandlerDef(this, "controllers.Application", "main", Seq(classOf[String]), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:26
// @LINE:25
class ReverseAnswerController {
    

// @LINE:26
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnswerController.list(), HandlerDef(this, "controllers.AnswerController", "list", Seq(), "GET", """""", _prefix + """api/answer""")
)
                      

// @LINE:25
def upsert(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnswerController.upsert(), HandlerDef(this, "controllers.AnswerController", "upsert", Seq(), "POST", """Answer""", _prefix + """api/answer""")
)
                      
    
}
                          

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseOptionController {
    

// @LINE:20
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OptionController.list(), HandlerDef(this, "controllers.OptionController", "list", Seq(), "GET", """Option""", _prefix + """api/option""")
)
                      

// @LINE:22
def findByQuestion(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OptionController.findByQuestion(id), HandlerDef(this, "controllers.OptionController", "findByQuestion", Seq(classOf[Long]), "GET", """""", _prefix + """api/option/findByQuestion/$id<[^/]+>""")
)
                      

// @LINE:21
def upsert(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OptionController.upsert(), HandlerDef(this, "controllers.OptionController", "upsert", Seq(), "POST", """""", _prefix + """api/option""")
)
                      
    
}
                          
}
        
    