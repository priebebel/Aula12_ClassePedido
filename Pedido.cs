namespace RDI_AULA12
{
    public class Pedido
    {
        public decimal Valor { get; private set; }

        // Construtor público
        public Pedido(decimal valor)
        {
            if (!ValorEhValido(valor))
            {
                throw new ArgumentException("O valor do pedido deve ser maior que zero.");
            }

            Valor = valor;
        }

        // Método estático
        public static bool ValorEhValido(decimal valor)
        {
            return valor > 0;
        }
    }
}