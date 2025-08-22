package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MarkaTab device specifications for Android Compose previews.
 *
 * This extension provides MarkaTab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MarkaTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MarkaTab: Any
  get() = object {
      /** DeviceSpec(manufacturer=MarkaTab, code=Markatab-1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MarkaTab, code=Markatab-1,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MARKATAB_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MarkaTab, code=Speadtrum, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MarkaTab, code=Speadtrum,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SPEADTRUM = "spec:width=800,height=1280,unit=px,dpi=213"

  }
