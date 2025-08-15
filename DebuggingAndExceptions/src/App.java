public class App {
    public static void main(String[] args) {
        private final static UserDAO dao = new UserDAO();

        private final static Scanner scanner = new Scanner(System.in);
        


        var scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao cadastro de usuários, selecione a operação desejada");
        System.out.println("1. Cadastrar usuário");
        System.out.println("2. Atualizar usuário");
        System.out.println("3. Deletar usuário");
        System.out.println("4. Buscar usuário");
        System.out.println("5. Listar usuários");
        System.out.println("0. Sair");
        var userInput = scanner.nextInt();

        while (true){
            var selectedOption = MenuOption.values()[userInput -1];
            if selectedOption == MenuOption.SAVE {
                System.out.println("Digite o nome do usuário:");
                var name = scanner.next();
                System.out.println("Digite o email do usuário:");
                var email = scanner.next();
                System.out.println("Digite a data de nascimento do usuário (yyyy-MM-ddTHH:mm:ssZ):");
                var birthday = OffsetDateTime.parse(scanner.next());
                var userModel = new UserModel();
                userModel.setName(name);
                userModel.setEmail(email);
                userModel.setBirthday(birthday);
                var savedUser = userDAO.save(userModel);
                System.out.println("Usuário salvo com sucesso: " + savedUser);
            } else if (selectedOption == MenuOption.UPDATE) {
                System.out.println("Digite o ID do usuário a ser atualizado:");
                var id = scanner.nextLong();
                System.out.println("Digite o novo nome do usuário:");
                var name = scanner.next();
                System.out.println("Digite o novo email do usuário:");
                var email = scanner.next();
                System.out.println("Digite a nova data de nascimento do usuário (yyyy-MM-ddTHH:mm:ssZ):");
                var birthday = OffsetDateTime.parse(scanner.next());
                var userModel = new UserModel();
                userModel.setId(id);
                userModel.setName(name);
                userModel.setEmail(email);
                userModel.setBirthday(birthday);
                var updatedUser = userDAO.update(userModel);
                System.out.println("Usuário atualizado com sucesso: " + updatedUser);
            } else if (selectedOption == MenuOption.DELETE) {
                System.out.println("Digite o ID do usuário a ser deletado:");
                var id = scanner.nextLong();
                var deletedUser = userDAO.delete(id);
                System.out.println("Usuário deletado com sucesso: " + deletedUser);
            } else if (selectedOption == MenuOption.FIND) {
                System.out.println("Digite o ID do usuário a ser buscado:");
                var id = scanner.nextLong();
                try {
                    var foundUser = userDAO.findById(id);
                    System.out.println("Usuário encontrado: " + foundUser);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            } else if (selectedOption == MenuOption.FIND_ALL) {
                var allUsers = userDAO.findAll();
                if (allUsers.isEmpty()) {
                    System.out.println("Nenhum usuário cadastrado.");
                } else {
                    System.out.println("Usuários cadastrados:");
                    allUsers.forEach(System.out::println);
                }
            }
        }

        private static model
    }
}
