using System;

namespace RDI_AULA12
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Digite o valor do pedido: ");
            decimal valor = decimal.Parse(Console.ReadLine()!);

            if (Pedido.ValorEhValido(valor))
            {
                var pedido = new Pedido(valor);
                Console.WriteLine($"Pedido criado com sucesso. Valor: {pedido.Valor}");
            }
            else
            {
                Console.WriteLine("Erro: o valor do pedido deve ser maior que zero.");
            }
        }
    }
}
