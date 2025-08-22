package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Yuho device specifications for Android Compose previews.
 *
 * This extension provides Yuho device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yuho.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yuho: Any
  get() = object {
      /** DeviceSpec(manufacturer=Yuho, code=Yuho_Tab10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yuho, code=Yuho_Tab10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val YUHO_TAB10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Yuho, code=Yuho_Tab8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yuho, code=Yuho_Tab8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val YUHO_TAB8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
