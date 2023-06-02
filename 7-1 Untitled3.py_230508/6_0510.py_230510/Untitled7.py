#!/usr/bin/env python
# coding: utf-8

# In[1]:


what=('hell',)
what


# In[2]:


hehe=('hehehhe')
hehe


# In[3]:


a=(2,5)
b=(3,5)
a==b


# In[4]:


empty_list=[]
weekdays=['Monday','Tuesday','Wednesday','Thursday','Friday']
big_birds=['emu','ostrich','cassowary']
leap_years=[2000,2004,2008]
randomness=['Punxsatawney',{'groundhog':'Phil'},'Feb.2']


# In[5]:


another_empty_list=list()
another_empty_list


# In[6]:


list('cat')


# In[7]:


a_tuple=('ready','fire','aim')
list(a_tuple)


# In[8]:


tuple(list(a_tuple))


# In[9]:


marxes=['Groucho','Chico','Harpo']
marxes[0]


# In[10]:


marxes[1]


# In[11]:


marxes[-1]


# In[12]:


print(marxes[1:])


# In[13]:


print(type(marxes[0]))  #문자열
print(marxes[2:])  #리스트-리스트 안의 값을 다 읽어야함으로
print(marxes[5])    #5라는 자리는 없다.


# In[ ]:


marxes[::2]


# In[ ]:


marxes[::-2]


# In[ ]:


marxes[::-1]


# In[ ]:


marxes=['Groucho','Chico','Harpo']
marxes.reverse()
marxes


# In[ ]:


marxes=['Groucho','Chico','Harpo']
marxes[4:]  # 4부터 라는 자리수를 찾으려면 앞에서부터 읽어야함으로 오류안남!!


# In[ ]:


print(marxes[::-6])


# In[ ]:


marxes[1]=marxes.append("Zeppo")
print(marxes)  # None:값은 있으나 넣을수 없는 상태


# In[17]:


marxes=['Groucho','Chico','Harpo']
list_app=[]
list_app=marxes.append("Zeppo")
marxes[1]=list_app
marxes.insert(2,"hello")  # 2번째 후에 hello를 넣는다.
print(list_app)
print(marxes)


# In[19]:


marxes=['Groucho','Chico','Harpo']
marxes[2]='Wanda'
marxes


# In[23]:


number=[1,2,3,4,5]
number[1:4]=[8,9]
number


# In[25]:


number=[1,2,3,4,5]
number[1:4]=[]
print(number)


# In[34]:


numbers=[1,2,3,4]
numbers[1:3]='wat?'
numbers


# In[33]:


numbers=[1,2,3,4]
numbers[1:3]=['wat?']
del numbers[1]
print(numbers)


# In[37]:


marxes=['Groucho','Chico','Harpo','Zeppo']
marxes.pop()
marxes


# In[39]:


marxes.pop(1)


# In[40]:


marxes


# In[41]:


marxes=['Groucho','Chico','Harpo']
', '.join(marxes)


# In[52]:


friends=['Harry','Hermione','Ron']
separator='*'
joined=separator.join(friends)
joined


# In[50]:


separated = joined.split(separator)
separated


# In[54]:


separated=joined.split(separator)
separated==friends


# In[57]:


friends=['Harry','Hermione','Ron']
separator='*'
joined=separator.join(friends)
joined


# In[58]:


separated = joined.split(separator)
separated


# In[59]:


separated=joined.split(separator)
separated==friends


# In[63]:


a=[1,2,3]
b=a.copy()
c=list(a)
d=a[:]
a[0]='integer lists are boring'
a


# In[65]:


b


# In[67]:


c


# In[68]:


d


# In[69]:


a=[1,2,[8,9]]
b=a
print(a)
c=a[2][0]
print(c)


# In[ ]:




