FrameWorks and Languages  
Java17 Spring Boot


Browser/Tools  
*Google Chrome and Postman

Model 
private int Id;  
@NotBlank   
private String userName;  
@Pattern(regexp = "[0-9]{2}-[0-9]{2}-[0-9]{4}", message = "Enter a valid date (DD-MM-YYYY)")  
private String dateOfBirth;  
@Email   
private String email;  
@Pattern(regexp = "[0-9]{12}", message = "Phone number must be contains 12 digits!")   
private String phoneNo;
@Pattern(regexp = "[0-9]{2}-[0-9]{2}-[0-9]{4}", message = "Enter a valid date (DD-MM-YYYY)")   
private String date;
@Pattern(regexp = "[0-9]{2}:[0-9]{2}", message = "Enter a valid time (HH:MM)")  
private String time;

DataFlow 
End Points / Controllers  
addUser  
getUser  
getUser/{id}  
updateUser/{userId}  
deleteUser/{userId}  

Service  
For adding user  
public String addUser(User newUser)  
For getting all the users  
public List getUser()  
For getting user based on Id  
public User getUserById(int id)  
For updating user info  
public String updateUser(User updatedUser, int id)  
For deleting an user  
public List deleteUser(int id)  

Database  
I haven't used any Database in this project yet. But for data storing I have used an Collections.
  
Datastructures  
ArrayList
