#!/usr/bin/env python
# coding: utf-8

# In[1]:


#숫자를 입력받아 몫과 나머지를 구하는 식
num1=int(input())
num2=int(input())
print(divmod(num1,num2))


# In[2]:


num1=int(input("첫정수입력"))
num2=int(input("두번째정수입력"))
res=divmod(num1,num2)


# In[3]:


num1=int(input("첫정수입력"))
num2=int(input("두번째정수입력"))
res=divmod(num1,num2)
println("몫입력"+res[0])
println("나머지입력"+res[1])


# In[4]:


num1=int(input("첫정수입력"))
num2=int(input("두번째정수입력"))
res=divmod(num1,num2)
print("몫입력"+res[0])
print("나머지입력"+res[1])


# In[5]:


num1=int(input("첫정수입력"))
num2=int(input("두번째정수입력"))
res=divmod(num1,num2)
print("몫입력",res[0])
print("나머지입력",res[1])


# In[7]:


#if,for안써도됨- 원하는 두 수를 입력받아서 사칙연산한 결과 보여주는 프로그램
num1=int(input("1번째 숫자 : "))
num2=int(input("2번째 숫자 : "))
res1=num1+num2
res2=num1-num2
res3=num1*num2
res4=num1/num2
print("덧셈값 : ",res1)
print("뺄셈값 : ",res2)
print("곱셈값 : ",res3)
print("나눗셈값 : ",res4)


# In[8]:


#if,for안써도됨- 원하는 두 수를 입력받아서 사칙연산한 결과 보여주는 프로그램
num1=int(input("1번째 숫자 : "))
num2=int(input("2번째 숫자 : "))
plus=num1+num2
minus=num1-num2
multi=num1*num2
divis=num1/num2
print("덧셈값 : ",plus)
print("뺄셈값 : ",minus)
print("곱셈값 : ",multi)
print("나눗셈값 : ",divis)


# In[9]:


diaster= True
if diaster :
    print("woe!")
else:
    print("whee!")


# In[10]:


furry = True
large = True
if furry:
    if large:
        print("It's a yeti.")
    else :
        print("It's a cat!")
else:
    if large:
        print("It's a whale!")
    else:
        print("It's a human. Or a hairless cat.")


# In[26]:


# mission 주머니에 3000원이 있습니다. 
# 버스타면 1000원 택시타면 2000원입니다.
# 1000원짜리 키피를 먹게되면 어떤 교통 수단을 활용할까요?
#아니면 버스를 타고간다
#1500원짜리 커피
#커피를 사셨나요?(y/n)
#사셨다면 어떤 교통수단을 이용하실 수 있습니다.
m=3000
c=1500
hell = input("커피샀나요? y/n")
if hell == "y":
    m=m-c
    if m>=2000:
        print("택시 타세요")
    else:
        print("버스밖에 못타요")
else:
    print("모두사용가능합니다.")
    


# In[ ]:





# In[20]:


# mission 주머니에 3000원이 있습니다. 
# 버스타면 1000원 택시타면 2000원입니다.
# 1000원짜리 키피를 먹게되면 어떤 교통 수단을 활용할까요?
m=3000
m-=1000
if m>=2000:
    print("여전히 택시")
else:
    print("버스...")


# In[19]:


# mission 주머니에 3000원이 있습니다. 
# 버스타면 1000원 택시타면 2000원입니다.
# 1000원짜리 키피를 먹게되면 어떤 교통 수단을 활용할까요?
m=3000
if m>=2000:
    print("택시ㄱ")
else:
    print("버스")


# In[ ]:


# mission 주머니에 3000원이 있습니다. 
# 버스타면 1000원 택시타면 2000원입니다.
# 1000원짜리 키피를 먹게되면 어떤 교통 수단을 활용할까요?
#아니면 버스를 타고간다
#1500원짜리 커피
#커피를 사셨나요?(y/n)
#사셨다면 어떤 교통수단을 이용하실 수 있습니다.
m=3000
c=1500
hell = input("커피샀나요? y/n : ")
if hell == "y":
    m=m-c
    if m>=2000:
        print("택시 타세요")
    else:
        if m>=1000:
            print("버스 타세요.")
        else:
            print("걸어가야합니다.")
else:
    print("모두사용가능합니다.")


# In[ ]:





# In[ ]:




