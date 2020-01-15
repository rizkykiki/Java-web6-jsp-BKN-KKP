$(function () {
    var dp1 = $('#dp1').datepicker().data('datepicker');
    dp1.selectDate(new Date());
    var dp2 = $('#dp2').datepicker().data('datepicker');
    dp2.selectDate(new Date());

})
function hanyaAngka(evt) {
    var charCode = (evt.which) ? evt.which : event.keyCode
    if (charCode > 31 && (charCode < 48 || charCode > 57))
        return false;
    return true;
}
$(function () {
    $("#Univ").autocomplete({
        source: "UserController.Java",
        minLength: 3
    });
});
$(function () {
    $("#jur").autocomplete({
        source: "UserController.Java",
        minLength: 3
    });
});

function validasiemail() {
    var x = document.forms["cekemail"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (x == "") {
        alert("Isi inputan email");
    } else {
        if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= x.length)
        {
            alert("Isi Email yang bener BAMBANG !!");
        }
    }
}