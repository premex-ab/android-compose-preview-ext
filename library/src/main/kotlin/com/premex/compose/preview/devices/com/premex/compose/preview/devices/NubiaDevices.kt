package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * nubia device specifications for Android Compose previews.
 *
 * This extension provides nubia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nubia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nubia: Any
  get() = object {
      /** DeviceSpec(manufacturer=nubia, code=K68, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=K68, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val K68 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=K99J, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=K99J, width=1200,
      height=1920, dpi=260, isGoogleDevice=false).code */
      val K99J = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=nubia, code=nubia_NB1001-UN, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=nubia_NB1001-UN,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val NUBIA_NB1001_UN = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=nubia, code=NX503A, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX503A, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX503A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX505J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX505J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX505J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX507J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX507J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX507J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX508J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX508J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX508J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX510J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX510J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX510J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX511J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX511J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX511J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX512J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX512J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX512J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX513J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX513J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX513J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX523J_V1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX523J_V1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX523J_V1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX529J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX529J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX529J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX531J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX531J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX531J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX541J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX541J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX541J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX549J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX549J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX549J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX551J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX551J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX551J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX563J, width=1080, height=1920, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX563J, width=1080,
      height=1920, dpi=440, isGoogleDevice=false).code */
      val NX563J = "spec:width=1080,height=1920,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=nubia, code=NX569J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX569J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX569J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX573J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX573J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NX573J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=NX575J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX575J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NX575J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=NX589J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX589J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX589J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX591J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX591J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX591J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX595J, width=1080, height=2040, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX595J, width=1080,
      height=2040, dpi=480, isGoogleDevice=false).code */
      val NX595J = "spec:width=1080,height=2040,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX601J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX601J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX601J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX609J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX609J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NX609J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX612J, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX612J, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val NX612J = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX619J, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX619J, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val NX619J = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX619J-EEA, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX619J-EEA, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val NX619J_EEA = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX627J, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX627J, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NX627J = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX627J-EEA, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX627J-EEA, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NX627J_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX629J, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX629J, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NX629J = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX629J-EEA, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX629J-EEA, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NX629J_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX651J, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX651J, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NX651J = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX651J-EEA, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX651J-EEA, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NX651J_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX659J, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX659J, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NX659J = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX659J-EEA, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX659J-EEA, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NX659J_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX659J-RU, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX659J-RU, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NX659J_RU = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX659J-UN, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX659J-UN, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NX659J_UN = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX666J, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX666J, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val NX666J = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX669J, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX669J, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val NX669J = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX669J-EEA, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX669J-EEA, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val NX669J_EEA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX669J-UN, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX669J-UN, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val NX669J_UN = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX679J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX679J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NX679J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=NX679J-EEA, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX679J-EEA, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val NX679J_EEA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX679J-UN, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX679J-UN, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val NX679J_UN = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX679S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX679S, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NX679S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=NX709J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX709J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NX709J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=NX709J-EEA, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX709J-EEA, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val NX709J_EEA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX709J-UN, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX709J-UN, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val NX709J_UN = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX709S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX709S, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NX709S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=NX709S-EEA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX709S-EEA, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NX709S_EEA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=NX709S-UN, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX709S-UN, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val NX709S_UN = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX729J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX729J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NX729J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=NX729J-EEA, width=1116, height=2480, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX729J-EEA, width=1116,
      height=2480, dpi=480, isGoogleDevice=false).code */
      val NX729J_EEA = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX729J-UN, width=1116, height=2480, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX729J-UN, width=1116,
      height=2480, dpi=480, isGoogleDevice=false).code */
      val NX729J_UN = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX769J, width=1116, height=2480, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX769J, width=1116,
      height=2480, dpi=480, isGoogleDevice=false).code */
      val NX769J = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=NX789J, width=1216, height=2688, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX789J, width=1216,
      height=2688, dpi=520, isGoogleDevice=false).code */
      val NX789J = "spec:width=1216,height=2688,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=nubia, code=NX907J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=NX907J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NX907J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P606F10, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P606F10, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P606F10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P606F17, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P606F17, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P606F17 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P606F18, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P606F18, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P606F18 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P606F19, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P606F19, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val P606F19 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P606F20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P606F20, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P606F20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P616F02, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P616F02, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P616F02 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=P616F03, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P616F03, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P616F03 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P616F05, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P616F05, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P616F05 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P678F01, width=1188, height=2790, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P678F01, width=1188,
      height=2790, dpi=520, isGoogleDevice=false).code */
      val P678F01 = "spec:width=1188,height=2790,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=nubia, code=P720F08, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P720F08, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P720F08 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=P720F09, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P720F09, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P720F09 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P720F09_U, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P720F09_U, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P720F09_U = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P720F10, width=900, height=2030, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P720F10, width=900,
      height=2030, dpi=400, isGoogleDevice=false).code */
      val P720F10 = "spec:width=900,height=2030,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=nubia, code=P720F11, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P720F11, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P720F11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P720F12, width=1080, height=2392, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P720F12, width=1080,
      height=2392, dpi=480, isGoogleDevice=false).code */
      val P720F12 = "spec:width=1080,height=2392,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=P745F01, width=1188, height=2790, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P745F01, width=1188,
      height=2790, dpi=520, isGoogleDevice=false).code */
      val P745F01 = "spec:width=1188,height=2790,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=nubia, code=P780F01, width=900, height=2030, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P780F01, width=900,
      height=2030, dpi=400, isGoogleDevice=false).code */
      val P780F01 = "spec:width=900,height=2030,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=nubia, code=P780F02, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P780F02, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P780F02 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=P820F03, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P820F03, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P820F03 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=P820F05, width=1080, height=2392, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P820F05, width=1080,
      height=2392, dpi=480, isGoogleDevice=false).code */
      val P820F05 = "spec:width=1080,height=2392,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=P875N02, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P875N02, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P875N02 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=P898A21, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P898A21, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P898A21 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=P898P02, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P898P02, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val P898P02 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=P963F11, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=P963F11, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P963F11 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=PQ82A01, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=PQ82A01, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PQ82A01 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=PQ82A02, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=PQ82A02, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PQ82A02 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=nubia, code=PQ82A04, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=PQ82A04, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val PQ82A04 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=nubia, code=PQ82A11, width=1116, height=2480, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=PQ82A11, width=1116,
      height=2480, dpi=480, isGoogleDevice=false).code */
      val PQ82A11 = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=PQ83A01, width=1116, height=2480, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=PQ83A01, width=1116,
      height=2480, dpi=480, isGoogleDevice=false).code */
      val PQ83A01 = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=PQ83A06, width=1116, height=2480, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=PQ83A06, width=1116,
      height=2480, dpi=480, isGoogleDevice=false).code */
      val PQ83A06 = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=PQ83F01, width=1116, height=2480, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=PQ83F01, width=1116,
      height=2480, dpi=480, isGoogleDevice=false).code */
      val PQ83F01 = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=PQ83P01, width=1800, height=2880, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=PQ83P01, width=1800,
      height=2880, dpi=400, isGoogleDevice=false).code */
      val PQ83P01 = "spec:width=1800,height=2880,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=nubia, code=PQ84A01, width=1216, height=2688, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=PQ84A01, width=1216,
      height=2688, dpi=520, isGoogleDevice=false).code */
      val PQ84A01 = "spec:width=1216,height=2688,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=nubia, code=PQ84A02, width=1216, height=2688, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=PQ84A02, width=1216,
      height=2688, dpi=520, isGoogleDevice=false).code */
      val PQ84A02 = "spec:width=1216,height=2688,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=nubia, code=Z6255, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=Z6255, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z6255 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=Z6657, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=Z6657, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z6657 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nubia, code=Z6701S, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=Z6701S, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val Z6701S = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=nubia, code=Z8900S, width=1188, height=2790, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nubia, code=Z8900S, width=1188,
      height=2790, dpi=520, isGoogleDevice=false).code */
      val Z8900S = "spec:width=1188,height=2790,unit=px,dpi=520"

  }
