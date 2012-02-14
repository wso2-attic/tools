/*
This will used in all wsdl conver related stuff.
*/

var _href = self.location.href;
var URL;
var _mainURL;
var _response;

var _MARValidate = false;
var _ModuleXmlValidat = false;

function extraStoreDirUUID(uuid) {
    // Create SOAP Message
    if (_MARValidate) {
        _MARValidate = false;
        // do mar validatioin
        var bodyXml = '<soapenv:Body>\n' +
                      '<req:validateRequest xmlns:req="http://mar.tools.wso2.org/xsd">\n' +
                      '<fileId>' + uuid + '</fileId>\n' +
                      '</req:validateRequest>\n' +
                      '</soapenv:Body>\n';

        var serviceURL = _mainURL + "/services/" + "MarValidatorXSL";

        serviceClient(serviceURL, bodyXml, "validate");
    }

    if (_ModuleXmlValidat) {
        // do module Validation
        _ModuleXmlValidat = false;
        var bodyXml = '<soapenv:Body>\n' +
                      '<req:validateModuleXMLRequest xmlns:req="http://mar.tools.wso2.org/xsd">\n' +
                      '<fileId>' + uuid + '</fileId>\n' +
                      '</req:validateModuleXMLRequest>\n' +
                      '</soapenv:Body>\n';

        var serviceURL = _mainURL + "/services/" + "MarValidatorXSL";
        serviceClient(serviceURL, bodyXml, "validateModuleXML");

    }


}

function initURL() {

    if (_href.lastIndexOf('wservices') > 0) {
        _mainURL = _href.substring(0, _href.lastIndexOf('wservices') - 1);
    }

    URL = _mainURL + "/wservices/MarValidatorXSL";
}


function createXMLHttpRequestObject() {
    // branch for native XMLHttpRequest object
    if (window.XMLHttpRequest) {
        return new XMLHttpRequest();

        // branch for IE/Windows ActiveX version
    } else if (window.ActiveXObject) {
        return new ActiveXObject("Microsoft.XMLHTTP");

    }
}

function serviceClient(callURL, bodyXml, operationName) {

    var req = createXMLHttpRequestObject();

    //Inner function to get the AJAX Response
    req.onreadystatechange = function() {
        // only if req shows "complete"
        // only if req shows "complete"
        if (req.readyState == 4) {
            // only if "OK"
            if (req.status == 202) {
                // ...processing statements go here...
                alert('Processed.');
                //                showDiv(document.getElementById('content'));
            } else if (req.status == 200) {
                var _uuid = req.responseXML.getElementsByTagName('return')[0].firstChild.nodeValue;
                window.location = _mainURL + _uuid;
            }
            else {
                //                alert("There was a problem retrieving the XML data:\n" + req.statusText);
                var exceptionNode = getExceptionNode(req.responseXML);
                alert("Validator Found an Error" +
                      xmlSerializerToString(exceptionNode));
            }
        }
    }

    try {
        req.open("POST", callURL, true);
    } catch(e) {

        alert("Error while opening connection. ERROR message = " + e.message);
        return false;
    }

    req.setRequestHeader('Content-Type', "text/xml");
    req.setRequestHeader("SOAPAction", operationName);

    var xmlToSend = '<?xml version="1.0" encoding="UTF-8"?>' +
                    ' <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">' +
                    ' <soapenv:Header xmlns:wsa="http://schemas.xmlsoap.org/ws/2004/08/addressing">';
    xmlToSend += ' <wsa:To>' + callURL + '</wsa:To>' +
                 ' <wsa:Action>' + operationName + '</wsa:Action>' +
                 ' <wsa:ReplyTo>' +
                 ' <wsa:Address>http://schemas.xmlsoap.org/ws/2004/08/addressing/role/anonymous</wsa:Address>' +
                 ' </wsa:ReplyTo>' +
                 ' <wsa:MessageID>uuid:BABE23A9BE85EA7AE011327368520801</wsa:MessageID>' +
                 ' </soapenv:Header>' + bodyXml +
                 ' </soapenv:Envelope>';

    req.send(xmlToSend);

}

function validateAndSubmitMAR() {
    _MARValidate = true;
    var formObj = document.getElementById('marValidatorDivFormId')
    var inputObj = document.getElementById('filenameMARId')
    if (inputObj.value == "") {
        alert('Please Select a MAR to Validate');
        return false;
    }
    formObj.action = _mainURL + "/fileupload/*";
    formObj.submit();
    return true;

}

function validateAndSubmitModuleXml() {
    _ModuleXmlValidat = true;
    var formObj = document.getElementById('module_xmlValidatorDivIdFormId')
    var inputObj = document.getElementById('filenameModule_xmlId')
    if (inputObj.value == "") {
        alert('Please Select a module.xml to Validate');
        return false;
    }
    formObj.action = _mainURL + "/fileupload/*";
    formObj.submit();
    return true;

}

function showDiv(objDiv) {
    if (objDiv == null)
        return;

    /*

    Would added a value. 

    var par = objDiv.parentNode;

    var len = par.childNodes.length;
    var count;
    for (count = 0; count < len; count++) {
        if (par.childNodes[count].nodeName == "DIV") {
            par.childNodes[count].style.display = 'none';
        }
    }*/
    objDiv.style.display = 'inline';
}


function getExceptionNode(xml) {
    try {
        if (xml.getElementsByTagName("Exception")[0] !=
            null) return xml.getElementsByTagName("Exception")[0];
    } catch(e) {
    }
    try {
        if (xml.getElementsByTagName(xml.firstChild.nextSibling.prefix + ":Exception")[0] !=
            null) return xml.getElementsByTagName(xml.firstChild.nextSibling.prefix +
                                                  ":Exception")[0];
    } catch(e) {
    }
    try {
        if (xml.getElementsByTagName("Fault")[0] !=
            null) return xml.getElementsByTagName("Fault")[0];
    } catch(e) {
    }
    try {
        if (xml.getElementsByTagName(xml.firstChild.nextSibling.prefix + ":Fault")[0] !=
            null) return xml.getElementsByTagName(xml.firstChild.nextSibling.prefix + ":Fault")[0];
    } catch(e) {
    }
    alert("getExceptionNode not supported");
}

function xmlSerializerToString(obj) {
    // branch for native XMLHttpRequest object
    if (window.XMLHttpRequest) {
        return (new XMLSerializer().serializeToString(obj));


        // branch for IE/Windows ActiveX version
    } else if (window.ActiveXObject) {
        // ...processing statements go here...
        return obj.xml;
    }
}

