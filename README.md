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
- Manage crop quantity and land size with measurement units
- Update crop status:
  - Growing
  - Ready to Harvest
  - Harvested
  - Damaged
- View personal crop records in tables
- Search and filter crop information

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

### Reports & Decision Making
- Total registered users by role
- Total crops in the system
- Crops by category
- Harvested crops report
- Growing and damaged crops report
- Crop availability insights
- Farmer productivity tracking
- Seasonal crop activity reports

### User Interface Features
- Interactive Java Swing graphical user interface
- JTable-based data management
- Search and filtering functionality
- Hover effects and navigation panels
- Dynamic form navigation
- Validation messages and confirmation dialogs

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

- **Users** – Stores user details and account roles (`Admin`, `Farmer`, `Field Officer`, `Buyer`)
- **Crops** – Stores crop information including planting schedules, harvest dates, land size, quantity, category, status, and farmer ownership

### Relationships

- One User (**Farmer**) → Many Crops  
- One Crop → Belongs to One Farmer  

The system uses **foreign keys** to maintain data consistency and ensure proper relationships between users and crops.

---

## Role Overview

### Admin
Responsible for managing the entire system.

Capabilities:
- Manage users
- View all crops
- Access reports
- Monitor agricultural activities
- Review system statistics

### Farmer
Responsible for maintaining crop records.

Capabilities:
- Add crops
- Update crop details
- Monitor crop progress
- Track harvest schedules

### Field Officer
Responsible for monitoring crop progress.

Capabilities:
- View farmer crop records
- Monitor crop conditions
- Support agricultural decision making

### Buyer
Responsible for crop purchasing preparation.

Capabilities:
- View available crops
- Monitor harvest-ready products

---

## Setup Instructions

### 1. Clone the Repository

```bash
git clone YOUR_REPOSITORY_LINK
```

Or download the project ZIP and extract it.

---

### 2. Open Project in Apache NetBeans

1. Open **Apache NetBeans**
2. Click **Open Project**
3. Select the project folder
4. Wait for dependencies to load

---

### 3. Setup MySQL Database

1. Open **XAMPP** or your MySQL server
2. Start:
   - Apache
   - MySQL

3. Open **phpMyAdmin**

4. Create a database:

```sql
CREATE DATABASE farmspheredb;
```

5. Import the provided SQL file (if available)

OR manually create required tables.

---

### 4. Configure Database Connection

Open the database connection class and configure credentials:

Example:

```java
Connection conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/farmspheredb",
    "root",
    ""
);
```

Update:
- Database name
- Username
- Password

according to your MySQL configuration.

---

### 5. Add Required Libraries

Add required JAR files to NetBeans project libraries.

Required library:
- **JGoodDatePicker**

Steps:
1. Right-click project
2. Properties
3. Libraries
4. Add JAR/Folder
5. Select the JGoodDatePicker `.jar`

---

### 6. Run the Application

1. Open the main form (`LoginForm.java`)
2. Click **Run Project**
3. Login and start using the system

---

## Purpose

The goal of this project is to provide a practical and user-friendly agriculture management solution that supports crop management, seasonal monitoring, supply preparation, and agricultural decision-making through an enterprise-style desktop application.

This project was developed to demonstrate:

- Core programming concepts
- Advanced graphical user interface development
- Database operations using JDBC
- Role-based system design
- Reporting and management decision support
- Enterprise application deployment preparation

---

## Future Improvements

- Crop health recommendation system
- Weather-based farming suggestions
- Dashboard analytics and charts
- PDF/Excel report exporting
- Notification system for harvest schedules
- Advanced search and filtering
- Improved UI/UX enhancements
- Mobile or cloud integration support
