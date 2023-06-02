#!/usr/bin/env python
# coding: utf-8

# In[5]:


count =1
while count<=5:
    print(count)
    count+=1


# In[7]:


while True:#break전까지 반복
    stuff =input("String to capitalize[type q to quit]: ")#stuff변수에 값을 넣음
    if stuff =="q":
        print("종료하겠습니다.")
        break#stuff가 q가되면 문장탈출
        print("종료하겠습니다!")#break에 걸리면 아래는 아무것도 출력안됨!
    print(stuff.capitalize())#stuff변수값의 맨앞 첫글자를 대문자로 만든다.


# In[9]:


while True:
    value=input("Integer, please [q to quit]: ")
    if value =='q':
        break
    number=int(value)
    if number % 2==0:
        continue          #짝수이면 그냥 다음으로 건너뛴다
    print(number,"squared is", number*number) #홀수이면 number*number출력


# In[12]:


lst = ['apple', 'banana', 'cherry']
for i, fruit in enumerate(lst):
    print(i, fruit)


# In[13]:


numbers=[1,3,5]
position= 0
while position < len(numbers):
    number=numbers[position]
    if number %2 ==0:
        print('Found even number',number)
        break
    position+=1
else:
    print('No even number found')


# In[15]:


word='thud'
offset=0
while offset<len(word):
    print(word[offset])
    offset +=1
    


# In[18]:


for x in word:
    print(x)


# In[29]:


for x in range(11):   #11개의 값 출력
    print(x)

for x in range(1,11):   #10개의 값 출력
    print(x)

list(range(3,11,2))


# In[31]:


str='i am a girl'
str_1=str.split()
print(str_1)
arr=list(range(1,33))
print(arr)


# In[48]:


#
cnt=0
for True
    Id = (input("아이디 입력해주세요:"))
    if Id != "hello":
        print("아이디를 새로 입력해주세요.")
        continue
    else:
        print("환영합니다.")
        break
    if count=="5"
        break


# In[ ]:


Limit = 5
Try = 0

while Try < Limit:
    ID = input("ID 입력하세요 : ")
    PW = input("비밀번호 입력하세요 : ")
    
    if ID == "hello" and PW == "1234":
        print("로그인 성공!")
        break
    else:
        print("아이디 혹은 패스워드 오류입니다. 다시 시도하세요.")
        Try += 1

if Try == Limit:
    print("5회 이상 오류입니다. 일시적으로 로그인이 제한됩니다.")


# In[62]:


# mission. 로그인 하는 방식을 while문으로 만들어주세요.
# 로그인에 일정 횟수 실패했을 경우를 구현해야함
ID = 'id'
PW = 'pw'
count=0
login=[input("아이디를 입력해주세요."),input("비밀번호를 입력해주세요.")]

if login[0]==ID and login[1]==PW:
    print('로그인에 성공하였습니다.')
else:
    for count in range(5):
        if count==4:  #가독성이 떨어짐 왜 4인가 한번에 모름 ==같으면 조건은 사용 안하는게 좋다!
            print('로그인 시도 횟수가 5회입니다. 본인인증 후 다시 로그인해주세요.')
            break
        count+=1
        print('아이디/비밀번호가 틀렸습니다. 다시 로그인해주세요.'+'로그인 시도 횟수('+str(count)+'/5)')
        login=[input("아이디를 입력해주세요."),input("비밀번호를 입력해주세요.")]


# In[61]:


id_='abc'
pw_='1234'
count = 1
while count<6 :    #이하표기보다 미만 표기가 나음!!
    idd = input("아이디: ")
    password = input("비밀번호: ")
    if idd==id_ and password == pw_:
        print("로그인 되었습니다.")
        break
    if idd != id_ or password !=pw_:
        print("아이디 또는 비밀번호를", count ,"회 잘못 입력하셨습니다.")
        count+=1
        #continue
else :
    print("본인인증 후 다시 로그인을 시도해주세요.")


# In[ ]:




