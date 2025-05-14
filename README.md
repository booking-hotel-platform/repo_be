# HOTEL BOOKING PLATFORM API

## Giới thiệu
API này cung cấp các chức năng quản lý đặt phòng khách sạn, bao gồm CRUD (Tạo, Đọc, Cập nhật, Xóa) cho các đặt phòng, khách sạn, người dùng, đánh giá và thanh toán.

## Link Deploy
https://jame-booking.netlify.app/

## URL và Chức Năng

### 1. **Bookings**
- **`POST /api/bookings`**: Tạo một đặt phòng mới.
- **`PUT /api/bookings/{id}`**: Cập nhật thông tin đặt phòng theo ID.
- **`GET /api/bookings`**: Lấy danh sách tất cả các đặt phòng.
- **`GET /api/bookings/{id}`**: Lấy thông tin đặt phòng theo ID.
- **`DELETE /api/bookings/{id}`**: Xóa một đặt phòng theo ID.

### 2. **Hotels**
- **`POST /api/hotels/createHotel`**: Tạo một khách sạn mới.
- **`GET /api/hotels`**: Lấy danh sách tất cả các khách sạn.
- **`GET /api/hotels/{id}`**: Lấy thông tin khách sạn theo ID.
- **`PUT /api/hotels/{id}`**: Cập nhật thông tin khách sạn theo ID.
- **`DELETE /api/hotels/{id}`**: Xóa một khách sạn theo ID.

### 3. **Users**
- **`POST /api/auth/signup`**: Đăng ký người dùng mới.
- **`POST /api/auth/signin`**: Đăng nhập người dùng.
- **`GET /api/users`**: Lấy danh sách tất cả người dùng.

### 4. **Reviews**
- **`POST /api/reviews`**: Tạo một đánh giá mới cho khách sạn.
- **`GET /api/reviews`**: Lấy danh sách tất cả đánh giá.
- **`PUT /api/reviews`**: Cập nhật đánh giá theo ID.
- **`DELETE /api/reviews`**: Xóa đánh giá theo ID.

### 5. **Payments**
- **`POST /api/payments`**: Tạo một thanh toán mới cho đặt phòng.
- **`GET /api/payments`**: Lấy thông tin thanh toán theo ID.

### 6. **Rooms**
- **`POST /api/rooms`**: Tạo một phòng mới cho khách sạn.
- **`GET /api/rooms`**: Lấy danh sách tất cả các phòng.
- **`GET /api/rooms/{id}`**: Lấy thông tin phòng theo ID.

### 7. **Images**
- **`POST /api/images/upload`**: Tải lên hình ảnh cho phòng.
- **`GET /api/images`**: Lấy danh sách tất cả hình ảnh.

### 8. **Amenities**
- **`POST /api/amenities`**: Tạo một tiện nghi mới cho khách sạn.
- **`GET /api/amenities`**: Lấy danh sách tất cả tiện nghi.

## Cách Sử Dụng
- Để sử dụng API này, bạn cần gửi các yêu cầu HTTP đến các URL được liệt kê ở trên với các phương thức tương ứng (GET, POST, PUT, DELETE).
- Các yêu cầu cần có tiêu đề và nội dung thích hợp tùy thuộc vào từng endpoint.

## Tài Liệu Tham Khảo
- [Postman API Documentation](https://learning.postman.com/docs/writing-scripts/intro-to-scripts/)
- [RESTful API Concepts](https://restfulapi.net/)

