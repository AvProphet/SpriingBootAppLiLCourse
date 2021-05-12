function setPicker(){
    $( "#datepicker" ).datepicker(
        { dateFormat: 'yy-mm-dd',
            onSelect: function(d,i) {
                i.lastVal = undefined;
                if (d !== i.lastVal) {
                    reloadPageForDateSelection();
                }
            }
        });
}

function getRequestParam(p){
    return (window.location.search.match(new RegExp('[?&]' + p + '=([^&]+)')) || [undefined, null])[1];
}

function setInitialDate(){
    let requestDate = getRequestParam('date');
    if(requestDate == null){
        requestDate = new Date();
    }else{
        requestDate = formatDate(requestDate);
    }
    $('#datepicker').datepicker('setDate', requestDate);

}

function reloadPageForDateSelection(){
    const selectedDate = document.getElementById('datepicker').value;
    const redirectLink = window.location.protocol + "//" + window.location.host + window.location.pathname + '?date=' + selectedDate;
    console.log('Redirecting to: ' + redirectLink);
    window.location.href = redirectLink;
}

function formatDate(input) {
    const dateFormat = 'yyyy-mm-dd';
    let parts = input.match(/(\d+)/g),
        i = 0, fmt = {};
    dateFormat.replace(/(yyyy|dd|mm)/g, function(part) { fmt[part] = i++; });

    return new Date(parts[fmt['yyyy']], parts[fmt['mm']]-1, parts[fmt['dd']]);
}

$(document).ready(function(){
    setPicker();
    setInitialDate();
});