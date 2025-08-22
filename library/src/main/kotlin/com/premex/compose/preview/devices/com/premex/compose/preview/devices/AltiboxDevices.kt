package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Altibox device specifications for Android Compose previews.
 *
 * This extension provides Altibox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Altibox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Altibox: Any
  get() = object {
      /** DeviceSpec(manufacturer=Altibox, code=uiw4054aib, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altibox, code=uiw4054aib,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UIW4054AIB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
