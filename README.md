# **Waves of Food**

**Waves of Food** is a food ordering app that allows users to browse food items, place orders, and manage their cart. This project includes authentication, real-time data management using Firebase, and a smooth user experience for food lovers!

## **Features**
- **User Authentication** (Email/Password and Google Sign-In)
- **Firebase Realtime Database Integration**
- **Cart Management** (Add, Remove, and Update Quantities)
- **View and Place Orders**
- **Responsive and intuitive user interface**

## **Screenshots**
(screenshots/1.JPG)
(screenshots/cart_screen.png)
(screenshots/order_details_screen.png)


## **Prerequisites**
To run the app, ensure you have the following installed:
- **Android Studio** (latest version)
- **Java Development Kit** (JDK 22 or above)
- **Firebase account and setup** (you need your own `google-services.json` file for Firebase integration)

## **How to Run the App**

### **Step 1: Clone the Repository**
Clone the repository to your local machine

### **Step 2: Open the Project in Android Studio**
1. Launch **Android Studio**.
2. Select **Open an existing Android Studio project**.
3. Navigate to the cloned repository folder and select it.

### **Step 3: Set Up Firebase**
1. Go to [Firebase Console](https://console.firebase.google.com/).
2. Create a new Firebase project.
3. Add an Android app to your Firebase project by registering the package name.
4. Download the `google-services.json` file.
5. Place the `google-services.json` file inside the `app/` directory of your project.

### **Step 4: Sync Project with Gradle Files**
1. Open **Android Studio**.
2. Click on **Sync Now** at the top right when prompted, or go to **File > Sync Project with Gradle Files**.

### **Step 5: Run the App**
1. Connect an Android device via USB or set up an Android emulator.
2. In **Android Studio**, click on **Run** (the green play button) to build and launch the app on your connected device or emulator.

## **Technologies Used**
- **Android** (Java)
- **Firebase Authentication**
- **Firebase Realtime Database**
- **RecyclerView for dynamic lists**
- **Glide for image loading**
