# SQL command to create the table: 
# Remember to correct VARCHAR column lengths to proper values 
# and add additional indexes for your own extensions.

# If you had prepaired CREATE TABLE SQL-statement before, 
# make sure that this automatically generated code is 
# compatible with your own code. If SQL code is incompatible,
# it is not possible to use these generated sources successfully.
# (Changing VARCHAR column lenghts will not break code.)

CREATE TABLE User (
      user_id bigint NOT NULL,
      user_name varchar(255),
      password varchar(255),
      remarks varchar(255),
      status varchar(255),
      created_on date,
      created_by varchar(255),
      edited_on date,
      edited_by varchar(255),
PRIMARY KEY(user_id),
INDEX User_user_id_INDEX (user_id));