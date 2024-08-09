package test.com.main;

import test.com.dept.DeptDAO;
import test.com.dept.DeptDAOimpl;
import test.com.dept.DeptVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class DeptMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DeptDAO dao = new DeptDAOimpl();

        while (true) {
            System.out.println("메뉴를 선택하세요");
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
        System.out.println("프로그램 종료");
    }
}

