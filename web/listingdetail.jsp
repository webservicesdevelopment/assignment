<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->

    <head>
        <meta charset="utf-8" />
        <!-- Set the viewport width to device width for mobile -->
        <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0" />
        <title>Vacate</title>

        <link rel="stylesheet" type="text/css" href="style.css">
        <link href='http://fonts.googleapis.com/css?family=Paytone+One|Open+Sans:400italic,600italic,700italic,400,600,700' rel='stylesheet' type='text/css'>

    </head>

    <body>
        <div class="main" id="listingdetail">
            <div class="banner">
                <div class="logo">
                    <a href="#"><img src="images/vacate-white.png"/></a>
                </div>

                <nav class="site-nav">
                    <ul>
                        <li><a href="#">HELP</a></li>
                        <li><a href="#">SIGN UP</a></li>
                        <li><a href="login.jsp">LOGIN</a></li>
                    </ul>
                </nav>
            </div>

            <div class="listingcontent">
                <div class="listing">
                    <c:set var="xml">
                        <property id='0'>
                            <lister>user1</lister>
                            <location>Sydney</location>
                            <type>whole house</type>
                            <availability>available</availability>
                            <numguests>6</numguests>
                            <address>123 Street</address>
                            <description>[property description]</description>
                            <enquires>
                                <enquiry>
                                    <name>Bob</name>
                                    <email>bob@email.com</email>
                                    <date>18-10-2016</date>
                                    <message>[enquiry message]</message>
                                </enquiry>
                            </enquires>
                        </property>

                    </c:set>
                    <c:import var="xslt" url="property.xsl"/>
                    <x:transform doc="${xml}" xslt="${xslt}"/>
                </div>
            </div>

            <div class="promo">
            </div>

            

        </div>



    </body>
</html>
