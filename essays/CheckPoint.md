---
layout: essay
type: essay
title: Checkpoint Post - Assignment 4
# All dates must be YYYY-MM-DD format!
date: 2019-12-11
labels:
  - Software Engineering
  - Projects
---

Group Members: Nicole Nagatoshi, Joseph Gomes

# Web Application Details
For our ITM Assignment 4, we will be attempting to modify a previously created punchcard system application created in php and instead run through javascript and server software that we have learned in this course. We will also try to improve both the applications visuals, improve both User and Manager interfaces, and also attempt to include additional functionality to the system, specifically in how punchcards are accessed and how items can be marked off after each purchase.

We will attempt to make use of the following items:
* __Sessions/Cookies:__
  * We want to use sessions/cookies to keep both the user and manager logged-in to their respective interfaces until they are logged out either manually or after a certain period of time. We also want to use these to carry information for whether or not a customer should receive a new punch on their punchcard.
 * __File I/O and Multi-dimensional arrays:__
   * If we are unable to figure out connecting and using a database to store our client data, we will most likely use a File I/O to read and write to a JSON file containing user registration data, punchcard statuses, and other aspects which we need to store to run our punchcard system.
 * __Form processing / validation of entries:__
   * For users to access their punchcard, they will need to login. We will be using a number of forms to either have a user login to an existing account, or register a new account which will be pushed to either a .json file + array similarly to Assignment 2, or to a SQL database similarly to the existing php example. These forms will be validated to ensure correct logins and to prevent re-registering / overwriting of existing users.
 * __CSS/HTML5:__
   * We are heavily using CSS across our many HTML pages (featuring mainly an index hompage, login pages, and smaller pages that link to the company's social media amoung other things) to create a pleasing user interface on the customer side.  This includes attempts to match the existing company's website, as well as the creation of popup windows to featuring registration/login.
 * __Loops/Conditionals:__
   * We are thinking of using different loops/conditionals to generate the customer's punch card on a 'check loyalty status' page that will regenerate a premade punchcard image, possibly based on their number of purchases or if a manager presses a button to add a stamp to their existing punchcard.

Our plan to successfully complete the project before the end of the semester is to continue to work together on specific aspects of assignment and divide our workload across different tools for us to focus on.  If there are any sections that may be getting out of our hands or becoming more complicated than previously thought, we will revert back to examples from lab that we are more comfortable with. 

We have currently created a number of heavily CSS's pages featuring our homepage, login and registration forms, and some small offshoot pages for links to pages like social media. We have also begin construction on the actual punchcard spread across multiple images and have begin connecting up our forms to a temporary json file storage system. We will also be focusing on researching connecting a simple SQL database to our form system to begin storing our user data outside of the json file.
