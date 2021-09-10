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
    //menü
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
    //nyelv választó
    $('#languageSelector').text(language["language"]);

    //
    //$('#home-page-title').text(language["home-page-title"]);

}


document.addEventListener("DOMContentLoaded", function(){
// make it as accordion for smaller screens
    if (window.innerWidth > 992) {

        document.querySelectorAll('.navbar .nav-item').forEach(function(everyitem){

            everyitem.addEventListener('mouseover', function(e){

                let el_link = this.querySelector('a[data-bs-toggle]');

                if(el_link != null){
                    let nextEl = el_link.nextElementSibling;
                    el_link.classList.add('show');
                    nextEl.classList.add('show');
                }

            });
            everyitem.addEventListener('mouseleave', function(e){
                let el_link = this.querySelector('a[data-bs-toggle]');

                if(el_link != null){
                    let nextEl = el_link.nextElementSibling;
                    el_link.classList.remove('show');
                    nextEl.classList.remove('show');
                }


            })
        });

    }
// end if innerWidth
});

$(document).ready(function(){
    getLanguage('hungarian');
    //console.log(language);
});