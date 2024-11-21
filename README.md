# Advantage Shopping Automation Project

This project is an automated testing framework designed for the **Advantage Shopping Application**. It uses **Selenide** for browser automation and **TestNG** for managing and executing test cases. The project covers user functionalities like account creation, login with valid and invalid credentials, and user navigation, with detailed reporting using **Allure**.

---

## Features

### Automated Test Scenarios
1. **Account Creation**
    - Create a new account with randomly generated user data.
    - Validates successful registration.

2. **Login Functionality**
    - Login with valid credentials.
    - Validate error messages for invalid credentials.

3. **User Navigation**
    - Navigate to the user menu and interact with it.

### Reporting
- Generates **Allure Reports** for detailed insights into test execution, including:
    - Step-by-step logs.
    - Screenshots on failure.
    - Test environment information.

---

## Technologies Used

- **Java 17**: Primary programming language.
- **Maven**: Dependency and build management.
- **Selenide**: Simplifies browser automation.
- **TestNG**: Test execution and management.
- **Allure**: Test reporting.

---

## Prerequisites

Ensure the following are installed:
- **Java JDK 17+**
- **Maven**
- **Google Chrome** (latest version)
- **ChromeDriver** (compatible with Chrome version)
- **Allure CLI** (for generating reports)

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/GiorgiNikola/advantage-shopping-project.git
   cd advantage-shopping-automation
