package controller;

import model.Funcionario;
import java.util.ArrayList;

public class FuncionarioController {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado: " + funcionario.mostrarDetalhes());
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario f : funcionarios) {
                System.out.println(f.mostrarDetalhes());
            }
        }
    }

    public void atualizarFuncionario(int index, String novoNome, double novoSalario) {
        if (index >= 0 && index < funcionarios.size()) {
            Funcionario f = funcionarios.get(index);
            f.setNome(novoNome);
            f.setSalario(novoSalario);
            System.out.println("Funcionário atualizado: " + f.mostrarDetalhes());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void excluirFuncionario(int index) {
        if (index >= 0 && index < funcionarios.size()) {
            Funcionario removido = funcionarios.remove(index);
            System.out.println("Funcionário removido: " + removido.mostrarDetalhes());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
