📁 README.md

# Java Console-Based Chat Application

This is a basic **Client-Server Chat Application** built using **Java**, utilizing **Socket Programming** and **Multithreading**. It runs on the command line interface (CLI) and demonstrates how two programs (client and server) can communicate over a network.

---

## 💡 Features

- Console-based chat system
- Real-time messaging between client and server
- Uses multithreading to handle multiple clients
- Socket-based networking

---

## 🔧 Technologies Used

- Java (JDK 1.8)
- Socket Programming (java.net package)
- Multithreading (java.lang.Thread)
- Command Line / VS Code Terminal

---

## 🛠️ How to Run

### 1. Compile the programs
```bash
javac ChatServer.java
javac ChatClient.java

2. Run the Server

java ChatServer

3. Run the Client (in another terminal)

java ChatClient


---

📂 File Structure

ChatApp/
├── ChatServer.java
├── ChatClient.java
└── README.md


---

📘 Concepts Used

Socket – for creating server and client endpoints.

ServerSocket – to listen for incoming client connections.

Multithreading – so the server can handle messages and responses simultaneously.

Input/Output Streams – for sending and receiving data.



---

✨ Sample Output

Server Terminal:

Server started...
Client connected!
Client: Hello Server

Client Terminal:

Client started...
Connected to Server!
You: Hello Server


---

📌 Note

Ensure Java is installed and added to your system PATH.

For multiple clients, you can create multiple instances of ChatClient.java.



---

👩‍💻 Made with ❤️ by Ashi Tomar

---