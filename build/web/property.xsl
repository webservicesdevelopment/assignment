<?xml version="1.0" encoding="UTF-8"?>


<!--
    Document   : properties.xsl
    Created on : 8 October 2016, 11:17 AM
    Author     : harry
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>property.xsl</title>
            </head>
            <body>
                <table style="margin: 0 auto;">
                    <tr>
                        <td><img src="images/bg.jpg" style="width: 450px; height:300px;"/></td>
                        <td valign="">
                            <table>
                                <tr valign="top">
                                    <th class="details" colspan="4">
                                        <h4>Bungalow Name</h4>
                                    </th>
                                </tr>
                                <tr>
                                    <td>
                                        <th class="details">Description</th>
                                    </td>
                                    <td>
                                        <xsl:value-of select="description"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <th class="details">Location</th>
                                    </td>
                                    <td>
                                        <xsl:value-of select="location"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <th class="details">Address</th>
                                    </td>
                                    <td>
                                        <xsl:value-of select="address"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                    <th class="details">Type</th>
                                    </td>
                                    <td>
                                        <xsl:value-of select="type"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <th class="details">Maximim Guests</th>
                                    </td>
                                    <td>
                                        <xsl:value-of select="numguests"/>
                                    </td>
                                </tr>	
                                <tr>
                                    <td>
                                        <th class="details">Availability</th>
                                    </td>
                                    <td>
                                    <xsl:value-of select="availability"/>
                                    </td>
                            </tr>		
                        </table>
                    </td>
                </tr>
            </table>
        <div class="seperator"></div>  
               
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
