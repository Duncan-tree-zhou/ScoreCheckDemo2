
/*tb_user;*/

insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('9a315103-cceb-467e-afbe-40d959bd8982','duncan','welcome',1,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('1070405f-94a7-47c4-a8db-99968ec6fe84','gary','welcome',1,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('0aa57096-f859-4d58-b7f4-99d6d69aa01e','gino','welcome',1,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('2733068b-e24b-45c2-9b14-6ec3ac9ae7ea','beya','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('4a1b3f1d-c640-44fb-b5d2-c84f49072ede','jeff','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('4b866d41-9397-44a5-b267-4b2220edf116','jerry','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('863ebd1d-46e7-4b43-b20f-ce3e0444d19b','bell','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('a21a2d57-772c-4642-8f73-da2958ecec3f','sandy','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('d72619f9-c623-470a-b965-5d4cd614a720','anna','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('a3b5db97-797a-4f0b-98d3-fc826df02516','simon','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('007e5538-6503-4d35-b55c-b77a451634c3','kevin','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('699ba68f-072f-4c1f-bd5a-e24961594cfb','lynn','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('7949b72c-7a1c-49ea-83c2-1863940679f7','sunny','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('62bdace0-bcd3-4931-9e6b-e57f12c1a0cf','macro','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('e13082ed-3a3c-4881-8b9e-b74f96a33859','jaskey','welcome',2,null);
insert into tb_user( uid, uname, upassword, uprivilege, u_fn_id) values ('d49409fd-5fb3-43bf-8c1f-d251d4ec5a5b','ice','welcome',2,null);


/*tb_class*/
insert into tb_class(cls_id ,cls_desc ,cls_start ,cls_end ,cls_type ) values ('30010120140001','初中部一四级一班','2014-09-01 00:00:00',null,'');
insert into tb_class(cls_id ,cls_desc ,cls_start ,cls_end ,cls_type ) values ('30010120140002','初中部一四级二班','2014-09-01 00:00:00',null,'');
insert into tb_class(cls_id ,cls_desc ,cls_start ,cls_end ,cls_type ) values ('30010120150001','初中部一五级一班','2015-09-01 00:00:00',null,'');
insert into tb_class(cls_id ,cls_desc ,cls_start ,cls_end ,cls_type ) values ('30010120150002','初中部一五级二班','2015-09-01 00:00:00',null,'');

/*tb_student*/

insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120140001001','','刘北娅','F','刘大海','13456745674');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120140001002','','黄杰夫','M','黄宝宝','13453453342');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120140001003','','李哲联','M','李桃花','13456745674');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120140001004','','龚彪','M','龚共','13456745674');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120140002001','','陈三迪','F','陈海鸥','13456745674');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120140002002','','林安娜','F','林森','13456745674');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120140002003','','郑熙门','M','郑远航','13456745674');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120140002004','','刘凯文','M','刘洪涛','13456745674');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120150001001','','李林','M','李发','13456745674');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120150001002','','吴马克','M','吴心水','13456745674');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120150001003','','郑思琪','F','郑雄兵','13456745674');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120150002001','','曾冰','F','曾帅','13456745674');
insert into tb_student(st_id,st_image,st_name ,st_gender  ,st_parent_name ,st_contact )values
('30010120150002002','','黄阳','F','黄大志','13456745674');



insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('658d2fb8-66b2-4d3d-9d76-fd3aa6a91fc6','30010120140001001','30010120140001','2014-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('ee59e073-ea12-47c7-b701-ddf44aeaac58','30010120140001002','30010120140001','2014-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('070ed0fb-5923-488a-a64a-16442fca36fa','30010120140001003','30010120140001','2014-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('2ae20605-ea22-44d8-af71-701c3faa8b65','30010120140001004','30010120140001','2014-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('ac61f703-cecd-4a3c-9df2-7eff3a20ae9b','30010120140002001','30010120140002','2014-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('977ec88a-2eca-4937-b069-fee7cf239537','30010120140002002','30010120140002','2014-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('4e955b37-47aa-44e7-af5e-29f74f89cdcf','30010120140002003','30010120140002','2014-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('de021337-f54f-44ea-9380-b19309782bc0','30010120140002004','30010120140002','2014-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('fd388346-fb7b-4866-bb1c-836b25a64977','30010120150001001','30010120150001','2015-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('eddd5427-1290-4a12-bd4d-e20783af7ad9','30010120150001002','30010120150001','2015-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('20eaf799-614e-4d76-81b0-866b4cef7d52','30010120150001003','30010120150001','2015-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('405897fa-d42d-4348-8718-00210d89da61','30010120150002001','30010120150002','2015-09-04 00:00:00',null);
insert into c_st_cls(c_id ,st_id ,cls_id,c_start,c_end)values('b5bfdc6b-213c-4d27-84c8-dc5bfade2f3c','30010120150002002','30010120150002','2015-09-04 00:00:00',null);

insert into tb_teacher(tch_id,tch_name,tch_image,tch_gender,tch_group,tch_contact)values(
'300101201300001','黄大江','','M','3001012014教务处','13545673453');

insert into tb_teacher(tch_id,tch_name,tch_image,tch_gender,tch_group,tch_contact)values(
'300101201400001','李飞鸿','','M','3001012014语文','13545673453');

insert into tb_teacher(tch_id,tch_name,tch_image,tch_gender,tch_group,tch_contact)values(
'300101201400002','刘独秀','','M','3001012014数学','13545673453');

insert into tb_teacher(tch_id,tch_name,tch_image,tch_gender,tch_group,tch_contact)values(
'300101201400003','周恩来','','M','3001012014英语','13545673453');

insert into tb_teacher(tch_id,tch_name,tch_image,tch_gender,tch_group,tch_contact)values(
'300101201400004','陈少奇','','M','3001012015语文','13545673453');

insert into tb_teacher(tch_id,tch_name,tch_image,tch_gender,tch_group,tch_contact)values(
'300101201400005','吴国潘','','M','3001012015数学','13545673453');

insert into tb_teacher(tch_id,tch_name,tch_image,tch_gender,tch_group,tch_contact)values(
'300101201400006','曾安妮','','M','3001012014英语','13545673453');


insert into tb_position(psn_id,psn_name,psn_desc)values(
'3b30faa2-9411-43e3-854f-389942628d22','校长','正校长');
insert into tb_position(psn_id,psn_name,psn_desc)values(
'ec17d433-4e06-4c94-9b6b-49915fd68e2f','副校长','副校长');
insert into tb_position(psn_id,psn_name,psn_desc)values(
'3d6b0129-c8f5-479c-b574-c0ceac31fad4','系主任','主任');
insert into tb_position(psn_id,psn_name,psn_desc)values(
'4d466f88-8d46-463c-b0e0-537a235661ba','科组组长','科组组长');
insert into tb_position(psn_id,psn_name,psn_desc)values(
'ad5877f1-7de5-4860-81df-f09aa953cba8','班主任','班主任');
insert into tb_position(psn_id,psn_name,psn_desc)values(
'1a811348-0c63-4677-9450-5f26fa6cd10b','老师','老师');

insert into c_tch_psn(c_id,tch_id,psn_id,c_start,c_end,c_fnd_id)values(
'163c77ca-61a6-40ce-a050-f27ff32b2cb4','300101201300001','3b30faa2-9411-43e3-854f-389942628d22','2014-04-01 00:00:00',null,'');
insert into c_tch_psn(c_id,tch_id,psn_id,c_start,c_end,c_fnd_id)values(
'e92bb730-a43d-4562-9a41-890fc69bcea4','300101201300001','1a811348-0c63-4677-9450-5f26fa6cd10b','2014-04-01 00:00:00',null,'');
insert into c_tch_psn(c_id,tch_id,psn_id,c_start,c_end,c_fnd_id)values(
'bf5047ab-ecab-4764-a06c-4ff98018b131','300101201400001','1a811348-0c63-4677-9450-5f26fa6cd10b','2014-04-01 00:00:00',null,'');
insert into c_tch_psn(c_id,tch_id,psn_id,c_start,c_end,c_fnd_id)values(
'363d1aa7-914e-421f-be6a-2becca7d18db','300101201400002','1a811348-0c63-4677-9450-5f26fa6cd10b','2014-04-01 00:00:00',null,'');
insert into c_tch_psn(c_id,tch_id,psn_id,c_start,c_end,c_fnd_id)values(
'cdef580b-10c2-4867-9abc-c564802c42ea','300101201400003','1a811348-0c63-4677-9450-5f26fa6cd10b','2014-04-01 00:00:00',null,'');
insert into c_tch_psn(c_id,tch_id,psn_id,c_start,c_end,c_fnd_id)values(
'80f85329-e830-439a-880e-2b24375f867a','300101201400004','1a811348-0c63-4677-9450-5f26fa6cd10b','2014-04-01 00:00:00',null,'');
insert into c_tch_psn(c_id,tch_id,psn_id,c_start,c_end,c_fnd_id)values(
'b6b9a520-77b4-4acc-ad1a-63f747c4d739','300101201400005','1a811348-0c63-4677-9450-5f26fa6cd10b','2014-04-01 00:00:00',null,'');
insert into c_tch_psn(c_id,tch_id,psn_id,c_start,c_end,c_fnd_id)values(
'fdf16721-c52e-4e51-a769-47aea16e0341','300101201400006','1a811348-0c63-4677-9450-5f26fa6cd10b','2014-04-01 00:00:00',null,'');


insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'545a2cb9-30f0-4623-8a70-99303b37d73b','语文','语言与文字','主修','23a68312-5bd9-4f22-b412-e033c6a20cd8',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201300001');
insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'2d8bb376-b663-40da-8c11-b06b7ed2b293','语文','语言与文字','主修','23a68312-5bd9-4f22-b412-e033c6a20cd8',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201400001');
insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','数学','数学','主修','970525c1-ab91-4daf-b454-9ddd83c6696d',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201400002');
insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'6078640e-6911-44d4-857e-3be633881116','数学','数学','主修','970525c1-ab91-4daf-b454-9ddd83c6696d',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201400002');
insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'80f3ff87-0dcf-4efb-a7b5-06dd80ce17ed','英语','英语','主修','d52040c6-502c-424c-87ce-890f4ef5c67c',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201400003');
insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'0cb734f2-7dbe-41b7-86ae-e24c56636bfb','英语','英语','主修','d52040c6-502c-424c-87ce-890f4ef5c67c',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201400003');
insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'f35ce15e-7378-471d-8611-23e803199078','语文','语言与文字','主修','23a68312-5bd9-4f22-b412-e033c6a20cd8',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201400004');
insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'1fc37e53-e9ed-46bc-ad66-cf93375e561e','语文','语言与文字','主修','23a68312-5bd9-4f22-b412-e033c6a20cd8',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201400004');
insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'ee803864-c441-4384-bc03-27129f15225d','数学','数学','主修','970525c1-ab91-4daf-b454-9ddd83c6696d',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201400005');
insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'0d56f8c2-9943-4626-a096-e2fd0b9b22fb','数学','数学','主修','970525c1-ab91-4daf-b454-9ddd83c6696d',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201400005');
insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'077cfe21-48db-47b7-b647-9628ce8de4cc','英语','英语','主修','d52040c6-502c-424c-87ce-890f4ef5c67c',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201400006');
insert into tb_course(cos_id,cos_name,cos_desc,cos_type,cosg_id,cos_credit,cos_start ,cos_end ,tch_id)values(
'ae8549ae-8a36-4f71-b675-585c927a9c76','英语','英语','主修','d52040c6-502c-424c-87ce-890f4ef5c67c',4,'2015-09-27 00:00:00','2016-07-20 00:00:00','300101201400006');

insert into tb_course_group(cosg_id ,cosg_name ,cosg_desc )values
('23a68312-5bd9-4f22-b412-e033c6a20cd8','语文','语文');
insert into tb_course_group(cosg_id ,cosg_name ,cosg_desc )values
('970525c1-ab91-4daf-b454-9ddd83c6696d','数学','数学');
insert into tb_course_group(cosg_id ,cosg_name ,cosg_desc )values
('d52040c6-502c-424c-87ce-890f4ef5c67c','英语','英语');

insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'1c44791a-5b50-47d8-a66d-015c2fbfea27','30010120140001001','a3676c33-19c4-4f88-921a-8b27a143f014');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'd7e0cef6-d39c-4062-a1bf-67aac68b42fb','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'9424214d-9c61-4c34-8bf7-52f286c7ef5c','30010120140001001','80f3ff87-0dcf-4efb-a7b5-06dd80ce17ed');


insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'077cfe21-48db-47b7-b647-9628ce8de4cc','30010120140001002','a3676c33-19c4-4f88-921a-8b27a143f014');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'c1299e33-2c5c-4929-83e0-ae42e07f046b','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'a0e5ac81-bfe7-4dff-84d2-3ea14609c53a','30010120140001002','80f3ff87-0dcf-4efb-a7b5-06dd80ce17ed');

insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'008e165d-0d28-4548-8fa0-8df0d6ed4370','30010120140001003','a3676c33-19c4-4f88-921a-8b27a143f014');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'0826ed59-fdaf-4e7e-b0c3-8e525d8a3e6f','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'6234f092-5021-4821-9f7b-860ce81016cf','30010120140001003','80f3ff87-0dcf-4efb-a7b5-06dd80ce17ed');

insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'879febee-a51d-48e4-9ace-092274f7d0e3','30010120140001004','a3676c33-19c4-4f88-921a-8b27a143f014');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'0f8b6d55-8d92-430b-898e-187d75c3dc14','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'cf11fc10-d4f6-49ae-a652-017971772fbd','30010120140001004','80f3ff87-0dcf-4efb-a7b5-06dd80ce17ed');

insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'4f60d945-bf69-4272-840e-1736f2eed230','30010120140002001','2d8bb376-b663-40da-8c11-b06b7ed2b293');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'bed06849-f53c-4222-891c-856db58eacee','30010120140002001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'ae4566be-95a9-4d8a-9f17-487612af6529','30010120140002001','80f3ff87-0dcf-4efb-a7b5-06dd80ce17ed');

insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'45aacc4f-a123-4e57-8aa2-19ffa79952dd','30010120140002002','2d8bb376-b663-40da-8c11-b06b7ed2b293');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'c49132e2-ba81-4463-b57f-2f442f48a3d5','30010120140002002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'bdd168df-51fa-4c25-9e6a-5cc5f42ce818','30010120140002002','80f3ff87-0dcf-4efb-a7b5-06dd80ce17ed');

insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'8171d137-a42a-463f-88b1-fcfdf549cb3f','30010120140002003','2d8bb376-b663-40da-8c11-b06b7ed2b293');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'f51050e7-4c20-40cb-a82b-8b72bbf6881c','30010120140002003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'54f6e544-269c-4edf-b77f-128d6a371b47','30010120140002003','80f3ff87-0dcf-4efb-a7b5-06dd80ce17ed');

insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'f16fd5a2-7882-4195-8e23-ee03a5dc62df','30010120140002004','2d8bb376-b663-40da-8c11-b06b7ed2b293');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'b66ec9e6-8f51-4821-9886-0b21c86ea467','30010120140002004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'f5dc1d6d-2e79-4c95-b4f4-8805f9d98f1a','30010120140002004','80f3ff87-0dcf-4efb-a7b5-06dd80ce17ed');


insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'e4b72385-629d-405b-ad55-8526aefdccdf','30010120150001001','f35ce15e-7378-471d-8611-23e803199078');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'3393f75e-9dea-4a9c-9b47-e5b3899a99ca','30010120150001001','ee803864-c441-4384-bc03-27129f15225d');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'f468c2d0-0424-480a-bc9d-1feeff70a1a0','30010120150001001','077cfe21-48db-47b7-b647-9628ce8de4cc');


insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'd27bc481-cd26-4d49-912c-d511ba2e8755','30010120150001002','f35ce15e-7378-471d-8611-23e803199078');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'92badd3b-7afc-40f6-a0ae-b7b47c661bbd','30010120150001002','ee803864-c441-4384-bc03-27129f15225d');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'4ba56b38-33d6-4b41-aa1a-3a40fdd4fec8','30010120150001002','077cfe21-48db-47b7-b647-9628ce8de4cc');


insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'025d0d0d-6d91-4f86-b1fd-f621adddc0a8','30010120150001003','f35ce15e-7378-471d-8611-23e803199078');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'46534942-84bf-476a-b6e8-300d912edf65','30010120150001003','ee803864-c441-4384-bc03-27129f15225d');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'67c4ba3f-bc17-49b4-8260-be1c0f2e8828','30010120150001003','077cfe21-48db-47b7-b647-9628ce8de4cc');


insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'd68ea509-e0e9-41ec-92d6-c5f942b12e08','30010120150002001','f35ce15e-7378-471d-8611-23e803199078');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'6019027d-6d6c-4e60-969b-e73ebc67236b','30010120150002001','ee803864-c441-4384-bc03-27129f15225d');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'74013cd9-efbf-4bff-8d51-f77ddbf3ac02','30010120150002001','077cfe21-48db-47b7-b647-9628ce8de4cc');


insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'97b92438-dde3-4a92-bf5e-d164cfd76a7e','30010120150001002','f35ce15e-7378-471d-8611-23e803199078');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'0e808615-6efc-4a94-a40c-cafe628d8e67','30010120150001002','ee803864-c441-4384-bc03-27129f15225d');
insert into c_st_cos(c_id ,st_id ,cs_id  )values (
'ae265a46-9957-40dd-9edd-fcf893ed56f5','30010120150001002','077cfe21-48db-47b7-b647-9628ce8de4cc');


insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('b15993d9-5462-41c2-b8ed-e5c0cf2eba94','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',90.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8f28f22b-cd98-4f32-9dfe-086c7715e04a','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',71.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('4d71bf34-01a2-4e93-b5f6-d0bfdad914ef','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',98.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('3eba87a0-7723-440d-9d6d-45688c351ec7','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',70.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('4efbe82a-d0f1-430a-a278-4b4a247ce133','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',80.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8138018d-5204-4514-9d9e-f653744def35','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',78.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('74f401ab-5733-4bfc-86ed-0424b1fb9b12','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',71.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('32d7280f-6a79-40fe-9aa8-583d9e23bd5a','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',87.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('33c2ff58-2681-4c3e-884b-6a7fe239856b','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',89.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('499dd8a6-d219-4c34-a095-a97081d6fbb7','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',99.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c06c5327-5932-46a5-a44d-7a9c0313b224','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',98.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c48914ec-1e59-4b3f-a83a-6c05e48e9537','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('b417b253-0029-4698-80dd-baae348ecfa0','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',86.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a47df5b1-fd4a-4647-8750-40db964af178','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',74.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('53cc81f6-2cb3-4848-8491-6e3a04694e7c','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',77.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('ed519deb-9fcc-474f-965d-d8fd800907a8','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',89.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('05bdc0a1-f329-453c-a4c9-7068c73dd884','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',95.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('cd466f50-198e-42ec-aed1-2d8854d46e3d','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',97.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('69ade547-a3be-4a9f-b076-33200155b2ff','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',83.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('bf818d76-6ef5-49fe-8a6b-3bbbd36fe624','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',90.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('0af54d8c-9689-4042-ad5f-498ae609e2a7','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',76.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c5003a8a-0f85-4434-9834-78e024f03311','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',92.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('9e34c1eb-fcc8-458c-bb70-ebc3e0c18eb5','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',94.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('3641dcef-2ff7-42c1-a921-194713c57487','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',74.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('24003b07-f937-4076-b173-d338c489451b','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',89.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8ca130c6-bbeb-43e8-9e92-db04605b70b5','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',83.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('ffc3db9c-0bf0-4749-9d67-3da0d7c39424','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',89.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('e12536d7-c755-4275-b2fe-f8436972f234','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',88.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('54a32076-fe42-440e-9596-fa492de055be','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',88.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('29629ed9-38f7-4ea7-b675-dd389d01d69f','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',94.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('10c927a1-49ee-4dd9-8fe8-35d7a6d193e7','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',76.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('548af003-ec96-4cd2-89ad-d5b4d067c939','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',94.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('e6bef8e9-bf2f-4984-8b29-ccfe71e69444','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',78.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a6b12a84-5e37-480a-9ae7-6285fd29e4e1','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',86.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('7224d6fb-d858-49da-9301-30dd5b8470c7','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',94.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('abad2fb2-c7a0-4597-8d00-d716a6463e2f','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',91.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('bdcae907-e331-44d1-afd7-21e502483c73','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',77.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a679a0d2-0f18-45fe-ab05-a146b53fb2de','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',73.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c6cbe574-de6b-47d4-b8a5-a7c358e7dee8','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',92.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('2a7db977-1cc7-4f41-bdc6-b4f3bad732c1','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',82.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('85f3e7f7-5c5c-4aad-828d-ff9efc4d7419','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',86.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('17eab437-f2a9-4a8a-9639-26631436d8c4','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',95.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c7681af8-b1d1-4fa0-9bfe-7ea3f1d3be51','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',82.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('96b847a0-9707-4aeb-a41a-f4d5c55d4fdd','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',82.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('7d09939d-d901-4cb2-8b3e-4ff39345d208','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',79.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('631a031c-8317-4ab4-bb2f-003d2551a387','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',77.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('2dfcbe01-6352-4af0-97c7-62b8d8c1e540','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',85.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('92355029-468e-4c10-9af9-6c517a426b73','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',82.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('95f94210-1b01-474f-871e-0254a14a6378','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',73.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('cf5aa4c5-f628-4c49-8740-8bf864c2129e','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',87.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('cd82fb20-86f0-4280-a9d0-fbed03cdfa62','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',79.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a83bd6a1-2351-454a-b9d2-4792698b55bc','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',98.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('30c553a4-ef75-47d5-b9c5-a575c0824cd5','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',76.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('45680be2-9479-4080-9a29-8c32e2b1b2fa','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',84.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('68b3240a-e56a-4618-a72d-97bb5a9dcd0e','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('b56ec352-b140-4ab0-b051-46c559f8b401','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',70.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('ce9ddb2d-938e-410f-8798-19f5b39dcc9e','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',72.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a46b58c4-2610-41b3-ad74-05048e15b9c2','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',72.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('5e7881ed-23ec-47ac-b294-b3199e01db44','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',86.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('85d04cde-141c-493f-9f92-377ea1f94764','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',95.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('d9666eae-ae9f-41a5-9008-88e3fe7a9d83','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',89.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('94201aba-c080-4374-849b-2315f0a295ae','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',98.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('151676a4-a4c3-4439-999e-fd8faddcdf74','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',86.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('36be0e23-90d8-4f47-a584-2b9a275f8fba','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',77.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('e01546ef-f01f-400f-8a05-a061b55c10bf','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('3665e8d6-ddf1-46c1-b7e5-ae365b8f3eff','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('30fa7c41-7a49-48f5-a9f3-cf7deea00c69','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',78.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('b7eda08f-60f9-4457-b752-35054d3fc3fe','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',70.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('2c817341-1499-46c9-a78e-7eac253bc019','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',76.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('14d16463-7e40-4dde-af01-3567264e3240','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',98.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('ed7538cb-e1e5-4a0a-81e6-0f0c320565bc','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',84.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('145374fa-d6c4-4bed-8a98-08b319158d6f','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',87.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('92fd1b1f-5db1-4f00-9c2d-109ff15b2856','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',72.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('06a4b741-5abb-4c28-b1f0-3ef25290e4eb','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',71.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8f782817-84fb-44e5-9d44-60e0f3755fb3','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('60aa52f3-0b45-4516-9061-d9f0bc888662','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',71.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('2a5e4fcf-5164-468b-9104-2eddbb16bfa6','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a8344960-aaaf-4d12-b99c-35fc89dd597b','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',83.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('e776a61e-bc58-4230-a851-0471ce678188','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',86.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('18f46ab2-3f58-46a8-9df6-de02fd0dc7e6','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',86.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('5965778e-6981-47a8-b560-0636956fec11','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',83.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('9366a3a8-ab9f-4d4e-9c01-a02aef657e0c','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('314736f4-9efd-44f7-ba59-c8dcad4cb223','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',82.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('fc96513f-b76a-4b58-b13e-a1bef20278b8','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',84.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('505966bc-2ee3-4a14-89fd-623c863b1327','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',89.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('5b2d6029-0f32-4cd0-81e2-c5cbda5835db','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',90.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('7478f40c-0506-47c4-849c-2c380fd03619','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',96.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('9017f5d2-4a4b-4ad3-8573-0243165859c1','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',88.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('5493bee8-bedc-44b5-976d-87de9cfc7281','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',99.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('94c52546-185d-4a94-a091-1696335c4d6a','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',81.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('84157979-4ece-4f70-b02e-9b92a682edde','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',81.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('0df7d776-e1db-44ff-8ffc-736001bdcddb','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',72.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('48f1de4b-a061-4151-aadc-65dc5f58afbe','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',77.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('6240f2d6-2da5-4ded-ae49-0fca70732ab7','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',84.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('243425c0-a793-4cc2-a978-a3dcc2f39a8e','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',84.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('0cbafc7b-0b1e-4734-9923-e4c239dda34b','30010120140001004','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',96.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('0cc0af27-4901-4456-ab86-74ddb0462fb3','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',83.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8f3c376c-0c52-411b-8bfb-1cf263bca5f4','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',70.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('24b5e33c-14ca-4f04-b65d-3b0aed57d6da','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',95.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('4e2dcbbf-1e17-45e2-9d38-099881735eb9','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',72.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('ba19708c-c0fa-4889-95fe-56e8ed0b181f','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',92.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('51bdf886-b69d-40d8-8587-095b91576bca','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',93.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('ecc03a79-36ce-40c3-b99a-60502ceeae90','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',84.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('da5689ba-5ff2-4376-bfbf-92813b23e9a0','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',96.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('409fdcca-000a-4d2e-902f-c651a5e472c3','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',89.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('6dde8781-b5bd-43ff-b8ac-5d1d9b1aa5f5','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',99.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c03806ea-7e67-4976-ad9e-c272137bc4ac','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',95.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a8d36289-9ce1-4760-bc08-eb504c26b847','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',87.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('7fb75729-608d-48d8-a260-9ddf4ad7a7cf','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',85.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('2affbf1e-f53c-4892-aef9-d11db63f3396','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',77.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('eba01dcb-d729-481f-b2a4-667b487ec449','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',87.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('e0dd492b-cc82-47f8-b47c-c965fc6e58c3','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',94.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('7989d294-8f23-430d-8426-f2a10ee17262','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',70.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('7b9b5305-c790-49ea-81e9-e102abdb4b2b','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',70.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('3f1a77bf-5e4f-43ea-9e47-e2907a00c617','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',74.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('cccdab96-d6be-482b-81a5-bb5deeae6496','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',89.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('4b5a6a0d-6ad6-4390-b58f-eb8653dbdacb','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',70.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a564db42-8968-45bd-99ef-3838d2f01831','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',83.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('704657ca-0960-472e-a017-773ff0544709','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',83.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a665bf0d-36ae-47f1-927f-55c774347a29','30010120140001004','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',74.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('e3f40a37-0b69-4d3d-8c43-05bae0bf9e00','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',71.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('58cc04d6-f936-4959-8e3f-57946b54c726','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',95.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8880fd0b-558e-4226-a657-3f5048adf699','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',77.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('b43ba71e-30fb-4d57-855b-862f67c0f1df','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',91.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('66f2c3c2-fed5-4306-96c5-691483cf62cd','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',95.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a017322d-de44-425c-9d82-253c048aa212','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',90.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('ef4c4fcb-8424-47a0-bada-07044f67d080','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',89.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('bb1fb34f-56fa-4ec5-bb70-1b3aceab581b','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',81.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('485851c8-2a24-4ddd-8013-d0d812cc66ae','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',82.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('b5f1224c-c3d9-4be5-9314-e6de525de852','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',88.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('32cc6b02-9659-49f2-a795-b080faf82593','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',83.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('b7cb8282-4594-4186-b84d-448c61ed01c5','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',91.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('59a18ccf-9c1c-40ab-8c03-50e1bea81d57','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',88.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('854ee1e7-b7e9-4f11-a71e-f327276725f2','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',94.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('28748078-7ea4-4548-b99e-4f5bbf014cfb','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',86.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('d9fa7dba-7a49-4287-881c-6e82aa706c97','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',72.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('671f4ec5-2db2-454b-9825-cd539650d642','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',94.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('cba8bf11-050f-4035-8d1d-a0db5a116525','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('b8851b6b-9563-4a39-a153-7e89ad31950f','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',77.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('67911210-0cb4-4f22-911c-dd7e45f34f51','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',82.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('9cec5a5d-6dae-4d96-864f-1827b6a24717','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',88.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('1eee8553-1e56-4aa7-8970-2eca23b3b124','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',84.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('0972514c-c482-430b-9743-06d4c7c16fa8','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',74.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c18a4765-27b2-4cb9-ae75-f3108ef64477','30010120140001004','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',83.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('7193c398-c6b8-4148-8773-6ffca4651a5e','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',92.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('76504a88-5fd9-4219-8e53-bdd8320a89e8','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',83.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('46c08dd5-9c63-4067-aa98-a1842432ea31','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',72.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('6ad609fb-9e66-476d-ac1e-3eef89bc0769','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',96.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a4af41e1-edc4-411c-afb0-f3d9e8227558','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',71.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('ab3e6786-0059-4a82-a72f-4e5c10bcc378','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',79.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('1cb4e01d-07d0-453a-8552-376036466b6e','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',77.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c15366ad-3c9c-4e7e-a873-689869e54cae','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',92.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('6144d699-1606-4e9d-b6d0-5b273bd1005b','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',88.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('df43b62b-3346-46e1-a8a5-84e977f66612','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',79.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c0fb60b4-1a0a-4ede-baaa-1cbee9810fec','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',91.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8d531659-6d51-4735-8c5d-6c386cce24e6','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',94.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('42e0387a-b739-41cb-a2b4-8e67856e9b2c','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',84.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('812df0e9-3336-4e8f-9402-9a2da897928e','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('d610d508-5382-4d25-afde-6581843b024b','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',90.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('7af2d3c8-dcaf-49e4-9539-84dccba2dd39','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',91.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('674d5671-39e4-46cd-b214-32cd1aa10dfd','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',86.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c6c7461b-1800-4bf4-94d0-068b93dfc322','30010120140001003','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',98.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('ff477f78-becf-450e-9c3e-9f431fb6f2d3','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',82.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('4c14c824-4d42-4c5c-9928-8b9ec9c765ef','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',79.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8656bf20-6e54-49a1-8f01-5fca6eb0ff25','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',89.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('f2ff47c3-8f72-4037-9cf3-a958a8210c4c','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',79.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8b69688d-56bf-4430-b404-cc9ae0fa9838','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',71.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8116d2e5-ae0c-4d27-b74d-b69b5e5957c4','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',72.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('1b3bb33e-c5f6-4c64-96f4-d252eaf209a1','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('3a8e857f-e33b-4279-a4f7-01100354dcd0','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c5cc6c3e-9de4-42e3-8a2c-5b7f4c91ec28','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',80.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('ee92d120-4bd8-4734-bd6a-d884f1ec7728','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',90.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('b0b4c739-9927-44d4-adaa-f42f2cf48532','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',93.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('407348be-e99b-4d12-b5c4-ba890af18e6c','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',77.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('4656223e-dbde-42ff-bbaf-06cfb6fde6bd','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',85.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('0ecc1aaa-5ca4-46e0-8317-9b851290d177','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c89df595-f1d1-48ec-a25d-56a8a8cdaaf8','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',88.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('9d193c6c-b522-48b0-bc2c-46625a1cfe1a','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',91.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a12b0009-53bd-49b8-8c78-35438f6d97b3','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',78.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('07415cd4-108c-4ce6-b393-e3984140ffeb','30010120140001003','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',71.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c1e0b4df-e4a3-4c84-a906-de054885d7dc','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('b4e9b8c7-7ad3-45d5-b2af-76b188512bab','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',70.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('245ca2c2-74be-4137-8968-0ab4c0e3c696','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',96.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('7e9a0eaa-1934-48b3-9e76-980b071ded9e','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',98.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('4b13d725-c384-4e67-8166-ed5d63621229','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',99.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c7518ec4-a6b6-41a7-b32f-0919b2770c76','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',81.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('d7697cff-ecea-48e8-bda3-ff0ce7164961','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',76.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('f5c6d637-f118-40d7-8aea-e333d4e50367','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',85.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8dc4f46d-524e-4be1-b907-4741a42d6dba','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',75.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('0cda4701-0213-4105-bc19-714144ec6b3f','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',87.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8ecd689a-2c76-4d52-836b-a88e3107d7e6','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',91.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('958defb0-5682-43e0-93c6-865af1221484','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',80.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c1c6b9ea-5578-497a-9a42-681487d215f5','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',93.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('e2438f09-d380-4cfd-aba3-f17481e6bc04','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',96.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('0b2f0ed6-4d53-4e4a-94c7-640ad57c5878','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',94.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('fa65f17b-cf37-4d5c-9315-a55ff4d14dde','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',78.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('bc6e6f53-da15-4701-85ea-9ecf643f5515','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',93.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('bf08866c-d43a-4a0d-bce9-e8a99a7828b3','30010120140001003','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',78.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('84206715-9ac6-49b2-a6d9-bbae526eaa59','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',90.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('8f5de8b3-1794-4dc6-a6e4-3f497f53db18','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',74.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('93c3b2a4-da15-4f9a-a121-a2865705149b','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',71.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('6577587f-4be2-4eec-b14c-5a96e709e86f','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',99.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('49adecc3-5758-416d-b2df-37fbbf90029a','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',97.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a832e892-18a9-4b64-a379-b64934a07060','30010120140001001','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',95.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('e1596dd3-a0e9-4fc8-b314-cf2fc1de4113','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第1次测验','2014-01-01 00:00:00',94.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('1907210c-18a6-4a9f-8f2e-789546027cea','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第2次测验','2014-02-01 00:00:00',87.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('4a94b6ed-a66f-489f-8f1b-7884f2f4470d','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第3次测验','2014-03-01 00:00:00',81.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('dc677978-c843-4398-a8a2-39b6345dfdf1','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第4次测验','2014-04-01 00:00:00',92.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('ed05a33f-1ce7-44b1-88e2-d81aa643fd35','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第5次测验','2014-05-01 00:00:00',78.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('0f718e08-bc0e-475c-8302-98d47c29aba8','30010120140001002','545a2cb9-30f0-4623-8a70-99303b37d73b','第6次测验','2014-06-01 00:00:00',72.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('cde0bbcc-b78d-4319-a92c-4f10e4b67ce0','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',70.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('aaae3d85-1571-4031-b18e-f235dd772a3e','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',94.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('1c64e3fb-622d-482a-83ae-ec36a66c5459','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',82.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('cff6b457-4c3b-41ad-8fd3-464d023ea410','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',93.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('94640f68-55b1-43e1-a12c-3eed076d401d','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',86.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('a926b308-467d-4ed4-8757-1a04df6d4ecc','30010120140001001','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',95.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('26c2dc8b-ebae-4f11-851b-a1e89c4af9a1','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第1次测验','2014-01-01 00:00:00',85.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('be791360-15d0-4d7b-9e2f-d89bc957af8b','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第2次测验','2014-02-01 00:00:00',77.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('cdc56019-dd6e-40d5-be04-5c574d56af46','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第3次测验','2014-03-01 00:00:00',80.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('4c0cc08f-1cbb-4268-9db1-5f68dd2fe73c','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第4次测验','2014-04-01 00:00:00',82.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('74cd4984-5a78-449a-a6ee-39c008754e5d','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第5次测验','2014-05-01 00:00:00',70.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('87505b1f-fc13-4245-b99d-b22f3ba0eae7','30010120140001002','2d8bb376-b663-40da-8c11-b06b7ed2b293','第6次测验','2014-06-01 00:00:00',87.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('bb79845d-3e2f-4011-90ae-7bd0077eadb3','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',81.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('fdbe8d0b-7a22-4459-ab68-b2b34c3be3ca','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',85.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('13129485-90df-45be-9b4d-b1feaf40e39f','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',96.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('20691c40-57fd-44d6-af16-8f607ff77f90','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',96.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('d6dc694b-421f-4682-b301-425124f54b2b','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',72.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('c4d92816-2124-43ec-a3ca-3a9188b60cf5','30010120140001001','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',99.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('22cb2453-224e-4dba-835c-46ad7504f159','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第1次测验','2014-01-01 00:00:00',99.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('1ce1e7fa-a0cc-4fcc-be49-a58731725407','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第2次测验','2014-02-01 00:00:00',91.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('3d7ef20c-b036-4aaa-a300-7c14e29af2b6','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第3次测验','2014-03-01 00:00:00',93.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('99bd52a7-271c-4593-8c4d-9f07dfea1483','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第4次测验','2014-04-01 00:00:00',96.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('11168d75-10f3-473a-9269-3a1a011c3e0f','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第5次测验','2014-05-01 00:00:00',96.0);
insert into tb_score(sc_id ,st_id ,cs_id ,sc_name ,sc_date ,sc_score )values('d8478f21-8a90-4e05-b935-87a3e1d186bd','30010120140001002','b1d930d0-4d92-4284-a1a3-d2e3345d2f4c','第6次测验','2014-06-01 00:00:00',90.0);
