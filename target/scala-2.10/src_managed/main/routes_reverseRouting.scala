// @SOURCE:C:/Users/Akash Singh/Desktop/ShopList/conf/routes
// @HASH:c0d0f0469b0fc5aa418fe85b0f44d1865b8bc447
// @DATE:Sat Apr 12 21:43:48 IST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:38
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:38
class ReverseAssets {
    

// @LINE:38
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplicationController {
    

// @LINE:7
def about(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
class ReverseProductController {
    

// @LINE:32
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "product/add")
}
                                                

// @LINE:31
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "product/add")
}
                                                

// @LINE:33
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "product/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:34
def afterDeletion(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "product/delete")
}
                                                
    
}
                          

// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseUserController {
    

// @LINE:25
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user/create")
}
                                                

// @LINE:22
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/logout")
}
                                                

// @LINE:24
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/create")
}
                                                

// @LINE:21
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user/login")
}
                                                

// @LINE:20
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/login")
}
                                                
    
}
                          

// @LINE:8
class ReverseSearchController {
    

// @LINE:8
def search(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "search")
}
                                                
    
}
                          

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseShopController {
    

// @LINE:12
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop/create")
}
                                                

// @LINE:15
def display(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:11
def viewAll(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop/viewall" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:13
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shop/create")
}
                                                
    
}
                          
}
                  


// @LINE:38
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:38
class ReverseAssets {
    

// @LINE:38
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:7
// @LINE:6
class ReverseApplicationController {
    

// @LINE:7
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApplicationController.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApplicationController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
class ReverseProductController {
    

// @LINE:32
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product/add"})
      }
   """
)
                        

// @LINE:31
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/add"})
      }
   """
)
                        

// @LINE:33
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:34
def afterDeletion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.afterDeletion",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/delete"})
      }
   """
)
                        
    
}
              

// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseUserController {
    

// @LINE:25
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/create"})
      }
   """
)
                        

// @LINE:22
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/logout"})
      }
   """
)
                        

// @LINE:24
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/create"})
      }
   """
)
                        

// @LINE:21
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/login"})
      }
   """
)
                        

// @LINE:20
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/login"})
      }
   """
)
                        
    
}
              

// @LINE:8
class ReverseSearchController {
    

// @LINE:8
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchController.search",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseShopController {
    

// @LINE:12
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShopController.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/create"})
      }
   """
)
                        

// @LINE:15
def display : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShopController.display",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def viewAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShopController.viewAll",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/viewall" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:13
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShopController.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/create"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:38
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:38
class ReverseAssets {
    

// @LINE:38
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplicationController {
    

// @LINE:7
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApplicationController.about(), HandlerDef(this, "controllers.ApplicationController", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApplicationController.index(), HandlerDef(this, "controllers.ApplicationController", "index", Seq(), "GET", """ Application Urls""", _prefix + """""")
)
                      
    
}
                          

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
class ReverseProductController {
    

// @LINE:32
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.save(), HandlerDef(this, "controllers.ProductController", "save", Seq(), "POST", """""", _prefix + """product/add""")
)
                      

// @LINE:31
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.blank(), HandlerDef(this, "controllers.ProductController", "blank", Seq(), "GET", """ Product Urls""", _prefix + """product/add""")
)
                      

// @LINE:33
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.delete(id), HandlerDef(this, "controllers.ProductController", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """product/delete/$id<[^/]+>""")
)
                      

// @LINE:34
def afterDeletion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.afterDeletion(), HandlerDef(this, "controllers.ProductController", "afterDeletion", Seq(), "GET", """""", _prefix + """product/delete""")
)
                      
    
}
                          

// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseUserController {
    

// @LINE:25
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.submit(), HandlerDef(this, "controllers.UserController", "submit", Seq(), "POST", """""", _prefix + """user/create""")
)
                      

// @LINE:22
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.logout(), HandlerDef(this, "controllers.UserController", "logout", Seq(), "GET", """""", _prefix + """user/logout""")
)
                      

// @LINE:24
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.blank(), HandlerDef(this, "controllers.UserController", "blank", Seq(), "GET", """""", _prefix + """user/create""")
)
                      

// @LINE:21
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.authenticate(), HandlerDef(this, "controllers.UserController", "authenticate", Seq(), "POST", """""", _prefix + """user/login""")
)
                      

// @LINE:20
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.login(), HandlerDef(this, "controllers.UserController", "login", Seq(), "GET", """ User Urls""", _prefix + """user/login""")
)
                      
    
}
                          

// @LINE:8
class ReverseSearchController {
    

// @LINE:8
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchController.search(), HandlerDef(this, "controllers.SearchController", "search", Seq(), "POST", """""", _prefix + """search""")
)
                      
    
}
                          

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseShopController {
    

// @LINE:12
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShopController.blank(), HandlerDef(this, "controllers.ShopController", "blank", Seq(), "GET", """""", _prefix + """shop/create""")
)
                      

// @LINE:15
def display(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShopController.display(id), HandlerDef(this, "controllers.ShopController", "display", Seq(classOf[Int]), "GET", """POST    /shop/update/:id           controllers.ShopController.update(id:Int)""", _prefix + """shop/$id<[^/]+>""")
)
                      

// @LINE:11
def viewAll(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShopController.viewAll(p, s, o, f), HandlerDef(this, "controllers.ShopController", "viewAll", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """ Shop Urls""", _prefix + """shop/viewall""")
)
                      

// @LINE:13
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShopController.submit(), HandlerDef(this, "controllers.ShopController", "submit", Seq(), "POST", """""", _prefix + """shop/create""")
)
                      
    
}
                          
}
        
    