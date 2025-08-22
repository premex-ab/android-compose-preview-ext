package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GreenLion device specifications for Android Compose previews.
 *
 * This extension provides GreenLion device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GreenLion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GreenLion: Any
  get() = object {
      /** DeviceSpec(manufacturer=GreenLion, code=G-10_PRO, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GreenLion, code=G-10_PRO,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G_10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GreenLion, code=G-10_ULTRA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GreenLion, code=G-10_ULTRA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G_10_ULTRA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GreenLion, code=G-30_ULTRA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GreenLion, code=G-30_ULTRA,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val G_30_ULTRA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GreenLion, code=G-8_PRO, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GreenLion, code=G-8_PRO, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val G_8_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
