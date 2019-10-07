# RetroUploadImageMultipart

Ini adalah project Sederhana mengupload image ke Server menggunakan Library Retrofit 2 dengan metode Multipart 

# Screenshoot

![11111](https://user-images.githubusercontent.com/15800599/66329679-1a0e0b80-e959-11e9-98b9-cbefb836b08a.jpg)
![1111](https://user-images.githubusercontent.com/15800599/66329677-1a0e0b80-e959-11e9-8d73-dfed56e61889.jpg)
![111](https://user-images.githubusercontent.com/15800599/66329676-1a0e0b80-e959-11e9-89d4-c7d90dcc725d.jpg)
![upload](https://user-images.githubusercontent.com/15800599/66329681-1aa6a200-e959-11e9-9356-57a9716deb73.png)



File upload.php 

```
<?php
	$action = htmlspecialchars($_POST['action']);
	$response = array("success" => FALSE);
	if($action == "multipart") {
	    if ($_FILES["photo"]["error"] > 0) {
	    	$response["success"] = FALSE;
			$response["message"] = "Upload Failed";
	    } else {
			$name_file=htmlspecialchars($_FILES['photo']['name']);
	        if (@getimagesize($_FILES["photo"]["tmp_name"]) !== false) {
				move_uploaded_file($_FILES["photo"]["tmp_name"], $name_file);
				$response["success"] = TRUE;
			    $response["message"] = "Upload Successfull";
			}else{
				$response["success"] = FALSE;
				$response["message"] = "Upload Failed";
			}
			echo json_encode($response);
	    }
	}
?>
```

Referensi ini saya ambil dari blog : http://wimsonevel.blogspot.com/2016/11/tutorial-android-upload-image-using.html
terimakasih Smeoga bermanfaat :)
