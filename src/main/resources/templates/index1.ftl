<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8" />
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<title></title>
<style>
	h2{
		color:red;
	}
</style>
</head>
<body>
	  这是一个freemarker页面<br/>
	<h1>h1的标签</h1>
	<h2>h2的标签</h2>
</body> 
 <script type="text/javascript">
  	$(function(){
  		$.getJSON("getjstr",function(mes){
  			$("h1").html(mes);
  		});  
  		  		
  	});
  
  </script>
</html>

