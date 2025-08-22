package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WirelessGate device specifications for Android Compose previews.
 *
 * This extension provides WirelessGate device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wirelessgate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wirelessgate: Any
  get() = object {
      /** WirelessGate wg_tablet_01 */
      val WG_TABLET_01 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
