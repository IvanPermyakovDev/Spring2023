# Spring2023
# Пермяков Иван Дмитриевич

Идея приложения: сервис для управления проектами

Описание основного функционала:
- Регистрация/авторизация пользователя
- Возможность создать проект, добавить в него пользователей,внести описание и опциональные параметры
- Возможность создать задачу, обозначить дедлайн, прикрепить позователя к задаче,
- Возможность оставлять комментарии к проектам и задачам
- главная страница у пользоватея с отображающимися проектами и информацией о них
- дэшборд проекта с подробной визуализацией данных о степени выполнения задач

Роли пользователей и их возможности:
- аминистратор:
  - имеет доступ ко всем данным и функциям системы
- тимлид:
  - имеет полный функционал участника команды
  - имеет возможность создать категорию задач с соответствующим пайплайном в дэшборде
  - имеет возможность одобрять предложенную задачу (или создавать свою без отправки на одобрение)
  - имеет возможностьдобавлять и удалять участников команды в свой проект
  - имеет возможность давать роли участникам команды в рамках текущего проекта
- участник команды:
  - имеет возможность создать проект, автоматически став в нем тимлидом
  - имеет возможность предлагать задачу, составив ее описание, обозначив дедлайн
    и прикрепив к ней соответствующих участников команды
  - имеет возможность менять статус задачи
  - имеет возможность оставлять комментарии к проектам и задачам

Дэшборд проекта:
  - виджет с пайплайнами задач и их прогрессбаром
  - виджет с задачами и степенью их выполнения у каждого участника
  - общий прогрессбар проекта
  
