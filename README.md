# 🚀 OrangeHRM Automation Testing Project

## 📌 Project Overview

This project is an automation testing framework developed for the OrangeHRM web application using Selenium WebDriver, Java, TestNG, Maven, and the Page Object Model (POM) design pattern.

The framework automates key functionalities of the OrangeHRM application, reducing manual testing effort and improving test execution efficiency.

---

## 🎯 Objectives

- Automate login functionality.
- Validate successful dashboard navigation.
- Automate employee addition in the PIM module.
- Automate logout functionality.
- Implement a maintainable and scalable framework using Page Object Model (POM).
- Execute test cases using TestNG.

---

## 🛠️ Tools & Technologies Used

| Technology | Purpose |
|------------|----------|
| Java | Programming Language |
| Selenium WebDriver | Browser Automation |
| TestNG | Test Execution Framework |
| Maven | Dependency Management |
| Eclipse IDE | Development Environment |
| WebDriverManager | Driver Management |
| Git & GitHub | Version Control |

---

## 📂 Project Structure

```plaintext
OrangeHRM_Automation
│
├── src/test/java
│   ├── base
│   │   └── BaseTest.java
│   │
│   ├── pages
│   │   ├── LoginPage.java
│   │   ├── DashboardPage.java
│   │   └── PIMPage.java
│   │
│   └── tests
│       ├── LoginTest.java
│       └── PIMTest.java
│
├── testNG.xml
├── pom.xml
└── README.md
```

---

## 🧪 Test Scenarios Covered

### ✅ Login Functionality
- Launch browser
- Navigate to OrangeHRM
- Enter valid credentials
- Verify successful login

### ✅ Dashboard Validation
- Verify dashboard is displayed after login

### ✅ Employee Management
- Navigate to PIM Module
- Add a new employee
- Save employee details

### ✅ Logout Functionality
- Open profile menu
- Logout successfully

---

## 🌐 Application Under Test

**OrangeHRM Demo Website**

https://opensource-demo.orangehrmlive.com/

---

## ▶️ How to Run the Project

### Prerequisites

- Java JDK 8 or above
- Eclipse IDE
- Maven
- Google Chrome

### Steps

1. Clone the repository

```bash
git clone https://github.com/Kushagra1976/OrangeHRM_Automation.git
```

2. Open the project in Eclipse.

3. Update Maven Dependencies

```plaintext
Right Click Project → Maven → Update Project
```

4. Run TestNG Suite

```plaintext
Right Click testNG.xml → Run As → TestNG Suite
```

---

## 📊 Framework Design

The framework follows the **Page Object Model (POM)** design pattern.

### Layers

- Base Layer
  - Browser setup and teardown

- Page Layer
  - Web element locators
  - Page-specific actions

- Test Layer
  - Test execution logic

This design improves:

- Code Reusability
- Maintainability
- Readability
- Scalability

---

## 📈 Results

- Successfully automated Login functionality.
- Successfully automated Add Employee functionality.
- Successfully automated Logout functionality.
- Improved testing efficiency and reduced manual effort.
- Stable execution using TestNG and Selenium WebDriver.

---

## 🚀 Future Enhancements

- Implement Explicit Waits (WebDriverWait)
- Add Extent Reports
- Capture Screenshots on Failure
- Data-Driven Testing using Excel
- Cross-Browser Testing
- Jenkins CI/CD Integration

---

## 👨‍💻 Author

**Kushagra Bansal**

B.Tech Computer Science Engineering  
SRM Institute of Science and Technology

GitHub: https://github.com/Kushagra1976

---

## 📄 License

This project is developed for educational and learning purposes.
