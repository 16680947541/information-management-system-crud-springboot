#### 一个简简单单的项目

#### 使用 SpringBoot + MySQL + MyBatisPlus + Vue3

创建 SQL 语句

```my
create table kthomework.bot
(
    id         int auto_increment
        primary key,
    user_id    int                                        not null,
    name       varchar(100)                               not null,
    surname    varchar(100)                               null,
    sex        varchar(5)                                 null,
    address    varchar(100)                               null,
    phone      varchar(100)                               null,
    email      varchar(100) default 'yezihui96@gmail.com' null,
    title      varchar(100)                               null,
    createtime datetime                                   null,
    modifytime datetime                                   null
);

create table kthomework.user
(
    id       int auto_increment
        primary key,
    username varchar(100)     null,
    password varchar(100)     null,
    photo    varchar(1000)    null,
    rating   int default 1500 null
);

```

如果没有用过 Vue， 需要先下载 node  和 npm，完成后克隆项目，在 web 文件夹下

执行 npm install , 下载完成后， vue ui 启动。 
