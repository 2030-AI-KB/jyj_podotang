#!/usr/bin/env python
# coding: utf-8

# In[4]:


poem='''How do I love thee? Let me count the ways.
        I love thee to the depth and breadth and height
        My soul can reach, when feeling out of sight
        For the ends of Being and ideal Grace.
        I love thee to the level of everyday's
        Most quiet need, by sun and candle-light.
        I love thee freely, as men strive for Right;
        I love thee purely, as they turn from Praise.
        I love thee with the passion put to use
        In my old griefs, and with my childhood's faith.
        I love thee with a love I seemed to lose
        With my lost saint - I love thee with the breath,
        Smiles, tears, of all my life! - and if God choose,
        I shall but love thee better after death.'''

dist = poem.replace('?','')
dist = dist.replace('-','')
dist = dist.replace(',','')
dist = dist.replace('.','')
dist = dist.replace('!','')
dist1= dist.split()
dist2= dist.split('\n')

dup={}
for word in dist1:
    if word not in dup.keys():
        dup[word]=1
    else:
        dup[word]+=1
print(dup)




# !pip install matplotlib
import matplotlib.pyplot as plt
x=[word for word in dup.keys()]
y=[word for word in dup.values()]
plt.figure(figsize=(100,15))
plt.bar(x,y, color='b',label='word')
plt.xlabel('Word', fontsize=30, color='w')
plt.ylabel('Count', fontsize=30, color='w')
plt.xticks(x, fontsize=22, color='r')
plt.title('Poem of Word Count', fontsize=50, color='w')
plt.rcParams['axes.grid']=True
plt.legend(loc=4)
plt.show()


# In[1]:


empty_tuple=()
empty_tuple


# In[2]:


one_marx='Groucho',
one_marx


# In[3]:


a=abc
print(a)


# In[ ]:




