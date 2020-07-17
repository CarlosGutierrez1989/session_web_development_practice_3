<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>


<html lang="es">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1, shrink-to-fit=no" name="viewport">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"/>
<link rel="stylesheet" type="text/css" href="/resources/css/main.css">
<link rel="stylesheet" type="text/css" href="/resources/css/addArtist.css">

<title>CDSSpotify</title>
</head>


<body>

<jsp:include page="header.jsp" />
			
<div id="bodyaddSong" class="container bodyaddSong">
    <div class="row">
    <div class="card bg-light">
    <article class="card-body mx-auto" style="max-width: 400px;">
        <h4 class="card-title mt-3 text-center">Add new Singer</h4>
    
        <form>
            <div class="row">

                <div class="form-group input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"> <i class="fa fa-microphone"></i> </span>
                    </div>
                    <input id="name" class="form-control" placeholder="Name" type="text">
                    
                </div> <!-- form-group// -->
                <div class="form-group input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"> <i class="fa fa-paper-plane-o"></i> </span>
                    </div>
                    <input id="web_page" class="form-control" placeholder="Web page" type="text" >
                </div> <!-- form-group// -->
              
                <div class="form-group">
                    <button id="createArtistButton" type="submit" class="btn btn-primary btn-block" > Create  </button>
                </div> <!-- form-group// -->      
            </div>
                                         
    </form>
    
    <h4 id="singername" class="card-title mt-3 text-center">Singer name: <h3></h3> </h4>
    <h4 id="singerpage" class="card-title mt-3 text-center">Singer web page: <h3></h3></h4>
    </article>

    </div> <!-- card.// -->

    </div>
    </div> 

    <!--container end.//-->
    


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Artist saved</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p id="modalBody">Modal body text goes here.</p>
      </div>
      <div class="modal-footer">

         <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>


<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>


<script src="/resources/js/addArtist.js"></script>

</body>
</html>
