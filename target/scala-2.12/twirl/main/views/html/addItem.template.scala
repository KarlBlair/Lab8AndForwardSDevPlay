
package views.html

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

object addItem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.ItemOnSale],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemForm: Form[models.products.ItemOnSale],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Item",user)/*6.23*/{_display_(Seq[Any](format.raw/*6.24*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new item</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addItemSubmit(), 'class -> "form-horizontal", 'role -> "form")/*12.102*/ {_display_(Seq[Any](format.raw/*12.104*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""

        """),format.raw/*17.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the itemForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*21.24*/select),format.raw/*21.30*/(""" """),format.raw/*21.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->
            """),_display_(/*24.14*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*24.86*/("""
            """),format.raw/*25.13*/("""<p><strong>Categories</strong></p>
            """),_display_(/*26.14*/for((value, name) <- products.Category.options) yield /*26.61*/ {_display_(Seq[Any](format.raw/*26.63*/("""
                """),format.raw/*27.17*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*27.67*/value),format.raw/*27.72*/(""""  
                    """),_display_(/*28.22*/if(itemForm("id").getValue.isPresent && itemForm("id").getValue.get != "")/*28.96*/ {_display_(Seq[Any](format.raw/*28.98*/(""" 
                        """),_display_(/*29.26*/if(products.Category.inCategory(value.toLong, itemForm("id").getValue.get.toLong))/*29.108*/ {_display_(Seq[Any](format.raw/*29.110*/("""
                            """),format.raw/*30.29*/("""checked
                        """)))}),format.raw/*31.26*/("""
                    """)))}),format.raw/*32.22*/(""" 
                """),format.raw/*33.17*/("""/> """),_display_(/*33.21*/name),format.raw/*33.25*/(""" """),format.raw/*33.26*/("""</br>
            """)))}),format.raw/*34.14*/("""
            """),format.raw/*35.13*/("""</p>
            
            """),_display_(/*37.14*/inputText(itemForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*37.100*/("""
            """),_display_(/*38.14*/inputText(itemForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*38.88*/("""
            """),_display_(/*39.14*/inputText(itemForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*39.88*/("""

            """),_display_(/*41.14*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*41.75*/("""
            
            """),format.raw/*43.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update item" class="btn btn-primary">
                <a href=""""),_display_(/*49.27*/routes/*49.33*/.HomeController.onsale(0)),format.raw/*49.58*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*53.6*/(""" """),format.raw/*53.24*/("""
""")))}),format.raw/*54.2*/(""" """))
      }
    }
  }

  def render(itemForm:Form[models.products.ItemOnSale],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,user)

  def f:((Form[models.products.ItemOnSale],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,user) => apply(itemForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 11:36:28 GMT 2019
                  SOURCE: /home/wdd/Desktop/Lab8AndForwardSDevPlay/app/views/addItem.scala.html
                  HASH: 53e43f4f16318656150537c54dffadcbbcf6a667
                  MATRIX: 994->1|1135->73|1179->70|1207->89|1234->91|1263->112|1301->113|1332->118|1651->411|1757->507|1798->509|1835->546|1872->645|1909->655|1922->659|1953->669|1990->679|2364->1026|2391->1032|2420->1033|2672->1258|2765->1330|2806->1343|2881->1391|2944->1438|2984->1440|3029->1457|3106->1507|3132->1512|3184->1537|3267->1611|3307->1613|3361->1640|3453->1722|3494->1724|3551->1753|3615->1786|3668->1808|3714->1826|3745->1830|3770->1834|3799->1835|3849->1854|3890->1867|3948->1898|4056->1984|4097->1998|4192->2072|4233->2086|4328->2160|4370->2175|4452->2236|4506->2262|4898->2627|4913->2633|4959->2658|5119->2788|5148->2806|5180->2808
                  LINES: 28->1|31->4|34->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|48->17|52->21|52->21|52->21|55->24|55->24|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|62->31|63->32|64->33|64->33|64->33|64->33|65->34|66->35|68->37|68->37|69->38|69->38|70->39|70->39|72->41|72->41|74->43|80->49|80->49|80->49|84->53|84->53|85->54
                  -- GENERATED --
              */
          