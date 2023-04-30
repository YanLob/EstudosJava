package composicao.desafio.teste;

import composicao.Carro;

public class CarroTeste {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
//        faltou emcapsulamento!!!
//        c1.motor.fatorInjecao = -30;
//        O carro tem o motor e o motor tem o carro, relação unidirecional

        System.out.println(c1.motor.giros());

        // relação bidirecional
        System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.carro.motor.giros());


    }
}
