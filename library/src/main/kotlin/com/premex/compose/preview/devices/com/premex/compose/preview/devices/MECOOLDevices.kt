package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MECOOL device specifications for Android Compose previews.
 *
 * This extension provides MECOOL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MECOOL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MECOOL: Any
  get() = object {
      /** DeviceSpec(manufacturer=MECOOL, code=BOS, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=BOS, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BOS = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MECOOL, code=KA1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=KA1, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KA1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=KA2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=KA2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KA2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=KD1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=KD1, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KD1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=KD2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=KD2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KD2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=KM1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=KM1, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KM1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=KM3, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=KM3, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KM3 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=KM6, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=KM6, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KM6 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=KM7, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=KM7, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KM7 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=KM8, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=KM8, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KM8 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=KM9PRO, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=KM9PRO, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KM9PRO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=KT1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=KT1, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KT1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=LAS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=LAS, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=YDA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=YDA, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YDA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=YYC, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=YYC, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YYC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MECOOL, code=YYT, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECOOL, code=YYT, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YYT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
