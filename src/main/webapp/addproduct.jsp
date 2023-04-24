<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css"
	rel="stylesheet">
<link
	href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css"
	rel="stylesheet">
<link rel="icon" href="../img/shopee-logo.png" type="image/x-icon">
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
<link rel="stylesheet" href="../resource/addproduct.css">
<link rel="icon" href="../resource/img/shopee-logo.png"
	type="image/x-icon">
<title>Shopee - Thêm sản phẩm</title>
</head>
<body>
	<!--  <header>
        <div class="header-logo">
            <a href=""><img src="../resource/img/shopee-logo.png" alt="logo-header" width="35px"></a>
        </div>
        <div class="header-content">
            <a href="">Trang chủ <i class="fa-solid fa-chevron-right"></i></a>
            <a href="">Sản phẩm <i class="fa-solid fa-chevron-right"></i></a>
            <a href="">Thêm 1 sản phẩm mới</a>
        </div>
        <div class="header-info">
            <a href="">Tama Football</a>
            <a href="">|</a>
            <a href=""><i class="fa-solid fa-bars"></i></a>
            <a href=""><i class="fa-solid fa-bell"></i> </a>
            <a href="" class="suni">SHOPEE UNI</a>
        </div>
        <div class="header-menu-button"></div>
        <div class="header-action"></div>
    </header>
    <main>
            <div class="side-nav">
                <a href=""><i class="fa-regular fa-circle-check"></i> Thông tin cơ bản</a>
                <a href=""><i class="fa-regular fa-circle-check"></i> Thông tin chi tiết</a>
                <a href=""><i class="fa-regular fa-circle-check"></i> Thông tin bán hàng</a>
                <a href=""><i class="fa-regular fa-circle-check"></i> Vận chuyển</a>
                <a href=""><i class="fa-regular fa-circle-check"></i> Thông tin khác</a>
            </div>
            <div class="product-detail-info-right">
                <div class="product-detail-info-basic">
                    <div class="product-detail-info-basic-title">
                        Thông tin cơ bản
                    </div>
                    <div class="product-detail-info-basic-add">
                        <div class="add_image">
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="filebutton">Hình ảnh sản phẩm</label>
                                <div class="col-md-4">
                                    <input type="file" name="file" accept="image/*" multiple="multiple" aspect="1" class="shopee-upload__input">
                                </div>
                            </div>
                        </div>
                        <div class="add_image">
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="filebutton">Video sản phẩm</label>
                                <div class="col-md-4">
                                    <input type="file" name="file" accept="image/*" multiple="multiple" aspect="1" class="shopee-upload__input">
                                </div>
                            </div>
                        </div>
                        <form action="">
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="filebutton">Tên sản phẩm</label>
                                    <input type="text" name="name_product" id="product_name" placeholder="Nhập vào" required>
                            </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="filebutton">Ngành hàng</label>
                                <select id="product_category">
                                    <option value="health">Sức khỏe</option>
                                    <option value="caring">Chăm sóc</option>
                                    <option value="baby">Trẻ em</option>
                                  </select>
                            </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="filebutton">Mô tả sản phẩm</label>
                                    <input type="text" name="product_des" id="product_des"  required>
                            </div>
                        </form>
                    </div>

                </div>
                <div class="product-detail-sale-info">
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="filebutton">Phân loại hàng</label>
                            <input type="text" name="product_type" id="product_type">
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="filebutton">Giá</label>
                            <input type="text" name="product_type" id="product_type" required>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="filebutton">Đã bán</label>
                            <input type="text" name="product_type" id="product_type"  required>
                    </div>
                </div>
                <div class="product-detail-shipping">
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="filebutton">Cân nặng (Sau khi đóng gói)</label>
                            <input type="text" name="product_type" id="product_weigth" placeholder="Nhập vào">
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="filebutton">Kích thước đóng gói</label>
                            
                            <input type="text" name="product_long" id="product_long" placeholder="R">
                            <input type="text" name="product_long_af" id="product_long_af" placeholder="D">
                            <input type="text" name="product_long_af" id="product_long_af" placeholder="C">

                            
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="filebutton">Phí vận chuyển</label>
                            <input type="text" name="product_ship" id="product_ship">
                    </div>
                </div>
                <div class="product_save_info">
                    <input type="button" name="button_cancle" id="button_save_hide" value="Hủy">
                    <input type="button" name="button_save_hide" id="button_save_hide" value="Lưu và Ẩn">
                    <input type="button" name="button_save" id="button_save" value="Lưu và Hiển thị">     
                </div>
            </div>
        </div>
    </main>
</body> -->
	<form action="new" method="post">
		<label for="lname">Tên</label> <input type="text" name="name"><br>
		<br> <label for="lname">Giá</label> <input type="text"
			name="price"><br> <br>
		<!--  <label for="lname">Hình ảnh</label>
  <input type="text" name="image"><br><br>
  <label for="lname">Đã bán</label>
  <input type="text" name="sold"><br><br> -->
		<button type="submit">Submit</button>
		<button type="submit" formaction="/action_page2.php">Submit
			to another page</button>
	</form>
</html>