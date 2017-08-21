
package views.html.template

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object principal extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <!-- Meta, title, CSS, favicons, etc. -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        """),format.raw/*10.62*/("""
        """),format.raw/*11.9*/("""<title>"""),_display_(/*11.17*/title),format.raw/*11.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("css/bootstrap.css")),format.raw/*12.98*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.versioned("css/font-awesome.css")),format.raw/*13.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("css/nprogress.css")),format.raw/*14.98*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("css/green.css")),format.raw/*15.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("css/prettify.css")),format.raw/*16.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.versioned("css/select2.css")),format.raw/*17.96*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("css/switchery.css")),format.raw/*18.98*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("css/starrr.css")),format.raw/*19.95*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("css/daterangepicker.css")),format.raw/*20.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("css/custom.css")),format.raw/*21.95*/("""">
                
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*23.59*/routes/*23.65*/.Assets.versioned("images/favicon.png")),format.raw/*23.104*/("""">
    </head>    
    <body class="nav-md">
        <div class="container body">
            <div class="main_container">

<!-- Menu 01 -->                
                <div class="col-md-3 left_col">
                  <div class="left_col scroll-view">
                    <div class="navbar nav_title" style="border: 0;">
                      <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>Gentelella Alela!</span></a>
                    </div>

                    <div class="clearfix"></div>

                    <!-- menu profile quick info -->
                    <div class="profile clearfix">
                      <div class="profile_pic">
                        <img src="images/img.jpg" alt="..." class="img-circle profile_img">
                      </div>
                      <div class="profile_info">
                        <span>Welcome,</span>
                        <h2>John Doe</h2>
                      </div>
                    </div>
                    <!-- /menu profile quick info -->

                    <br />

                    <!-- sidebar menu -->
                    <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                      <div class="menu_section">
                        <h3>General</h3>
                        <ul class="nav side-menu">
                          <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                              <li><a href="index.html">Dashboard</a></li>
                              <li><a href="index2.html">Dashboard2</a></li>
                              <li><a href="index3.html">Dashboard3</a></li>
                            </ul>
                          </li>
                          <li><a><i class="fa fa-edit"></i> Forms <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                              <li><a href="item">Item Form</a></li>
                              <li><a href="form_advanced.html">Advanced Components</a></li>
                              <li><a href="form_validation.html">Form Validation</a></li>
                              <li><a href="form_wizards.html">Form Wizard</a></li>
                              <li><a href="form_upload.html">Form Upload</a></li>
                              <li><a href="form_buttons.html">Form Buttons</a></li>
                            </ul>
                          </li>
                          <li><a><i class="fa fa-desktop"></i> UI Elements <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                              <li><a href="general_elements.html">General Elements</a></li>
                              <li><a href="media_gallery.html">Media Gallery</a></li>
                              <li><a href="typography.html">Typography</a></li>
                              <li><a href="icons.html">Icons</a></li>
                              <li><a href="glyphicons.html">Glyphicons</a></li>
                              <li><a href="widgets.html">Widgets</a></li>
                              <li><a href="invoice.html">Invoice</a></li>
                              <li><a href="inbox.html">Inbox</a></li>
                              <li><a href="calendar.html">Calendar</a></li>
                            </ul>
                          </li>
                          <li><a><i class="fa fa-table"></i> Tables <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                              <li><a href="tables.html">Tables</a></li>
                              <li><a href="tables_dynamic.html">Table Dynamic</a></li>
                            </ul>
                          </li>
                          <li><a><i class="fa fa-bar-chart-o"></i> Data Presentation <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                              <li><a href="chartjs.html">Chart JS</a></li>
                              <li><a href="chartjs2.html">Chart JS2</a></li>
                              <li><a href="morisjs.html">Moris JS</a></li>
                              <li><a href="echarts.html">ECharts</a></li>
                              <li><a href="other_charts.html">Other Charts</a></li>
                            </ul>
                          </li>
                          <li><a><i class="fa fa-clone"></i>Layouts <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                              <li><a href="fixed_sidebar.html">Fixed Sidebar</a></li>
                              <li><a href="fixed_footer.html">Fixed Footer</a></li>
                            </ul>
                          </li>
                        </ul>
                      </div>
                      <div class="menu_section">
                        <h3>Live On</h3>
                        <ul class="nav side-menu">
                          <li><a><i class="fa fa-bug"></i> Additional Pages <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                              <li><a href="e_commerce.html">E-commerce</a></li>
                              <li><a href="projects.html">Projects</a></li>
                              <li><a href="project_detail.html">Project Detail</a></li>
                              <li><a href="contacts.html">Contacts</a></li>
                              <li><a href="profile.html">Profile</a></li>
                            </ul>
                          </li>
                          <li><a><i class="fa fa-windows"></i> Extras <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                              <li><a href="page_403.html">403 Error</a></li>
                              <li><a href="page_404.html">404 Error</a></li>
                              <li><a href="page_500.html">500 Error</a></li>
                              <li><a href="plain_page.html">Plain Page</a></li>
                              <li><a href="login.html">Login Page</a></li>
                              <li><a href="pricing_tables.html">Pricing Tables</a></li>
                            </ul>
                          </li>
                          <li><a><i class="fa fa-sitemap"></i> Multilevel Menu <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                                <li><a href="#level1_1">Level One</a>
                                <li><a>Level One<span class="fa fa-chevron-down"></span></a>
                                  <ul class="nav child_menu">
                                    <li class="sub_menu"><a href="level2.html">Level Two</a>
                                    </li>
                                    <li><a href="#level2_1">Level Two</a>
                                    </li>
                                    <li><a href="#level2_2">Level Two</a>
                                    </li>
                                  </ul>
                                </li>
                                <li><a href="#level1_2">Level One</a>
                                </li>
                            </ul>
                          </li>                  
                          <li><a href="javascript:void(0)"><i class="fa fa-laptop"></i> Landing Page <span class="label label-success pull-right">Coming Soon</span></a></li>
                        </ul>
                      </div>

                    </div>
                    <!-- /sidebar menu -->

                    <!-- /menu footer buttons -->
                    <div class="sidebar-footer hidden-small">
                      <a data-toggle="tooltip" data-placement="top" title="Settings">
                        <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                      </a>
                      <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                        <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                      </a>
                      <a data-toggle="tooltip" data-placement="top" title="Lock">
                        <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                      </a>
                      <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                        <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                      </a>
                    </div>
                    <!-- /menu footer buttons -->
                  </div>
                </div>

<!-- Menu 01 -->

<!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="images/img.jpg" alt="">John Doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> Profile</a></li>
                    <li>
                      <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">Help</a></li>
                    <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>

                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <div class="text-center">
                        <a>
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

        """),_display_(/*274.10*/content),format.raw/*274.17*/("""




            """),format.raw/*279.13*/("""<!-- footer content -->
            <footer>
              <div class="pull-right">
                Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
              </div>
              <div class="clearfix"></div>
            </footer>
            <!-- /footer content -->
            </div>
        </div>

        <script src=""""),_display_(/*290.23*/routes/*290.29*/.Assets.versioned("js/jquery.js")),format.raw/*290.62*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*291.23*/routes/*291.29*/.Assets.versioned("js/bootstrap.js")),format.raw/*291.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*292.23*/routes/*292.29*/.Assets.versioned("js/fastclick.js")),format.raw/*292.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*293.23*/routes/*293.29*/.Assets.versioned("js/nprogress.js")),format.raw/*293.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*294.23*/routes/*294.29*/.Assets.versioned("js/bootstrap-progressbar.js")),format.raw/*294.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*295.23*/routes/*295.29*/.Assets.versioned("js/icheck.js")),format.raw/*295.62*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*296.23*/routes/*296.29*/.Assets.versioned("js/moment.js")),format.raw/*296.62*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*297.23*/routes/*297.29*/.Assets.versioned("js/daterangepicker.js")),format.raw/*297.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*298.23*/routes/*298.29*/.Assets.versioned("js/bootstrap-wysiwyg.min.js")),format.raw/*298.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*299.23*/routes/*299.29*/.Assets.versioned("js/jquery.hotkeys.js")),format.raw/*299.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*300.23*/routes/*300.29*/.Assets.versioned("js/prettify.js")),format.raw/*300.64*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*301.23*/routes/*301.29*/.Assets.versioned("js/jquery.tagsinput.js")),format.raw/*301.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*302.23*/routes/*302.29*/.Assets.versioned("js/switchery.min.js")),format.raw/*302.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*303.23*/routes/*303.29*/.Assets.versioned("js/select2.full.min.js")),format.raw/*303.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*304.23*/routes/*304.29*/.Assets.versioned("js/parsley.min.js")),format.raw/*304.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*305.23*/routes/*305.29*/.Assets.versioned("js/autosize.min.js")),format.raw/*305.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*306.23*/routes/*306.29*/.Assets.versioned("js/jquery.autocomplete.min.js")),format.raw/*306.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*307.23*/routes/*307.29*/.Assets.versioned("js/starrr.js")),format.raw/*307.62*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*308.23*/routes/*308.29*/.Assets.versioned("js/custom.js")),format.raw/*308.62*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*309.23*/routes/*309.29*/.Assets.versioned("javascripts/main.js")),format.raw/*309.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 17 01:11:33 COT 2017
                  SOURCE: /home/juan/workspace/CAOS/hiperion/app/views/template/principal.scala.html
                  HASH: d7ea9cd19c028f45a666e612551b8dae39d407bb
                  MATRIX: 966->1|1091->31|1118->32|1502->441|1538->450|1573->458|1599->463|1688->525|1703->531|1762->569|1845->625|1860->631|1923->672|2006->728|2021->734|2080->772|2163->828|2178->834|2233->868|2316->924|2331->930|2389->967|2472->1023|2487->1029|2544->1065|2627->1121|2642->1127|2701->1165|2784->1221|2799->1227|2855->1262|2938->1318|2953->1324|3019->1368|3102->1424|3117->1430|3173->1465|3278->1543|3293->1549|3354->1588|16603->14809|16632->14816|16678->14833|17071->15198|17087->15204|17142->15237|17227->15294|17243->15300|17301->15336|17386->15393|17402->15399|17460->15435|17545->15492|17561->15498|17619->15534|17704->15591|17720->15597|17790->15645|17875->15702|17891->15708|17946->15741|18031->15798|18047->15804|18102->15837|18187->15894|18203->15900|18267->15942|18352->15999|18368->16005|18438->16053|18523->16110|18539->16116|18602->16157|18687->16214|18703->16220|18760->16255|18845->16312|18861->16318|18926->16361|19011->16418|19027->16424|19089->16464|19174->16521|19190->16527|19255->16570|19340->16627|19356->16633|19416->16671|19501->16728|19517->16734|19578->16773|19663->16830|19679->16836|19751->16886|19836->16943|19852->16949|19907->16982|19992->17039|20008->17045|20063->17078|20148->17135|20164->17141|20226->17181
                  LINES: 28->1|33->1|34->2|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|55->23|55->23|55->23|306->274|306->274|311->279|322->290|322->290|322->290|323->291|323->291|323->291|324->292|324->292|324->292|325->293|325->293|325->293|326->294|326->294|326->294|327->295|327->295|327->295|328->296|328->296|328->296|329->297|329->297|329->297|330->298|330->298|330->298|331->299|331->299|331->299|332->300|332->300|332->300|333->301|333->301|333->301|334->302|334->302|334->302|335->303|335->303|335->303|336->304|336->304|336->304|337->305|337->305|337->305|338->306|338->306|338->306|339->307|339->307|339->307|340->308|340->308|340->308|341->309|341->309|341->309
                  -- GENERATED --
              */
          