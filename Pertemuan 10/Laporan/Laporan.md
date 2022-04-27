# Laporan Praktikum Pertemuan 3
Oleh : Muhammad Islahuddin 2141720268

## Jawaban Pertanyaan

### Sub Bab 8.2
1. Karena front dan rear agar tidak ada data harus bernilai -1, jika bernilai 0 maka front dan rear ada di indeks 0 sedangkan size nya masih 0 atau tidak ada raung.
2. Jika rear ada di index terakhir dari array maka rear nya akan di set ke 0, jadi rear tidak akan melewati batas maksimal dari indeks array.
3. Potongan kode tersebut berguna untuk jika front berada pada posisi max-1 atau indexs terakhir dari array, maka disaat ada penambahan data baru, maka akan di tempatkan pada index ke -0.
4. Ya karena bisa saja indeks terdepan bukan indeks 0, indeks terdepan adalah front jadi yang di tampilkan adalah dimulai dari indeks front.
5. Jadi ini iterasi untuk mengeprint data pada array. Ketika i sudah pada indeks paling terakhir dari array, i akan kembali ke 0. Misal max = 5, front = 3, rear = 2 maka akan seperti berikut :  
i = 3 -> print index 3  
i = (3+1) % max // i = 4 -> print index 4  
i = (4+1) % max // i = 0 -> print index 0 // karena 5 % 5 = 0  
i = (0+1) % max // i = 1 -> print index 1  
i = (1+1) % max // i = 2 -> print index 2  //menggunakan sout di luar while karena syarat while adalah i != rear  
dengan begitu sistem tidak akan mengeprint indeks diluar indeks array dan mengulang ke 0 jika i sudah pada indeks paling terakhir dari array.
6. ```java
System.out.print("Masukkan data baru: ");
int dataMasuk = sc.nextInt();
Q.Enqueue(dataMasuk);
break;
```
dan
```java
if (IsFull()) {
    System.out.println("Queue sudah penuh");
}
```
7. ```java
public int Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            return 0;
        } else {
            if (IsEmpty()){
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            return 1;
        }
    }
```  
Untuk fungsi main saya edit pada bagian case 1 dan 2 menjadi :

```java
case 1:
    System.out.print("Masukkan data baru: ");
    int dataMasuk = sc.nextInt();
    pilih = Q.Enqueue(dataMasuk);
    break;
case 2:
    int dataKeluar = Q.Dequeue();
    if (dataKeluar != 0) {
        System.out.println("Data yang dikeluarkan: " + dataKeluar);
        break;
    } else {
        pilih = dataKeluar;
        break;
    }
```
### Sub Bab 8.3
1. ```java
if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
            && data.saldo != 0) {
        System.out.println("Data yang dikeluarkan: " + data.norek + " " + data.nama + " "
                + data.alamat + " " + data.umur + " " + data.saldo);
        break;
    }
```  
Ketika masuk ke case 2 dan data[front] mempunyai isi atau tidak sama dengan kosong, maka sistem akan mengprint data yang telah didequeue tersebut.

2. 
Modifikasi dari class Queue : 
```java
public void peekRear() {
    if (!IsEmpty()) {
        System.out.println("Elemen terbelakang: " + data[rear].norek + " " + data[rear].nama + " "
                + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
    } else {
        System.out.println("Queue masih kosong");
    }
}
```
Modifikasi dari class QueueMain :
```java
public static void menu() {
    System.out.println("Pilih Menu:");
    System.out.println("1. Antrian Baru");
    System.out.println("2. Antrian Keluar");
    System.out.println("3. Cek Antrian Terdepan");
    System.out.println("4. Cek Semua Antrian");
    System.out.println("5. Cek Antrian Paling Belakang");
    System.out.println("-------------------");
}
```
```java
        case 5:
            antri.peekRear();
            break;
    }

} while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
```