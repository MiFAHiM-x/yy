# Result Browser App

একটা ছোট Android অ্যাপ যা Education Board Result চেক করার জন্য বানানো।

## ফিচার
- দুইটা সার্ভারের বাটন (Server 1 & Server 2)
- বাটনে ক্লিক করলে সাইট লোড হবে
- অটোমেটিক অটোফিল:
  - Board: **dinajpur**
  - Exam: **hsc**
  - Year: **2026**
  - Result Type: **1**
  - Roll: **305033**
  - Reg: **2117820810**

---

## GitHub দিয়ে APK বানানোর পদ্ধতি (সবচেয়ে সহজ)

### ধাপ ১: নতুন GitHub Repository তৈরি করো
1. https://github.com/new এ যাও
2. Repository name দাও: `ResultBrowserApp` (বা যেকোনো নাম)
3. **Public** সিলেক্ট করো
4. **Create repository** বাটনে ক্লিক করো

### ধাপ ২: কোড আপলোড করো

**পদ্ধতি A – GitHub ওয়েবসাইট দিয়ে (সবচেয়ে সহজ):**
1. নতুন তৈরি করা রিপোজিটরিতে গিয়ে **uploading an existing file** লিংকে ক্লিক করো
2. এই ফোল্ডারের **সব ফাইল ও ফোল্ডার** ড্র্যাগ-অ্যান্ড-ড্রপ করে দাও
3. Commit message দাও: `Initial commit`
4. **Commit changes** বাটনে ক্লিক করো

**পদ্ধতি B – Git কমান্ড দিয়ে:**
```bash
git init
git add .
git commit -m "Initial commit - Result Browser App"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/ResultBrowserApp.git
git push -u origin main
```

### ধাপ ৩: APK ডাউনলোড করো
1. রিপোজিটরিতে গিয়ে উপরের **Actions** ট্যাবে ক্লিক করো
2. **Build APK** ওয়ার্কফ্লো চলতে দেখবে (২-৪ মিনিট লাগে)
3. সবুজ টিক চিহ্ন আসলে ক্লিক করো
4. নিচে **Artifacts** সেকশনে **Result-Browser-APK** দেখবে
5. সেখানে ক্লিক করে APK ডাউনলোড করো

### ধাপ ৪: মোবাইলে ইনস্টল করো
- ডাউনলোড করা APK মোবাইলে কপি করো
- ফাইল ম্যানেজার দিয়ে ওপেন করো
- “Unknown sources” থেকে ইনস্টল অ্যালাউ করো

---

## রোল / রেজিস্ট্রেশন নম্বর পরিবর্তন

`app/src/main/java/com/resultbrowser/app/WebViewActivity.java` ফাইলে এই অংশ এডিট করো:

```java
setVal('board', 'dinajpur');
setVal('exam', 'hsc');
setVal('year', '2026');
setVal('result_type', '1');
...
setVal('roll', '305033');
setVal('reg', '2117820810');
```

তারপর আবার GitHub-এ পুশ করলে নতুন APK অটোমেটিক বিল্ড হবে।

---

## ম্যানুয়ালি রান করতে চাইলে
Actions ট্যাবে গিয়ে **Build APK** → **Run workflow** বাটনে ক্লিক করো।
