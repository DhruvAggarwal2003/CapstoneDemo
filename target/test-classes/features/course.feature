Feature: Number of Courses Displayed
Scenario: Verify the number of available courses on the website
Given The user is on the courses page
When The user views the list of available courses
Then  The total number of displayed courses should be correct