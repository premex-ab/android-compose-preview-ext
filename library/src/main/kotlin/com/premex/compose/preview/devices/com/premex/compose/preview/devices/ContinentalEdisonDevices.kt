package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ContinentalEdison device specifications for Android Compose previews.
 *
 * This extension provides ContinentalEdison device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ContinentalEdison.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ContinentalEdison: Any
  get() = object {
      /** DeviceSpec(manufacturer=ContinentalEdison, code=cottongreen, width=1080, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ContinentalEdison,
      code=cottongreen, width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val COTTONGREEN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ContinentalEdison, code=guandu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ContinentalEdison, code=guandu,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ContinentalEdison, code=kenton, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ContinentalEdison, code=kenton,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ContinentalEdison, code=lasalle, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ContinentalEdison, code=lasalle,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ContinentalEdison, code=marina, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ContinentalEdison, code=marina,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ContinentalEdison, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ContinentalEdison, code=martin,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ContinentalEdison, code=nagata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ContinentalEdison, code=nagata,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
