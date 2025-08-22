package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MEIZE device specifications for Android Compose previews.
 *
 * This extension provides MEIZE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MEIZE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MEIZE: Any
  get() = object {
      /** MEIZE D105 */
      val D105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEIZE D106 */
      val D106 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** MEIZE D115 */
      val D115 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEIZE D125_EEA */
      val D125_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEIZE D126 */
      val D126 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEIZE D126_EEA */
      val D126_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
