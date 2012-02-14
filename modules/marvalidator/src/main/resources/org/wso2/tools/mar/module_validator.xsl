<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:xdt="http://www.w3.org/2005/xpath-datatypes">
	<xsl:output method="xml"/>
	<!-- root match -->
	<xsl:template match="/">
		<report>
			<xsl:apply-templates/>
		</report>
	</xsl:template>
	<!-- template for modules -->
    <xsl:template match="module">
        <!-- No Name-->
        <info>module element is found</info>
        <xsl:if test="not(@name)">
            <error>Attribute name is not found</error>
        </xsl:if>
        <xsl:if test="not(@class)">
            <info>Attribute class is not found</info>
        </xsl:if>

        <xsl:if test="not(Description)">
            <info>Description element is not found</info>
        </xsl:if>

        <xsl:if test="not(inflow)">
            <info>inflow element is not found</info>
        </xsl:if>
        <xsl:if test="not(outflow)">
            <info>outflow element is not found</info>
        </xsl:if>

        <xsl:if test="not(parameter)">
            <info>parameter element is not found</info>
        </xsl:if>
        <xsl:if test="not(operation)">
            <info>operation element is not found</info>
        </xsl:if>

        <xsl:if test="not(Outfaultflow)">
            <info>Outfaultflow element is not found</info>
        </xsl:if>

        <xsl:if test="not(INfaultflow)">
            <info>INfaultflow element is not found</info>
        </xsl:if>

        <xsl:apply-templates/>

    </xsl:template>

    <xsl:template match="inflow">
        <info>inflow element is found</info>
        <xsl:apply-templates/>

    </xsl:template>
    <xsl:template match="outflow">
        <info>outflow element is found</info>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="Outfaultflow">
        <info>Outfaultflow element is found</info>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="INfaultflow">
        <info>Outfaultflow element is found</info>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="handler">
        <info>Element handler is found</info>

        <xsl:if test="not(name)">
            <warning>Attribute name is not found for handler</warning>
        </xsl:if>
        <!-- No service element!! -->
        <xsl:if test="not(@class)">
            <error>Attribute class is not found for handler</error>
        </xsl:if>

        <xsl:apply-templates/>

    </xsl:template>
    <!-- template for order -->
	<xsl:template match="order">
		<info>Element order found</info>
		<!-- No service element!! -->
		<xsl:if test="not(@phase)">
			<error>Attribute phase is not found</error>
		</xsl:if>
        <xsl:if test="not(@after)">
			<info>Attribute after is not found</info>
		</xsl:if>
        <xsl:if test="not(@before)">
			<info>Attribute before is not found</info>
		</xsl:if>
        <xsl:if test="not(@phaseFirst)">
			<info>Attribute phaseFirst is not found</info>
		</xsl:if>
        <xsl:if test="not(@phaseFirst)">
			<info>Attribute phaseFirst is not found</info>
		</xsl:if>
         <xsl:if test="not(@phaseLast)">
			<info>Attribute phaseLast is not found</info>
		</xsl:if>
        <xsl:apply-templates/>
    </xsl:template>


    <!-- template for parameter -->
	<xsl:template match="parameter">
		<!-- No name for the parameter-->
		<xsl:if test="not(@name)">
			<error>Attribute name is not found in parameter</error>
		</xsl:if>
		<!-- the locked attribute is missing -->
		<xsl:if test="not(@locked)">
			<warning>Attribute locked not found in parameter with name <xsl:value-of select="@name"/></warning>
		</xsl:if>
	</xsl:template>
	<!-- template for operation -->
	<xsl:template match="operation">
		<!-- no name for the operation -->
		<xsl:if test="not(@name)">
			<error>No name attribute found in Operation</error>
		</xsl:if>
		<!-- no mep for the operation -->
		<xsl:if test="not(@mep)">
			<error> No mep attribute found in Operation <xsl:value-of select="@name"/></error>
		</xsl:if>
		<!-- no scope for the operation -->
		<xsl:if test="not(@scope)">
			<warning>No scope attribute found in Operation <xsl:value-of select="@name"/>. Default will be picked.</warning>
		</xsl:if>
		<!-- no message receiver  for the operation -->
		<xsl:if test="not(messageReceiver)">
			<warning> No messageReceiver element found in Operation <xsl:value-of select="@name"/>Default will be picked.</warning>
		</xsl:if>
        <xsl:if test="not(actionMapping)">
            <warning>No Action Mapping Found</warning>
        </xsl:if>
    </xsl:template>
</xsl:stylesheet>
