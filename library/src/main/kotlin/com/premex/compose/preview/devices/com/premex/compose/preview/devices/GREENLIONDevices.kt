package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GREENLION device specifications for Android Compose previews.
 *
 * This extension provides GREENLION device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GREENLION.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GREENLION: Any
  get() = object {
      /** DeviceSpec(manufacturer=GREENLION, code=G-20ULTRA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREENLION, code=G-20ULTRA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val G_20ULTRA = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
