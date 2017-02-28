
select e.empno as empno,
		e.ename as ename,
		e.job as job,
		e.mgr as mgr,
		e.hiredate as hiredate,
		e.sal as sal,
		e.comm as comm,
		d.deptno as deptno,
		d.dname as dname,
		d.loc as loc
  from emp e INNER join dept d
    on e.deptno = d.deptno;
	
select *
  from emp e INNER join dept e
    on e.deptno = e.deptno;	
	 
  