package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TUTU device specifications for Android Compose previews.
 *
 * This extension provides TUTU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TUTU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TUTU: Any
  get() = object {
      /** DeviceSpec(manufacturer=TUTU, code=lakeside, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TUTU, code=lakeside, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TUTU, code=nagai, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TUTU, code=nagai, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
