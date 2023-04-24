<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <link rel="stylesheet" href="../resource/banner.css">
<div class="home__page-banner-left">
						<div class="slideshow-container">

							<div class="mySlides fade">
							 <a href="#"><img src="../resource/img/banner1.jfif" style="width:99.5%; height:232px"></a>
							</div>
							
							<div class="mySlides fade">
							  <a href="#"><img src="../resource/img/banner2.jfif" style="width:99.5%; height:232px"></a>
							</div>
							
							<div class="mySlides fade">
							  <a href="#"><img src="../resource/img/banner3.jfif" style="width:99.5%; height:232px"></a>
							</div>
							  
							  <div class="mySlides fade">
							  <a href="#"><img src="../resource/img/banner4.jfif" style="width:99.5%; height:232px"></a>
							</div>
							
							</div>
							<br>
							
							<div style="text-align:center">
							  <span class="dot"></span>
							  <span class="dot"></span>
							  <span class="dot"></span>
							  <span class="dot"></span>
							</div>
							<script>
							var slideIndex = 0;
							showSlides();
							
							function showSlides() {
								var i;
								var slides = document.getElementsByClassName("mySlides");
								var dots = document.getElementsByClassName("dot");
								for (i = 0; i < slides.length; i++) {
								   slides[i].style.display = "none";
								}
								slideIndex++;
								if (slideIndex> slides.length) {slideIndex = 1}
								for (i = 0; i < dots.length; i++) {
									dots[i].className = dots[i].className.replace(" active", "");
								}
								slides[slideIndex-1].style.display = "block";
								dots[slideIndex-1].className += " active";
								setTimeout(showSlides, 2000); // Chuyển ảnh sau 2 giây
							}
							</script>
					</div>