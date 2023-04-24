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
<link rel="stylesheet" href="../resource/product.css">
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
<link rel="icon" href="../resource/img/shopee-logo.png"
	type="image/x-icon">
<title>Shopee Việt Nam | Mua và Bán Trên Ứng Dụng Di Động Hoặc
	Website</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main>
		<div class="main_product-crumb">
			<a href="">Shopee <i class="fa-solid fa-angle-right"></i></a> <a
				href="">Thời Trang Nữ <i class="fa-solid fa-angle-right"></i></a> <a
				href="">Áo <i class="fa-solid fa-angle-right"></i></a> <a href="">Áo
				Thun <i class="fa-solid fa-angle-right"></i>
			</a> ${detail.name}
		</div>
		<div class="main_product-info">
			<div class="main_product-info-left">
				<div class="main_product-info-left-img">
					<a href=""><img src="${detail.image}" style="width:460px; height:450px"></a>
				</div>
				<div class="main_product-info-left-img-chooses">
					<div class="main_product-info-left-img-choose">
						<a href=""><img src="${detail.image}" alt=""></a>
					</div>
					<div class="main_product-info-left-img-choose">
						<a href=""><img src="${detail.image}" alt=""></a>
					</div>
					<div class="main_product-info-left-img-choose">
						<a href=""><img src="${detail.image}" alt=""></a>
					</div>
					<div class="main_product-info-left-img-choose">
						<a href=""><img src="${detail.image}" alt=""></a>
					</div>
					<div class="main_product-info-left-img-choose">
						<a href=""><img src="${detail.image}" alt=""></a>
					</div>
				</div>
				<div class="main_product-info-left-footer">
					<div class="main_product-info-left-footer-left">
						<div class="main_product-info-left-footer-left-text">Chia
							sẻ:</div>
						<a href=""><i class="fa-brands fa-facebook-messenger"></i></a> <a
							href=""><i class="fa-brands fa-facebook"></i></a> <a href=""><i
							class="fa-brands fa-pinterest"></i></a> <a href=""><i
							class="fa-brands fa-twitter"></i></a>
					</div>
					<div class="space">|</div>
					<div class="main_product-info-left-footer-right">
						<a href=""><i class="fa-regular fa-heart"></i> Đã thích (8,3k)</a>
					</div>
				</div>
			</div>
			<div class="main_product-info-right">
				<div class="main_product-info-right-top">
					<div class="main_product-info-right-name">
						<c:out value="${detail.name}" />
					</div>
					<div class="main_product-info-right-product-info">
						<div class="main_product-info-right-product-info-star">
							<a href="">4.0</a> <i class="fa-solid fa-star"></i><i
								class="fa-solid fa-star"></i><i class="fa-solid fa-star"></i><i
								class="fa-solid fa-star"></i><i class="fa-regular fa-star"></i>
						</div>
						<div class="main_product-info-right-product-info-rate">
							<a href="">4,8k</a> Đánh giá
						</div>
						<div class="main_product-info-right-product-info-sold">
							<a href="">14,3k</a> Đã bán
						</div>
						<div class="main_product-info-right-product-info-complain">
							<a href="">Tố cáo</a>
						</div>
					</div>
					<div class="main_product-info-right-flashsale">
						<a href=""><img src="../resource/img/product/fls.jpg" style="width:665px"></a>
					</div>
					<div class="main_product-info-right-product-cost">
						<div class="old-cost">$159.000</div>
						<div class="sale-cost">${detail.price}</div>
						<div class="cost-discount">50% GIẢM</div>
					</div>
					<div class="main_product-info-right-product-main">
						<div class="main_product-info-right-product-discount">
							<div class="discount-text">Mã Giảm Giá Của Shop</div>
							<div class="discount-value">Giảm $2k</div>
						</div>
						<div class="main_product-info-right-product-insurance">
							<div class="discount-text">Bảo hiểm</div>
							<div class="insurance-value">Bảo Hiểm Thời Trang</div>
							<div class="insurance-more">
								<a href="">Tìm hiểu thêm</a>
							</div>
						</div>
						<div class="main_product-info-right-product-shipping">
							<div class="discount-text">Vận chuyển</div>
							<div class="shipping-value">
								<div class="shipping-value-top">
									<i class="fa-solid fa-truck-arrow-right"></i> Miễn Phí Vận
									Chuyển
								</div>
								<div class="shipping-value-bottom">
									<div class="bottom-top">
										<div class="shipping-value-bottom-text">Vận chuyển tới</div>
										<div class="shipping-value-bottom-choose">
											<a href="">Phường Tràng Tiền, Quận Hoàn Kiếm</a><i
												class="fa-solid fa-chevron-down"></i>
										</div>
									</div>
									<div class="bottom-top">
										<div class="shipping-value-bottom-text">Phí Vận Chuyển</div>
										<div class="shipping-value-bottom-choose">
											<a href="">0đ</a><i class="fa-solid fa-chevron-down"></i>
										</div>
									</div>

								</div>
							</div>
						</div>
						<div class="main_product-info-right-product-color">
							<div class="product-color-text">Màu</div>
							<button class="btn-color">Đen</button>
							<button class="btn-color">Trắng</button>
						</div>
						<div class="main_product-info-right-product-size">
							<div class="product-color-text">SIZE</div>
							<button class="btn-size">M (48-59KG)</button>
							<button class="btn-size">L(60-65KG)</button>
							<button class="btn-size">XL(66-73KG)</button>
						</div>
						<div class="main_product-info-right-product-size-info">
							<a href="">Bảng Quy Đổi Kích Cỡ</a> <i
								class="fa-solid fa-chevron-right"></i>
						</div>
						<div class="main_product-info-right-product-mount">
							<div class="product-color-text">Số Lượng</div>
							<div class="buttons_added">
								<button onclick="decrement()">-</button>
								<input id=demoInput type=number min=1 max=20 value="1">
								<button onclick="increment()">+</button>
								<script>
									function increment() {
										document.getElementById('demoInput')
												.stepUp();
									}
									function decrement() {
										document.getElementById('demoInput')
												.stepDown();
									}
								</script>
							</div>

						</div>
						<div class="main_product-info-right-product-add-buy">
							<div class="main_product-info-right-product-add">
							<form action="addingcart" method="post">
								<a href="addingcart" target="_top">
									<button class="product-add-button">
										<i class="fa-solid fa-cart-shopping"></i> Thêm Vào Giỏ Hàng
									</button>
								</a>
							</form>
							</div>
							<div class="main_product-info-right-product-buy">
								<button class="product-buy-button">Mua Ngay</button>
							</div>
						</div>
					</div>
				</div>
				<div class="main_product-info-right-bottom">
					<div class="ensure">
						<a href=""><i class="fa-solid fa-file-signature"></i> Shopee
							Đảm Bảo</a>
					</div>
					<div class="refund">
						<a href="">3 Ngày Trả Hàng/Hoàn Tiền</a>
					</div>
				</div>
			</div>
		</div>
	</main>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>