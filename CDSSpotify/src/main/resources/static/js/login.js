
$( document ).ready(function() {
    console.log( "ready!" );
    
	$( "#main2" ).hide();

	
});



function singUp(){
	$( "#main2" ).show();
	$( "#main1" ).hide();
}

function logIn(){
	$( "#main1" ).show();
	$( "#main2" ).hide();
}
