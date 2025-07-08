# Anime Watchlist

A simple **JavaFX** application that allows users to manage their anime watchlist. It uses **Firebase Authentication** for user login and **Firebase Firestore** to store and manage anime data.

## Features

- User authentication (Sign Up & Login)
- Add, Edit, and Delete anime from your watchlist
- Data is stored in **Firebase Firestore**

## Prerequisites

- **Java 17+**
- **Maven**
- **Firebase Project** with Firestore and Authentication enabled.

## Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/anime-watchlist.git
    cd anime-watchlist
    ```

2. Replace the Firebase API Key:
   - In `FireBaseAuthService.java`, replace `API_KEY` with your Firebase Web API Key.

3. Build and run the application:

    ```bash
    mvn clean install
    mvn javafx:run
    ```

4. Create a Firebase Project:
   - Set up Firebase Firestore and Authentication (Email/Password).
   - Add your Firebase API Key to the code.

## Folder Structure

```text
AnimeWatchlist/
├── Main.java
├── firebase/
│   └── FirebaseConfig.java
├── controllers/
│   ├── LoginController.java
│   ├── RegisterController.java
│   └── DashboardController.java
├── models/
│   ├── Anime.java
│   └── User.java
├── views/
│   ├── login.fxml
│   ├── register.fxml
│   └── dashboard.fxml
└── utils/
    └── SceneSwitcher.java
