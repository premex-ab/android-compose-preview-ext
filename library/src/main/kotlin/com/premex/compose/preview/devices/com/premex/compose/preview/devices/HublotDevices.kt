package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hublot device specifications for Android Compose previews.
 *
 * This extension provides Hublot device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hublot.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hublot: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hublot, code=halibut, width=390, height=390, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hublot, code=halibut, width=390,
      height=390, dpi=320, isGoogleDevice=false).code */
      val HALIBUT = "spec:width=390,height=390,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hublot, code=turbot, width=454, height=454, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hublot, code=turbot, width=454,
      height=454, dpi=320, isGoogleDevice=false).code */
      val TURBOT = "spec:width=454,height=454,unit=px,dpi=320"

  }
