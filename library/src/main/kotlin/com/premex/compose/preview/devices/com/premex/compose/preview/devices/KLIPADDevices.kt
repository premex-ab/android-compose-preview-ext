package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KLIPAD device specifications for Android Compose previews.
 *
 * This extension provides KLIPAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KLIPAD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KLIPAD: Any
  get() = object {
      /** DeviceSpec(manufacturer=KLIPAD, code=KL2018R, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL2018R, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KL2018R = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL2108NBE, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL2108NBE, width=800,
      height=1332, dpi=160, isGoogleDevice=false).code */
      val KL2108NBE = "spec:width=800,height=1332,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL2109NB_EEA, width=768, height=1366, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL2109NB_EEA,
      width=768, height=1366, dpi=160, isGoogleDevice=false).code */
      val KL2109NB_EEA = "spec:width=768,height=1366,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL3669A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL3669A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KL3669A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL3669_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL3669_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KL3669_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL4889B, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL4889B, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KL4889B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL4889C, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL4889C, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KL4889C = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL4890, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL4890, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KL4890 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL4891, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL4891, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KL4891 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL4898, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL4898, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KL4898 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL4898_A50, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL4898_A50, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KL4898_A50 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL500, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL500, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KL500 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL502, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL502, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val KL502 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL503, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL503, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val KL503 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL505, width=480, height=854, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL505, width=480,
      height=854, dpi=220, isGoogleDevice=false).code */
      val KL505 = "spec:width=480,height=854,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL601, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL601, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KL601 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL602, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL602, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KL602 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL605, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL605, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KL605 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL608, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL608, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KL608 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL628KO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL628KO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KL628KO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL6889B, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL6889B, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KL6889B = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL7590, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL7590, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KL7590 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL7591, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL7591, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KL7591 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL8889, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL8889, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KL8889 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL9878, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL9878, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KL9878 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL9878AE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL9878AE, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KL9878AE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KLIPAD, code=KL9878A_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KL9878A_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KL9878A_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KLIPAD, code=KLIPAD, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KLIPAD, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KLIPAD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=KLIPAD_KL600, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KLIPAD_KL600,
      width=540, height=960, dpi=240, isGoogleDevice=false).code */
      val KLIPAD_KL600 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KLIPAD, code=KLIPAD_KL600B, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KLIPAD_KL600B,
      width=540, height=960, dpi=240, isGoogleDevice=false).code */
      val KLIPAD_KL600B = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KLIPAD, code=KLIPAD_SMART_I746, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=KLIPAD_SMART_I746,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val KLIPAD_SMART_I746 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KLIPAD, code=V355, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=V355, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V355 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KLIPAD, code=V355B, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=V355B, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V355B = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KLIPAD, code=V356, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KLIPAD, code=V356, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V356 = "spec:width=480,height=960,unit=px,dpi=240"

  }
