package C_18_Interfaces_Ex_Res.services;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amount, int months);
}
