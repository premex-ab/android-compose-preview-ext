package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LVILLE device specifications for Android Compose previews.
 *
 * This extension provides LVILLE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lville.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lville: Any
  get() = object {
      /** LVILLE TP1005 */
      val TP1005 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LVILLE TPC1013 */
      val TPC1013 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LVILLE TPC1013_EEA */
      val TPC1013_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
