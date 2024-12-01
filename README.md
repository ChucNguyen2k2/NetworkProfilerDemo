# NetworkProfilerDemo
demo use Network Profiler in android studio 
Mục tiêu: Sử dụng công cụ Network Profiler để phân tích lưu lượng mạng của ứng dụng.

a. Chạy ứng dụng trên thiết bị thật hoặc giả lập
Kết nối điện thoại thật qua USB và bật Developer Options (bật USB Debugging) hoặc chạy ứng dụng trên một thiết bị giả lập có API >= 26.  
Nhấn Run để cài đặt và chạy ứng dụng.  

b. Mở Network Profiler  
Trong Android Studio, mở Profiler bằng cách vào View > Tool Windows > Profiler.  
Chọn thiết bị và ứng dụng đang chạy.  

c. Quan sát dữ liệu mạng  
Nhấn vào tab Network trong Profiler.  
Thực hiện hành động trong ứng dụng, như nhấn nút "Fetch Data".  

Quan sát các thông số:  
Request/Response: Hiển thị URL và dữ liệu tải lên/tải xuống.  
Latency: Thời gian để nhận phản hồi từ server.  
Throughput: Dữ liệu truyền tải mỗi giây.  
  

Phân tích và tối ưu hóa  
Nhận diện vấn đề:
Quan sát xem ứng dụng có thực hiện nhiều yêu cầu nhỏ hay không, hoặc thời gian phản hồi có quá cao.  

Tối ưu hóa:  
Gộp các yêu cầu nếu có thể.  
Sử dụng bộ nhớ đệm (caching) để giảm tải mạng.  
Giảm kích thước dữ liệu truyền tải.  
