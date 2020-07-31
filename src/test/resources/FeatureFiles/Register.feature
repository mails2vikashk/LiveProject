Feature: Registration functionality scenarios


@Register @One
Scenario: Verify wheather the user is able to register into the Application by the provided details.
Given I launch the application 
And I navigate to Account Registration Page
When I provide all the valid details.
   |FirstName|Ravi|
   |LastName |Kiran|
   |Email    |mails2vikashk@gmail.com|
   |Telephone|6576688879|
   |Password |RKiran|
   
And I Select the privacy policy
And I Click on the continue button
Then I should see the User account has  Successfully created
