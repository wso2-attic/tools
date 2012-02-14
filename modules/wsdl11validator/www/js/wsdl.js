/*
This will used in all wsdl conver related stuff.
*/

var _href = self.location.href;
var URL;
var _mainURL;
var _response;

function extraStoreDirUUID(uuid) {

    // Create SOAP Message

    var bodyXml = '<soapenv:Body>\n' +
                  '<req:validateRequest xmlns:req="http://net.wso2.tools.wsdl/xsd">\n' +
                  '<fileId>' + uuid + '</fileId>\n' +
                  '</req:validateRequest>\n' +
                  '</soapenv:Body>\n';

    var serviceURL = _mainURL + "/services/" + "WSDL11Validator";

    serviceClient(serviceURL, bodyXml, "validate")


}

function initURL() {

    if (_href.lastIndexOf('wservices') > 0) {
        _mainURL = _href.substring(0, _href.lastIndexOf('wservices') - 1);
    }

    URL = _mainURL + "/services";
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
                //showDiv(document.getElementById('content'));
            } else if (req.status == 200) {
                var _uuid = req.responseXML.getElementsByTagName('return')[0].firstChild.nodeValue;
                window.location = _mainURL + _uuid;
            }
            else {
                // alert("There was a problem retrieving the XML data:\n" + req.statusText);
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

function validateAndSubmit() {
    var objForm = document.getElementById('wsdl11FormID');
    var inputObj = document.getElementById('filename');
    if (inputObj.value == "") {
        alert('Please Select a WSDL of Version 1.1');
        return false;
    }
    objForm.action = _mainURL + "/fileupload/*";
    objForm.submit();
    return true;

}

function getExceptionNode(xml){
    try { if (xml.getElementsByTagName("Exception")[0] != null) return xml.getElementsByTagName("Exception")[0]; } catch(e) {}
    try { if (xml.getElementsByTagName(xml.firstChild.nextSibling.prefix + ":Exception")[0] != null) return xml.getElementsByTagName(xml.firstChild.nextSibling.prefix + ":Exception")[0]; } catch(e) {}
    try { if (xml.getElementsByTagName("Fault")[0] != null) return xml.getElementsByTagName("Fault")[0]; } catch(e) {}
    try { if (xml.getElementsByTagName(xml.firstChild.nextSibling.prefix + ":Fault")[0] != null) return xml.getElementsByTagName(xml.firstChild.nextSibling.prefix + ":Fault")[0]; } catch(e) {}
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

function showDiv(objDiv) {
    if (objDiv == null)
        return;

    var par = objDiv.parentNode;

    var len = par.childNodes.length;
    var count;
    for (count = 0; count < len; count++) {
        if (par.childNodes[count].nodeName == "DIV") {
            par.childNodes[count].style.display = 'none';
        }
    }
    objDiv.style.display = 'inline';
}
