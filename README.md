# Spring Boot Web Application
This repository has the project files for a tutorial series on Spring Boot available from by website at [Spring Framework}

After the project start 

Drop the user_roles table

 CREATE TABLE `user_role` (
  `user_id` bigint(20) NOT NULL,
  `roles_role_id` bigint(20) NOT NULL,
  CONSTRAINT `FK5scdquo6f12cpstqai86x4biw` FOREIGN KEY (`roles_role_id`) REFERENCES `role` (`role_id`),
  CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 

Create is using this above command
