package com.dh.hobbyist.payment.model.service;

import java.sql.Connection;
import java.util.List;

import com.dh.hobbyist.payment.model.dao.PaymentDao;
import com.dh.hobbyist.payment.model.vo.Payment;
import static com.dh.hobbyist.common.JDBCTemplate.*;

public class PaymentService {

	public int insertPayment(Payment p) {
		Connection con = getConnection();
		
		int result = new PaymentDao().insertPayment(con, p);
		
		if(result > 0) {
			result = new PaymentDao().updateMemberCtn(con, p);
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result;
	}

	public List<Payment> selectList() {
		Connection con = getConnection();
		
		List<Payment> payList = new PaymentDao().selectList(con);
		
		close(con);
		
		return payList;
	}

}
