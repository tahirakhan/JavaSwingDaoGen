# SQL command to create the table: 
# Remember to correct VARCHAR column lengths to proper values 
# and add additional indexes for your own extensions.

# If you had prepaired CREATE TABLE SQL-statement before, 
# make sure that this automatically generated code is 
# compatible with your own code. If SQL code is incompatible,
# it is not possible to use these generated sources successfully.
# (Changing VARCHAR column lenghts will not break code.)

CREATE TABLE Department (
      department_id bigint NOT NULL,
      department_name varchar(255),
      status varchar(255),
      created_by varchar(255),
      created_on datetime,
      edited_by varchar(255),
      edited_on datetime,
PRIMARY KEY(department_id),
INDEX Department_department_id_INDEX (department_id));