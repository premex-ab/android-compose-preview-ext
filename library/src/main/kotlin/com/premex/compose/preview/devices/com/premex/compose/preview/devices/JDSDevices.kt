package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JDS device specifications for Android Compose previews.
 *
 * This extension provides JDS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JDS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JDS: Any
  get() = object {
      /** DeviceSpec(manufacturer=JDS, code=Amigo7xJDS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JDS, code=Amigo7xJDS, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AMIGO7XJDS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
