import java.util.Scanner;

public class AddressBookClient {
    private static AddressBookService service = new AddressBookService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1: 添加联系人\n2: 修改联系人\n3: 删除联系人\n4: 查看所有联系人\n5: 退出");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    listContacts();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void addContact() {
        System.out.print("输入姓名: ");
        String name = scanner.next();
        System.out.print("输入电话: ");
        String phone = scanner.next();
        service.addContact(name, phone);
        System.out.println("联系人已添加");
    }

    private static void updateContact() {
        System.out.print("输入要修改的联系人姓名: ");
        String name = scanner.next();
        System.out.print("输入新电话: ");
        String phone = scanner.next();
        service.updateContact(name, phone);
        System.out.println("联系人已修改");
    }

    private static void deleteContact() {
        System.out.print("输入要删除的联系人姓名: ");
        String name = scanner.next();
        service.deleteContact(name);
        System.out.println("联系人已删除");
    }

    private static void listContacts() {
        for (Contact contact : service.getContacts()) {
            System.out.println("姓名: " + contact.name + ", 电话: " + contact.phone);
        }
    }
}