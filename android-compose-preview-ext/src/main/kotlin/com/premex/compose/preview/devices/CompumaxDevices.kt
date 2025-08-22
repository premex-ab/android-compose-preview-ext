package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Compumax device specifications for Android Compose previews.
 *
 * This extension provides Compumax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Compumax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Compumax: Any
  get() = object {
      /** Compumax BLUEPAD10 */
      val BLUEPAD10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Compumax mid1016_mk_64 */
      val MID1016_MK_64 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
