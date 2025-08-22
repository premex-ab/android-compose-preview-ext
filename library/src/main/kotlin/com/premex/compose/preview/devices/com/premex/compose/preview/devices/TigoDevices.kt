package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tigo device specifications for Android Compose previews.
 *
 * This extension provides Tigo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tigo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tigo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tigo, code=uiw4054mil, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tigo, code=uiw4054mil, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val UIW4054MIL = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tigo, code=uiw4059mil, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tigo, code=uiw4059mil, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val UIW4059MIL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
