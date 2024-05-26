package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;


public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int prodid=Integer.parseInt(request.getParameter("productid"));
		ProductDao pd=new ProductDaoImpl();
		Product p1=new Product();
		p1.setProdid(prodid);
		Product prod=pd.searchproductById(p1);
		
		request.setAttribute("data", prod);
		
		
		RequestDispatcher rd=
	    request.getRequestDispatcher("updateProduct.jsp");
	    rd.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
