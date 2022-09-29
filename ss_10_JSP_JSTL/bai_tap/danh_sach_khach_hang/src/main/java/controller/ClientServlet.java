package controller;

import model.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ClientServlet", value = "/client")
public class ClientServlet extends HttpServlet {
    public static List<Client> clientList = new ArrayList<>();

    static {
        clientList.add(new Client("Hồ Xuân Bảo", "31-08-2003", "Đà Lạt","https://scontent.fsgn2-2.fna.fbcdn.net/v/t39.30808-1/244633814_623905011960242_7371857561920335598_n.jpg?stp=dst-jpg_p240x240&_nc_cat=103&ccb=1-7&_nc_sid=7206a8&_nc_ohc=SBzVpqOgCssAX9ojrTg&tn=u-9ihUQR7W0MFm-T&_nc_ht=scontent.fsgn2-2.fna&oh=00_AT8K9AiDocKvGGydRlzzJLK7kiM4hRAKtyvPmvkr8u0SSw&oe=633AC73A"));
        clientList.add(new Client("Hồ Ngọc Huy", "24-06-2003", "Yên Bái","https://scontent.fsgn2-7.fna.fbcdn.net/v/t39.30808-6/290231947_705314070759950_4491701305546782043_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=l-0SyPp3MHkAX9VxzYe&_nc_ht=scontent.fsgn2-7.fna&oh=00_AT8gdUqfXwu0UNj4_33ICk7NBC3Q5MFHguU7IeFrOQGXGA&oe=633B2E0C"));
        clientList.add(new Client("Tống Nhật Minh", "21-05-2003", "Nguyễn Tri Phương","https://scontent.fsgn2-1.fna.fbcdn.net/v/t39.30808-6/289148317_1754615538244924_8666915145697722035_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=IBU16Y42ZMsAX8BAhQo&_nc_ht=scontent.fsgn2-1.fna&oh=00_AT_PtI_1J_rVqQpC7E-Mma3LUKt96hJFb5ho7X1OJTcydA&oe=633A5B2E"));
        clientList.add(new Client("Vy Cá", "11-01-2003", "Washington","https://scontent.fsgn2-5.fna.fbcdn.net/v/t39.30808-6/239823888_3242255462671750_794936623470211314_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=_kIA9Q1VmRsAX-IYQft&tn=u-9ihUQR7W0MFm-T&_nc_ht=scontent.fsgn2-5.fna&oh=00_AT83QnlBmERTY1nnf9tVztO3KcUep4bHRL1zznnkhCij6A&oe=633A2C30"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("clientList", clientList);
        request.getRequestDispatcher("list.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
