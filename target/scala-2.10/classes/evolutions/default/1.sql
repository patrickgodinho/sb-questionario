# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table answer (
  id                        bigint not null,
  question_id               bigint,
  answer                    varchar(255),
  email                     varchar(255),
  constraint pk_answer primary key (id))
;

create table option (
  id                        bigint not null,
  question_id               bigint,
  value                     varchar(255),
  constraint pk_option primary key (id))
;

create table question (
  id                        bigint not null,
  quiz_id                   bigint,
  question                  varchar(255),
  type                      varchar(255),
  constraint pk_question primary key (id))
;

create table quiz (
  id                        bigint not null,
  user_id                   bigint,
  title                     varchar(255),
  description               varchar(255),
  constraint pk_quiz primary key (id))
;

create table USERS (
  id                        bigint not null,
  name                      varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  constraint pk_USERS primary key (id))
;

create sequence answer_seq;

create sequence option_seq;

create sequence question_seq;

create sequence quiz_seq;

create sequence USERS_seq;

alter table answer add constraint fk_answer_question_1 foreign key (question_id) references question (id);
create index ix_answer_question_1 on answer (question_id);
alter table option add constraint fk_option_question_2 foreign key (question_id) references question (id);
create index ix_option_question_2 on option (question_id);
alter table question add constraint fk_question_quiz_3 foreign key (quiz_id) references quiz (id);
create index ix_question_quiz_3 on question (quiz_id);
alter table quiz add constraint fk_quiz_user_4 foreign key (user_id) references USERS (id);
create index ix_quiz_user_4 on quiz (user_id);



# --- !Downs

drop table if exists answer cascade;

drop table if exists option cascade;

drop table if exists question cascade;

drop table if exists quiz cascade;

drop table if exists USERS cascade;

drop sequence if exists answer_seq;

drop sequence if exists option_seq;

drop sequence if exists question_seq;

drop sequence if exists quiz_seq;

drop sequence if exists USERS_seq;

