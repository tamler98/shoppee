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
<link rel="stylesheet" href="../resource/signup.css">
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
<link rel="icon" href="../resource/img/shopee-logo.png"
	type="image/x-icon">
<title>Đăng ký ngay | Shopee Việt Nam</title>
</head>

<body>
	<header>
		<div class="header_content">
			<div class="content">
				<div class="header_logo">
					<a href=""><img src="../resource/img/Shopee.svg" alt="erro"></a>
					<div class="header_text">Đăng Nhập</div>
				</div>
				<div class="header_helps">
					<a href="">Bạn cần giúp đỡ?</a>
				</div>
			</div>
	</header>
	<main>
		<div class="main_content">
			<div class="main_logo">
				<div class="main_logo_logo">
					<img src="../resource/img/logo_shopee.png" width="210">
				</div>
				<div class="main_logo_slogan">
					<p>Nền tảng thương mại điện tử</p>
					<p>yêu thích ở Đông Nam Á & Đài Loan</p>
				</div>
			</div>
			<div class="main_form">
				<div class="text">Đăng ký</div>
				<div class="form_login">
					<form action="signup" method="post" class="form_login">
						<label for="username"></label> <input type="text" id="username"
							name="username" placeholder="Email/Số điện thoại/ Tên đăng nhập"><br>
						<label for="password"></label> <input type="password"
							id="password" name="password" placeholder="Mật khẩu"><br>
						<input type="submit" value="Đăng ký" id="button_signup">
					</form>
					<div class="form_or">
						<div class="form_or_text">------------------------------
							HOẶC ------------------------------</div>
					</div>
					<br>
					<div class="login_socials">
						<a href="" class="login_social">
							<div class="social_logo">
								<img src="../resource/img/fblogo.webp" width="20px">
							</div>
							<div class="social_name">Facebook</div>
						</a> <a href="" class="login_social">
							<div class="social_logo">
								<img src="../resource/img/gg.png" width="20px">
							</div>
							<div class="social_name">Google</div>
						</a>
					</div>
					<div class="private">
						<div class="private_text">Bằng việc đăng kí, bạn đã đồng ý
							với Shopee về</div>
						<div class="private_text">
							<a href="">Điều khoản dịch vụ </a>&<a href=""> Chính sách bảo
								mật</a>
						</div>
					</div>
					<div class="new_signup">
						<div class="signup_text">Bạn đã có tài khoản?</div>
						<div class="signup_link">
							<a href="">Đăng nhập</a>
						</div>
					</div>
				</div>
			</div>
	</main>
	<jsp:include page="footer.jsp"></jsp:include>

</body>

</html>