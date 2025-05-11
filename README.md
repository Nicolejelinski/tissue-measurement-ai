# TissAI

**Sistema de medição automatizada de tecidos com visão computacional para laboratórios DASA**

[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://openjdk.org/)
[![OpenCV](https://img.shields.io/badge/OpenCV-4.5.5-green)](https://opencv.org/)
[![License](https://img.shields.io/badge/License-MIT-purple)](LICENSE)

##  Visão Geral
Solução de IA para medição precisa de tecidos biológicos e leitura de peso em balanças, integrada a bancos de dados médicos existentes.

##  Funcionalidades
- **Medição Automatizada**: Detecção de dimensões (comprimento/largura) de tecidos via OpenCV.
- **Leitura de Peso**: OCR para capturar valores exibidos em balanças digitais.
- **Integração com Banco de Dados**: Armazenamento seguro de medições.
- **Calibração**: Interface para ajuste de parâmetros de câmera e balança.


### Pré-requisitos
- Java 17+
- OpenCV 4.5.5
- Maven 3.8+ (ou Gradle)
- Camera USB e balança compatível

### Instalação
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/TissAI.git
   cd TissAI
    ```
   Configure o OpenCV:

2. Baixe o OpenCV e defina a variável de ambiente:

  ```bash
export OPENCV_DIR=/caminho/para/opencv
  ```

3. Execute o projeto:
  ```bash
mvn spring-boot:run
# Ou use a IDE de sua preferência
  ```



<div align="center"> <sub>Desenvolvido com ❤️ por <a href="https://github.com/NicoleJelinski">nina</a></sub> </div>
   
