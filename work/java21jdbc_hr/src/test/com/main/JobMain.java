package test.com.main;

import test.com.job.JobDAO;
import test.com.job.JobDAOimpl;
import test.com.job.JobVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class JobMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        JobDAO dao = new JobDAOimpl();

        while (true) {
            System.out.println("메뉴를 선택하세요");
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
        System.out.println("프로그램 종료");
    }
}
