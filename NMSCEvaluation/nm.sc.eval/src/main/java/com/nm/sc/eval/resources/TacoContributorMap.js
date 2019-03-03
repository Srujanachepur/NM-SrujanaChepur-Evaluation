$(document).ready(function() {
    $('#tacotable').DataTable({
        "processing" : true,
        "ajax" : {
            "url" : "http://localhost:8085/TacoContributorResponse/result",
            dataSrc : ''
        },
        "columns" : [ {
            "data" : "full_name"
        }, {
            "data" : "username"
        }]
    });
});