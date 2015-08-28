
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

<!DOCTYPE html>

<html data-ng-app="app" data-ng-controller="AppCtrl">
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta name="viewport" content="width=1000, initial-scale=1.0, maximum-scale=1.0">
	<meta name="fragment" content="!" />
	<base href="/" />
	<title>questionar.io</title>
	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.47*/routes/*13.53*/.Assets.at("stylesheets/main.css"))),format.raw/*13.87*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.47*/routes/*14.53*/.Assets.at("stylesheets/flatui/vendor/bootstrap.min.css"))),format.raw/*14.110*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.47*/routes/*15.53*/.Assets.at("stylesheets/flatui/flat-ui.min.css"))),format.raw/*15.101*/("""">
	<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*16.52*/routes/*16.58*/.Assets.at("images/favicon.png"))),format.raw/*16.90*/("""">
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,800,700,400italic,600italic,700italic,800italic,300italic" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="content">
		<header>
			<div class="row">
				<div class="col-xs-12">
					<!-- <nav class="navbar navbar-inverse navbar-embossed navbar-fixed-top" role="navigation"> -->
					<nav class="navbar navbar-inverse navbar-embossed" role="navigation" data-ng-controller="LoginCtrl">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-01">
								<span class="sr-only">Toggle navigation</span>
							</button>
							<a class="navbar-brand" href="#">Questionar.io</a>
						</div>
						<div class="collapse navbar-collapse" id="navbar-collapse-01">
							<ul class="nav navbar-nav navbar-left">
								<li><a data-ng-click="createQuiz()" href="">Crie já o seu<span class="navbar-unread">1</span></a></li>
							</ul>
							<ul class="nav navbar-nav navbar-right">
                            <li data-ng-hide="userEmail != null"><a href="" data-toggle="modal" data-target="#modal-login">Entrar</a></li>
								<li class="dropdown">
									<a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">"""),format.raw/*39.125*/("""{"""),format.raw/*39.126*/("""{"""),format.raw/*39.127*/("""userEmail"""),format.raw/*39.136*/("""}"""),format.raw/*39.137*/("""}"""),format.raw/*39.138*/("""<span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="#">Ver meus questionários</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="" data-ng-click="logoff()">Sair</a></li>
									</ul>
								</div><!-- /.navbar-collapse -->
							</nav><!-- /navbar -->
						</div>
					</div>
				</header>
                <div class="modal fade" id="modal-login" data-ng-controller="LoginCtrl">
                    <div class="modal-dialog modal-sm">
                        <div class="modal-content">
                          <div class="modal-body">
                                <div class="login-form">
                                    <div class="form-group">
                                        <input type="text"  data-ng-model="login.email" class="form-control login-field" value="" placeholder="Digite seu e-mail" id="login-name">
                                        <label class="login-field-icon fui-user" for="login-name"></label>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" data-ng-model="login.password" class="form-control login-field" value="" placeholder="Senha" id="login-pass">
                                        <label class="login-field-icon fui-lock" for="login-pass"></label>
                                    </div>
                                    <a class="btn btn-primary btn-lg btn-block" data-ng-click="login()">Entrar</a>
                                    <a class="login-link" href="/usuario" data-ng-click="close()">Novo por aqui? Cadastre-se</a>
                                    <a class="login-link" href="" data-dismiss="modal">Voltar</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
				<div class="row ">
					<div class="col-xs-offset-1 col-xs-10 row-content">
						<content>
							<div data-ng-view="view"></div>
						</content>	
					</div>
				</div>
				<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
				<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.1.5/angular.min.js"></script>
                <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.1.5/angular-resource.min.js"></script>
                <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.1.5/angular-cookies.min.js"></script>
				<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.1.5/angular-sanitize.min.js"></script>
				
				<script src=""""),_display_(Seq[Any](/*84.19*/routes/*84.25*/.Assets.at("javascripts/app/app.js"))),format.raw/*84.61*/("""" type="text/javascript"></script>
				<script src=""""),_display_(Seq[Any](/*85.19*/routes/*85.25*/.Assets.at("javascripts/flatui/flat-ui.min.js"))),format.raw/*85.72*/("""" type="text/javascript"></script>
				<script src=""""),_display_(Seq[Any](/*86.19*/routes/*86.25*/.Assets.at("javascripts/app/controllers/AppCtrl.js"))),format.raw/*86.77*/("""" type="text/javascript"></script>
                <script src=""""),_display_(Seq[Any](/*87.31*/routes/*87.37*/.Assets.at("javascripts/app/controllers/QuizCtrl.js"))),format.raw/*87.90*/("""" type="text/javascript"></script>
                <script src=""""),_display_(Seq[Any](/*88.31*/routes/*88.37*/.Assets.at("javascripts/app/controllers/UserCtrl.js"))),format.raw/*88.90*/("""" type="text/javascript"></script>
                <script src=""""),_display_(Seq[Any](/*89.31*/routes/*89.37*/.Assets.at("javascripts/app/controllers/LoginCtrl.js"))),format.raw/*89.91*/("""" type="text/javascript"></script>
				<script src=""""),_display_(Seq[Any](/*90.19*/routes/*90.25*/.Assets.at("javascripts/app/controllers/NavCtrl.js"))),format.raw/*90.77*/("""" type="text/javascript"></script>
			</div>
			<div class="row">
			<footer class="footer ">

					<p class="first">® Patrick Godinho - (034) 96888388</p>		
				</footer>
			</div>

		</body>

		</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 28 14:37:16 BRT 2015
                    SOURCE: /Users/patrick/Dropbox/sb-questionario/app/views/main.scala.html
                    HASH: fd99bc67de3cb9f2f37768962339e6b34da48f32
                    MATRIX: 766->1|861->3|1285->391|1300->397|1356->431|1441->480|1456->486|1536->543|1621->592|1636->598|1707->646|1797->700|1812->706|1866->738|3237->2080|3267->2081|3297->2082|3335->2091|3365->2092|3395->2093|6075->4737|6090->4743|6148->4779|6237->4832|6252->4838|6321->4885|6410->4938|6425->4944|6499->4996|6600->5061|6615->5067|6690->5120|6791->5185|6806->5191|6881->5244|6982->5309|6997->5315|7073->5369|7162->5422|7177->5428|7251->5480
                    LINES: 26->1|29->1|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|67->39|67->39|67->39|67->39|67->39|67->39|112->84|112->84|112->84|113->85|113->85|113->85|114->86|114->86|114->86|115->87|115->87|115->87|116->88|116->88|116->88|117->89|117->89|117->89|118->90|118->90|118->90
                    -- GENERATED --
                */
            