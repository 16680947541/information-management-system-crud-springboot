#### 一个简简单单的项目



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

