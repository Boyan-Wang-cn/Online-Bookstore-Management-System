export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/login'
    },
    {
      path: '/login',
      name: 'login',
      component: Login
    },
    {
      path: '/listUser',
      component: listUser,
      redirect: '/listUser',
      children: [
        {
          path: '/listUser',
          component: listUser
        },
        {
          path: '/user',
          component: User
        },
        {
          path: '/order',
          component: MyOrder
        }
      ]
    }
  ]
})