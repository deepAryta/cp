const mongodb =  require('mongodb')
const MongoClient = mongodb.MongoClient

const databaseName =   'task-manager'
const connectionURL = 'mongodb://127.0.0.1:27017'

const ObjextID = mongodb.ObjectID

mongodb.connect(connectionURL,{useNewUrlParser:true},(error,client)=>{
    if(error) return console.log("This is the error")


    const db = client.db(databaseName)

    // db.collection('tasks').insertMany([{
    //     name:"Learn Java",
    //     completed:false
    // },{
    //     name:"Learn node.js",
    //     completed:false
    // },{
    //     name:"Physically fit",
    //     completed:true
    // }],(error,result)=>{
    //     if(error) return console.log("the error is here")

    //     console.log(result.ops)
    // })

    db.collection('tasks').find({completed:false}).toArray((error,tas)=>{
        if(error) return console.log("THE ERRO")

        console.log(tas)
    })


})
