package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MINIX device specifications for Android Compose previews.
 *
 * This extension provides MINIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MINIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MINIX: Any
  get() = object {
      /** DeviceSpec(manufacturer=MINIX, code=DV8553, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINIX, code=DV8553, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8553 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
