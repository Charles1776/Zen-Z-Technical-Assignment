
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import org.openqa.selenium.By

import com.kms.katalon.core.model.FailureHandling

import java.lang.Object

import java.util.List

import java.sql.Connection

import com.katalon.plugin.keyword.connection.DBType

import java.sql.ResultSet

import org.apache.poi.ss.usermodel.Sheet

import org.apache.poi.ss.usermodel.Workbook

import java.util.Map

import org.apache.poi.ss.usermodel.Cell

import org.apache.poi.ss.usermodel.Row

import org.openqa.selenium.WebElement



def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFile(
        	object
         , 	file)
}


def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFileUsingRobot(
        	object
         , 	file)
}


def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.initNgDriver"() {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).initNgDriver()
}


def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.findWebElementBy"(
    	By by	) {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).findWebElementBy(
        	by)
}


def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.waitForAngularLoad"() {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).waitForAngularLoad()
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isFalse"(
    	boolean expression	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isFalse(
        	expression
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isFalse"(
    	boolean expression	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isFalse(
        	expression
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isTrue"(
    	boolean expression	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isTrue(
        	expression
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isTrue"(
    	boolean expression	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isTrue(
        	expression
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.matchesDateTimeFormat"(
    	String dateInString	
     , 	String datetimeFormat	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).matchesDateTimeFormat(
        	dateInString
         , 	datetimeFormat
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.matchesDateTimeFormat"(
    	String dateInString	
     , 	String datetimeFormat	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).matchesDateTimeFormat(
        	dateInString
         , 	datetimeFormat
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNull"(
    	Object object	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNull(
        	object
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNull"(
    	Object object	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNull(
        	object
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNotNull"(
    	Object object	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNotNull(
        	object
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNotNull"(
    	Object object	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNotNull(
        	object
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.contains"(
    	java.util.List<Object> list	
     , 	java.util.List<Object> subList	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).contains(
        	list
         , 	subList
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.contains"(
    	java.util.List<Object> list	
     , 	java.util.List<Object> subList	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).contains(
        	list
         , 	subList
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsIgnoreOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsIgnoreOrder(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsIgnoreOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsIgnoreOrder(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsWithOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsWithOrder(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsWithOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsWithOrder(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.equals"(
    	Object actual	
     , 	Object expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).equals(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.equals"(
    	Object actual	
     , 	Object expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).equals(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isZero"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isZero(
        	value
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isZero"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isZero(
        	value
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isNegative"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isNegative(
        	value
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isNegative"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isNegative(
        	value
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isPositive"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isPositive(
        	value
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isPositive"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isPositive(
        	value
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThanOrEqual(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThanOrEqual(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThanOrEqual(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThanOrEqual(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.notEqual"(
    	Object actual	
     , 	Object expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).notEqual(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.notEqual"(
    	Object actual	
     , 	Object expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).notEqual(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThan"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThan(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThan"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThan(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThan"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThan(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThan"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThan(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.matches"(
    	String text	
     , 	String pattern	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).matches(
        	text
         , 	pattern
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.matches"(
    	String text	
     , 	String pattern	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).matches(
        	text
         , 	pattern
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.execute"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).execute(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeQuery(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeUpdate"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeUpdate(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection"(
    	Connection conn	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).closeConnection(
        	conn)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection"() {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).getGlobalConnection()
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection"(
    	DBType type	
     , 	String server	
     , 	String port	
     , 	String dbName	
     , 	String userName	
     , 	String Password	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).createConnection(
        	type
         , 	server
         , 	port
         , 	dbName
         , 	userName
         , 	Password)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getRowCount(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getColumnCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getColumnCount(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleRowValue"(
    	ResultSet rs	
     , 	int rowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleRowValue(
        	rs
         , 	rowIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	int colIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	colIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	columnName)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.resultSetToArrayList"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).resultSetToArrayList(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.exportToCSV"(
    	ResultSet rs	
     , 	String pathFile	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).exportToCSV(
        	rs
         , 	pathFile)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnName)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	int columnIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListRowValue"(
    	ResultSet rs	
     , 	int fromRowIndex	
     , 	int toRowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListRowValue(
        	rs
         , 	fromRowIndex
         , 	toRowIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.isEmptyResult"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).isEmptyResult(
        	rs)
}


def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingGlobalConnection"(
    	String fileName	
     , 	String query	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingGlobalConnection(
        	fileName
         , 	query)
}


def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingInternalConnection"(
    	String fileName	
     , 	String query	
     , 	String user	
     , 	String password	
     , 	DBType dbType	
     , 	String host	
     , 	String port	
     , 	String dbName	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingInternalConnection(
        	fileName
         , 	query
         , 	user
         , 	password
         , 	dbType
         , 	host
         , 	port
         , 	dbName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByIndex"(
    	Sheet sheet	
     , 	int rowIndex	
     , 	int colIndex	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByIndex(
        	sheet
         , 	rowIndex
         , 	colIndex
         , 	value)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheets"(
    	Workbook workbook	
     , 	java.util.List<String> sheetNames	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheets(
        	workbook
         , 	sheetNames)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getMapOfKeyValueRows"(
    	Sheet sheet	
     , 	int keyRowIdx	
     , 	int valueRowIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getMapOfKeyValueRows(
        	sheet
         , 	keyRowIdx
         , 	valueRowIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddresses"(
    	Sheet sheet	
     , 	Map content	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddresses(
        	sheet
         , 	content)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellIndexByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellIndexByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getColumnsByIndex"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> columnIndexes	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getColumnsByIndex(
        	sheet
         , 	columnIndexes)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getRowIndexByCellContent"(
    	Sheet sheet	
     , 	String cellContent	
     , 	int columnIdxForCell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getRowIndexByCellContent(
        	sheet
         , 	cellContent
         , 	columnIdxForCell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddress(
        	sheet
         , 	cellAddress
         , 	value)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValuesByRangeIndexes"(
    	Sheet sheet	
     , 	int rowInd1	
     , 	int colInd1	
     , 	int rowInd2	
     , 	int colInd2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValuesByRangeIndexes(
        	sheet
         , 	rowInd1
         , 	colInd1
         , 	rowInd2
         , 	colInd2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheetByName"(
    	String filePath	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheetByName(
        	filePath
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByRangeAddress"(
    	Sheet sheet	
     , 	String topLeftAddress	
     , 	String rightBottomAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByRangeAddress(
        	sheet
         , 	topLeftAddress
         , 	rightBottomAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook"(
    	String filePath	
     , 	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).saveWorkbook(
        	filePath
         , 	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelFile"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelFile(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValue"(
    	Cell cell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValue(
        	cell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getSheetNames"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getSheetNames(
        	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	
     , 	int sheetIndex	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath
         , 	sheetIndex)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.locateCell"(
    	Sheet sheet	
     , 	Object cellContent	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).locateCell(
        	sheet
         , 	cellContent)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getTableContent"(
    	Sheet sheet	
     , 	int startRow	
     , 	int endRow	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getTableContent(
        	sheet
         , 	startRow
         , 	endRow)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getDataRows"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> rowIndexs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getDataRows(
        	sheet
         , 	rowIndexs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2)
}


def static "com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).readLatestEMailBodyContent(
        	emailID
         , 	password
         , 	folderLableName)
}


def static "com.testwithhari.katalon.plugins.Gmail.deleteAllEMails"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).deleteAllEMails(
        	emailID
         , 	password
         , 	folderLableName)
}


def static "com.testwithhari.katalon.plugins.Gmail.sendEmail"(
    	String from_emailaddress	
     , 	String email_password	
     , 	String to_emailaddress	
     , 	String email_subject	
     , 	String email_body	) {
    (new com.testwithhari.katalon.plugins.Gmail()).sendEmail(
        	from_emailaddress
         , 	email_password
         , 	to_emailaddress
         , 	email_subject
         , 	email_body)
}


def static "com.testwithhari.katalon.plugins.Gmail.getEmailsCount"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).getEmailsCount(
        	emailID
         , 	password
         , 	folderLableName)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getAttribute"(
    	WebElement element	
     , 	String attribute	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getAttribute(
        	element
         , 	attribute)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElements"(
    	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElements(
        	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isVisible"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isVisible(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElement"(
    	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElement(
        	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getParentElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getParentElement(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isDisabled"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isDisabled(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getSiblingElements"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getSiblingElements(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElementInsideParent"(
    	WebElement parent	
     , 	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElementInsideParent(
        	parent
         , 	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElementsInsideParent"(
    	WebElement parent	
     , 	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElementsInsideParent(
        	parent
         , 	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getNextSiblingElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getNextSiblingElement(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getSiblingElement"(
    	WebElement element	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getSiblingElement(
        	element
         , 	selector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getAllShadowElement"(
    	WebElement parent	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getAllShadowElement(
        	parent
         , 	selector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getPreviousSiblingElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getPreviousSiblingElement(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectDropdown"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectDropdown(
        	parentElement
         , 	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectDropdown"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectDropdown(
        	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getChildElements"(
    	WebElement parent	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getChildElements(
        	parent)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getShadowElement"(
    	WebElement parent	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getShadowElement(
        	parent
         , 	selector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.setImplicitWait"(
    	int seconds	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).setImplicitWait(
        	seconds)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectCheckbox"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectCheckbox(
        	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectCheckbox"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectCheckbox(
        	parentElement
         , 	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.setExplicitWait"(
    	int seconds	
     , 	int pollingTime	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).setExplicitWait(
        	seconds
         , 	pollingTime)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isChecked"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isChecked(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.scrollTo"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).scrollTo(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectRadio"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectRadio(
        	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectRadio"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectRadio(
        	parentElement
         , 	label)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectAllOption"(
    	TestObject dropdownObject	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectAllOption(
        	dropdownObject)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectAllOption"(
    	TestObject dropdownObject	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectAllOption(
        	dropdownObject
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionSelectedByName"(
    	TestObject dropdownObject	
     , 	String expectedName	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionSelectedByName(
        	dropdownObject
         , 	expectedName)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionItemsStatus"(
    	TestObject dropdownObject	
     , 	String listItemNames	
     , 	boolean expectedStatus	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionItemsStatus(
        	dropdownObject
         , 	listItemNames
         , 	expectedStatus)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionItemsStatus"(
    	TestObject dropdownObject	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionItemsStatus(
        	dropdownObject
         , 	listItemNames)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByName"(
    	TestObject dropdownObject	
     , 	String listItemNames	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByName(
        	dropdownObject
         , 	listItemNames
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByName"(
    	TestObject dropdownObject	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByName(
        	dropdownObject
         , 	listItemNames)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByIndex"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	Object range	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByIndex(
        	dropdownObject
         , 	optionGroupName
         , 	range
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByIndex"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	Object range	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByIndex(
        	dropdownObject
         , 	optionGroupName
         , 	range)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByName"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByName(
        	dropdownObject
         , 	optionGroupName
         , 	listItemNames)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByName"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	String listItemNames	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByName(
        	dropdownObject
         , 	optionGroupName
         , 	listItemNames
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByIndex"(
    	TestObject dropdownObject	
     , 	Object range	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByIndex(
        	dropdownObject
         , 	range)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByIndex"(
    	TestObject dropdownObject	
     , 	Object range	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByIndex(
        	dropdownObject
         , 	range
         , 	isSelect)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.getDifferenceRatio"(
    	String expected	
     , 	String actual	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).getDifferenceRatio(
        	expected
         , 	actual)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.getDifferenceRatio"(
    	String expected	
     , 	String actual	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).getDifferenceRatio(
        	expected
         , 	actual
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.verifyMatchBaseline"(
    	String filename	
     , 	String baselinePath	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).verifyMatchBaseline(
        	filename
         , 	baselinePath)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.verifyMatchBaseline"(
    	String filename	
     , 	String baselinePath	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).verifyMatchBaseline(
        	filename
         , 	baselinePath
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScreenshot"(
    	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScreenshot(
        	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScreenshot"(
    	String filename	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScreenshot(
        	filename
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeCuttingScreenshot"(
    	String filename	
     , 	int headerToCut	
     , 	int footerToCut	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeCuttingScreenshot(
        	filename
         , 	headerToCut
         , 	footerToCut)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeCuttingScreenshot"(
    	String filename	
     , 	int headerToCut	
     , 	int footerToCut	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeCuttingScreenshot(
        	filename
         , 	headerToCut
         , 	footerToCut
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScalingScreenshot"(
    	String filename	
     , 	float dpr	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScalingScreenshot(
        	filename
         , 	dpr)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScalingScreenshot"(
    	String filename	
     , 	float dpr	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScalingScreenshot(
        	filename
         , 	dpr
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename
         , 	timeout)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot"(
    	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeEntirePageScreenshot(
        	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot"(
    	String filename	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeEntirePageScreenshot(
        	filename
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename
         , 	timeout)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.baselineImage"(
    	String filename	
     , 	String baselineDir	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).baselineImage(
        	filename
         , 	baselineDir)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.baselineImage"(
    	String filename	
     , 	String baselineDir	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).baselineImage(
        	filename
         , 	baselineDir
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs
         , 	timeout)
}
