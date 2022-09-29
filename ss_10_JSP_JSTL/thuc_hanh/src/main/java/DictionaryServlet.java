import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", value = "/DictionaryServlet")
public class DictionaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, String> dic = new HashMap<>();
        dic.put("Hello", "Xin Chào");
        dic.put("Fine", "Tui ổn");
        dic.put("Lonely", "Cô đơn alone một mình");
        dic.put("I Love You", "anh yeu em");
        PrintWriter printWriter = response.getWriter();
        String search = request.getParameter("note");
        String result = dic.get(search);
        if (result != null) {
            printWriter.print("World : " + search + " Result :" + result);
        } else {
            System.out.println("Không có trong từ điển");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
