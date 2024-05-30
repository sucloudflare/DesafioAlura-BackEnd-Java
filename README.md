 <h1>Conversor de Moedas</h1>
 <p>Este é um projeto Java que converte valores entre diferentes moedas usando taxas de câmbio obtidas de uma API externa.</p>

 <h2>Pré-requisitos</h2>
 <ul>
  <li>Java 22 ou superior</li>
    <li>Maven</li>
 </ul>

 <h2>Instalando o Maven</h2>
 <p>Para instalar o Maven no Kali Linux, siga os passos abaixo:</p>  <ol>
   <li>Atualize a lista de pacotes:</li>
    <code>sudo apt update</code>
    <li>Instale o Maven:</li>
        <code>sudo apt install maven</code>
 <li>Verifique a instalação do Maven:</li>
    <code>mvn -version</code>
 <p>Você deve ver a versão do Maven instalada e outras informações de configuração.</p>
</ol>

<h2>Compilando e Executando o Projeto</h2>
<p>Execute o arquivo por esses comandos, caso sua versão não seja compativel</p>
 <ol>
   <li>Clone o repositório para o seu diretório local:</li>
   <code>git clone https://github.com/sucloudflare/DesafioAlura-BackEnd-Java</code>
    <code>cd DesafioAlura-BackEnd-Java</code>
   <li>Compile o projeto usando Maven:</li>
       <code>mvn clean install</code>
    <li>Execute o projeto:</li>
        <code>mvn exec:java -Dexec.mainClass="conversor.ConversorMoedas
</code>
    </ol>

 <h2>Estrutura do Projeto</h2>
  <p>O projeto está dividido em quatro classes principais dentro do pacote conversor:</p>
 <ul>
     <li>ConversorMoedas.java: Classe principal que contém o método main e a lógica de interação com o usuário.</li>
     <li>SelecionadorMoeda.java: Classe que mapeia a seleção do usuário para o código da moeda correspondente.</li>
     <li>ConversorMoeda.java: Classe que contém a lógica para converter valores entre diferentes moedas.</li>
     <li>CarregadorTaxas.java: Classe que carrega as taxas de câmbio de uma API externa.</li>
 </ul>
  <h2>Dependências</h2>
 <p>O projeto utiliza a biblioteca Gson para o parsing de JSON. Esta dependência está definida no arquivo pom.xml:</p>
   <pre><code>&lt;dependencies&gt;
    &lt;dependency&gt;
        &lt;groupId&gt;com.google.code.gson&lt;/groupId&gt;
        &lt;artifactId&gt;gson&lt;/artifactId&gt;
        &lt;version&gt;2.10.1&lt;/version&gt;
    &lt;/dependency&gt;
&lt;/dependencies&gt;
 </code></pre>

 <h2>Configuração do Maven</h2>
   <p>O arquivo pom.xml está configurado para usar Java 22:</p>
 <pre><code>&lt;properties&gt;
    &lt;maven.compiler.source&gt;22&lt;/maven.compiler.source&gt;
    &lt;maven.compiler.target&gt;22&lt;/maven.compiler.target&gt;
    &lt;project.build.sourceEncoding&gt;UTF-8&lt;/project.build.sourceEncoding&gt;
&lt;/properties&gt;
   </code></pre>

 <h2>Exemplo de Uso</h2>
<p>Ao executar o projeto, você será solicitado a selecionar a moeda de origem e destino, bem como o valor a ser convertido. O programa então exibirá o valor convertido com base nas taxas de câmbio atuais.</p>

 <p>Nota: Certifique-se de que sua versão do Java e Maven estejam corretamente configuradas para evitar problemas de compatibilidade.</p>

<p>Este README fornece instruções claras sobre como configurar o ambiente, compilar e executar o projeto. Certifique-se de substituir <code>https://github.com/sucloudflare/DesafioAlura-BackEnd-Java</code> pelo URL real do seu repositório no GitHub.</p></body>
