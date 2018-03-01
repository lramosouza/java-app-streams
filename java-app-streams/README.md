#Questão  2 - Api socio torcedor
- Comecei a implementa-la com recursos do Spring Cloud para viabilizar fallbacks e circuir braker, mas infelizmente não tive tempo de finalizar.

#Questão 3 -Streams
- Lógica na classe Util.java
- Executar a classe MainApp.java

#Questão 4 - Deadlock
Deadlock é quando um processo entra em conflito com o outro pois o evento que se deseja executar aceita somente um processo por vez.
Um exemplo clássico é quando se há concorrência em gravação de dados em banco e, para garantir a integridade dos dados, o processo fica bloqueado.

Para evitar deadlocks, o ideal é que os processos sejam executados em fila pois desta forma dois processos não tentarão executar o mesmo evento.

#Questão 5 - Streams vs ParallelStreams
ParallelStreams como o próprio nome já diz, são strems que são executadas em paralelo através do recurso de multi-thread do java, ou seja, a Stream é dividida em substreams. 
Já uma Stream comum, é um recurso que opera utilizando somente uma única Thread.
ParallelStreams podem ser mais rápidas em relação as Streams quando executadas em ambientes com mais cores de CPUs, porém deve-se tomar cuidado para não sobrecarregar os recursos de hardware.