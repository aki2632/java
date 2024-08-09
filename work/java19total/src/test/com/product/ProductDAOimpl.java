package test.com.product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOimpl implements ProductDAO {

    List<ProductVO> list = new ArrayList<>();

    public ProductDAOimpl() {}

    @Override
    public int insert(ProductVO vo) {
        System.out.println("insert()....");
        int flag = 0;

        vo.setNum(list.size() + 1);
        System.out.println(vo);

        list.add(vo);

        flag = 1;
        return flag;
    }

    @Override
    public int update(ProductVO vo) {
        System.out.println("update()....");
        System.out.println(vo);
        int flag = 0;

        for (ProductVO product : list) {
            if (product.getNum() == vo.getNum()) {
                product.setPname(vo.getPname());
                product.setModel(vo.getModel());
                product.setPrice(vo.getPrice());
                product.setCount(vo.getCount());
                flag = 1;
                break;
            }
        }
        return flag;
    }

    @Override
    public int delete(ProductVO vo) {
        System.out.println("delete()....");
        int flag = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum() == vo.getNum()) {
                list.remove(i);
                flag = 1;
                break;
            }
        }
        return flag;
    }

    @Override
    public ProductVO selectOne(ProductVO vo) {
        System.out.println("selectOne()....");
        ProductVO vo2 = null;

        for (ProductVO product : list) {
            if (product.getNum() == vo.getNum()) {
                vo2 = product;
                break;
            }
        }

        return vo2;
    }

    @Override
    public List<ProductVO> selectAll() {
        System.out.println("selectAll()....");
        return list;
    }

    @Override
    public List<ProductVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()....");
        System.out.println(searchKey);
        System.out.println(searchWord);

        List<ProductVO> vos = new ArrayList<>();

        if ("pname".equals(searchKey)) {
            for (ProductVO product : list) {
                if (product.getPname().contains(searchWord)) {
                    vos.add(product);
                }
            }
        } else if ("model".equals(searchKey)) {
            for (ProductVO product : list) {
                if (product.getModel().contains(searchWord)) {
                    vos.add(product);
                }
            }
        } else {
            vos = list;
        }
        return vos;
    }
}
