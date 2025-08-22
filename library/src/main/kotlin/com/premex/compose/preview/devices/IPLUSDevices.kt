package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * i-PLUS device specifications for Android Compose previews.
 *
 * This extension provides i-PLUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IPLUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IPLUS: Any
  get() = object {
      /** i-PLUS Nu60 */
      val NU60 = "spec:width=480,height=960,unit=px,dpi=240"

      /** i-PLUS Nu65 */
      val NU65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** i-PLUS NU70 */
      val NU70 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** i-PLUS Omega7 */
      val OMEGA7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** i-PLUS Omega8 */
      val OMEGA8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
