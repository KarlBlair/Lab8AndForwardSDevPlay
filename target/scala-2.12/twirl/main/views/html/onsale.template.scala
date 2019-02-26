
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.products.ItemOnSale],List[models.products.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.products.ItemOnSale],categories: List[models.products.Category],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("On Sale",user)/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""
    """),format.raw/*3.5*/("""<h1>On sale here</h1>


    """),format.raw/*6.74*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""
    """),format.raw/*12.5*/("""<div class="col-sm-3">
		<h4>Categories</h4>
	        <ul class="list-group">
                    <a href = """"),_display_(/*15.33*/routes/*15.39*/.HomeController.onsale(0)),format.raw/*15.64*/("""" class="list-group-item">All Categories</a>
		        """),_display_(/*16.12*/for(c<-categories) yield /*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
			        """),format.raw/*17.12*/("""<a href = """"),_display_(/*17.24*/routes/*17.30*/.HomeController.onsale(c.getId())),format.raw/*17.63*/("""" class="list-group-item catheight">"""),_display_(/*17.100*/c/*17.101*/.getName),format.raw/*17.109*/("""
                        """),format.raw/*18.25*/("""<span class="badge">"""),_display_(/*18.46*/c/*18.47*/.getItems.size),format.raw/*18.61*/("""</span> 
                    </a>
			    """)))}),format.raw/*20.9*/("""
            """),format.raw/*21.13*/("""</ul>
    </div>

    <div class="col-sm-9">
        <h4>Note that all products are second hand, unless otherwise stated.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Image</th>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
            """),format.raw/*40.68*/("""
            """),_display_(/*41.14*/for(i<-items) yield /*41.27*/ {_display_(Seq[Any](format.raw/*41.29*/("""
               """),format.raw/*42.16*/("""<tr>
                    """),_display_(/*43.22*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*43.104*/ {_display_(Seq[Any](format.raw/*43.106*/("""
                        """),format.raw/*44.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*44.69*/(i.getId + "thumb.jpg")),format.raw/*44.92*/(""""/></td>
                    """)))}/*45.23*/else/*45.28*/{_display_(Seq[Any](format.raw/*45.29*/("""
                        """),format.raw/*46.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*47.22*/("""
                  """),format.raw/*48.19*/("""<td>"""),_display_(/*48.24*/i/*48.25*/.getId),format.raw/*48.31*/("""</td>
                  <td>"""),_display_(/*49.24*/i/*49.25*/.getName),format.raw/*49.33*/("""</td>
                  <td>"""),_display_(/*50.24*/i/*50.25*/.getDescription),format.raw/*50.40*/("""</td>
                  <td>"""),_display_(/*51.24*/i/*51.25*/.getStock),format.raw/*51.34*/("""</td>
                  <td>&euro; """),_display_(/*52.31*/("%.2f".format(i.getPrice))),format.raw/*52.58*/("""</td>

                  """),_display_(/*54.20*/if((user != null) && ("admin".equals(user.getRole())))/*54.74*/ {_display_(Seq[Any](format.raw/*54.76*/("""
                  """),format.raw/*55.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*57.18*/routes/*57.24*/.HomeController.updateItem(i.getId)),format.raw/*57.59*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*63.18*/routes/*63.24*/.HomeController.deleteItem(i.getId)),format.raw/*63.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
                  """)))}),format.raw/*67.20*/("""
               """),format.raw/*68.16*/("""</tr>
            """)))}),format.raw/*69.14*/("""
        
        """),format.raw/*71.9*/("""</tbody>
    </table>
    """),_display_(/*73.6*/if((user != null) && ("admin".equals(user.getRole())))/*73.60*/ {_display_(Seq[Any](format.raw/*73.62*/("""
    """),format.raw/*74.5*/("""<p>
        <a href=""""),_display_(/*75.19*/routes/*75.25*/.HomeController.addItem()),format.raw/*75.50*/("""">
            <button class="btn btn-primary">Add an item</button>
        </a>
    </p>
    """)))}),format.raw/*79.6*/("""
"""),format.raw/*80.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(items:List[models.products.ItemOnSale],categories:List[models.products.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(items,categories,user)

  def f:((List[models.products.ItemOnSale],List[models.products.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (items,categories,user) => apply(items,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 15:12:22 GMT 2019
                  SOURCE: /home/wdd/Desktop/Lab8AndForwardSDevPlay/app/views/onsale.scala.html
                  HASH: 4ea43602ca9e29c126bde141a844df0d9fa9b88f
                  MATRIX: 1024->1|1226->111|1254->131|1292->132|1323->137|1378->234|1406->237|1446->269|1485->271|1514->274|1577->312|1590->317|1625->332|1655->335|1693->343|1725->348|1862->458|1877->464|1923->489|2006->545|2040->563|2080->565|2120->577|2159->589|2174->595|2228->628|2293->665|2304->666|2334->674|2387->699|2435->720|2445->721|2480->735|2552->777|2593->790|3140->1364|3181->1378|3210->1391|3250->1393|3294->1409|3347->1435|3439->1517|3480->1519|3533->1544|3604->1588|3648->1611|3697->1642|3710->1647|3749->1648|3802->1673|3917->1757|3964->1776|3996->1781|4006->1782|4033->1788|4089->1817|4099->1818|4128->1826|4184->1855|4194->1856|4230->1871|4286->1900|4296->1901|4326->1910|4389->1946|4437->1973|4490->1999|4553->2053|4593->2055|4640->2074|4718->2125|4733->2131|4789->2166|5016->2366|5031->2372|5087->2407|5298->2587|5342->2603|5392->2622|5437->2640|5490->2667|5553->2721|5593->2723|5625->2728|5674->2750|5689->2756|5735->2781|5860->2876|5888->2877
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|71->40|72->41|72->41|72->41|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|78->47|79->48|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|85->54|85->54|85->54|86->55|88->57|88->57|88->57|94->63|94->63|94->63|98->67|99->68|100->69|102->71|104->73|104->73|104->73|105->74|106->75|106->75|106->75|110->79|111->80
                  -- GENERATED --
              */
          