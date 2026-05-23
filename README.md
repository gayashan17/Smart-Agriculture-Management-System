# FarmSphere - Smart Agriculture Management System

A desktop-based Smart Agriculture Management System developed using Java Swing, Apache NetBeans, and MySQL. The application is designed to support farmers, field officers, and buyers by managing seasonal farming activities, crop monitoring, crop health tracking, and harvest preparation through a centralized role-based platform.

---

## Features

### Authentication & User Management
- User authentication and secure login system
- Role-based access for **Admin**, **Farmer**, **Field Officer**, and **Buyer**
- Create and manage user accounts
- Profile management and logout functionality
- Input validation and secure database operations 

### Farmer Features
- Register and manage crop records
- Add, update, and delete crop information
- Track planting and harvest schedules
- Update crop status
- View personal crop records in tables
- Search and filter crops

### Field Officer Features
- View farmer crop records
- Monitor crop progress and health
- Review crop conditions
- Support crop management and seasonal monitoring

### Buyer Features
- View available crops
- Browse harvest-ready products
- Monitor crop availability and supply preparation

### Admin Features
- Dashboard with system statistics
- Manage all users (Farmers, Field Officers, Buyers)
- Add, update, delete, and search user records
- View and manage all crop records
- Monitor crop status and ownership
- Access reporting and management insights
- View agriculture-related reports for decision making

---

## Technologies Used

- **Programming Language:** Java  
- **Framework / GUI:** Java Swing  
- **IDE:** Apache NetBeans  
- **Database:** MySQL  
- **Database Connectivity:** JDBC
- **Libraries:** JGoodDatePicker  

---

## Database Structure

The application uses multiple relational database tables to manage users, crops, and system activities.

### Main Tables

- **Users** – Stores user details and account roles 
- **Crops** – Stores crop information

---

## Setup Instructions

### 1. Clone the Repository
Or download the project ZIP and extract it.

### 2. Open Project in Apache NetBeans
1. Open **Apache NetBeans**
2. Click **Open Project**
3. Select the project folder
4. Wait for dependencies to load

### 3. Setup MySQL Database
5. Import the SQL file

### 5. Add Required Libraries
Add required JAR files to NetBeans project libraries.

Required library:
- **JGoodDatePicker**


### 6. Run the Application

## Purpose

The goal of this project is to provide a practical and user-friendly agriculture management solution that supports crop management, seasonal monitoring, supply preparation, and agricultural decision-making through an enterprise-style desktop application.
