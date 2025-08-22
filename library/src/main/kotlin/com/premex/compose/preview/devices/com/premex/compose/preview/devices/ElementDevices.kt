package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Element device specifications for Android Compose previews.
 *
 * This extension provides Element device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Element.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Element: Any
  get() = object {
      /** DeviceSpec(manufacturer=Element, code=kaitak, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Element, code=kaitak, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KAITAK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Element, code=tennoji, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Element, code=tennoji, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TENNOJI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Element, code=Tiger838, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Element, code=Tiger838, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TIGER838 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
