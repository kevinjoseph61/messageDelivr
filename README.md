# MessageDelivr
Real-time chat application using Firebase for Android
To use this application create a Firebase project and obtain the ```google-services.json``` file and put it under the ```app``` folder where a template json file is already kept. Obtain your server key from your project settings as shown below
![Server Key Image](repopic/serverkey.png?raw=true "Server Key Image")
and enter it under ``` app\src\main\java\com\example\messagedelivr\Fragments\APIService.java``` interface headers in Authorization
### Some UI pictures and functionalities
* Start Page, Login, SignUp
![Home](repopic/home.png?raw=true "Home")
* Messages, Users, Profile Tabs
![Tabs](repopic/tabs.png?raw=true "Tabs")
* Reset Passwords securely using Firebase
![Reset](repopic/reset.png?raw=true "Reset")
* Users marked as Online, Delivered and Seen messages
![Online](repopic/online.png?raw=true "Online")
* Push Notifications on new message
![Push](repopic/push.png?raw=true "Push")
* Update Profile Picture by uploading to Firebase Storage and edit name/bio
![Update](repopic/update.png?raw=true "Update")