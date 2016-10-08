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
<div class="main" id="listings">
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

    <div class="searchbar">	
        <form class="search">
            <select name="Listing Type" class="listtype" class="placeholders">
                <option disabled selected hidden><div class="h3">Listing Type</div></option>
                <option>ANY</option>
                <option>Type 1</option>
                <option>Type 2</option>
                <option>Type 3</option>
            </select>

            <select name="Min. Guests" class="minguests">
                <option disabled selected hidden>Min. Guests</option>
                <option>ANY</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
            </select>

            <select name="Max. Guests" class="maxguests">
                <option disabled selected hidden>Max. Guests</option>
                <option>ANY</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
            </select>

            <input type="submit" value="SEARCH" class="search-btn">
        </form>
     </div>
</div>


<div class="content">
    <div class="listings">
        <h1 style="margin: 40px 0;"> All Listings </h1>
        <c:import var="xml" url="./WEB-INF/properties.xml"/>
        <c:import var="xslt" url="properties.xsl"/>
        <x:transform doc="${xml}" xslt="${xslt}"/>
    </div>
</div>

</body>
</html>
