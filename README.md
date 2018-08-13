####一. 说明
1. 运行tomcat自动跳转到项目首页index.jsp

2. 项目首页有三个超链接，分别可以跳转到登陆界面，电影列表界面，插入界面

3. 登陆界面需要验证用户名是否为数据库中customer中的first_name,存在跳转到列表界面，不存在提示用户名不存在

4. 插入界面可以把数据插入进数据库中，language为下拉列表

5. 列表界面可以看见所有电影的数据，并且可以选择更新或者删除

6. 更新和删除界面会显示当前数据项的数据，单击确认按钮确定更改或者删除

7. 数据库名称root,密码sasa

####二.运行截图

1. 主界面

![Main](/img/main.png "Main")

2. 登陆界面

![login](/img/login.png "login")

3. 登陆成功（查找到数据）

![loginSuc](/img/loginSuc.png "loginSuc")

4. 登陆失败（查无此人）

![loginFail](/img/loginFail.png "loginFail")

5. 电影列表（登陆跳转）

![show](/img/show.png "show")

6. 修改（修改界面id文本框是只读的）

![update](/img/update.png "update")

7. 修改结果

![updateRes](/img/updateRes.png "updateRes")

8. 删除（删除界面四个文本框都是只读的，仅用于确认是否删除）

![delete](/img/delete.png "delete")

9. 删除结果

![deleteRes](/img/deleteRes.png "deleteRes")

10. 插入

![add](/img/add.png "add")

11. 插入结果

![addRes](/img/addRes.png "addRes")

12. 操作成功（增删改成功）

![opSuc](/img/opSuc.png "opSuc")




