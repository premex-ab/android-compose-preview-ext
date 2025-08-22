package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cat device specifications for Android Compose previews.
 *
 * This extension provides Cat device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cat: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cat, code=BM1S1B, width=1080, height=2408, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=BM1S1B, width=1080,
      height=2408, dpi=400, isGoogleDevice=false).code */
      val BM1S1B = "spec:width=1080,height=2408,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=Cat, code=CatB15Q, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=CatB15Q, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val CATB15Q = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cat, code=CatS30, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=CatS30, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CATS30 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cat, code=CatS31, width=720, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=CatS31, width=720,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val CATS31 = "spec:width=720,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Cat, code=CatS40, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=CatS40, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val CATS40 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cat, code=CatS41, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=CatS41, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val CATS41 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Cat, code=CatS48c, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=CatS48c, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CATS48C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Cat, code=CatS50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=CatS50, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CATS50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cat, code=CatS52, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=CatS52, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val CATS52 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Cat, code=CatS60, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=CatS60, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CATS60 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cat, code=CatS61, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=CatS61, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val CATS61 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Cat, code=S22FLIP, width=480, height=640, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=S22FLIP, width=480,
      height=640, dpi=240, isGoogleDevice=false).code */
      val S22FLIP = "spec:width=480,height=640,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cat, code=S42, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=S42, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val S42 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Cat, code=S42G, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=S42G, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val S42G = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Cat, code=S62, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=S62, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val S62 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Cat, code=S62Pro, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cat, code=S62Pro, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val S62PRO = "spec:width=1080,height=2160,unit=px,dpi=420"

  }
