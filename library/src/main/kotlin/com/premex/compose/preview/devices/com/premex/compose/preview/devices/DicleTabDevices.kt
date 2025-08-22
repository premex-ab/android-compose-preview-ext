package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dicle_Tab device specifications for Android Compose previews.
 *
 * This extension provides Dicle_Tab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DicleTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DicleTab: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dicle_Tab, code=Active, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dicle_Tab, code=Active, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ACTIVE = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dicle_Tab, code=DTABC2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dicle_Tab, code=DTABC2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DTABC2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
