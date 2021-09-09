

var language;
function getLanguage(lang) {
    $.ajax({
        url:  '/language/' +  lang + '.json',
        dataType: 'json', async: false, dataType: 'json',
        success: function (data) {
            language = data;
        } });
    setLanguage();
}

function setLanguage() {
    $('#home').html(language["home"]);
    $('#scada').text(language["scada"]);
    $('#jobs').text(language["jobs"]);
    $('#products').text(language["products"]);
    $('#solutions').text(language["solutions"]);
    $('#building-automation').text(language["building-automation"]);
    $('#energy-management').text(language["energy-management"]);
    $('#fan-coil').text(language["fan-coil"]);
    $('#air-treatment').text(language["air-treatment"]);
    $('#thermostat').text(language["thermostat"]);
    $('#heat-central').text(language["heat-central"]);
    $('#references').text(language["references"]);
    $('#contact').text(language["contact"]);

    $('#languageSelector').text(language["language"]);
}

$(document).ready(function(){
    getLanguage('hungarian');
    //console.log(language);
});