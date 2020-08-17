var originalParseFromString = DOMParser.prototype.parseFromString;

DOMParser.prototype.parseFromString = function(content, type) {
    if (type !== 'text/html') {
        return originalParseFromString.apply(this, arguments);
    }
    var doc = document.implementation.createHTMLDocument('');
    var body = doc.body;
    var parentNode = body.parentNode;
    parentNode.removeChild(parentNode.firstElementChild);
    body.outerHTML = content;
    return doc;
}