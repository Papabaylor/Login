# Login API

The `Login` API provides user authentication functionality with Google and Apple sign-in options. It allows users to securely log in to the application using their Google or Apple accounts.

## Features
- **Google Login:** Users can log in using their Google accounts.
- **Apple Login:** Users can log in using their Apple accounts.
- **Token-based Authentication:** Generates and returns a token upon successful login for session management.
- **Secure:** Uses OAuth 2.0 for secure authentication.

## Usage
To use the `Login` API, send a POST request with the user's Google or Apple credentials. The API will validate the credentials and return a token if the login is successful.

## Example
```java
// Example code for using the Login API
String token = loginAPI.loginWithGoogle(googleCredentials);
if (token != null) {
    // Login successful
    System.out.println("Login successful. Token: " + token);
} else {
    // Login failed
    System.out.println("Login failed.");
}
```
