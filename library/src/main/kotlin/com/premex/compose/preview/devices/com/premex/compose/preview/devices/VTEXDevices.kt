package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VTEX device specifications for Android Compose previews.
 *
 * This extension provides VTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VTEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VTEX: Any
  get() = object {
      /** DeviceSpec(manufacturer=VTEX, code=MT8768, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VTEX, code=MT8768, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MT8768 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VTEX, code=VK102W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VTEX, code=VK102W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val VK102W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VTEX, code=VK802W, width=800, height=1280, dpi=188,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VTEX, code=VK802W, width=800,
      height=1280, dpi=188, isGoogleDevice=false).code */
      val VK802W = "spec:width=800,height=1280,unit=px,dpi=188"

  }
