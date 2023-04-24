<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="../resource/header.css">
<header>
	<nav class="narbar-wrapper-container-wrapper">
		<div class="navbar-wrapper">
			<a href="/JavaWeb/manager/products"><i class="fa-solid fa-pipe"></i>Kênh người bán</a>
			<a href=""><i class="fa-li fa fa-check-square"></i></i> | Trở thành
				người bán Shopee</a> <a href="">| Tải ứng dụng</a> <a href="https://www.facebook.com/themoon.eec">| Kết
				nối</a> <a href="https://www.facebook.com/themoon.eec"><i class="fa-brands fa-facebook"></i></a> <a href=""><i
				class="fa-brands fa-instagram"></i></a>
		</div>
		<div class="navbar_space"></div>
		<ul class="nav_links">
			<li class="link"><a href=""><i class="fa-regular fa-bell"></i>
					Thông báo</a></li>
			<li class="link"><a href=""><i
					class="fa-regular fa-circle-question"></i> Hỗ trợ</a></li>
			<li class="link"><a href=""><i
					class="fa-solid fa-earth-americas"></i> Tiếng Việt</a></li>
			${loggedIn}
		</ul>
	</nav>
	<div class="container-wrapper">
		<div class="header_logo">
			<a href="index"><img src="../resource/img/logo-full-white.png" width="150px"></a>
		</div>
		<div class="header_search">

			<div class="header__search-input">
				<form action="search?index=1" method="post" id="form_search">
					<input type="text" id="input_search" name="txtSearch" placeholder="Tìm kiếm trên Shoppee"> 
					<!-- <input type="submit" name="btn_search" id="btn_search" value="Go"> -->
					<button name="btn_search" id="btn_search"><i class="fa-solid fa-magnifying-glass"></i></button>
				</form>
			</div>
			<div class="search_list">
				<a href="">Dép</a> <a href="">Áo Khoác</a> <a href="">Túi Xách
					Nữ</a> <a href="">Áo Croptop</a> <a href="">Váy</a> <a href="">Ốp
					Iphone</a> <a href="">Son</a> <a href="">Áo Khoác Nam</a>
			</div>
		</div>
			<jsp:include page="cart.jsp"></jsp:include>
</header>