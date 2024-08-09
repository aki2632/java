package product;

import java.util.List;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        System.out.println("hello");

        ProductDAO dao = new ProductDAOimpl();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색... [x 입력시 종료]");
            input = scanner.nextLine();

            if (input.equals("x")) {
                System.out.println("종료...");
                break;
            }

            ProductVO vo;
            int result;
            switch (input) {
                case "1":
                    vo = new ProductVO();
                    System.out.println("product name:");
                    vo.setPname(scanner.nextLine());
                    System.out.println("product model:");
                    vo.setModel(scanner.nextLine());
                    System.out.println("product price:");
                    vo.setPrice(scanner.nextInt());
                    System.out.println("product count:");
                    vo.setCount(scanner.nextInt());
                    scanner.nextLine();

                    result = dao.insert(vo);
                    break;

                case "2":
                    vo = new ProductVO();
                    System.out.println("수정을 원하는 product number:");
                    vo.setNum(scanner.nextInt());
                    scanner.nextLine(); // Consume newline
                    System.out.println("new product name:");
                    vo.setPname(scanner.nextLine());
                    System.out.println("new product model:");
                    vo.setModel(scanner.nextLine());
                    System.out.println("new product price:");
                    vo.setPrice(scanner.nextInt());
                    System.out.println("new product count:");
                    vo.setCount(scanner.nextInt());
                    scanner.nextLine();

                    result = dao.update(vo);
                    break;

                case "3":
                    vo = new ProductVO();
                    System.out.println("삭제를 원하는 product number:");
                    vo.setNum(scanner.nextInt());
                    scanner.nextLine();

                    result = dao.delete(vo);
                    break;

                case "4":
                    vo = new ProductVO();
                    System.out.println("검색을 원하는 product num:");
                    vo.setNum(scanner.nextInt());
                    scanner.nextLine();

                    ProductVO vo2 = dao.selectOne(vo);
                    System.out.println(vo2);
                    break;

                case "5":
                    List<ProductVO> list = dao.selectAll();
                    for (ProductVO x : list) {
                        System.out.println(x);
                    }
                    break;

                case "6":
                    System.out.println("검색을 원하는 searchKey [pname or model]:");
                    String searchType = scanner.nextLine();
                    System.out.println("검색을 원하는 searchWord:");
                    String searchKeyword = scanner.nextLine();

                    list = dao.searchList(searchType, searchKeyword);
                    for (ProductVO x : list) {
                        System.out.println(x);
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;
            }

            System.out.println("=======================");
        }

        scanner.close();
    }
}
