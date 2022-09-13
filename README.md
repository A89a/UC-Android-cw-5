<div dir="rtl">
  
  # تمرين 💪:
  ## الجزء الأول من التمرين💚:
  خطوات الجزء الأول من التمرين:
  1) نقوم بإنشاء class بإسم Items مع الخصائص التالية كما هو موضح بالجدول
  2) إنشاء دوال الـ Setter و الـ Getter ودالة الـ Constructor
  <img src="https://cdn.discordapp.com/attachments/740224779730157638/954374131351158784/unknown.png"/>
  
  3) في ملف MainActivity, سنقوم بتعريف Arraylist و إضافة كائنات داخل ArrayList
  
  ### ملاحظة: ترى سويناهم المحاضرة اللي طافت 
  
  ## الجزء الثاني من التمرين😎:
  ### (إنشاء تصميم الـ RecyclerView)
  ### في هذا الجزء من التمرين سوف نقوم بتصميم العنصر الواحد من الـ RecyclerView:
  <img src="https://cdn.discordapp.com/attachments/740224779730157638/954414689159348264/unknown.png"/>
  <img src="https://cdn.discordapp.com/attachments/740224779730157638/954414721447125083/unknown.png"/>
  
  ## الجزء الثالث من التمرين🤩:
  ### (إنشاء الـ ArrayAdapter)
  
  1) نقوم بإنشاء كلاس جافا باسمItemAdapter.
  2) نضيفله extends RecyclerView.Adapter
  3) نضغط علامة اللمبة ونسوي implementation
  4) نقوم بإنشاء متغير مصفوفة <ArrayList<Items ومتغير Context
  5) نقوم بإنشاء Constructor
  6) ننشئ كلاس داخليViewHolder
  7) نربط العناصر الموجودة في الـ XMLداخل هذا الكلاس
  8) داخل onCreateViewHolder نقوم بإنشاء View ونربط ملف item_row.xml
  9) داخل onBindViewHolder نغير قيم العناصر اللي داخل ملف XML اللي سوينا فيه التصميم (setText & setImageResources)
  10) نعدل getItemCount ونخليها تردلنا حجم ArrayList
  
 وما ننسى نربط الـ Adapter بالـ RecylerView داخل MainActivity عن طريق

  ```Java
  RecyclerView recycler = findViewById(R.id.rv);
  ItemAdapter adapter = new ItemAdapter(myList, this);
  recycler.setAdapter(adapter);

  ```
  
 
## بالتوفيق طلبتنا الأعزاء🤗
  
  
  
