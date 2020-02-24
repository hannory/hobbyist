package com.dh.hobbyist.payment.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dh.hobbyist.payment.model.service.PaymentService;
import com.dh.hobbyist.payment.model.vo.Payment;

@WebServlet("/selectPaymentList.pa")
public class SelectPaymentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SelectPaymentListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Payment> payList = new PaymentService().selectList();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
