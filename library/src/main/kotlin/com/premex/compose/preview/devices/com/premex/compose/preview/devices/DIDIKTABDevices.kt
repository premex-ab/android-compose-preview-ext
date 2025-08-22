package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIDIK_TAB device specifications for Android Compose previews.
 *
 * This extension provides DIDIK_TAB device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIDIKTAB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIDIKTAB: Any
  get() = object {
      /** DeviceSpec(manufacturer=DIDIK_TAB, code=DT24, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIDIK_TAB, code=DT24, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DT24 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
