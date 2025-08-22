package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IHOME device specifications for Android Compose previews.
 *
 * This extension provides IHOME device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IHOME.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IHOME: Any
  get() = object {
      /** DeviceSpec(manufacturer=IHOME, code=elliniko, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IHOME, code=elliniko, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IHOME, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IHOME, code=hongkong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IHOME, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IHOME, code=mountbaker, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

  }
