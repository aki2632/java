package test.com.main;

import test.com.emp.EmpDAO;
import test.com.emp.EmpDAOimpl;
import test.com.emp.EmpVO;

import test.com.dept.DeptDAO;
import test.com.dept.DeptDAOimpl;
import test.com.dept.DeptVO;

import test.com.job.JobDAO;
import test.com.job.JobDAOimpl;
import test.com.job.JobVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TotalMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // total
        while (true) {
            System.out.println("TOTAL 메뉴를 선택하세요");
            System.out.println("1.EMP, 2.DEPT, 3.JOB [x입력시 종료]");
            String totalMenu = br.readLine();
            System.out.println("==========================");

            if (totalMenu.equals("1")) {
                // emp
                while (true) {
                    EmpDAO dao = new EmpDAOimpl();

                    System.out.println("EMP 메뉴를 선택하세요");
                    System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색 7.모두검색2( 부서+사원 조인=>뷰 ) 8.모두검색3( 부서+업무 조인=>뷰 ) [x입력시 종료]");
                    String menu = br.readLine();
                    System.out.println("==========================");

                    if (menu.equals("1")) {
                        // 입력
                        System.out.println("First Name:");
                        String first_name = br.readLine();
                        System.out.println("Last Name:");
                        String last_name = br.readLine();
                        System.out.println("Email:");
                        String email = br.readLine();
                        System.out.println("Phone Number:");
                        String phone_number = br.readLine();
                        System.out.println("Hire Date (YYYY-MM-DD):");
                        String hire_date = br.readLine();
                        System.out.println("Job ID:");
                        String job_id = br.readLine();
                        System.out.println("Salary:");
                        double salary = Double.parseDouble(br.readLine());
                        System.out.println("Commission PCT:");
                        double commission_pct = Double.parseDouble(br.readLine());
                        System.out.println("Manager ID:");
                        int manager_id = Integer.parseInt(br.readLine());
                        System.out.println("Department ID:");
                        int department_id = Integer.parseInt(br.readLine());

                        EmpVO vo = new EmpVO();
                        vo.setFirstName(first_name);
                        vo.setLastName(last_name);
                        vo.setEmail(email);
                        vo.setPhoneNumber(phone_number);
                        vo.setHireDate(hire_date);
                        vo.setJobId(job_id);
                        vo.setSalary(salary);
                        vo.setCommissionPct(commission_pct);
                        vo.setManagerId(manager_id);
                        vo.setDepartmentId(department_id);

                        int result = dao.insert(vo);
                        System.out.println("result:" + result);
                        if (result == 1) {
                            System.out.println("insert successed");
                        } else {
                            System.out.println("insert failed");
                        }
                        System.out.println("=======================");
                    } else if (menu.equals("2")) {
                        // 수정
                        System.out.println("Employee ID:");
                        int employee_id = Integer.parseInt(br.readLine());
                        System.out.println("First Name:");
                        String first_name = br.readLine();
                        System.out.println("Last Name:");
                        String last_name = br.readLine();
                        System.out.println("Email:");
                        String email = br.readLine();
                        System.out.println("Phone Number:");
                        String phone_number = br.readLine();
                        System.out.println("Hire Date (YYYY-MM-DD):");
                        String hire_date = br.readLine();
                        System.out.println("Job ID:");
                        String job_id = br.readLine();
                        System.out.println("Salary:");
                        double salary = Double.parseDouble(br.readLine());
                        System.out.println("Commission PCT:");
                        double commission_pct = Double.parseDouble(br.readLine());
                        System.out.println("Manager ID:");
                        int manager_id = Integer.parseInt(br.readLine());
                        System.out.println("Department ID:");
                        int department_id = Integer.parseInt(br.readLine());

                        EmpVO vo = new EmpVO();
                        vo.setEmployeeId(employee_id);
                        vo.setFirstName(first_name);
                        vo.setLastName(last_name);
                        vo.setEmail(email);
                        vo.setPhoneNumber(phone_number);
                        vo.setHireDate(hire_date);
                        vo.setJobId(job_id);
                        vo.setSalary(salary);
                        vo.setCommissionPct(commission_pct);
                        vo.setManagerId(manager_id);
                        vo.setDepartmentId(department_id);

                        int result = dao.update(vo);
                        System.out.println("result:" + result);

                        if (result >= 1) {
                            System.out.println("update successed");
                        } else {
                            System.out.println("update failed");
                        }
                        System.out.println("=======================");
                    } else if (menu.equals("3")) {
                        // 삭제
                        System.out.println("Employee ID:");
                        int employee_id = Integer.parseInt(br.readLine());

                        EmpVO vo = new EmpVO();
                        vo.setEmployeeId(employee_id);

                        int result = dao.delete(vo);
                        System.out.println("result:" + result);
                        if (result >= 1) {
                            System.out.println("delete successed");
                        } else {
                            System.out.println("delete failed");
                        }
                        System.out.println("=======================");
                    } else if (menu.equals("4")) {
                        // 번호검색
                        System.out.println("Employee ID:");
                        int employee_id = Integer.parseInt(br.readLine());

                        EmpVO vo = new EmpVO();
                        vo.setEmployeeId(employee_id);

                        EmpVO vo2 = dao.selectOne(vo);

                        if (vo2 != null) {
                            System.out.println("selectOne successed");
                        } else {
                            System.out.println("selectOne failed");
                        }
                        System.out.println(vo2);
                        System.out.println("=======================");
                    } else if (menu.equals("5")) {
                        // 모두검색
                        List<EmpVO> list = dao.selectAll();
                        System.out.printf("%5s %11s %11s %10s %18s %19s %10s %10s %15s %12s %12s \n", "ID", "First Name", "Last Name", "Email", "Phone Number", "Hire Date", "Job ID", "Salary", "Commission PCT", "Manager ID", "Department ID");

                        for (EmpVO x : list) {
                            System.out.printf("%5d %11s %11s %10s %18s %19s %10s %10.2f %15.2f %12d %12d \n",
                                    x.getEmployeeId(), x.getFirstName(), x.getLastName(), x.getEmail(), x.getPhoneNumber(), x.getHireDate(), x.getJobId(), x.getSalary(), x.getCommissionPct(), x.getManagerId(), x.getDepartmentId());
                        }
                        if (list.size() == 0) System.out.println("selectAll failed");
                        System.out.println("=======================");
                    } else if (menu.equals("6")) {
                        // 검색어검색
                        System.out.println("searchKey (first_name, last_name, email):");
                        String searchKey = br.readLine();
                        System.out.println("searchWord:");
                        String searchWord = br.readLine();
                        List<EmpVO> list = dao.searchList(searchKey, searchWord);
                        System.out.printf("%5s %11s %11s %10s %18s %19s %10s %10s %15s %12s \n", "ID", "First Name", "Last Name", "Email", "Phone Number", "Hire Date", "Job ID", "Salary", "Commission PCT", "Manager ID", "Department ID");

                        for (EmpVO x : list) {
                            System.out.printf("%5d %11s %11s %10s %18s %19s %10s %10.2f %15.2f %12d %12d \n",
                                    x.getEmployeeId(), x.getFirstName(), x.getLastName(), x.getEmail(), x.getPhoneNumber(), x.getHireDate(), x.getJobId(), x.getSalary(), x.getCommissionPct(), x.getManagerId(), x.getDepartmentId());
                        }
                        if (list.size() == 0) System.out.println("searchList failed");
                        System.out.println("=======================");
                    }
                    if (menu.equals("x")) break;
                }
                System.out.println("EMP 프로그램 종료");
            } else if (totalMenu.equals("2")) {
                // dept
                while (true) {
                    DeptDAO dao = new DeptDAOimpl();

                    System.out.println("DEPT 메뉴를 선택하세요");
                    System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색 [x입력시 종료]");
                    String menu = br.readLine();
                    System.out.println("==========================");

                    if (menu.equals("1")) {
                        // 입력
                        System.out.println("Department ID:");
                        int department_id = Integer.parseInt(br.readLine());
                        System.out.println("Department Name:");
                        String department_name = br.readLine();
                        System.out.println("Manager ID:");
                        int manager_id = Integer.parseInt(br.readLine());
                        System.out.println("Location ID:");
                        int location_id = Integer.parseInt(br.readLine());

                        DeptVO vo = new DeptVO();
                        vo.setDepartmentId(department_id);
                        vo.setDepartmentName(department_name);
                        vo.setManagerId(manager_id);
                        vo.setLocationId(location_id);

                        int result = dao.insert(vo);
                        System.out.println("result:" + result);
                        if (result == 1) {
                            System.out.println("insert successed");
                        } else {
                            System.out.println("insert failed");
                        }
                        System.out.println("=======================");
                    } else if (menu.equals("2")) {
                        // 수정
                        System.out.println("Department ID:");
                        int department_id = Integer.parseInt(br.readLine());
                        System.out.println("Department Name:");
                        String department_name = br.readLine();
                        System.out.println("Manager ID:");
                        int manager_id = Integer.parseInt(br.readLine());
                        System.out.println("Location ID:");
                        int location_id = Integer.parseInt(br.readLine());

                        DeptVO vo = new DeptVO();
                        vo.setDepartmentId(department_id);
                        vo.setDepartmentName(department_name);
                        vo.setManagerId(manager_id);
                        vo.setLocationId(location_id);

                        int result = dao.update(vo);
                        System.out.println("result:" + result);
                        if (result >= 1) {
                            System.out.println("update successed");
                        } else {
                            System.out.println("update failed");
                        }
                        System.out.println("=======================");
                    } else if (menu.equals("3")) {
                        // 삭제
                        System.out.println("Department ID:");
                        int department_id = Integer.parseInt(br.readLine());

                        DeptVO vo = new DeptVO();
                        vo.setDepartmentId(department_id);

                        int result = dao.delete(vo);
                        System.out.println("result:" + result);
                        if (result >= 1) {
                            System.out.println("delete successed");
                        } else {
                            System.out.println("delete failed");
                        }
                        System.out.println("=======================");
                    } else if (menu.equals("4")) {
                        // 번호검색
                        System.out.println("Department ID:");
                        int department_id = Integer.parseInt(br.readLine());

                        DeptVO vo = new DeptVO();
                        vo.setDepartmentId(department_id);

                        DeptVO vo2 = dao.selectOne(vo);

                        if (vo2 != null) {
                            System.out.println("selectOne successed");
                            System.out.println(vo2);
                        } else {
                            System.out.println("selectOne failed");
                        }
                        System.out.println("=======================");
                    } else if (menu.equals("5")) {
                        // 모두검색
                        List<DeptVO> list = dao.selectAll();
                        System.out.printf("%5s %20s %12s %12s \n", "ID", "Department Name", "Manager ID", "Location ID");

                        for (DeptVO x : list) {
                            System.out.printf("%5d %20s %12d %12d \n",
                                    x.getDepartmentId(), x.getDepartmentName(), x.getManagerId(), x.getLocationId());
                        }
                        if (list.size() == 0) System.out.println("selectAll failed");
                        System.out.println("=======================");
                    } else if (menu.equals("6")) {
                        // 검색어검색
                        System.out.println("searchKey (department_name):");
                        String searchKey = br.readLine();
                        System.out.println("searchWord:");
                        String searchWord = br.readLine();
                        List<DeptVO> list = dao.searchList(searchKey, searchWord);
                        System.out.printf("%5s %20s %12s %12s \n", "ID", "Department Name", "Manager ID", "Location ID");

                        for (DeptVO x : list) {
                            System.out.printf("%5d %20s %12d %12d \n",
                                    x.getDepartmentId(), x.getDepartmentName(), x.getManagerId(), x.getLocationId());
                        }
                        if (list.size() == 0) System.out.println("searchList failed");
                        System.out.println("=======================");
                    }

                    if (menu.equals("x")) break;
                }
                System.out.println("DEPT 프로그램 종료");
            } else if (totalMenu.equals("3")) {
                // job
                while (true) {
                    JobDAO dao = new JobDAOimpl();

                    System.out.println("JOB 메뉴를 선택하세요");
                    System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색 [x입력시 종료]");
                    String menu = br.readLine();
                    System.out.println("==========================");

                    if (menu.equals("1")) {
                        // 입력
                        System.out.println("Job ID:");
                        String job_id = br.readLine();
                        System.out.println("Job Title:");
                        String job_title = br.readLine();
                        System.out.println("Min Salary:");
                        double min_salary = Double.parseDouble(br.readLine());
                        System.out.println("Max Salary:");
                        double max_salary = Double.parseDouble(br.readLine());

                        JobVO vo = new JobVO();
                        vo.setJobId(job_id);
                        vo.setJobTitle(job_title);
                        vo.setMinSalary(min_salary);
                        vo.setMaxSalary(max_salary);

                        int result = dao.insert(vo);
                        System.out.println("result:" + result);
                        if (result == 1) {
                            System.out.println("insert successed");
                        } else {
                            System.out.println("insert failed");
                        }
                        System.out.println("=======================");
                    } else if (menu.equals("2")) {
                        // 수정
                        System.out.println("Job ID:");
                        String job_id = br.readLine();
                        System.out.println("Job Title:");
                        String job_title = br.readLine();
                        System.out.println("Min Salary:");
                        double min_salary = Double.parseDouble(br.readLine());
                        System.out.println("Max Salary:");
                        double max_salary = Double.parseDouble(br.readLine());

                        JobVO vo = new JobVO();
                        vo.setJobId(job_id);
                        vo.setJobTitle(job_title);
                        vo.setMinSalary(min_salary);
                        vo.setMaxSalary(max_salary);

                        int result = dao.update(vo);
                        System.out.println("result:" + result);
                        if (result >= 1) {
                            System.out.println("update successed");
                        } else {
                            System.out.println("update failed");
                        }
                        System.out.println("=======================");
                    } else if (menu.equals("3")) {
                        // 삭제
                        System.out.println("Job ID:");
                        String job_id = br.readLine();

                        JobVO vo = new JobVO();
                        vo.setJobId(job_id);

                        int result = dao.delete(vo);
                        System.out.println("result:" + result);
                        if (result >= 1) {
                            System.out.println("delete successed");
                        } else {
                            System.out.println("delete failed");
                        }
                        System.out.println("=======================");
                    } else if (menu.equals("4")) {
                        // 번호검색
                        System.out.println("Job ID:");
                        String job_id = br.readLine();

                        JobVO vo = new JobVO();
                        vo.setJobId(job_id);

                        JobVO vo2 = dao.selectOne(vo);

                        if (vo2 != null) {
                            System.out.println("selectOne successed");
                            System.out.println(vo2);
                        } else {
                            System.out.println("selectOne failed");
                        }
                        System.out.println("=======================");
                    } else if (menu.equals("5")) {
                        // 모두검색
                        List<JobVO> list = dao.selectAll();
                        System.out.printf("%10s %40s %12s %12s \n", "Job ID", "Job Title", "Min Salary", "Max Salary");

                        for (JobVO x : list) {
                            System.out.printf("%10s %40s %12.2f %12.2f \n",
                                    x.getJobId(), x.getJobTitle(), x.getMinSalary(), x.getMaxSalary());
                        }
                        if (list.size() == 0) System.out.println("selectAll failed");
                        System.out.println("=======================");
                    } else if (menu.equals("6")) {
                        // 검색어검색
                        System.out.println("searchKey (job_id, job_title):");
                        String searchKey = br.readLine();
                        System.out.println("searchWord:");
                        String searchWord = br.readLine();
                        List<JobVO> list = dao.searchList(searchKey, searchWord);
                        System.out.printf("%10s %40s %12s %12s \n", "Job ID", "Job Title", "Min Salary", "Max Salary");

                        for (JobVO x : list) {
                            System.out.printf("%10s %40s %12.2f %12.2f \n",
                                    x.getJobId(), x.getJobTitle(), x.getMinSalary(), x.getMaxSalary());
                        }
                        if (list.size() == 0) System.out.println("searchList failed");
                        System.out.println("=======================");
                    }

                    if (menu.equals("x")) break;
                }
                System.out.println("JOB 프로그램 종료");
            }

            if (totalMenu.equals("x")) break;
        }
        System.out.println("TOTAL 프로그램 종료");
    }
}
