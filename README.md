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
  
  1) نقوم بإنشاء كلاس جافا باسم ItemAdapter.
  2) نقوم بإنشاء متغير مصفوفة <ArrayList<Items
  3) نقوم بإنشاء Constructor -> نضغط على علامة اللمبة ونحط على قبل الأخيرة
  4) داخل الـ Constructor نضع قيمة مصفوفة الـ ItemAdapter التي انشئناها تساوي قيمة المصفوفة التي بداخل الـ Constructor
  5) داخل onCreateViewHolder نقوم بإنشاء View
  6) داخل onBindViewHolder نربطه بالعناصر ملف XML اللي سوينا فيه التصميم
  7) ننشئ كلاس داخلي ViewHolder
  8) نربط العناصر الموجودة في الـ XMLداخل هذا الكلاس
  9) نربط الـ Adapter بالـ RecylerView عن طريق

  ```Java
  RecyclerView phonelist = findViewById(R.id.rv);
  PhoneAdapter adapter = new PhoneAdapter(phones, this);
  phonelist.setAdapter(adapter);

  ```
  
  # ملاحظة: شرح الدرس واااااااااااايد راح يفيدنا واااااااااااااايد
 
## بالتوفيق طلبتنا الأعزاء🤗
  
  
  ### إذا تعقدتوا من شرح التمرين هني روحوا ارجعوا حق ال google doc

  
