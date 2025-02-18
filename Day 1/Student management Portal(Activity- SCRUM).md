# Student management Portal(Activity- SCRUM)
---

# Sprint 1: User Authentication and Dashboard <2 weeks>

## Goal:
Implement user authentication (login/signup) and design the home page UI.

## Tasks:
- Set up the authentication system (e.g., using OAuth, JWT).
- Create user registration and login forms.
- Design the home page layout and UI components.
- Implement navigation and basic user interface.
- Add documentation for the implemented features.

## Error Handling:
- Implement error messages for failed login attempts (e.g., incorrect password, user not found).
- Handle errors during user registration (e.g., duplicate email, weak password).
- Ensure the home page gracefully handles loading errors and displays appropriate messages.

## Week 1:
- User authentication: On successful registration, redirect to the login page.
- Login page includes fields for username (either user or admin) and password (hashed).
- On successful or unsuccessful login, display a pop-up message indicating the result.
- Include a "Forgot Password" page.
- Dashboard features a user profile displaying name, user ID (USN), and branch.

## Week 2:
- Create a landing page featuring graphs for courses, program attendance, and registered courses.
- The landing page includes navigation, a logout option, and a chatbot.

## Goals for Week 2:
- Achieve successful login.
- Ensure the dashboard displays successful login status.

## What Went Well:
- Successful implementation of the dashboard and login functionality.

## Challenges:
- Managing multiple user login attempts.

## Improvements:
- Add more interactive elements to enhance user experience.
- If waiting time is prolonged, consider adding a small game for user engagement.
- Focus on improving request success rates and ensuring user-friendly navigation.
- Enhance UI for better usability and security.

---

# Sprint 2: Student and Course Management <3 Weeks>

## Goal:
Develop features for managing student profiles and courses.

## Tasks:
- Create CRUD (Create, Read, Update, Delete) operations for student profiles.
- Implement course creation, enrollment, and management.
- Design and develop course-related UI components.
- Ensure data validation and consistency.

## Error Handling:
- Handle errors during CRUD operations (e.g., invalid data, database connection issues).
- Provide feedback for failed course enrollment (e.g., course full, prerequisites not met).
- Ensure data validation errors are clearly communicated to the user.

## Week 1:
- Implement CRUD operations for student management, allowing for the addition, removal, and updating of student profiles.
- Create a student community feature for interaction among students.
- Collect documents for age trend analysis and gather data on students' areas of interest.
- Generate reports based on course attendance, status (ongoing, completed, joined), and student achievements.

## Week 2:
- Focus on course management using CRUD operations to create and manage courses.
- Allow the addition of course materials such as PDFs and MP4 videos.
- Enable both students and admins to add courses, with a requirement for student course additions to receive approval.
- Implement a ranking portal to track student achievements and course completions.
- Track the number of registered students and their course completion status based on the defined timeline.

## Week 3:
- Conduct unit testing, integrity testing, and system testing to ensure the reliability and performance of the implemented features.

---

# Sprint 3: Attendance Tracking and Reporting

## Goal:
Implement attendance tracking and reporting features.

## Tasks:
- Develop the attendance tracking system (mark attendance, view attendance records).
- Create reporting features (generate attendance reports, export data).
- Implement reminders for attendance.
- Design and develop UI components for attendance and reporting.
- Conduct final testing and bug fixing.

## Error Handling:
- Handle errors during attendance marking (e.g., network issues, invalid student ID).
- Ensure accurate reporting by handling data inconsistencies.
- Provide clear error messages for failed report generation or data export.

## Week 1:
- Focus on the attendance tracking system with a user-friendly UI for easy navigation and graphics.
- Allow registered students to mark their attendance, with lecturers having the authority to approve it.
- Implement a verification process where attendance is only approved after admin verification.
- Enable students to raise issues regarding attendance discrepancies.
- Display a calendar for easy tracking of attendance records.

## Week 2:
- Generate attendance reports in formats such as Excel or PDF.
- Allow for front-end editing of the attendance reports.
- Implement email notifications for attendance updates and reminders.

## Week 3:
- Conduct integrated testing for all components developed in previous sprints.
- Perform system testing to ensure overall functionality and performance.

## Week 4:
- Execute user acceptance testing (UAT) to validate the system against user requirements and expectations.
- Provide clear error messages for failed report generation or data export.

---
# Retrospective

## Sprint 1: User Authentication and Dashboard 

**Goal:**  
Implement user authentication (login/signup) and design the home page UI.

**What Went Well:**  
- Successfully set up the authentication system with smooth login and registration processes.
- The home page UI was designed and implemented effectively, providing a good user experience.
- Error handling for login and registration was well-received, with clear messages for users.

**Challenges Faced:**  
- Managing multiple user login attempts led to some performance issues.
- Some users experienced confusion regarding the password reset process.
- Initial navigation design required adjustments based on user feedback.

**Improvements:**  
- Enhance the user interface with more interactive elements to engage users.
- Implement a more intuitive password reset process.
- Optimize the system to handle multiple login attempts more efficiently.

---

## Sprint 2: Student and Course Management

**Goal:**  
Develop features for managing student profiles and courses.

**What Went Well:**  
- Successfully implemented CRUD operations for student profiles and courses.
- The student community feature fostered interaction among students.
- Reports on course attendance and student achievements were generated effectively.

**Challenges Faced:**  
- Some data validation issues arose during CRUD operations, leading to user frustration.
- The approval process for course additions was initially unclear to students.
- Integration of multimedia content (PDFs, videos) faced technical challenges.

**Improvements:**  
- Improve data validation feedback to users for a smoother experience.
- Clarify the course addition approval process through better UI messaging.
- Streamline the integration of multimedia content for course management.

---

## Sprint 3: Attendance Tracking and Reporting

**Goal:**  
Implement attendance tracking and reporting features.

**What Went Well:**  
- The attendance tracking system was developed with an intuitive UI, making it easy for students and lecturers to use.
- The reporting features allowed for effective generation and editing of attendance reports.
- Email notifications for attendance updates were successfully implemented.

**Challenges Faced:**  
- Data inconsistencies during report generation caused delays.
- Some students encountered network issues when marking attendance.
- Integration testing revealed unexpected bugs that required additional time to fix.

**Improvements:**  
- Enhance error handling to provide clearer messages for users during attendance marking.
- Allocate more time for testing phases to catch bugs earlier in the process.
- Gather user feedback on the attendance UI for further improvements in future sprints.
---
