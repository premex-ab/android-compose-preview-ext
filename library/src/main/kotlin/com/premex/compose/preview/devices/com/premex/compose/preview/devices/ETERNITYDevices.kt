package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ETERNITY device specifications for Android Compose previews.
 *
 * This extension provides ETERNITY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ETERNITY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ETERNITY: Any
  get() = object {
      /** DeviceSpec(manufacturer=ETERNITY, code=HEROSP001, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ETERNITY, code=HEROSP001,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HEROSP001 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ETERNITY, code=UWS68, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ETERNITY, code=UWS68, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val UWS68 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
