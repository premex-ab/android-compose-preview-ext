package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HKC device specifications for Android Compose previews.
 *
 * This extension provides HKC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HKC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HKC: Any
  get() = object {
      /** DeviceSpec(manufacturer=HKC, code=burbank, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HKC, code=burbank, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BURBANK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HKC, code=gangbyeon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HKC, code=gangbyeon, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HKC, code=kannai, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HKC, code=kannai, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KANNAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HKC, code=lakeside, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HKC, code=lakeside, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HKC, code=mateo, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HKC, code=mateo, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HKC, code=nagai, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HKC, code=nagai, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HKC, code=panormou, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HKC, code=panormou, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val PANORMOU = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HKC, code=pioneer, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HKC, code=pioneer, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
