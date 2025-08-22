package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tablet_PC device specifications for Android Compose previews.
 *
 * This extension provides Tablet_PC device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TabletPC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TabletPC: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tablet_PC, code=T3G_07, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tablet_PC, code=T3G_07, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val T3G_07 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Tablet_PC, code=T3G_10B, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tablet_PC, code=T3G_10B, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T3G_10B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Tablet_PC, code=Tablet_PC, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tablet_PC, code=Tablet_PC,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TABLET_PC = "spec:width=800,height=1280,unit=px,dpi=213"

  }
