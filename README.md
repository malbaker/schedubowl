# bowling-demo
Demo App for Bowling Reservation Sytem using Maven and JSP

Team 25: Malik Baker, Hewlett Angela Chao, Abigail Gualda, Andrea Lopez


Third-Party Integrations and Services:
- MongoDB (database)
- SpringBoot
- Calendly Reservation System
- Zapier Integration 
	- automatically transfers data from Calendly to a Google Sheet
	

The bowling reservation system requires a MongoDB Compass download and connection in order to view the web application, as it is still in a local host. 
	Steps:
		1. Download MongoDB Compass: https://www.mongodb.com/try/download/compass?tck=docs_compass
		2. Log in to MongoDB Account:
			a. https://account.mongodb.com/account/login
			b. Click "Log in with Google"
				User: schedubowl.cs411@gmail.com
				Password: CS411spring2022
		3. Connect to the schedubowl-dedicated server with this URI:
		mongodb+srv://mbaker:JCole2014Forest@schedubowl-dedicated.cxx0m.mongodb.net/test
		4. Launch SchedUBowlApplication.java
		5. Open a web browser and use this link: localhost:6969

The actual website is pretty simple, with just a log in page in the beginning to allow users to log in to their account or to register for a new one. There is a distinction between the admin account type and the user account type, as admin accounts are able to view all total reservations, while user accounts can only view their own created reservations. 

Once logged in, the website opens to a minimal landing page, where users can view their created reservations and book a new one. Clicking on the link to book a new reservation will open a pop-up window with the Calendly reservation page, allowing users to view a calendar with a selection of availabilities. Users can select the date/time for a new reservation and then they are taken to a form where they can input the necessary information for their bowling reservation. Users will need to input their name and email, request the number of lanes (from 1-3), reserve shoes and sizes, and specify whether they would like to have gutters raised. 
Once the user successfully creates the reservation, their reservation details will appear on their account. 

---

MongoDB:
The data stored in our MongoDB server is mainly housed in the "test-db" database. Within this database, the "AppUser" collection holds the accounts registered with our website, and the "test" collection holds the total list of created reservations. 








