#Quest�o  2 - Api socio torcedor
- Comecei a implementa-la com recursos do Spring Cloud para viabilizar fallbacks e circuir braker, mas infelizmente n�o tive tempo de finalizar.

#Quest�o 3 -Streams
- L�gica na classe Util.java
- Executar a classe MainApp.java

#Quest�o 4 - Deadlock
Deadlock � quando um processo entra em conflito com o outro pois o evento que se deseja executar aceita somente um processo por vez.
Um exemplo cl�ssico � quando se h� concorr�ncia em grava��o de dados em banco e, para garantir a integridade dos dados, o processo fica bloqueado.

Para evitar deadlocks, o ideal � que os processos sejam executados em fila pois desta forma dois processos n�o tentar�o executar o mesmo evento.

#Quest�o 5 - Streams vs ParallelStreams
ParallelStreams como o pr�prio nome j� diz, s�o strems que s�o executadas em paralelo atrav�s do recurso de multi-thread do java, ou seja, a Stream � dividida em substreams. 
J� uma Stream comum, � um recurso que opera utilizando somente uma �nica Thread.
ParallelStreams podem ser mais r�pidas em rela��o as Streams quando executadas em ambientes com mais cores de CPUs, por�m deve-se tomar cuidado para n�o sobrecarregar os recursos de hardware.