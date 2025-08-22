package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ooredoo device specifications for Android Compose previews.
 *
 * This extension provides Ooredoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ooredoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ooredoo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ooredoo, code=diw387oor, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ooredoo, code=diw387oor,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DIW387OOR = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
