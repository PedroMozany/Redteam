package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface IAcao {

    String acao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;


}
