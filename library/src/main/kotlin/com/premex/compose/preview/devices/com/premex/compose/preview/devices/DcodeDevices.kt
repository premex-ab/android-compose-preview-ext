package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dcode device specifications for Android Compose previews.
 *
 * This extension provides Dcode device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dcode.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dcode: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dcode, code=Dcode_Cypher, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dcode, code=Dcode_Cypher,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val DCODE_CYPHER = "spec:width=720,height=1600,unit=px,dpi=320"

  }
