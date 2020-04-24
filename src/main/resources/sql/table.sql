create table t_department
(
    id          int(11)      NOT NULL AUTO_INCREMENT,
    name        varchar(100) not null comment '专业名称（系别）',

    activated   bit(1)       NOT NULL DEFAULT b'1' COMMENT '状态',
    created_by  varchar(50)           DEFAULT 'system' COMMENT '创建人',
    updated_by  varchar(50)           DEFAULT 'system' COMMENT '更新人',
    create_time datetime              DEFAULT NULL COMMENT '创建时间',
    update_time timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (id) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  ROW_FORMAT = COMPACT COMMENT ='专业信息表（系别）';

create table t_class
(
    id            int(11)      NOT NULL AUTO_INCREMENT,
    name          varchar(100) not null comment '班级全称',
    number        int(2)                default null comment '班级号',
    department    varchar(100) not null comment '专业名名称（系别）',
    department_id int(11)      not null comment '专业标识',
    instructor_id int(11)               default null comment '辅导员标识',

    activated     bit(1)       NOT NULL DEFAULT b'1' COMMENT '状态',
    created_by    varchar(50)           DEFAULT 'system' COMMENT '创建人',
    updated_by    varchar(50)           DEFAULT 'system' COMMENT '更新人',
    create_time   datetime              DEFAULT NULL COMMENT '创建时间',
    update_time   timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (id) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  ROW_FORMAT = COMPACT COMMENT ='班级信息表';

CREATE TABLE t_student
(
    id          int(11)     NOT NULL AUTO_INCREMENT,
    name        varchar(50) not NULL COMMENT '全名',
    number      int(11)     not null unique comment '学号',
    grade       int(5)      not null comment '入学年份，年级',
    class_id    int(11)              default null comment '所属班级标识',
    phone       int(11)              default null comment '联系方式，电话',
    email       varchar(100)         DEFAULT NULL COMMENT '用户邮箱',

    activated   bit(1)      NOT NULL DEFAULT b'1' COMMENT '状态',
    created_by  varchar(50)          DEFAULT 'system' COMMENT '创建人',
    updated_by  varchar(50)          DEFAULT 'system' COMMENT '更新人',
    create_time datetime             DEFAULT NULL COMMENT '创建时间',
    update_time timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (id) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  ROW_FORMAT = COMPACT COMMENT ='学生信息表';

create table t_teacher
(
    id            int(11)      NOT NULL AUTO_INCREMENT,
    name          varchar(100) not null comment '教师名称',
    department_id int(11)               default null comment '专业标识',
    number        int(11)      not null comment '教师编号',
    title         varchar(2)            default null comment '教师职称',

    activated     bit(1)       NOT NULL DEFAULT b'1' COMMENT '状态',
    created_by    varchar(50)           DEFAULT 'system' COMMENT '创建人',
    updated_by    varchar(50)           DEFAULT 'system' COMMENT '更新人',
    create_time   datetime              DEFAULT NULL COMMENT '创建时间',
    update_time   timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (id) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  ROW_FORMAT = COMPACT COMMENT ='教师信息表';

create table t_course
(
    id            int(11)      NOT NULL AUTO_INCREMENT,
    name          varchar(100) not null comment '课程名称',
    department_id int(11)               default null comment '专业标识',

    activated     bit(1)       NOT NULL DEFAULT b'1' COMMENT '状态',
    created_by    varchar(50)           DEFAULT 'system' COMMENT '创建人',
    updated_by    varchar(50)           DEFAULT 'system' COMMENT '更新人',
    create_time   datetime              DEFAULT NULL COMMENT '创建时间',
    update_time   timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (id) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  ROW_FORMAT = COMPACT COMMENT ='课程信息表';

create table r_class_course
(
    class_id  int(11) comment '班级标识',
    course_id int(11) comment '课程标识'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  ROW_FORMAT = COMPACT COMMENT ='班级，课程关联表';

create table r_teacher_course
(
    teacher_id int(11) comment '教师标识',
    course_id  int(11) comment '课程标识'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  ROW_FORMAT = COMPACT COMMENT ='教师，课程关联表';

CREATE TABLE `user`
(
    `id`          int(11)      NOT NULL AUTO_INCREMENT,
    `login`       varchar(50)  NOT NULL COMMENT '登录名',
    `password`    varchar(100) not null comment '密码',
    `email`       varchar(100)          DEFAULT NULL COMMENT '用户邮箱',
    `full_name`   varchar(50)           DEFAULT NULL COMMENT '全名',
    `authorities` varchar(255)          DEFAULT NULL COMMENT '用户角色',
    `activated`   bit(1)       NOT NULL DEFAULT b'1' COMMENT '状态',
    `created_by`  varchar(50)           DEFAULT 'system' COMMENT '创建人',
    `updated_by`  varchar(50)           DEFAULT 'system' COMMENT '更新人',
    `create_time` datetime              DEFAULT NULL COMMENT '创建时间',
    `update_time` timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE KEY `uidx_user_login` (`login`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  ROW_FORMAT = COMPACT COMMENT ='用户信息表';