var fieldIds = ['username','firstname', 'lastname', 'email', "emailc", "password", "passwordc"];
var isvalid = 1;

function validateForm(){
    if(isvalid == 0){
        reloadForm();
        isvalid = 1;
    }

    var constraints = {
        from: {email: true},
        pwdmin: {length: {minimum: 8}},
        pwdmax: {length: {maximum: 120}},

    };

    var fieldValues = [ document.getElementById("username").value,
        document.getElementById("firstname").value,
        document.getElementById("lastname").value,
        document.getElementById("email").value,
        document.getElementById("emailc").value,
        document.getElementById("password").value,
        document.getElementById("passwordc").value ];

    for(var i = 0; i < 7; i++) {
        var id = fieldIds[i];
        if (fieldValues[i] == "" || fieldValues[i] == null) {
            $('#' + id).addClass("is-invalid");
            $('#' + id).after('<small id="error' + id + '" class="form-control-feedback danger">Bitte füllen Sie dieses Feld aus.</small>');
            isvalid = 0;
        }
        else if (i == 3) {
            //console.log(fieldValues[2])
            if (!!validate({from: fieldValues[3]}, constraints)) {
                $('#' + id).addClass("is-invalid");
                $('#' + id).after('<small id="error' + id + '" class="form-control-feedback danger">Bitte geben Sie eine gültige E-Mail Adresse ein.</small>');
                isvalid = 0;
            }
        }
        else if (i == 4) {
            if (fieldValues[i-1] != fieldValues[i]) {
                $('#emailc').addClass("is-invalid");
                $('#emailc').after('<small id="erroremailc" class="form-control-feedback danger">Die E-Mail Adressen stimmen nicht überein.</small>');
                isvalid = 0;
            }
        }
        else if (i == 3) {
            if (!!validate({pwdmin: fieldValues[3]}, constraints)) {
                $('#' + id).addClass("is-invalid");
                $('#' + id).after('<small id="error' + id + '" class="form-control-feedback danger">Das Passwort unterschreitet die min. Länge. (8 Zeichen)</small>');
                isvalid = 0;
            }
            else if (!!validate({pwdmax: fieldValues[3]}, constraints)) {
                $('#' + id).addClass("is-invalid");
                $('#' + id).after('<small id="error' + id + '" class="form-control-feedback danger">Das Passwort überschreitet die max. Länge. (120 Zeichen)</small>');
                isvalid = 0;
            }
        }
        else if (i == 6) {
            if (fieldValues[i-1] != fieldValues[i]) {
                $('#passwordc').addClass("is-invalid");
                $('#passwordc').after('<small id="errorpasswordc"  class="form-control-feedback danger">Die Passwörter stimmen nicht überein.</small>');
                isvalid = 0;
            }

        }
    }

    if(isvalid == 0){
        return false;
    }
}

function reloadForm(){
    for(var i = 0; i < 7; i++){
        var id = fieldIds[i];
        $('#'+id).removeClass("is-invalid");
        $('#error'+id).remove();
        $('#conditions-label').removeClass("danger");
    }
}