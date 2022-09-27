import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet", value = "/translateServlet")
public class TranslateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        Map<String,String>dictionary=new HashMap<>();
        dictionary.put("Hello","Xin Chào");
        dictionary.put("Bye","Tạm Biệt");
        dictionary.put("Fuck you","Đ mẹ mày");
        dictionary.put("What","Cái gì");
        dictionary.put("Wonderful","Tuyệt vời");
        String search =request.getParameter("txtSearch");
        String result = dictionary.get(search);
        PrintWriter writer = response.getWriter();
        if(result != null){
            writer.println("Word: " + search);
            writer.println("Result: " + result);
        } else {
            writer.println("Not found");
        }
    }
}
