ashish is a user service with server (9090)

grpc is a token service with server (9091) and client

Database details:-
database : pgAdmin
database name : login
table name : logindetails

Connection details:-
String url = "jdbc:postgresql://localhost:5432/login";
Class.forName("org.postgresql.Driver");
connection = DriverManager.getConnection(url, "postgres", "1998");

Command to change password :-
ALTER USER postgres PASSWORD 'new Password'
