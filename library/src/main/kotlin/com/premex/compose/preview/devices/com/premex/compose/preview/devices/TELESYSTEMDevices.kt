package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TELESYSTEM device specifications for Android Compose previews.
 *
 * This extension provides TELESYSTEM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TELESYSTEM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TELESYSTEM: Any
  get() = object {
      /** DeviceSpec(manufacturer=TELESYSTEM, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELESYSTEM, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TELESYSTEM, code=ONT2HD, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELESYSTEM, code=ONT2HD, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ONT2HD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TELESYSTEM, code=UPT24K, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELESYSTEM, code=UPT24K,
      width=1080, height=1920, dpi=213, isGoogleDevice=false).code */
      val UPT24K = "spec:width=1080,height=1920,unit=px,dpi=213"

  }
