#!/usr/bin/env python
# coding: utf-8

# a=int(input("a값을 넣으시오 :"))
# b=int(input("b값을 넣으시오 :"))
# c=a+b
# print("다음은 두 수의 합계입니다 : ",c)

# In[1]:


for i in range(10):
    print(i,end='')


# In[2]:


for i in range(1,13,3):
    print(i,end=', ')


# In[3]:


yeappi='예삐예삐'
girl='얘들아!!!'
'hello my name is {} yo comeon {} '.format(yeappi,girl)


# In[4]:


thing='butterfly'
place='cocacola'
f'The{thing:>20} is in the {place:.^20}'


# In[5]:


# m으로 시작하는 단어를 대문자로 만들어보자
song  ='''When an eel grabs your arm,
And if causes great harm,
That's - a moray!'''
for hell in song.split():
    if hell.startswith('m'):
        hell=hell.upper()
    print(hell,end=' ')


# In[6]:


for i in range(2, 10):
    for j in range(1, 10):
        print(f"{i} x {j} = {i*j}")


# In[7]:


for i in range(2, 10):
    for j in range(1, 10):
        print(f"{i} x {j} = {i*j}")
    print()  # 한 단이 끝나면 빈 줄을 출력하여 구분합니다.


# In[14]:


for i in range(2, 10):
    for j in range(1, 10):
        print(f"{i}*{j}={i*j}")
    print()


# In[ ]:




