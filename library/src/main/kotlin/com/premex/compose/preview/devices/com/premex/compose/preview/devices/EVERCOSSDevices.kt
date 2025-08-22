package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVERCOSS device specifications for Android Compose previews.
 *
 * This extension provides EVERCOSS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EVERCOSS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EVERCOSS: Any
  get() = object {
      /** DeviceSpec(manufacturer=EVERCOSS, code=AT8B, width=768, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=AT8B, width=768,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val AT8B = "spec:width=768,height=1024,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_A75B, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_A75B,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val EVERCOSS_A75B = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_M40A, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_M40A,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val EVERCOSS_M40A = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_M50_MAX, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_M50_MAX,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val EVERCOSS_M50_MAX = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_M50_STAR, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_M50_STAR,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val EVERCOSS_M50_STAR = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_M80, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_M80,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val EVERCOSS_M80 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_S45, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_S45,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val EVERCOSS_S45 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_S50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_S50,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val EVERCOSS_S50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_U6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_U6,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val EVERCOSS_U6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_U60, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_U60,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val EVERCOSS_U60 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_U6_PRIME, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=EVERCOSS_U6_PRIME,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val EVERCOSS_U6_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERCOSS, code=M53, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=M53, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M53 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=M55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=M55, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=M55A, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=M55A, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M55A = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=M55B, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=M55B, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M55B = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=M55C, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=M55C, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M55C = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=M6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=M6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERCOSS, code=M60, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=M60, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M60 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERCOSS, code=M6A, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=M6A, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val M6A = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=EVERCOSS, code=M70, width=600, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=M70, width=600,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val M70 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=R50A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=R50A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val R50A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=R6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=R6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERCOSS, code=R70, width=600, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=R70, width=600,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val R70 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=S45B, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=S45B, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S45B = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=S55A, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=S55A, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val S55A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=EVERCOSS, code=S55B, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=S55B, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S55B = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERCOSS, code=S6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=S6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERCOSS, code=U50A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=U50A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val U50A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=U50A_MAX, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=U50A_MAX, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val U50A_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERCOSS, code=U50A_PLUS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=U50A_PLUS,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val U50A_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERCOSS, code=U50C, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=U50C, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val U50C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERCOSS, code=U55, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=U55, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val U55 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERCOSS, code=U6B, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=U6B, width=540,
      height=1132, dpi=240, isGoogleDevice=false).code */
      val U6B = "spec:width=540,height=1132,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=U6C, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=U6C, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val U6C = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=EVERCOSS, code=U70B, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=U70B, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val U70B = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EVERCOSS, code=U70C, width=600, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=U70C, width=600,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val U70C = "spec:width=600,height=1024,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERCOSS, code=X7, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=X7, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val X7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EVERCOSS, code=X9, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERCOSS, code=X9, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val X9 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
