<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="../resource/productcart.css">
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css"
	rel="stylesheet">
<link
	href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/fontawesome.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/regular.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/regular.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/solid.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/svg-with-js.min.css">
<link rel="icon" href="resource/img/shopee-logo.png" type="image/x-icon">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
<title>Shopee Việt Nam | Mua và Bán Trên Ứng Dụng Di Động Hoặc
	Website</title>
</head>
<body>
	<header>
		<nav class="narbar-wrapper-container-wrapper">
			<div class="navbar-wrapper">
				<a href="products"><i class="fa-solid fa-pipe"></i>Kênh người bán</a> <a
					href=""><i class="fa-li fa fa-check-square"></i></i> | Trở thành
					người bán Shopee</a> <a href="">| Tải ứng dụng</a> <a href="">| Kết
					nối</a> <a href=""><i class="fa-brands fa-facebook"></i></a> <a href=""><i
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
			<div class="cart-page-header">
				<a href="index"><img src="../resource/img/logo-shopee.png" alt="" style="height: 46px;"></a>
				<a href="">| Giỏ Hàng</a>
			</div>
			<div class="cart-page-searchbar">
				<form action="search" method="post" id="form_search">
					<input type="text" id="input_search" name="txtSearch" placeholder="Tìm kiếm trên Shoppee">
					<input type="submit" name="btn_search" id="btn_search" value="GO">
				</form>
			</div>
		</div>
	</header>
	<main>
		<div class="main-content">
			<div class="main-title">
				<div class="main-title-name-product">Sản phẩm</div>
				<div class="main-title-price">Đơn giá</div>
				<div class="main-title-quantity">Số lượng</div>
				<div class="main-title-money">Số tiền</div>
				<div class="main-title-action">Thao tác</div>
			</div>
			
			
			
			<div class="main-products-buy">
			<c:forEach items="${items}" var="item">
				<div class="main-product-cart">
					<div class="main-product-cart-name">
						<img src="${item.getImage()}" alt="">
						<div class="name-content">
							<a href="">${item.getName()}</a>
						</div>
					</div>
					<div class="main-product-cart-price">đ ${item.getPrice()}</div>
					<div class="main-product-cart-quantity">${item.count}</div>
					<div class="main-product-cart-money">đ${item.count*item.getPrice()}</div>
					<div class="main-product-cart-action"><a href="oderdelete?orderid=${item.getId()}">Xóa</a></div>
				</div>
				</c:forEach>
			</div>
			
		</div>
	</main>
</body>
</html>