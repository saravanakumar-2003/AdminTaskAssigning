# AdminTaskAssigning

5 users - 
1 admin -

3 views - 1. user login to view user's project and tasks
	  2. admin login to view all projects, tasks and user of tasks
	  3. project name to view all tasks in project and user assigned to that project

Entity -

1. user entity - id, name, username, password
2. admin entity - id, name , username, password
3. project entity - projId, projName
4. task entity - taskId, taskName, projId, userId


user -> task - one to many
task -> user - many to one 


project -> task - one to many
task -> project - many to one
