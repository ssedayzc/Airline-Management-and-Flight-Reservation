# Airline-Management-and-Flight-Reservation

Havayolu Şirketi: Havayolu adı ve kodu olmak üzere iki değişken içeren, ayrıca uçuşların listesinin tutan 
tüm yazılımın tasarlandığı temel bölüm olarak adlandırılmaktadır. 

Havalimanı: Her havayolu farklı havalimanlarında faaliyet göstermektedir. Her havalimanının bir adı, adresi
ve benzersiz bir kodu vardır.

Uçak: Havayolları, uçuşlarını gerçekleştirmek için uçak sahibidir veya kiralamaktadır. Her uçağın adı, 
modeli, üretim yılı gibi özellikleri vardır.

Uçuş: Her uçuşun bir uçuş numarası, kalkış ve varış havalimanı, hangi uçakta yolculuk yapılacağı bilgisi, 
uçuş süresi, uçuş günü ve saati ve durum bilgisi bulunmaktadır. 

Uçuş Rezervasyonu: Bir uçuş için rezervasyon yapıldığında bu sınıf içerisinde benzersiz bir rezervasyon 
numarası, yolcu listesi ve atanan koltuklar, rezervasyon durumu vb. gibi özelliklere kaydedilmektedir.

Uçuş Koltuğu: Bu sınıf, belirli bir uçuşa atanan bir uçağın tüm koltuklarını temsil etmektedir. Bir uçuş 
örneğinin tüm rezervasyonları, bu sınıf aracılığıyla yolculara koltuk atayacaktır.

Kişi: Uçuş yönetim sisteminden yararlanan kabin üyeleri, yönetici ve yolcuların yer aldığı sınıftır.

### Sistem gereksinimleri aşağıda verilmektedir:

• Sistem yöneticileri havayolu şirketleri için listeleme ve ekleme işlemlerini yapabilmelidir.
• Sistem yöneticileri havalimanları için için listeleme ve ekleme işlemlerini yapabilmelidir.
• Sistem yöneticileri uçaklar için listeleme ve ekleme işlemlerini yapabilmelidir.
• Sistem yöneticileri uçuşlar için listeleme ve ekleme işlemlerini yapabilmelidir.
• Sistem yöneticileri rezervasyon yaptırmış yolcuların bilgilerini listeleyebilmektedir.
• Müşteriler (Yolcu sınıfı), istedikleri tarihte ve kalkış/varış havalimanları için uçuş araması 
yapabilmelidirler. 
• Müşteriler, tek bir uçuşta birden fazla yolcu için rezervasyon yapabilmelidirler.
• Müşteriler rezervasyonlarını iptal edebilmelidirler.

Bu proje için kullanılacak metin dosyalarının içeriği aşağıda alt başlıklar halinde verilmiştir.

1. HavayoluSirketleri.txt: Bu metin dosyası içerisinde havayolu şirketinin kodu ve adı yer almaktadır.

2. Havalimanlari.txt: Bu dosya havalimanı adı, havalimanının bulunduğu ülke ve şehir bilgisini 
içermektedir.

3. Ucaklar.txt: Bu dosyada uçakların tipi, maksimum yolcu kapasitesi ve üretim yılları yer almaktadır.

4. Ucuslar.txt: Bu dosya için gerekli parametreler dosyanın ilk satırında verilmiştir. İşlem yapılırken ilk 
satırların değerlendirilmemesi gerekmektedir. Bu dosyada uçak tipi ve havayolu şirketi bilgisi 
bulunmalıdır. 

5. Kisiler.txt: Bu dosyada kişilerin ad soyad, doğum tarih ve kategori bilgisi yer almaktadır. Kategori 
bilgisi Kisiler sınıfından kalıtım yolu ile alınan Yonetici, Yolcu ve KabinUyesi olmak üzere üç farklı 
türde olabilmektedir. 

6. Rezervasyonlar.txt: Müşteri olarak sisteme giriş yapan kişilerin bir veya birden fazla rezervasyon 
oluşturması sonrasında ilgili rezervasyon bilgileri bu dosyaya yazılmaktadır. Metin dosyasının ilk 
satırı içerisine hangi bilgilerin depolanacağı verilmektedir.
