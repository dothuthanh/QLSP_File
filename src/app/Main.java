package app;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
      Control control = new Control();
      control.add(new Product(0371,"Crtop","China",123.000,"Mat,kieu dang dep,chat vai min"));
      control.add(new Product(0372,"Dep Quai Hau","Viet Nam",155.000,"Kieu dang dep,ben"));
      control.add(new Product(0373,"Giay","Japan",198.000,"Kieu dang dep,khong bong choc da"));
      control.add(new Product(0374,"Tui Sach","Kore",450.000,"Kieu dang dep,Chat da ca xau"));
      control.add(new Product(0375,"Mascara","Thai Lan",167.000,"Kieu dang dep,an toan, chat luong"));
      control.add(new Product(0376,"Kem Nen","Phap",320.000,"Kieu dang dep, an toan , khong co hai cho nguoi dung,lau choi"));
      control.search(new Product(0376,"Kem Nen","Phap",320.000,"Kieu dang dep, an toan , khong co hai cho nguoi dung,lau choi"));
    }
}
