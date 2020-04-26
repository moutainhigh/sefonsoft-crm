package com.sefonsoft.oa.system.exception;

//
///**
// * ExceptionAdvice
// *
// * @author Aron
// * @date 16/10/28
// */
//@ControllerAdvice
//@ResponseBody
//public class DefaultExceptionAdvice {
//    Logger logger = LoggerFactory.getLogger(DefaultExceptionAdvice.class);
//    /**
//     * 400 - Bad Request
//     */
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(HttpMessageNotReadableException.class)
//    public Response handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
//        logger.error("参数解析失败", e);
//        return new Response().failure("参数解析失败");
//    }
//
//    /**
//     * 405 - Method Not Allowed
//     */
//    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
//    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
//    public Response handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
//        logger.error("不支持当前请求方法", e);
//        return new Response().failure("不支持当前请求方法");
//    }
//
//    /**
//     * 415 - Unsupported Media Type
//     */
//    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
//    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
//    public Response handleHttpMediaTypeNotSupportedException(Exception e) {
//        logger.error("不支持当前媒体类型", e);
//        return new Response().failure("不支持当前媒体类型");
//    }
//
//    /**
//     * 500 - Internal Server Error
//     */
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(Exception.class)
//    public Response handleException(Exception e) {
//        logger.error("服务运行异常", e);
//        String message = e.getMessage();
//        return new Response().failure(message);
//    }
//
//
//    /**
//     * 自定义消息异常
//     * */
//    @ResponseStatus(HttpStatus.OK)
//    @ExceptionHandler(MsgException.class)
//    public Response handleException(RuntimeException e) {
//        String message = e.getMessage();
//        return new Response().failure(message);
//    }
//
//}
