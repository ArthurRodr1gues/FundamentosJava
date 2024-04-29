package C_14_inheritance.upcasting_downcasting.entities;

public class BusinessAccount extends Account {

    double loanLimit;

    public BusinessAccount() {
        super(); // chamada ao construtor vazio da classe-mãe, porque se for adicionado alguma
                 // lógica, já tá aqui
    }

    public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0; //possivel erro: gerar saldo negativo
        }
    }

}
