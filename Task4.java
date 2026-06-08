package Part1;

interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

class AccountServiceImpl implements AccountService {
    private final Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account account : accounts) {
            if (account.getOwner().getId() == id) {
                return account;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 0;
        for (Account account : accounts) {
            if (account.getBalance() > value) {
                count++;
            }
        }
        return count;
    }
}

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account id=" + id + ", balance=" + balance +
                ", owner=" + owner.getFirstName() + " " + owner.getLastName();
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
public class Task4 {
    public static void main(String[] args) {
        Account[] accounts = {
            new Account(1, 1, new User(1, "John", "Doe")),
            new Account(2, 200, new User(2, "Jane", "Smith")),
            new Account(3, 400, new User(3, "Bob", "Johnson")),
            new Account(4, 405550, new User(4, "Alice", "Williams")),
            new Account(5, 57700, new User(5, "Charlie", "Brown")),
            new Account(6, 1600, new User(6, "David", "Jones")),
            new Account(7, 70, new User(7, "Eve", "Garcia")),
            new Account(8, 804, new User(8, "Frank", "Miller")),
        };
        AccountService service = new AccountServiceImpl(accounts);
        int value = 405549;
        int id = 8;
        System.out.println("Number of accounts with balance > " + value + " --> " + service.countAccountsWithBalanceGreaterThan(value));
        System.out.println("Account with owner id " + id + " --> " + service.findAccountByOwnerId(id));

    }
}