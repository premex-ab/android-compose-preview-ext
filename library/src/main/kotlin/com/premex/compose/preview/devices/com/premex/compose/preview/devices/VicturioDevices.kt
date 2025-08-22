package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Victurio device specifications for Android Compose previews.
 *
 * This extension provides Victurio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Victurio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Victurio: Any
  get() = object {
      /** DeviceSpec(manufacturer=Victurio, code=VI108, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Victurio, code=VI108, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VI108 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Victurio, code=VI86, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Victurio, code=VI86, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VI86 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
