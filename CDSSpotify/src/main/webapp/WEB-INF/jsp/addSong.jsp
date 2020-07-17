

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
<link rel="stylesheet" type="text/css" href="/resources/css/addSong.css">


<title>CDSSpotify</title>
</head>


<body>

<jsp:include page="header.jsp" />

<div id="bodyaddSong" class="container bodyaddSong">
<div class="row">
<div class="card bg-light">
<article class="card-body mx-auto" style="max-width: 400px;">

	<h4 class="card-title mt-3 text-center">Add new Song</h4>

	<form>
        <div class="row">
            <div class="form-group input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"> <i class="fa fa-headphones"></i> </span>
                </div>
                <input id="name" class="form-control" placeholder="Song name" type="text"/>
                
            </div> <!-- form-group// -->

            <div class="form-group input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"> <i class="fa fa-play-circle"></i> </span>
                </div>
                <input id="external_url" class="form-control" placeholder="External url" type="text"/>
            </div> <!-- form-group// -->
            
            <div class="form-group input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"> <i class="fa fa-picture-o"></i> </span>
                </div>
                <input id="image" class="form-control" placeholder="Image url" type="text"/>
            </div> <!-- form-group// -->

            <div class="form-group input-group">
                <div class="input-group date">
   	
					<div id="release_date" class="input-group date">
					
					</div>

                </div>
            </div> <!-- form-group// -->
  
            <div class="form-group input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"> <i class="fa fa-clock-o"></i> </span>
                </div>
                <input id="duration_ms" class="form-control" placeholder="Duration (ms)" type="text"/>
            </div> <!-- form-group// -->



            <div class="form-group input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"> <i class="fa fa-microphone"></i> </span>
                         <select id="artists" name="department" class="selectpicker" multiple data-live-search="true">
						    <c:forEach var="artist" items="${artists}">
						        <option value="${artist._id}" ${artist._id == selectedDept ? 'selected="selected"' : ''}>${artist.name}</option>>
						    </c:forEach>
						</select>
                    
                </div>
                

            </div> <!-- form-group end.// -->

            <div class="row buttonsRow">
                <div class="form-group col-md-12" >
                    <button id="createSongButton" type="submit" class="btn btn-primary btn-block"> Create Song  </button>
                    
                </div> <!-- form-group// -->    

                <div class="form-group artistButton col-md-12">
                 <a type="submit" class="btn btn-info btn-block " href="/songs/addSong/addArtist">Create Artist 
                	 
                 </a>
 
                </div> <!-- form-group// -->  
            </div>
        </div>      
        </div>                                                          
</form>
</article>
</div> <!-- card.// -->
</div>
</div> 
<!--container end.//-->


<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/css/bootstrap-select.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/js/bootstrap-select.min.js"></script>

<script src="/resources/datepicker/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" href="/resources/datepicker/css/bootstrap-datepicker.min.css">

<script src="/resources/js/addSong.js"></script>


</body>
</html>