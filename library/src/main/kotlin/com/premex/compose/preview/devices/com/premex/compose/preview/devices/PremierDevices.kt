package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Premier device specifications for Android Compose previews.
 *
 * This extension provides Premier device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Premier.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Premier: Any
  get() = object {
      /** DeviceSpec(manufacturer=Premier, code=Premier_P50, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premier, code=Premier_P50,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val PREMIER_P50 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Premier, code=TAB-7304-16G3GS, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premier, code=TAB-7304-16G3GS,
      width=800, height=1280, dpi=210, isGoogleDevice=false).code */
      val TAB_7304_16G3GS = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=Premier, code=TAB-7769-32G4GS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premier, code=TAB-7769-32G4GS,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_7769_32G4GS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Premier, code=TAB-7887-32G3GB, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premier, code=TAB-7887-32G3GB,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB_7887_32G3GB = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Premier, code=TAB-7888-32G3GB, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premier, code=TAB-7888-32G3GB,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_7888_32G3GB = "spec:width=800,height=1280,unit=px,dpi=213"

  }
