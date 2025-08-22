package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TechLife device specifications for Android Compose previews.
 *
 * This extension provides TechLife device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TechLife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TechLife: Any
  get() = object {
      /** DeviceSpec(manufacturer=TechLife, code=TLPAD001, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechLife, code=TLPAD001,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val TLPAD001 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TechLife, code=TLPAD002, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechLife, code=TLPAD002, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TLPAD002 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TechLife, code=TLPADP04, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechLife, code=TLPADP04,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val TLPADP04 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
