#!/usr/bin/env python
# coding: utf-8

# In[8]:


letter='o'
if letter == 'a' or letter == 'e' or letter == 'i' or letter =='o' or letter =='u':
    print(letter, 'is a vowel')
else:
    print(letter,'is not a vowel')


# In[9]:


vowels='aeiou'
letter='o'
letter in vowels


# In[10]:


if letter in vowels:
    print(letter,'is a vowel')


# In[14]:


#letter를 input 받아서
vowels='aeiou'
letter=input('input matching : ')
letter in vowels
if letter in vowels:
    print(letter,'is a vowel')
else:
    print(letter,'is not a vowel')


# In[31]:


#letter를 input 받아서
vowels=['I am a boy','I am a girl']
letter=input('input matching : ')
letter in vowels
if letter in vowels:
    print(letter,'is a vowel')
else:
    print(letter,'is not a vowel')


# In[24]:


letter='o'
vowel_set = {'a','e','i','o','u'}
letter in vowel_set


# In[26]:


vowel_list=['a','e','i','o','u']
letter in vowel_list


# In[27]:


vowel_tuple=('a','e','i','o','u')
letter in vowel_tuple


# In[28]:


vowel_string='aeiou'
letter in vowel_string


# In[29]:


vowel_dict={'a':'apple','e':'elephant',
           'i':'impala','o':'ocelot','u':'unicorn'}
letter in vowel_dict


# In[32]:


"'Nay!' said the naysayer. 'Neigh?' said the horse."
'The rare double quote in captivity:".'
'A'"two by four" is actually 1 1/2" x 3 1/2".'
"'There's the man that shot my paw!' cried the limping hound."


# In[33]:


"'Nay!' said the naysayer. 'Neigh?' said the horse."


# In[34]:


'The rare double quote in captivity:".'


# In[36]:


'A"two by four" is actually 1 1/2" x 3 1/2".'


# In[37]:


"'There's the man that shot my paw!' cried the limping hound."


# In[38]:


'''hello'''


# In[39]:


"""hello"""


# In[40]:


print('Give',"us",'''some''',"""space""")


# In[44]:


print('give'+"us"+'''some''')


# In[49]:


letters='abcdefghijklmnopqrstuvwxyz'
letters[-2]


# In[48]:


letters='abcdefghijklmnopqrstuvwxyz'
letters[5]


# In[140]:


money = int(input("가진 돈을 입력하세요: "))
coffee = input("커피를 사시겠습니까? (y/n): ")

if money < 1000:
    print("돈이 모자라서 아무것도 할 수 없습니다.")
else:
    if coffee == 'y':
        if money >= 2000:
            print("커피를 사고 택시를 탈 수 있습니다.")
        elif money >= 1500:
            print("커피를 사지 않고 택시를 탈 수 있습니다.")
        else:
            print("커피를 사지 않고 버스를 탈 수 있습니다.")
    else:
        if money >= 2000:
            print("커피를 사지 않고 택시를 탈 수 있습니다.")
        elif money >= 1000:
            print("커피를 사지 않고 버스를 탈 수 있습니다.")
        else:
            print("커피를 사지 않으며, 돈이 모자라서 아무것도 할 수 없습니다.")


# In[52]:


name='Henny'
print(name.replace('H','P'))
print(name)


# In[55]:


name='Henny'
print(name[1:])
name='P'+name[1:]
print(name)


# In[57]:


name='a.jpg'
print(name[1:])
name='P'+name[:-2]
print(name)


# In[61]:


#jpg -> bnp
name='Henny.jpg'
name=name[:5]+'.bnp'
print(name)


# In[63]:


name='Henny.jpg'
print(name.replace('jpg','bnp'))


# In[68]:


name='Kakao132435567_cat.jpg'
name='1'+name[-8:]
print(name)


# In[75]:


tasks='get gloves, get,mask,give cat vitamins,call ambulance'
tasks.split(' ')


# In[71]:


tasks='get gloves, get,mask,give cat vitamins,call ambulance'
tasks.split(',')


# In[72]:


tasks.split()


# In[81]:


crypto_list=['Yeti', 'Bigfoot', 'Loch Ness Monster']
crypto_string=', '.join(crypto_list)
print('Found and signing book deals:', crypto_list)
print('Found and signing book deals:', crypto_string)


# In[86]:


task=' I am a boy. too old '
print(task.strip())


# In[89]:


task=', I am a boy. too old, '
print(task.strip())
print(task.startswith(','))


# In[90]:


money = int(input("너 주머니에 얼마있니? :"))
coffee = 1500

if money <= 1000:
        print("돈없어 암것도 하지마....")
else:
    dec = input("커피를 샀나요? (Y/N) : ")
    if dec == "Y" :
        money = money - coffee
        if money >= 2000 :
            print("Taxi 타고가세요")
        elif money >= 1000 : 
            print("버스타고 가세요")
        else:
            print("커피 사먹으면 니 다리가 고생해!!!!")
    else :
        if dec == "N" :
            if money >= 2000 :
                print("Taxi 타고가세요")
            else:
                print("버스타고 가세요")
        else:
            print("잘못입력하셨어요........")


# In[98]:


poem='''All that doth flow we cannot liquid name
Or else would fire and water be the same;
But that is liquid which is moist and wet'''
word='the'
'''print(poem.find(word))
print(poem.index(word))
print(poem.rfind(word))
print(poem.rindex(word))''' #'''주석처리부분!'''
print(poem.count(word))


# In[107]:


# "나는 이 세상에서 가장 행복하게 살기위해 노력하는 행복 지킴이입니다."
# 라는 문장을 가지고 이 글을 작성한이가 중요하게 생각하는 영역을 찾아보세요
# 정량화 된 값을 도출하시어 설명해주십시오...(행복이 몇번들어갔느냐)
sen="나는 이 세상에서 가장 행복하게 살기위해 노력하는 행복 지킴이입니다."
word=input('중요한것 수 파악하라')
print(sen.count(word))







# In[108]:


setup = 'a duck goes into a bar...'
setup.strip('.')


# In[109]:


setup.capitalize()


# In[110]:


setup.title()


# In[111]:


setup.upper()


# In[112]:


setup.lower()


# In[113]:


setup.swapcase()


# In[114]:


setup.swapcase()


# In[116]:


print(setup.center(100))


# In[124]:


print("%10s"%'hi')
print("%-10s"%'hi')
print('I eat %d apples'% 3.0)
print('I eat %s apples'% 'five')

number=10
day='three'
print('I eat %d apples'% number)
print('I ate %d apples. so I was sick for %s days.'%(number,day))
print('Error rate is %20.3f%%.' % 93.35555)


# In[125]:


print("I ate{0} apples.so I was sick for {day} days".format(10, day=3))


# In[132]:


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
word=input("핵심 주제는 무엇인가")
print(poem.count(word))


# In[133]:


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
print(len(poem))


# In[134]:


word='.'
print(poem.find(word))


# In[135]:


print(poem[0:poem.find(word)])


# In[136]:


print(poem.index(word))


# In[139]:


name='김아무개'
age=40
print(f'나의 이름은{name}입니다. 나는 {age}입니다.')
print(f'나의 이름은{name}입니다. 나는 {age+1}입니다.')
print(f'{"hi":=^10}')
      


# In[145]:


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


# In[153]:


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


# In[ ]:




