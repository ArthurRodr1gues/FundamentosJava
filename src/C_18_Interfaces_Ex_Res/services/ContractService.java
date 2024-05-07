package C_18_Interfaces_Ex_Res.services;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import C_18_Interfaces_Ex_Res.entities.Contract;
import C_18_Interfaces_Ex_Res.entities.Installment;

@SuppressWarnings("unused")
public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
	}
}
