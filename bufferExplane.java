byte[] buffer = new byte[1024*1024];
FileInputStream sourceFile = new FileInputStream("c:\\data.txt");
FileOutputStream destFile = new FileOutputStream("c:\\output.txt");
while (true)
{
   int size = sourceFile.read(buffer);   // читаем данные из файла в буфер
   destFile.write(buffer, 0, size);      // записываем данные из буфера в файл

   // прекращаем копирование, если буфер заполнен не полностью
   if (size < buffer.length) break;
}
sourceFile.close();
destFile.close();