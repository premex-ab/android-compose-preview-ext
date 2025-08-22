package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * hoco device specifications for Android Compose previews.
 *
 * This extension provides hoco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hoco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hoco: Any
  get() = object {
      /** DeviceSpec(manufacturer=hoco, code=hoco_HI10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hoco, code=hoco_HI10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HOCO_HI10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=hoco, code=hoco_HI11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hoco, code=hoco_HI11, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HOCO_HI11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=hoco, code=hoco_HI12, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hoco, code=hoco_HI12, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val HOCO_HI12 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=hoco, code=hoco_HI14, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hoco, code=hoco_HI14, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HOCO_HI14 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
